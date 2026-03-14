#!/bin/bash
# libapp.so Analysis Script
# Run this script to analyze Flutter's libapp.so

LIBAPP="/storage/internal_new/project/Earnings/app/src/main/jniLibs/arm64-v8a/libapp.so"
OUTPUT_DIR="/storage/internal_new/project/Earnings/libapp_analysis"

mkdir -p "$OUTPUT_DIR"

echo "========================================"
echo "  libapp.so Analysis"
echo "========================================"
echo ""

# Check if file exists
if [ ! -f "$LIBAPP" ]; then
    echo "ERROR: libapp.so not found at $LIBAPP"
    exit 1
fi

echo "File: $LIBAPP"
echo "Size: $(ls -lh $LIBAPP | awk '{print $5}')"
echo ""

# 1. Extract all strings
echo "[1/6] Extracting strings..."
strings "$LIBAPP" > "$OUTPUT_DIR/all_strings.txt"
echo "      Saved: $OUTPUT_DIR/all_strings.txt ($(wc -l < $OUTPUT_DIR/all_strings.txt) lines)"

# 2. Extract API endpoints
echo "[2/6] Extracting API endpoints..."
grep -E "/api/" "$OUTPUT_DIR/all_strings.txt" | sort -u > "$OUTPUT_DIR/api_endpoints.txt"
echo "      Saved: $OUTPUT_DIR/api_endpoints.txt ($(wc -l < $OUTPUT_DIR/api_endpoints.txt) endpoints)"

# 3. Extract URLs
echo "[3/6] Extracting URLs..."
grep -E "https?://" "$OUTPUT_DIR/all_strings.txt" | sort -u > "$OUTPUT_DIR/urls.txt"
echo "      Saved: $OUTPUT_DIR/urls.txt ($(wc -l < $OUTPUT_DIR/urls.txt) URLs)"

# 4. Extract auth-related strings
echo "[4/6] Extracting auth-related strings..."
grep -iE "auth|login|token|register|logout|session|credential" "$OUTPUT_DIR/all_strings.txt" | sort -u > "$OUTPUT_DIR/auth_strings.txt"
echo "      Saved: $OUTPUT_DIR/auth_strings.txt ($(wc -l < $OUTPUT_DIR/auth_strings.txt) strings)"

# 5. Extract Firebase-related strings
echo "[5/6] Extracting Firebase-related strings..."
grep -iE "firebase|firestore|auth|analytics|crashlytics|messaging|performance" "$OUTPUT_DIR/all_strings.txt" | sort -u > "$OUTPUT_DIR/firebase_strings.txt"
echo "      Saved: $OUTPUT_DIR/firebase_strings.txt ($(wc -l < $OUTPUT_DIR/firebase_strings.txt) strings)"

# 6. Extract potential keys/secrets
echo "[6/6] Extracting potential keys/secrets..."
grep -iE "key|secret|password|api_key|apikey|token|bearer|credential" "$OUTPUT_DIR/all_strings.txt" | sort -u > "$OUTPUT_DIR/potential_secrets.txt"
echo "      Saved: $OUTPUT_DIR/potential_secrets.txt ($(wc -l < $OUTPUT_DIR/potential_secrets.txt) strings)"

echo ""
echo "========================================"
echo "  Analysis Complete!"
echo "========================================"
echo ""
echo "Output directory: $OUTPUT_DIR"
echo ""
echo "Files created:"
ls -la "$OUTPUT_DIR"
echo ""
echo "To search for specific terms:"
echo "  grep -i 'search_term' $OUTPUT_DIR/all_strings.txt"
echo ""
echo "For deeper analysis with Ghidra:"
echo "  1. Extract: unzip /tmp/ghidra.zip -d /opt/"
echo "  2. Run: /opt/ghidra_*/ghidraRun"
echo "  3. Import: $LIBAPP"
echo "  4. Analyze with default options"
echo ""
