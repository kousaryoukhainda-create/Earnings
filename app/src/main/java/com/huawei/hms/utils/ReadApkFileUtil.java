package com.huawei.hms.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import android.util.AndroidException;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.huawei.hms.support.log.HMSLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* loaded from: classes2.dex */
public class ReadApkFileUtil {
    public static final String EMUI10_PK = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAx4nUogUyMCmzHhaEb420yvpw9zBs+ETzE9Qm77bGxl1Iml9JEkBkNTsUWOstLgUBajNhV+BAMVBHKMEdzoQbL5kIHkTgUVM65yewd+5+BhrcB9OQ3LHp+0BN6aLKZh71T4WvsvHFhfhQpShuGWkRkSaVGLFTHxX70kpWLzeZ3RtqiEUNIufPR2SFCH6EmecJ+HdkmBOh603IblCpGxwSWse0fDI98wZBEmV88RFaiYEgyiezLlWvXzqIj6I/xuyd5nGAegjH2y3cmoDE6CubecoB1jf4KdgACXgdiQ4Oc63MfLGTor3l6RCqeUk4APAMtyhK83jc72W1sdXMd/sj2wIDAQAB";
    public static final String EMUI11_PK = "MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAqq2eRTMYr2JHLtvuZzfgPrgU8oatD4Rar9fOD7E00es2VhtB3vTyaT2BvYPUPA/nbkHRPak3EZX77CfWj9tzLgSHJE8XLk9C+2ESkdrxCDA6z7I8X+cBDnA05OlCJeZFjnUbjYB8SP8M3BttdrvqtVPxTkEJhchC7UXnMLaJ3kQ3ZPjN7ubjYzO4rv7EtEpqr2bX+qjnSLIZZuUXraxqfdBuhGDIYq62dNsqiyrhX1mfvA3+43N4ZIs3BdfSYII8BNFmFxf+gyf1aoq386R2kAjHcrfOOhjAbZh+R1OAGLWPCqi3E9nB8EsZkeoTW/oIP6pJvgL3bnxq+1viT2dmZyipMgcx/3N6FJqkd67j/sPMtPlHJuq8/s0silzs13jAw1WBV6tWHFkLGpkWGs8jp50wQtndtY8cCPl2XPGmdPN72agH+zsHuKqr/HOB2TuzzaO8rKlGIDQlzZcCSHB28nnvOyBVN9xzLkbYiLnHfd6bTwzNPeqjWrTnPwKyH3BPAgMBAAE=";
    public static final String KEY_SIGNATURE = "Signature:";
    public static final String KEY_SIGNATURE2 = "Signature2:";
    public static final String KEY_SIGNATURE3 = "Signature3:";
    private static final String a = "ReadApkFileUtil";
    private static String c;
    private static String d;
    private static String e;
    private static final Pattern b = Pattern.compile("\\s*|\t|\r|\n");
    private static String f = null;
    private static String g = null;

    private static byte[] a(ZipFile zipFile) {
        return a(zipFile, "META-INF/MANIFEST.MF");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4 */
    @TargetApi(19)
    private static void b(byte[] bArr) {
        Throwable th;
        BufferedReader bufferedReader;
        InputStream inputStream;
        ?? r2;
        BufferedReader bufferedReader2;
        InputStream inputStream2;
        if (bArr == null) {
            HMSLog.e(a, "manifest is null！");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader3 = null;
        c = null;
        d = null;
        e = null;
        try {
            inputStream = new ByteArrayInputStream(bArr);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            } catch (Exception unused) {
            } catch (Throwable th2) {
                th = th2;
                r2 = inputStream;
                IOUtils.closeQuietly((InputStream) r2);
                IOUtils.closeQuietly((Reader) bufferedReader3);
                throw th;
            }
            try {
                String a2 = a(bufferedReader);
                while (a2 != null) {
                    if (a2.length() != 0) {
                        if (a2.startsWith("ApkHash:")) {
                            f = a(a2.substring(a2.indexOf(":") + 1));
                        }
                        if (a2.startsWith(KEY_SIGNATURE)) {
                            c = a(a2.substring(a2.indexOf(":") + 1));
                            a2 = a(bufferedReader);
                        } else if (a2.startsWith(KEY_SIGNATURE2)) {
                            d = a(a2.substring(a2.indexOf(":") + 1));
                            a2 = a(bufferedReader);
                        } else if (a2.startsWith(KEY_SIGNATURE3)) {
                            e = a(a2.substring(a2.indexOf(":") + 1));
                            a2 = a(bufferedReader);
                        } else {
                            stringBuffer.append(a2);
                            stringBuffer.append("\r\n");
                        }
                    }
                    a2 = a(bufferedReader);
                }
                g = stringBuffer.toString();
                inputStream2 = inputStream;
            } catch (Exception unused2) {
                bufferedReader3 = bufferedReader;
                try {
                    HMSLog.e(a, "loadApkCert Exception!");
                    bufferedReader = bufferedReader3;
                    inputStream2 = inputStream;
                    IOUtils.closeQuietly(inputStream2);
                    IOUtils.closeQuietly((Reader) bufferedReader);
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader3;
                    bufferedReader3 = inputStream;
                    bufferedReader2 = bufferedReader3;
                    bufferedReader3 = bufferedReader;
                    r2 = bufferedReader2;
                    IOUtils.closeQuietly((InputStream) r2);
                    IOUtils.closeQuietly((Reader) bufferedReader3);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader2 = inputStream;
                bufferedReader3 = bufferedReader;
                r2 = bufferedReader2;
                IOUtils.closeQuietly((InputStream) r2);
                IOUtils.closeQuietly((Reader) bufferedReader3);
                throw th;
            }
        } catch (Exception unused3) {
            inputStream = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
            bufferedReader2 = bufferedReader3;
            bufferedReader3 = bufferedReader;
            r2 = bufferedReader2;
            IOUtils.closeQuietly((InputStream) r2);
            IOUtils.closeQuietly((Reader) bufferedReader3);
            throw th;
        }
        IOUtils.closeQuietly(inputStream2);
        IOUtils.closeQuietly((Reader) bufferedReader);
    }

    public static String bytesToString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            cArr2[i2] = cArr[(b2 & 255) >>> 4];
            cArr2[i2 + 1] = cArr[b2 & Ascii.SI];
        }
        return String.valueOf(cArr2);
    }

