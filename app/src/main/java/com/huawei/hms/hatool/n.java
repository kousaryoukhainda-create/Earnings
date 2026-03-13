package com.huawei.hms.hatool;

import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.stats.CodePackage;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes2.dex */
public class n {
    public static final Charset a = Charset.forName("UTF-8");

    public static Pair<byte[], String> a(String str, int i) {
        if (str == null || str.length() < i) {
            return new Pair<>(new byte[0], str);
        }
        String substring = str.substring(0, i);
        return new Pair<>(AbstractC1281eb.z(substring), str.substring(i));
    }

    public static String b(String str, String str2) {
        byte[] bArr;
        byte[] bytes = str.getBytes(a);
        byte[] z = AbstractC1281eb.z(str2);
        byte[] b = AbstractC0333Hr.b(16);
        if (bytes == null) {
            AbstractC1522hL.e("CBC", "encrypt 6 content is null");
            bArr = new byte[0];
        } else if (bytes.length == 0) {
            AbstractC1522hL.e("CBC", "encrypt 6 content length is 0");
            bArr = new byte[0];
        } else if (z.length < 16) {
            AbstractC1522hL.e("CBC", "encrypt 6 key error: 6 key length less than 16 bytes.");
            bArr = new byte[0];
        } else if (b.length < 16) {
            AbstractC1522hL.e("CBC", "encrypt 6 iv error: 6 iv length less than 16 bytes.");
            bArr = new byte[0];
        } else {
            SecretKeySpec secretKeySpec = new SecretKeySpec(z, "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, secretKeySpec, new IvParameterSpec(b));
                bArr = cipher.doFinal(bytes);
            } catch (NullPointerException e) {
                AbstractC1522hL.e("CBC", "NullPointerException: " + e.getMessage());
                bArr = new byte[0];
                byte[] bArr2 = new byte[b.length + bArr.length];
                System.arraycopy(b, 0, bArr2, 0, b.length);
                System.arraycopy(bArr, 0, bArr2, b.length, bArr.length);
                return AbstractC1281eb.h(bArr2);
            } catch (InvalidAlgorithmParameterException e2) {
                AbstractC1522hL.e("CBC", "InvalidAlgorithmParameterException: " + e2.getMessage());
                bArr = new byte[0];
                byte[] bArr22 = new byte[b.length + bArr.length];
                System.arraycopy(b, 0, bArr22, 0, b.length);
                System.arraycopy(bArr, 0, bArr22, b.length, bArr.length);
                return AbstractC1281eb.h(bArr22);
            } catch (InvalidKeyException e3) {
                AbstractC1522hL.e("CBC", "InvalidKeyException: " + e3.getMessage());
                bArr = new byte[0];
                byte[] bArr222 = new byte[b.length + bArr.length];
                System.arraycopy(b, 0, bArr222, 0, b.length);
                System.arraycopy(bArr, 0, bArr222, b.length, bArr.length);
                return AbstractC1281eb.h(bArr222);
            } catch (NoSuchAlgorithmException e4) {
                AbstractC1522hL.e("CBC", "NoSuchAlgorithmException: " + e4.getMessage());
                bArr = new byte[0];
                byte[] bArr2222 = new byte[b.length + bArr.length];
                System.arraycopy(b, 0, bArr2222, 0, b.length);
                System.arraycopy(bArr, 0, bArr2222, b.length, bArr.length);
                return AbstractC1281eb.h(bArr2222);
            } catch (BadPaddingException e5) {
                AbstractC1522hL.e("CBC", "BadPaddingException: " + e5.getMessage());
                bArr = new byte[0];
                byte[] bArr22222 = new byte[b.length + bArr.length];
                System.arraycopy(b, 0, bArr22222, 0, b.length);
                System.arraycopy(bArr, 0, bArr22222, b.length, bArr.length);
                return AbstractC1281eb.h(bArr22222);
            } catch (IllegalBlockSizeException e6) {
                AbstractC1522hL.e("CBC", "IllegalBlockSizeException: " + e6.getMessage());
                bArr = new byte[0];
                byte[] bArr222222 = new byte[b.length + bArr.length];
                System.arraycopy(b, 0, bArr222222, 0, b.length);
                System.arraycopy(bArr, 0, bArr222222, b.length, bArr.length);
                return AbstractC1281eb.h(bArr222222);
            } catch (NoSuchPaddingException e7) {
                AbstractC1522hL.e("CBC", "NoSuchPaddingException: " + e7.getMessage());
                bArr = new byte[0];
                byte[] bArr2222222 = new byte[b.length + bArr.length];
                System.arraycopy(b, 0, bArr2222222, 0, b.length);
                System.arraycopy(bArr, 0, bArr2222222, b.length, bArr.length);
                return AbstractC1281eb.h(bArr2222222);
            }
        }
        byte[] bArr22222222 = new byte[b.length + bArr.length];
        System.arraycopy(b, 0, bArr22222222, 0, b.length);
        System.arraycopy(bArr, 0, bArr22222222, b.length, bArr.length);
        return AbstractC1281eb.h(bArr22222222);
    }

