package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class zzaos {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v29 */
    public static X509Certificate[][] zza(String str) throws zzaoo, SecurityException, IOException {
        RandomAccessFile randomAccessFile;
        String str2 = "end > capacity: ";
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            Pair zzc = zzaot.zzc(randomAccessFile2);
            try {
                if (zzc != null) {
                    ByteBuffer byteBuffer = (ByteBuffer) zzc.first;
                    long longValue = ((Long) zzc.second).longValue();
                    long j = (-20) + longValue;
                    if (j >= 0) {
                        randomAccessFile2.seek(j);
                        if (randomAccessFile2.readInt() == 1347094023) {
                            throw new zzaoo("ZIP64 APK not supported");
                        }
                    }
                    long zza = zzaot.zza(byteBuffer);
                    if (zza < longValue) {
                        if (zza + zzaot.zzb(byteBuffer) == longValue) {
                            if (zza >= 32) {
                                ByteBuffer allocate = ByteBuffer.allocate(24);
                                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                allocate.order(byteOrder);
                                long j2 = longValue;
                                randomAccessFile2.seek(zza - allocate.capacity());
                                randomAccessFile2.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                                if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                                    long j3 = allocate.getLong(0);
                                    if (j3 >= allocate.capacity() && j3 <= 2147483639) {
                                        ?? r1 = (int) (8 + j3);
                                        long j4 = zza - ((long) r1);
                                        try {
                                            if (j4 >= 0) {
                                                try {
                                                    ByteBuffer allocate2 = ByteBuffer.allocate(r1);
                                                    allocate2.order(byteOrder);
                                                    randomAccessFile2.seek(j4);
                                                    randomAccessFile2.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                                    long j5 = zza;
                                                    long j6 = allocate2.getLong(0);
                                                    if (j6 == j3) {
                                                        Pair create = Pair.create(allocate2, Long.valueOf(j4));
                                                        ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                                                        long longValue2 = ((Long) create.second).longValue();
                                                        if (byteBuffer2.order() == byteOrder) {
                                                            int capacity = byteBuffer2.capacity() - 24;
                                                            if (capacity >= 8) {
                                                                int capacity2 = byteBuffer2.capacity();
                                                                if (capacity <= byteBuffer2.capacity()) {
                                                                    int limit = byteBuffer2.limit();
                                                                    int position = byteBuffer2.position();
                                                                    byteBuffer2.position(0);
                                                                    byteBuffer2.limit(capacity);
                                                                    byteBuffer2.position(8);
                                                                    ByteBuffer slice = byteBuffer2.slice();
                                                                    slice.order(byteBuffer2.order());
                                                                    byteBuffer2.position(0);
                                                                    byteBuffer2.limit(limit);
                                                                    byteBuffer2.position(position);
                                                                    int i = 0;
                                                                    while (slice.hasRemaining()) {
                                                                        i++;
                                                                        if (slice.remaining() >= 8) {
                                                                            long j7 = slice.getLong();
                                                                            if (j7 >= 4 && j7 <= 2147483647L) {
                                                                                int i2 = (int) j7;
                                                                                int position2 = slice.position() + i2;
                                                                                if (i2 <= slice.remaining()) {
                                                                                    if (slice.getInt() == 1896449818) {
                                                                                        X509Certificate[][] zzl = zzl(randomAccessFile2.getChannel(), new zzaon(zze(slice, i2 - 4), longValue2, j5, j2, byteBuffer, null));
                                                                                        randomAccessFile2.close();
                                                                                        try {
                                                                                            randomAccessFile2.close();
                                                                                        } catch (IOException unused) {
                                                                                        }
                                                                                        return zzl;
                                                                                    }
                                                                                    long j8 = j2;
                                                                                    long j9 = j5;
                                                                                    slice.position(position2);
                                                                                    j5 = j9;
                                                                                    j2 = j8;
                                                                                } else {
                                                                                    throw new zzaoo("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + slice.remaining());
                                                                                }
                                                                            } else {
                                                                                throw new zzaoo("APK Signing Block entry #" + i + " size out of range: " + j7);
                                                                            }
                                                                        } else {
                                                                            throw new zzaoo("Insufficient data to read size of APK Signing Block entry #" + i);
                                                                        }
                                                                    }
                                                                    throw new zzaoo("No APK Signature Scheme v2 block in APK Signing Block");
                                                                }
                                                                throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                                                            }
                                                            throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                                                        }
                                                        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                                    }
                                                    throw new zzaoo("APK Signing Block sizes in header and footer do not match: " + j6 + " vs " + j3);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    r1 = randomAccessFile2;
                                                    randomAccessFile = r1;
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (IOException unused2) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                            throw new zzaoo("APK Signing Block offset out of range: " + j4);
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } else {
                                        throw new zzaoo("APK Signing Block size out of range: " + j3);
                                    }
                                } else {
                                    throw new zzaoo("No APK Signing Block before ZIP Central Directory");
                                }
                            } else {
                                throw new zzaoo("APK too small for APK Signing Block. ZIP Central Directory offset: " + zza);
                            }
                        } else {
                            throw new zzaoo("ZIP Central Directory is not immediately followed by End of Central Directory");
                        }
                    } else {
                        throw new zzaoo("ZIP Central Directory offset out of range: " + zza + ". ZIP End of Central Directory offset: " + longValue);
                    }
                } else {
                    throw new zzaoo("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile2.length() + " bytes");
                }
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile = str2;
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = randomAccessFile2;
        }
    }

    private static int zzb(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            throw new IllegalArgumentException(AbstractC0324Hi.e(i, "Unknown content digest algorthm: "));
        }
        return 32;
    }

    private static int zzc(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    private static String zzd(int i) {
        if (i != 1) {
            if (i == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException(AbstractC0324Hi.e(i, "Unknown content digest algorthm: "));
        }
        return "SHA-256";
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 >= position && i2 <= limit) {
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        }
        throw new BufferUnderflowException();
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i >= 0) {
                if (i <= byteBuffer.remaining()) {
                    return zze(byteBuffer, i);
                }
                throw new IOException(AbstractC0324Hi.d(i, byteBuffer.remaining(), "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: "));
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IOException(AbstractC0324Hi.e(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: "));
    }

    private static void zzg(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            zzaom zzaomVar = new zzaom(fileChannel, 0L, j);
            zzaom zzaomVar2 = new zzaom(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            zzaot.zzd(duplicate, j);
            zzaok zzaokVar = new zzaok(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i = 0;
            for (Integer num : map.keySet()) {
                iArr[i] = num.intValue();
                i++;
            }
            try {
                byte[][] zzk = zzk(iArr, new zzaol[]{zzaomVar, zzaomVar2, zzaokVar});
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = iArr[i2];
                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), zzk[i2])) {
                        throw new SecurityException(zzd(i3).concat(" digest of contents did not verify"));
                    }
                }
                return;
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        }
        throw new SecurityException("No digests provided");
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i >= 0) {
            if (i <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new IOException(AbstractC0324Hi.d(i, byteBuffer.remaining(), "Underflow while reading length-prefixed value. Length: ", ", available: "));
        }
        throw new IOException("Negative length");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = zzc(r6);
        r12 = zzc(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r11 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r12 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.security.cert.X509Certificate[] zzj(java.nio.ByteBuffer r22, java.util.Map r23, java.security.cert.CertificateFactory r24) throws java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaos.zzj(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] zzk(int[] iArr, zzaol[] zzaolVarArr) throws DigestException {
        long j;
        int i;
        int length;
        int i2 = 0;
        long j2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            j = 1048576;
            if (i3 >= 3) {
                break;
            }
            j3 += (zzaolVarArr[i3].zza() + 1048575) / 1048576;
            i3++;
        }
        if (j3 < 2097151) {
            byte[][] bArr = new byte[iArr.length];
            int i4 = 0;
            while (true) {
                length = iArr.length;
                if (i4 >= length) {
                    break;
                }
                int i5 = (int) j3;
                byte[] bArr2 = new byte[(zzb(iArr[i4]) * i5) + 5];
                bArr2[0] = 90;
                zzg(i5, bArr2, 1);
                bArr[i4] = bArr2;
                i4++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i6 = 0; i6 < iArr.length; i6++) {
                String zzd = zzd(iArr[i6]);
                try {
                    messageDigestArr[i6] = MessageDigest.getInstance(zzd);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(zzd.concat(" digest not supported"), e);
                }
            }
            int i7 = 0;
            int i8 = 0;
            for (i = 3; i7 < i; i = 3) {
                zzaol zzaolVar = zzaolVarArr[i7];
                long j4 = j2;
                long zza = zzaolVar.zza();
                while (zza > j2) {
                    int min = (int) Math.min(zza, j);
                    zzg(min, bArr3, 1);
                    for (int i9 = 0; i9 < length; i9++) {
                        messageDigestArr[i9].update(bArr3);
                    }
                    long j5 = j4;
                    try {
                        zzaolVar.zzb(messageDigestArr, j5, min);
                        byte[] bArr4 = bArr3;
                        int i10 = 0;
                        while (i10 < iArr.length) {
                            int i11 = iArr[i10];
                            zzaol zzaolVar2 = zzaolVar;
                            byte[] bArr5 = bArr[i10];
                            int zzb = zzb(i11);
                            int i12 = length;
                            MessageDigest messageDigest = messageDigestArr[i10];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr5, (i8 * zzb) + 5, zzb);
                            if (digest == zzb) {
                                i10++;
                                zzaolVar = zzaolVar2;
                                length = i12;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                            }
                        }
                        long j6 = min;
                        long j7 = j5 + j6;
                        zza -= j6;
                        i8++;
                        j2 = 0;
                        j = 1048576;
                        bArr3 = bArr4;
                        j4 = j7;
                        messageDigestArr = messageDigestArr;
                    } catch (IOException e2) {
                        throw new DigestException(AbstractC0324Hi.d(i8, i2, "Failed to digest chunk #", " of section #"), e2);
                    }
                }
                i2++;
                i7++;
                j2 = 0;
                j = 1048576;
            }
            byte[][] bArr6 = new byte[iArr.length];
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                byte[] bArr7 = bArr[i13];
                String zzd2 = zzd(i14);
                try {
                    bArr6[i13] = MessageDigest.getInstance(zzd2).digest(bArr7);
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(zzd2.concat(" digest not supported"), e3);
                }
            }
            return bArr6;
        }
        throw new DigestException(BK.l(j3, "Too many chunks: "));
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzaon zzaonVar) throws SecurityException {
        ByteBuffer byteBuffer;
        long j;
        long j2;
        long j3;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzaonVar.zza;
                ByteBuffer zzf = zzf(byteBuffer);
                int i = 0;
                while (zzf.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(AbstractC2437ph.c(i, "Failed to parse/verify signer #", " block"), e);
                    }
                }
                if (i > 0) {
                    if (!hashMap.isEmpty()) {
                        j = zzaonVar.zzb;
                        j2 = zzaonVar.zzc;
                        j3 = zzaonVar.zzd;
                        byteBuffer2 = zzaonVar.zze;
                        zzh(hashMap, fileChannel, j, j2, j3, byteBuffer2);
                        return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("No signers found");
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}
