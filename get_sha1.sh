#!/bin/bash

# SHA-1 Hash Extraction Script for Earnings App
# Usage: ./get_sha1.sh [debug|release]

set -e

echo "========================================"
echo "  SHA-1 Certificate Hash Extractor"
echo "  Package: com.ykapps.earnings"
echo "========================================"
echo ""

# Function to extract SHA-1
get_sha1() {
    local keystore_path="$1"
    local alias="$2"
    local store_pass="$3"
    
    if [ ! -f "$keystore_path" ]; then
        echo "❌ Keystore not found: $keystore_path"
        return 1
    fi
    
    echo "Extracting SHA-1 from: $keystore_path"
    echo ""
    
    keytool -list -v -keystore "$keystore_path" -alias "$alias" -storepass "$store_pass" 2>/dev/null | grep -i "sha1:" | awk '{print $2}'
}

# Debug Keystore
echo "📱 DEBUG KEYSTORE"
echo "----------------------------------------"

if [[ "$OSTYPE" == "msys" || "$OSTYPE" == "win32" ]]; then
    # Windows
    DEBUG_KEYSTORE="$USERPROFILE/.android/debug.keystore"
else
    # Linux/Mac
    DEBUG_KEYSTORE="$HOME/.android/debug.keystore"
fi

if [ -f "$DEBUG_KEYSTORE" ]; then
    DEBUG_SHA1=$(keytool -list -v -keystore "$DEBUG_KEYSTORE" -alias androiddebugkey -storepass android -keypass android 2>/dev/null | grep -i "sha1:" | awk '{print $2}')
    echo "SHA1: $DEBUG_SHA1"
    echo ""
    echo "Copy this to Firebase Console:"
    echo "  https://console.firebase.google.com/project/crypto-cloud-mining-cbeff/settings/general/android:com.ykapps.earnings"
else
    echo "❌ Debug keystore not found at: $DEBUG_KEYSTORE"
    echo "   Run Android Studio to generate it first."
fi

echo ""
echo "========================================"
echo ""

# Release Keystore (if exists)
echo "🔐 RELEASE KEYSTORE"
echo "----------------------------------------"

RELEASE_KEYSTORE="earnings-release.keystore"
if [ -f "$RELEASE_KEYSTORE" ]; then
    echo "Found: $RELEASE_KEYSTORE"
    echo ""
    echo "Enter keystore password:"
    read -s KEYSTORE_PASS
    echo ""
    
    echo "Enter alias name:"
    read ALIAS_NAME
    echo ""
    
    RELEASE_SHA1=$(keytool -list -v -keystore "$RELEASE_KEYSTORE" -alias "$ALIAS_NAME" -storepass "$KEYSTORE_PASS" 2>/dev/null | grep -i "sha1:" | awk '{print $2}')
    echo "SHA1: $RELEASE_SHA1"
else
    echo "⚠️  No release keystore found in project directory"
    echo ""
    echo "To create a release keystore:"
    echo "  keytool -genkey -v -keystore earnings-release.keystore -alias earnings -keyalg RSA -keysize 2048 -validity 10000"
fi

echo ""
echo "========================================"
echo ""

# Full certificate info
echo "📋 FULL CERTIFICATE INFO (Debug)"
echo "----------------------------------------"
if [ -f "$DEBUG_KEYSTORE" ]; then
    keytool -list -v -keystore "$DEBUG_KEYSTORE" -alias androiddebugkey -storepass android -keypass android 2>/dev/null
fi

echo ""
echo "========================================"
echo ""
echo "✅ Done!"
echo ""
echo "Next steps:"
echo "  1. Copy SHA-1 hash(es) above"
echo "  2. Open Firebase Console"
echo "  3. Go to Project Settings → Your apps → com.ykapps.earnings"
echo "  4. Click 'Add fingerprint'"
echo "  5. Paste SHA-1 and save"
echo ""
echo "For detailed instructions, see:"
echo "  FIREBASE_SHA1_REGISTRATION_PROCEDURE.md"