    public static String a(String str, String str2) {
        byte[] bArr;
        Pair<byte[], String> a2 = a(str, 32);
        byte[] z = AbstractC1281eb.z((String) a2.second);
        byte[] z2 = AbstractC1281eb.z(str2);
        byte[] bArr2 = (byte[]) a2.first;
        if (z.length == 0) {
            AbstractC1522hL.e("CBC", "decrypt 6 content length is 0");
            bArr = new byte[0];
        } else if (z2.length < 16) {
            AbstractC1522hL.e("CBC", "decrypt 6 key error: 6 key length less than 16 bytes.");
            bArr = new byte[0];
        } else if (bArr2 == null) {
            AbstractC1522hL.e("CBC", "decrypt 6 iv is null");
            bArr = new byte[0];
        } else if (bArr2.length < 16) {
            AbstractC1522hL.e("CBC", "decrypt 6 iv error: 6 iv length less than 16 bytes.");
            bArr = new byte[0];
        } else {
            SecretKeySpec secretKeySpec = new SecretKeySpec(z2, "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArr = cipher.doFinal(z);
            } catch (NullPointerException e) {
                AbstractC1522hL.e("CBC", "NullPointerException: " + e.getMessage());
                bArr = new byte[0];
                return new String(bArr, a);
            } catch (InvalidAlgorithmParameterException e2) {
                AbstractC1522hL.e("CBC", "InvalidAlgorithmParameterException: " + e2.getMessage());
                bArr = new byte[0];
                return new String(bArr, a);
            } catch (InvalidKeyException e3) {
                AbstractC1522hL.e("CBC", "InvalidKeyException: " + e3.getMessage());
                bArr = new byte[0];
                return new String(bArr, a);
            } catch (NoSuchAlgorithmException e4) {
                AbstractC1522hL.e("CBC", "NoSuchAlgorithmException: " + e4.getMessage());
                bArr = new byte[0];
                return new String(bArr, a);
            } catch (BadPaddingException e5) {
                AbstractC1522hL.e("CBC", "BadPaddingException: " + e5.getMessage());
                AbstractC1522hL.e("CBC", "key is not right");
                bArr = new byte[0];
                return new String(bArr, a);
            } catch (IllegalBlockSizeException e6) {
                AbstractC1522hL.e("CBC", "IllegalBlockSizeException: " + e6.getMessage());
                bArr = new byte[0];
                return new String(bArr, a);
            } catch (NoSuchPaddingException e7) {
                AbstractC1522hL.e("CBC", "NoSuchPaddingException: " + e7.getMessage());
                bArr = new byte[0];
                return new String(bArr, a);
            }
        }
        return new String(bArr, a);
    }

    public static String a(byte[] bArr, String str) {
        byte[] bArr2;
        if (bArr == null || bArr.length == 0 || str == null) {
            v.b("AesCipher", "cbc encrypt(byte) param is not right");
            return "";
        }
        byte[] z = AbstractC1281eb.z(str);
        if (z.length < 16) {
            v.b("AesCipher", "key length is not right");
            return "";
        }
        byte[] b = AbstractC0333Hr.b(12);
        if (bArr.length == 0) {
            AbstractC1522hL.e(CodePackage.GCM, "encrypt 6 content length is 0");
            bArr2 = new byte[0];
        } else if (z.length < 16) {
            AbstractC1522hL.e(CodePackage.GCM, "encrypt 6 key error: 6 key length less than 16 bytes.");
            bArr2 = new byte[0];
        } else if (b.length < 12) {
            AbstractC1522hL.e(CodePackage.GCM, "encrypt 6 iv error: 6 iv length less than 16 bytes.");
            bArr2 = new byte[0];
        } else {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(z, "AES");
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, secretKeySpec, new GCMParameterSpec(UserVerificationMethods.USER_VERIFY_PATTERN, b));
                bArr2 = cipher.doFinal(bArr);
            } catch (NullPointerException e) {
                AbstractC1522hL.e(CodePackage.GCM, "GCM encrypt data error" + e.getMessage());
                bArr2 = new byte[0];
                byte[] bArr3 = new byte[b.length + bArr2.length];
                System.arraycopy(b, 0, bArr3, 0, b.length);
                System.arraycopy(bArr2, 0, bArr3, b.length, bArr2.length);
                return AbstractC1281eb.h(bArr3);
            } catch (GeneralSecurityException e2) {
                AbstractC1522hL.e(CodePackage.GCM, "GCM encrypt data error" + e2.getMessage());
                bArr2 = new byte[0];
                byte[] bArr32 = new byte[b.length + bArr2.length];
                System.arraycopy(b, 0, bArr32, 0, b.length);
                System.arraycopy(bArr2, 0, bArr32, b.length, bArr2.length);
                return AbstractC1281eb.h(bArr32);
            }
        }
        byte[] bArr322 = new byte[b.length + bArr2.length];
        System.arraycopy(b, 0, bArr322, 0, b.length);
        System.arraycopy(bArr2, 0, bArr322, b.length, bArr2.length);
        return AbstractC1281eb.h(bArr322);
    }
}