    private static boolean c() {
        try {
        } catch (Exception e2) {
            String str = a;
            HMSLog.i(str, "verifyMDMSignatureV3 MDM verify Exception!:" + e2.getMessage());
        }
        if (a(Base64.decode(EMUI11_PK, 0), a(g, "SHA-384"), b(e), "SHA384withRSA")) {
            HMSLog.i(a, "verifyMDMSignatureV3 verify successful!");
            return true;
        }
        HMSLog.i(a, "verifyMDMSignatureV3 verify failure!");
        return false;
    }

    public static boolean checkSignature() {
        if (e != null) {
            return c();
        }
        if (d != null) {
            return b();
        }
        if (c != null) {
            return a();
        }
        return false;
    }

    public static String getHmsPath(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo("com.huawei.hwid", UserVerificationMethods.USER_VERIFY_PATTERN).sourceDir;
        } catch (AndroidException | RuntimeException unused) {
            HMSLog.e(a, "HMS is not found!");
            return null;
        }
    }

    @TargetApi(19)
    public static boolean isCertFound(String str) {
        ZipFile zipFile;
        boolean z;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (zipFile.getEntry("META-INF/HUAWEI.CER") != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                b(a(zipFile, "META-INF/HUAWEI.CER"));
            }
            try {
                zipFile.close();
            } catch (IOException e3) {
                String str2 = a;
                HMSLog.e(str2, "zipFile.close Exception!" + e3.getMessage());
            }
            return z;
        } catch (Exception e4) {
            e = e4;
            zipFile2 = zipFile;
            String str3 = a;
            HMSLog.e(str3, "isCertFound Exception!" + e.getMessage());
            if (zipFile2 == null) {
                return false;
            }
            try {
                zipFile2.close();
                return false;
            } catch (IOException e5) {
                String str4 = a;
                HMSLog.e(str4, "zipFile.close Exception!" + e5.getMessage());
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e6) {
                    String str5 = a;
                    HMSLog.e(str5, "zipFile.close Exception!" + e6.getMessage());
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.zip.ZipFile] */
    public static boolean verifyApkHash(String str) {
        ZipFile zipFile;
        ZipFile zipFile2;
        StringBuilder sb = null;
        ZipFile zipFile3 = null;
        try {
            try {
                zipFile2 = new ZipFile(str);
            } catch (Throwable th) {
                th = th;
                zipFile = sb;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            byte[] a2 = a(zipFile2);
            ArrayList<String> a3 = a(a2);
            if (a3 != null) {
                a2 = a(a3);
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(a2);
            String bytesToString = bytesToString(messageDigest.digest());
            String str2 = f;
            if (str2 != null) {
                if (str2.equals(bytesToString)) {
                    try {
                        zipFile2.close();
                        return true;
                    } catch (Exception e3) {
                        String str3 = a;
                        HMSLog.i(str3, "close stream Exception!" + e3.getMessage());
                        return true;
                    }
                }
            }
            try {
                zipFile2.close();
                return false;
            } catch (Exception e4) {
                String str4 = a;
                HMSLog.i(str4, "close stream Exception!" + e4.getMessage());
                return false;
            }
        } catch (Exception e5) {
            e = e5;
            zipFile3 = zipFile2;
            String str5 = a;
            HMSLog.i(str5, "verifyApkHash Exception!" + e.getMessage());
            if (zipFile3 != null) {
                try {
                    zipFile3.close();
                    return false;
                } catch (Exception e6) {
                    String str6 = a;
                    sb = new StringBuilder("close stream Exception!");
                    sb.append(e6.getMessage());
                    HMSLog.i(str6, sb.toString());
                    return false;
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            zipFile = zipFile2;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (Exception e7) {
                    String str7 = a;
                    HMSLog.i(str7, "close stream Exception!" + e7.getMessage());
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static byte[] a(ZipFile zipFile, String str) {
        Throwable th;
        InputStream inputStream;
        Exception e2;
        Throwable th2;
        BufferedInputStream bufferedInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream3;
        ByteArrayOutputStream byteArrayOutputStream4;
        ZipEntry entry = zipFile.getEntry(str);
        OutputStream outputStream = null;
        if (entry == null) {
            return null;
        }
        try {
            inputStream = zipFile.getInputStream(entry);
            if (inputStream == null) {
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) null);
                IOUtils.closeQuietly((OutputStream) null);
                IOUtils.closeQuietly((OutputStream) null);
                return null;
            }
            try {
                bufferedInputStream = new BufferedInputStream(inputStream);
            } catch (Exception e3) {
                e2 = e3;
                bufferedInputStream = null;
                byteArrayOutputStream = null;
                byteArrayOutputStream2 = byteArrayOutputStream;
                try {
                    HMSLog.i(a, "getManifestBytes Exception!" + e2.getMessage());
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream2);
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    byteArrayOutputStream4 = byteArrayOutputStream2;
                    bufferedInputStream = bufferedInputStream;
                    byteArrayOutputStream3 = byteArrayOutputStream4;
                    outputStream = byteArrayOutputStream3;
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly(outputStream);
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                bufferedInputStream = null;
                byteArrayOutputStream = null;
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly(outputStream);
                throw th2;
            }
            try {
                byte[] bArr = new byte[4096];
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
                    try {
                        for (int read = bufferedInputStream.read(bArr, 0, 4096); read > 0; read = bufferedInputStream.read(bArr, 0, 4096)) {
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                        bufferedOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((InputStream) bufferedInputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
                        return byteArray;
                    } catch (Exception e4) {
                        e2 = e4;
                        byteArrayOutputStream2 = bufferedOutputStream;
                        HMSLog.i(a, "getManifestBytes Exception!" + e2.getMessage());
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((InputStream) bufferedInputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream2);
                        return null;
                    } catch (Throwable th5) {
                        th2 = th5;
                        byteArrayOutputStream3 = bufferedOutputStream;
                        outputStream = byteArrayOutputStream3;
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((InputStream) bufferedInputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly(outputStream);
                        throw th2;
                    }
                } catch (Exception e5) {
                    e2 = e5;
                    byteArrayOutputStream2 = null;
                } catch (Throwable th6) {
                    th2 = th6;
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly(outputStream);
                    throw th2;
                }
            } catch (Exception e6) {
                e2 = e6;
                byteArrayOutputStream = null;
                byteArrayOutputStream2 = byteArrayOutputStream;
                HMSLog.i(a, "getManifestBytes Exception!" + e2.getMessage());
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream2);
                return null;
            } catch (Throwable th7) {
                th2 = th7;
                byteArrayOutputStream = null;
                byteArrayOutputStream4 = null;
                bufferedInputStream = bufferedInputStream;
                byteArrayOutputStream3 = byteArrayOutputStream4;
                outputStream = byteArrayOutputStream3;
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly(outputStream);
                throw th2;
            }
        } catch (Exception e7) {
            e2 = e7;
            inputStream = null;
        } catch (Throwable th8) {
            th = th8;
            inputStream = null;
        }
    }

    @TargetApi(19)
    private static ArrayList<String> a(byte[] bArr) {
        if (bArr == null) {
            HMSLog.e(a, "manifest is null！");
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream, StandardCharsets.UTF_8));
            try {
                if (a(bufferedReader, arrayList)) {
                    bufferedReader.close();
                    byteArrayInputStream.close();
                    return arrayList;
                }
                bufferedReader.close();
                byteArrayInputStream.close();
                return null;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            HMSLog.e(a, "getManifestLinesArrary IOException!");
            return null;
        }
    }

    private static boolean b() {
        try {
        } catch (Exception e2) {
            String str = a;
            HMSLog.i(str, "verifyMDMSignatureV2 MDM verify Exception!:" + e2.getMessage());
        }
        if (a(Base64.decode(EMUI10_PK, 0), a(g, "SHA-256"), b(d), "SHA256withRSA")) {
            HMSLog.i(a, "verifyMDMSignatureV2 verify successful!");
            return true;
        }
        HMSLog.i(a, "verifyMDMSignatureV2 verify failure!");
        return false;
    }

    private static byte[] b(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        int length = str.length();
        if (length % 2 == 0) {
            i = length / 2;
        } else {
            i = (length / 2) + 1;
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < length; i2 += 2) {
            int i3 = i2 + 1;
            if (i3 < length) {
                bArr[i2 / 2] = (byte) (Character.digit(str.charAt(i3), 16) + (Character.digit(str.charAt(i2), 16) << 4));
            } else {
                bArr[i2 / 2] = (byte) (Character.digit(str.charAt(i2), 16) << 4);
            }
        }
        return bArr;
    }

    @TargetApi(19)
    private static byte[] a(ArrayList<String> arrayList) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, StandardCharsets.UTF_8));
        try {
            try {
                Collections.sort(arrayList);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    String str = arrayList.get(i);
                    bufferedWriter.write(str, 0, str.length());
                    bufferedWriter.write("\r\n", 0, 2);
                }
                bufferedWriter.flush();
            } catch (Exception e2) {
                String str2 = a;
                HMSLog.i(str2, "getManifestBytesbySorted Exception!" + e2.getMessage());
            }
            IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
            IOUtils.closeQuietly((Writer) bufferedWriter);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
            IOUtils.closeQuietly((Writer) bufferedWriter);
            throw th;
        }
    }

    private static boolean a(BufferedReader bufferedReader, ArrayList<String> arrayList) throws IOException {
        String a2 = a(bufferedReader);
        boolean z = false;
        while (a2 != null) {
            if (a2.equals("Name: META-INF/HUAWEI.CER")) {
                String a3 = a(bufferedReader);
                while (true) {
                    if (a3 == null) {
                        break;
                    } else if (a3.startsWith("Name:")) {
                        a2 = a3;
                        break;
                    } else {
                        a3 = a(bufferedReader);
                    }
                }
                z = true;
            }
            if (a2.length() != 0) {
                arrayList.add(a2);
            }
            a2 = a(bufferedReader);
        }
        return z;
    }

    private static String a(BufferedReader bufferedReader) throws IOException {
        int read;
        if (bufferedReader == null || (read = bufferedReader.read()) == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder(10);
        while (read != -1) {
            char c2 = (char) read;
            if (c2 == '\n') {
                break;
            } else if (sb.length() < 4096) {
                sb.append(c2);
                read = bufferedReader.read();
            } else {
                throw new IOException("cert line is too long!");
            }
        }
        String sb2 = sb.toString();
        return (sb2.isEmpty() || !sb2.endsWith("\r")) ? sb2 : sb2.substring(0, sb2.length() - 1);
    }

    private static boolean a() {
        try {
            if (a(b("30820122300d06092a864886f70d01010105000382010f003082010a0282010100a3d269348ac59923f65e8111c337605e29a1d1bc54fa96c1445050dd14d8d63b10f9f0230bb87ef348183660bedcabfdec045e235ed96935799fcdb4af5c97717ff3b0954eaf1b723225b3a00f81cbd67ce6dc5a4c07f7741ad3bf1913a480c6e267ab1740f409edd2dc33c8b718a8e30e56d9a93f321723c1d0c9ea62115f996812ceef186954595e39a19b74245542c407f7dddb1d12e6eedcfc0bd7cd945ef7255ad0fc9e796258e0fb5e52a23013d15033a32b4071b65f3f924ae5c5761e22327b4d2ae60f4158a5eb15565ba079de29b81540f5fbb3be101a95357f367fc661d797074ff3826950029c52223e4594673a24a334cae62d63b838ba3df9770203010001"), a(g, "SHA-256"), b(c), "SHA256withRSA")) {
                HMSLog.i(a, "verifyMDMSignatureV1 verify successful!");
                return true;
            }
            HMSLog.i(a, "verifyMDMSignatureV1 verify failure!");
            return false;
        } catch (Exception e2) {
            String str = a;
            HMSLog.i(str, "verifyMDMSignatureV1 MDM verify Exception!:" + e2.getMessage());
            return false;
        }
    }

    private static boolean a(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) throws Exception {
        Signature signature = Signature.getInstance(str);
        signature.initVerify(KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr)));
        signature.update(bArr2);
        return signature.verify(bArr3);
    }

    @TargetApi(19)
    private static byte[] a(String str, String str2) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        messageDigest.update(str.getBytes(StandardCharsets.UTF_8.name()));
        return messageDigest.digest();
    }

    private static String a(String str) {
        if (str == null) {
            return "";
        }
        return b.matcher(str).replaceAll("");
    }
}
