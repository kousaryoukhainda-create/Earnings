package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j$.util.DesugarTimeZone;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
/* renamed from: Cs  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204Cs {
    public static final String[] D;
    public static final int[] E;
    public static final byte[] F;
    public static final C3313zs G;
    public static final C3313zs[][] H;
    public static final C3313zs[] I;
    public static final HashMap[] J;
    public static final HashMap[] K;
    public static final HashSet L;
    public static final HashMap M;
    public static final Charset N;
    public static final byte[] O;
    public static final byte[] P;
    public final FileDescriptor a;
    public final AssetManager.AssetInputStream b;
    public int c;
    public final HashMap[] d;
    public final HashSet e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public static final boolean l = Log.isLoggable("ExifInterface", 3);
    public static final List m = Arrays.asList(1, 6, 3, 8);
    public static final List n = Arrays.asList(2, 7, 4, 5);
    public static final int[] o = {8, 8, 8};
    public static final int[] p = {8};
    public static final byte[] q = {-1, -40, -1};
    public static final byte[] r = {102, 116, 121, 112};
    public static final byte[] s = {109, 105, 102, 49};
    public static final byte[] t = {104, 101, 105, 99};
    public static final byte[] u = {79, 76, 89, 77, 80, 0};
    public static final byte[] v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] w = {-119, 80, 78, 71, Ascii.CR, 10, Ascii.SUB, 10};
    public static final byte[] x = {101, 88, 73, 102};
    public static final byte[] y = {73, 72, 68, 82};
    public static final byte[] z = {73, 69, 78, 68};
    public static final byte[] A = {82, 73, 70, 70};
    public static final byte[] B = {87, 69, 66, 80};
    public static final byte[] C = {69, 88, 73, 70};

    static {
        C3313zs[] c3313zsArr;
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        D = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C3313zs[] c3313zsArr2 = {new C3313zs("NewSubfileType", 254, 4), new C3313zs("SubfileType", 255, 4), new C3313zs("ImageWidth", UserVerificationMethods.USER_VERIFY_HANDPRINT, 3, 4), new C3313zs("ImageLength", 257, 3, 4), new C3313zs("BitsPerSample", 258, 3), new C3313zs("Compression", 259, 3), new C3313zs("PhotometricInterpretation", 262, 3), new C3313zs("ImageDescription", 270, 2), new C3313zs("Make", 271, 2), new C3313zs("Model", 272, 2), new C3313zs("StripOffsets", 273, 3, 4), new C3313zs("Orientation", 274, 3), new C3313zs("SamplesPerPixel", 277, 3), new C3313zs("RowsPerStrip", 278, 3, 4), new C3313zs("StripByteCounts", 279, 3, 4), new C3313zs("XResolution", 282, 5), new C3313zs("YResolution", 283, 5), new C3313zs("PlanarConfiguration", 284, 3), new C3313zs("ResolutionUnit", 296, 3), new C3313zs("TransferFunction", 301, 3), new C3313zs("Software", 305, 2), new C3313zs("DateTime", 306, 2), new C3313zs("Artist", 315, 2), new C3313zs("WhitePoint", 318, 5), new C3313zs("PrimaryChromaticities", 319, 5), new C3313zs("SubIFDPointer", 330, 4), new C3313zs("JPEGInterchangeFormat", 513, 4), new C3313zs("JPEGInterchangeFormatLength", 514, 4), new C3313zs("YCbCrCoefficients", 529, 5), new C3313zs("YCbCrSubSampling", 530, 3), new C3313zs("YCbCrPositioning", 531, 3), new C3313zs("ReferenceBlackWhite", 532, 5), new C3313zs("Copyright", 33432, 2), new C3313zs("ExifIFDPointer", 34665, 4), new C3313zs("GPSInfoIFDPointer", 34853, 4), new C3313zs("SensorTopBorder", 4, 4), new C3313zs("SensorLeftBorder", 5, 4), new C3313zs("SensorBottomBorder", 6, 4), new C3313zs("SensorRightBorder", 7, 4), new C3313zs("ISO", 23, 3), new C3313zs("JpgFromRaw", 46, 7), new C3313zs("Xmp", 700, 1)};
        G = new C3313zs("StripOffsets", 273, 3);
        H = new C3313zs[][]{c3313zsArr2, new C3313zs[]{new C3313zs("ExposureTime", 33434, 5), new C3313zs("FNumber", 33437, 5), new C3313zs("ExposureProgram", 34850, 3), new C3313zs("SpectralSensitivity", 34852, 2), new C3313zs("PhotographicSensitivity", 34855, 3), new C3313zs("OECF", 34856, 7), new C3313zs("SensitivityType", 34864, 3), new C3313zs("StandardOutputSensitivity", 34865, 4), new C3313zs("RecommendedExposureIndex", 34866, 4), new C3313zs("ISOSpeed", 34867, 4), new C3313zs("ISOSpeedLatitudeyyy", 34868, 4), new C3313zs("ISOSpeedLatitudezzz", 34869, 4), new C3313zs("ExifVersion", 36864, 2), new C3313zs("DateTimeOriginal", 36867, 2), new C3313zs("DateTimeDigitized", 36868, 2), new C3313zs("OffsetTime", 36880, 2), new C3313zs("OffsetTimeOriginal", 36881, 2), new C3313zs("OffsetTimeDigitized", 36882, 2), new C3313zs("ComponentsConfiguration", 37121, 7), new C3313zs("CompressedBitsPerPixel", 37122, 5), new C3313zs("ShutterSpeedValue", 37377, 10), new C3313zs("ApertureValue", 37378, 5), new C3313zs("BrightnessValue", 37379, 10), new C3313zs("ExposureBiasValue", 37380, 10), new C3313zs("MaxApertureValue", 37381, 5), new C3313zs("SubjectDistance", 37382, 5), new C3313zs("MeteringMode", 37383, 3), new C3313zs("LightSource", 37384, 3), new C3313zs("Flash", 37385, 3), new C3313zs("FocalLength", 37386, 5), new C3313zs("SubjectArea", 37396, 3), new C3313zs("MakerNote", 37500, 7), new C3313zs("UserComment", 37510, 7), new C3313zs("SubSecTime", 37520, 2), new C3313zs("SubSecTimeOriginal", 37521, 2), new C3313zs("SubSecTimeDigitized", 37522, 2), new C3313zs("FlashpixVersion", 40960, 7), new C3313zs("ColorSpace", 40961, 3), new C3313zs("PixelXDimension", 40962, 3, 4), new C3313zs("PixelYDimension", 40963, 3, 4), new C3313zs("RelatedSoundFile", 40964, 2), new C3313zs("InteroperabilityIFDPointer", 40965, 4), new C3313zs("FlashEnergy", 41483, 5), new C3313zs("SpatialFrequencyResponse", 41484, 7), new C3313zs("FocalPlaneXResolution", 41486, 5), new C3313zs("FocalPlaneYResolution", 41487, 5), new C3313zs("FocalPlaneResolutionUnit", 41488, 3), new C3313zs("SubjectLocation", 41492, 3), new C3313zs("ExposureIndex", 41493, 5), new C3313zs("SensingMethod", 41495, 3), new C3313zs("FileSource", 41728, 7), new C3313zs("SceneType", 41729, 7), new C3313zs("CFAPattern", 41730, 7), new C3313zs("CustomRendered", 41985, 3), new C3313zs("ExposureMode", 41986, 3), new C3313zs("WhiteBalance", 41987, 3), new C3313zs("DigitalZoomRatio", 41988, 5), new C3313zs("FocalLengthIn35mmFilm", 41989, 3), new C3313zs("SceneCaptureType", 41990, 3), new C3313zs("GainControl", 41991, 3), new C3313zs("Contrast", 41992, 3), new C3313zs("Saturation", 41993, 3), new C3313zs("Sharpness", 41994, 3), new C3313zs("DeviceSettingDescription", 41995, 7), new C3313zs("SubjectDistanceRange", 41996, 3), new C3313zs("ImageUniqueID", 42016, 2), new C3313zs("CameraOwnerName", 42032, 2), new C3313zs("BodySerialNumber", 42033, 2), new C3313zs("LensSpecification", 42034, 5), new C3313zs("LensMake", 42035, 2), new C3313zs("LensModel", 42036, 2), new C3313zs("Gamma", 42240, 5), new C3313zs("DNGVersion", 50706, 1), new C3313zs("DefaultCropSize", 50720, 3, 4)}, new C3313zs[]{new C3313zs("GPSVersionID", 0, 1), new C3313zs("GPSLatitudeRef", 1, 2), new C3313zs("GPSLatitude", 2, 5, 10), new C3313zs("GPSLongitudeRef", 3, 2), new C3313zs("GPSLongitude", 4, 5, 10), new C3313zs("GPSAltitudeRef", 5, 1), new C3313zs("GPSAltitude", 6, 5), new C3313zs("GPSTimeStamp", 7, 5), new C3313zs("GPSSatellites", 8, 2), new C3313zs("GPSStatus", 9, 2), new C3313zs("GPSMeasureMode", 10, 2), new C3313zs("GPSDOP", 11, 5), new C3313zs("GPSSpeedRef", 12, 2), new C3313zs("GPSSpeed", 13, 5), new C3313zs("GPSTrackRef", 14, 2), new C3313zs("GPSTrack", 15, 5), new C3313zs("GPSImgDirectionRef", 16, 2), new C3313zs("GPSImgDirection", 17, 5), new C3313zs("GPSMapDatum", 18, 2), new C3313zs("GPSDestLatitudeRef", 19, 2), new C3313zs("GPSDestLatitude", 20, 5), new C3313zs("GPSDestLongitudeRef", 21, 2), new C3313zs("GPSDestLongitude", 22, 5), new C3313zs("GPSDestBearingRef", 23, 2), new C3313zs("GPSDestBearing", 24, 5), new C3313zs("GPSDestDistanceRef", 25, 2), new C3313zs("GPSDestDistance", 26, 5), new C3313zs("GPSProcessingMethod", 27, 7), new C3313zs("GPSAreaInformation", 28, 7), new C3313zs("GPSDateStamp", 29, 2), new C3313zs("GPSDifferential", 30, 3), new C3313zs("GPSHPositioningError", 31, 5)}, new C3313zs[]{new C3313zs("InteroperabilityIndex", 1, 2)}, new C3313zs[]{new C3313zs("NewSubfileType", 254, 4), new C3313zs("SubfileType", 255, 4), new C3313zs("ThumbnailImageWidth", UserVerificationMethods.USER_VERIFY_HANDPRINT, 3, 4), new C3313zs("ThumbnailImageLength", 257, 3, 4), new C3313zs("BitsPerSample", 258, 3), new C3313zs("Compression", 259, 3), new C3313zs("PhotometricInterpretation", 262, 3), new C3313zs("ImageDescription", 270, 2), new C3313zs("Make", 271, 2), new C3313zs("Model", 272, 2), new C3313zs("StripOffsets", 273, 3, 4), new C3313zs("ThumbnailOrientation", 274, 3), new C3313zs("SamplesPerPixel", 277, 3), new C3313zs("RowsPerStrip", 278, 3, 4), new C3313zs("StripByteCounts", 279, 3, 4), new C3313zs("XResolution", 282, 5), new C3313zs("YResolution", 283, 5), new C3313zs("PlanarConfiguration", 284, 3), new C3313zs("ResolutionUnit", 296, 3), new C3313zs("TransferFunction", 301, 3), new C3313zs("Software", 305, 2), new C3313zs("DateTime", 306, 2), new C3313zs("Artist", 315, 2), new C3313zs("WhitePoint", 318, 5), new C3313zs("PrimaryChromaticities", 319, 5), new C3313zs("SubIFDPointer", 330, 4), new C3313zs("JPEGInterchangeFormat", 513, 4), new C3313zs("JPEGInterchangeFormatLength", 514, 4), new C3313zs("YCbCrCoefficients", 529, 5), new C3313zs("YCbCrSubSampling", 530, 3), new C3313zs("YCbCrPositioning", 531, 3), new C3313zs("ReferenceBlackWhite", 532, 5), new C3313zs("Copyright", 33432, 2), new C3313zs("ExifIFDPointer", 34665, 4), new C3313zs("GPSInfoIFDPointer", 34853, 4), new C3313zs("DNGVersion", 50706, 1), new C3313zs("DefaultCropSize", 50720, 3, 4)}, c3313zsArr2, new C3313zs[]{new C3313zs("ThumbnailImage", UserVerificationMethods.USER_VERIFY_HANDPRINT, 7), new C3313zs("CameraSettingsIFDPointer", 8224, 4), new C3313zs("ImageProcessingIFDPointer", 8256, 4)}, new C3313zs[]{new C3313zs("PreviewImageStart", 257, 4), new C3313zs("PreviewImageLength", 258, 4)}, new C3313zs[]{new C3313zs("AspectFrame", 4371, 3)}, new C3313zs[]{new C3313zs("ColorSpace", 55, 3)}};
        I = new C3313zs[]{new C3313zs("SubIFDPointer", 330, 4), new C3313zs("ExifIFDPointer", 34665, 4), new C3313zs("GPSInfoIFDPointer", 34853, 4), new C3313zs("InteroperabilityIFDPointer", 40965, 4), new C3313zs("CameraSettingsIFDPointer", 8224, 1), new C3313zs("ImageProcessingIFDPointer", 8256, 1)};
        J = new HashMap[10];
        K = new HashMap[10];
        L = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        M = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        N = forName;
        O = "Exif\u0000\u0000".getBytes(forName);
        P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C3313zs[][] c3313zsArr3 = H;
            if (i < c3313zsArr3.length) {
                J[i] = new HashMap();
                K[i] = new HashMap();
                for (C3313zs c3313zs : c3313zsArr3[i]) {
                    J[i].put(Integer.valueOf(c3313zs.a), c3313zs);
                    K[i].put(c3313zs.b, c3313zs);
                }
                i++;
            } else {
                HashMap hashMap = M;
                C3313zs[] c3313zsArr4 = I;
                hashMap.put(Integer.valueOf(c3313zsArr4[0].a), 5);
                hashMap.put(Integer.valueOf(c3313zsArr4[1].a), 1);
                hashMap.put(Integer.valueOf(c3313zsArr4[2].a), 2);
                hashMap.put(Integer.valueOf(c3313zsArr4[3].a), 3);
                hashMap.put(Integer.valueOf(c3313zsArr4[4].a), 7);
                hashMap.put(Integer.valueOf(c3313zsArr4[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa A[Catch: all -> 0x0030, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0030, blocks: (B:3:0x0021, B:5:0x0024, B:12:0x0039, B:18:0x0056, B:20:0x0061, B:28:0x0077, B:23:0x0068, B:26:0x0070, B:27:0x0074, B:29:0x0081, B:31:0x008a, B:33:0x0090, B:35:0x0096, B:37:0x009c, B:42:0x00aa), top: B:52:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0204Cs(java.io.ByteArrayInputStream r9) {
        /*
            r8 = this;
            r8.<init>()
            zs[][] r0 = defpackage.C0204Cs.H
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r8.d = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r2 = r0.length
            r1.<init>(r2)
            r8.e = r1
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r8.f = r1
            r1 = 0
            boolean r2 = defpackage.C0204Cs.l
            java.lang.String r3 = "ExifInterface"
            r8.b = r1
            r8.a = r1
            r1 = 0
            r4 = 0
        L21:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            if (r4 >= r5) goto L39
            java.util.HashMap[] r5 = r8.d     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r6.<init>()     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r5[r4] = r6     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r4 = r4 + 1
            goto L21
        L30:
            r9 = move-exception
            goto Lb0
        L33:
            r9 = move-exception
            goto La8
        L36:
            r9 = move-exception
            goto La8
        L39:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r4 = 5000(0x1388, float:7.006E-42)
            r0.<init>(r9, r4)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r9 = r8.f(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r8.c = r9     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r4 = 14
            r5 = 13
            r6 = 9
            r7 = 4
            if (r9 == r7) goto L81
            if (r9 == r6) goto L81
            if (r9 == r5) goto L81
            if (r9 != r4) goto L56
            goto L81
        L56:
            Bs r9 = new Bs     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r0 = r8.c     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r1 = 12
            if (r0 != r1) goto L65
            r8.d(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L77
        L65:
            r1 = 7
            if (r0 != r1) goto L6c
            r8.g(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L77
        L6c:
            r1 = 10
            if (r0 != r1) goto L74
            r8.k(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L77
        L74:
            r8.j(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
        L77:
            int r0 = r8.h     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r9.b(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r8.u(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L81:
            xs r9 = new xs     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r0 = r8.c     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            if (r0 != r7) goto L8e
            r8.e(r9, r1, r1)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L8e:
            if (r0 != r5) goto L94
            r8.h(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L94:
            if (r0 != r6) goto L9a
            r8.i(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L9a:
            if (r0 != r4) goto L9f
            r8.l(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
        L9f:
            r8.a()
            if (r2 == 0) goto Lbf
        La4:
            r8.p()
            goto Lbf
        La8:
            if (r2 == 0) goto Lb9
            java.lang.String r0 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r3, r0, r9)     // Catch: java.lang.Throwable -> L30
            goto Lb9
        Lb0:
            r8.a()
            if (r2 == 0) goto Lb8
            r8.p()
        Lb8:
            throw r9
        Lb9:
            r8.a()
            if (r2 == 0) goto Lbf
            goto La4
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0204Cs.<init>(java.io.ByteArrayInputStream):void");
    }

    public static ByteOrder q(C3141xs c3141xs) {
        short readShort = c3141xs.readShort();
        boolean z2 = l;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z2) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        String b = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.d;
        if (b != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b.concat("\u0000").getBytes(N);
            hashMap.put("DateTime", new C3227ys(2, bytes, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", C3227ys.a(0L, this.f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", C3227ys.a(0L, this.f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", C3227ys.a(0L, this.f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", C3227ys.a(0L, this.f));
        }
    }

    public final String b(String str) {
        C3227ys c = c(str);
        if (c != null) {
            if (!L.contains(str)) {
                return c.f(this.f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = c.a;
                if (i != 5 && i != 10) {
                    AbstractC2437ph.o(i, "GPS Timestamp format is not rational. format=", "ExifInterface");
                    return null;
                }
                C0152As[] c0152AsArr = (C0152As[]) c.g(this.f);
                if (c0152AsArr != null && c0152AsArr.length == 3) {
                    C0152As c0152As = c0152AsArr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) c0152As.a) / ((float) c0152As.b)));
                    C0152As c0152As2 = c0152AsArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) c0152As2.a) / ((float) c0152As2.b)));
                    C0152As c0152As3 = c0152AsArr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) c0152As3.a) / ((float) c0152As3.b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c0152AsArr));
                return null;
            }
            try {
                return Double.toString(c.d(this.f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final C3227ys c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < H.length; i++) {
            C3227ys c3227ys = (C3227ys) this.d[i].get(str);
            if (c3227ys != null) {
                return c3227ys;
            }
        }
        return null;
    }

    public final void d(C0178Bs c0178Bs) {
        String str;
        String str2;
        String str3;
        int i;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    AbstractC0256Es.a(mediaMetadataRetriever, new C3055ws(c0178Bs));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    HashMap[] hashMapArr = this.d;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", C3227ys.c(Integer.parseInt(str), this.f));
                    }
                    if (str2 != null) {
                        hashMapArr[0].put("ImageLength", C3227ys.c(Integer.parseInt(str2), this.f));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i = 1;
                                } else {
                                    i = 8;
                                }
                            } else {
                                i = 3;
                            }
                        } else {
                            i = 6;
                        }
                        hashMapArr[0].put("Orientation", C3227ys.c(i, this.f));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            c0178Bs.b(parseInt2);
                            byte[] bArr = new byte[6];
                            if (c0178Bs.read(bArr) == 6) {
                                int i2 = parseInt2 + 6;
                                int i3 = parseInt3 - 6;
                                if (Arrays.equals(bArr, O)) {
                                    byte[] bArr2 = new byte[i3];
                                    if (c0178Bs.read(bArr2) == i3) {
                                        this.h = i2;
                                        r(0, bArr2);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (l) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    mediaMetadataRetriever.release();
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a2, code lost:
        r23.c = r22.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a6, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018e A[LOOP:0: B:10:0x0034->B:82:0x018e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0196 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.C3141xs r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0204Cs.e(xs, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bf, code lost:
        if (r8 != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0204Cs.f(java.io.BufferedInputStream):int");
    }

    public final void g(C0178Bs c0178Bs) {
        int i;
        int i2;
        j(c0178Bs);
        HashMap[] hashMapArr = this.d;
        C3227ys c3227ys = (C3227ys) hashMapArr[1].get("MakerNote");
        if (c3227ys != null) {
            C0178Bs c0178Bs2 = new C0178Bs(c3227ys.d);
            c0178Bs2.c = this.f;
            byte[] bArr = u;
            byte[] bArr2 = new byte[bArr.length];
            c0178Bs2.readFully(bArr2);
            c0178Bs2.b(0L);
            byte[] bArr3 = v;
            byte[] bArr4 = new byte[bArr3.length];
            c0178Bs2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c0178Bs2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c0178Bs2.b(12L);
            }
            s(c0178Bs2, 6);
            C3227ys c3227ys2 = (C3227ys) hashMapArr[7].get("PreviewImageStart");
            C3227ys c3227ys3 = (C3227ys) hashMapArr[7].get("PreviewImageLength");
            if (c3227ys2 != null && c3227ys3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", c3227ys2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", c3227ys3);
            }
            C3227ys c3227ys4 = (C3227ys) hashMapArr[8].get("AspectFrame");
            if (c3227ys4 != null) {
                int[] iArr = (int[]) c3227ys4.g(this.f);
                if (iArr != null && iArr.length == 4) {
                    int i3 = iArr[2];
                    int i4 = iArr[0];
                    if (i3 > i4 && (i = iArr[3]) > (i2 = iArr[1])) {
                        int i5 = (i3 - i4) + 1;
                        int i6 = (i - i2) + 1;
                        if (i5 < i6) {
                            int i7 = i5 + i6;
                            i6 = i7 - i6;
                            i5 = i7 - i6;
                        }
                        C3227ys c = C3227ys.c(i5, this.f);
                        C3227ys c2 = C3227ys.c(i6, this.f);
                        hashMapArr[0].put("ImageWidth", c);
                        hashMapArr[0].put("ImageLength", c2);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void h(C3141xs c3141xs) {
        if (l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c3141xs);
        }
        c3141xs.c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = w;
        c3141xs.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = c3141xs.readInt();
                byte[] bArr2 = new byte[4];
                if (c3141xs.read(bArr2) == 4) {
                    int i = length + 8;
                    if (i == 16 && !Arrays.equals(bArr2, y)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, z)) {
                        if (Arrays.equals(bArr2, x)) {
                            byte[] bArr3 = new byte[readInt];
                            if (c3141xs.read(bArr3) == readInt) {
                                int readInt2 = c3141xs.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.h = i;
                                    r(0, bArr3);
                                    x();
                                    u(new C3141xs(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC2870uj.i(bArr2));
                        }
                        int i2 = readInt + 4;
                        c3141xs.a(i2);
                        length = i + i2;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(C3141xs c3141xs) {
        boolean z2 = l;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c3141xs);
        }
        c3141xs.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c3141xs.read(bArr);
        c3141xs.read(bArr2);
        c3141xs.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c3141xs.a(i - c3141xs.d);
        c3141xs.read(bArr4);
        e(new C3141xs(bArr4), i, 5);
        c3141xs.a(i3 - c3141xs.d);
        c3141xs.c = ByteOrder.BIG_ENDIAN;
        int readInt = c3141xs.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = c3141xs.readUnsignedShort();
            int readUnsignedShort2 = c3141xs.readUnsignedShort();
            if (readUnsignedShort == G.a) {
                short readShort = c3141xs.readShort();
                short readShort2 = c3141xs.readShort();
                C3227ys c = C3227ys.c(readShort, this.f);
                C3227ys c2 = C3227ys.c(readShort2, this.f);
                HashMap[] hashMapArr = this.d;
                hashMapArr[0].put("ImageLength", c);
                hashMapArr[0].put("ImageWidth", c2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c3141xs.a(readUnsignedShort2);
        }
    }

    public final void j(C0178Bs c0178Bs) {
        o(c0178Bs);
        s(c0178Bs, 0);
        w(c0178Bs, 0);
        w(c0178Bs, 5);
        w(c0178Bs, 4);
        x();
        if (this.c == 8) {
            HashMap[] hashMapArr = this.d;
            C3227ys c3227ys = (C3227ys) hashMapArr[1].get("MakerNote");
            if (c3227ys != null) {
                C0178Bs c0178Bs2 = new C0178Bs(c3227ys.d);
                c0178Bs2.c = this.f;
                c0178Bs2.a(6);
                s(c0178Bs2, 9);
                C3227ys c3227ys2 = (C3227ys) hashMapArr[9].get("ColorSpace");
                if (c3227ys2 != null) {
                    hashMapArr[1].put("ColorSpace", c3227ys2);
                }
            }
        }
    }

    public final void k(C0178Bs c0178Bs) {
        if (l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c0178Bs);
        }
        j(c0178Bs);
        HashMap[] hashMapArr = this.d;
        C3227ys c3227ys = (C3227ys) hashMapArr[0].get("JpgFromRaw");
        if (c3227ys != null) {
            e(new C3141xs(c3227ys.d), (int) c3227ys.c, 5);
        }
        C3227ys c3227ys2 = (C3227ys) hashMapArr[0].get("ISO");
        C3227ys c3227ys3 = (C3227ys) hashMapArr[1].get("PhotographicSensitivity");
        if (c3227ys2 != null && c3227ys3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", c3227ys2);
        }
    }

    public final void l(C3141xs c3141xs) {
        if (l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c3141xs);
        }
        c3141xs.c = ByteOrder.LITTLE_ENDIAN;
        c3141xs.a(A.length);
        int readInt = c3141xs.readInt() + 8;
        byte[] bArr = B;
        c3141xs.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c3141xs.read(bArr2) == 4) {
                    int readInt2 = c3141xs.readInt();
                    int i = length + 8;
                    if (Arrays.equals(C, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (c3141xs.read(bArr3) == readInt2) {
                            this.h = i;
                            r(0, bArr3);
                            u(new C3141xs(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC2870uj.i(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        c3141xs.a(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(C3141xs c3141xs, HashMap hashMap) {
        C3227ys c3227ys = (C3227ys) hashMap.get("JPEGInterchangeFormat");
        C3227ys c3227ys2 = (C3227ys) hashMap.get("JPEGInterchangeFormatLength");
        if (c3227ys != null && c3227ys2 != null) {
            int e = c3227ys.e(this.f);
            int e2 = c3227ys2.e(this.f);
            if (this.c == 7) {
                e += this.i;
            }
            if (e > 0 && e2 > 0 && this.b == null && this.a == null) {
                c3141xs.skip(e);
                c3141xs.read(new byte[e2]);
            }
            if (l) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e + ", length: " + e2);
            }
        }
    }

    public final boolean n(HashMap hashMap) {
        C3227ys c3227ys = (C3227ys) hashMap.get("ImageLength");
        C3227ys c3227ys2 = (C3227ys) hashMap.get("ImageWidth");
        if (c3227ys != null && c3227ys2 != null) {
            int e = c3227ys.e(this.f);
            int e2 = c3227ys2.e(this.f);
            if (e <= 512 && e2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o(C0178Bs c0178Bs) {
        ByteOrder q2 = q(c0178Bs);
        this.f = q2;
        c0178Bs.c = q2;
        int readUnsignedShort = c0178Bs.readUnsignedShort();
        int i = this.c;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c0178Bs.readInt();
        if (readInt >= 8) {
            int i2 = readInt - 8;
            if (i2 > 0) {
                c0178Bs.a(i2);
                return;
            }
            return;
        }
        throw new IOException(AbstractC0324Hi.e(readInt, "Invalid first Ifd offset: "));
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.d;
            if (i < hashMapArr.length) {
                StringBuilder i2 = AbstractC0324Hi.i(i, "The size of tag group[", "]: ");
                i2.append(hashMapArr[i].size());
                Log.d("ExifInterface", i2.toString());
                for (Map.Entry entry : hashMapArr[i].entrySet()) {
                    C3227ys c3227ys = (C3227ys) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c3227ys.toString() + ", tagValue: '" + c3227ys.f(this.f) + "'");
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void r(int i, byte[] bArr) {
        C0178Bs c0178Bs = new C0178Bs(bArr);
        o(c0178Bs);
        s(c0178Bs, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(defpackage.C0178Bs r29, int r30) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0204Cs.s(Bs, int):void");
    }

    public final void t(int i, String str, String str2) {
        HashMap[] hashMapArr = this.d;
        if (!hashMapArr[i].isEmpty() && hashMapArr[i].get(str) != null) {
            HashMap hashMap = hashMapArr[i];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i].remove(str);
        }
    }

    public final void u(C3141xs c3141xs) {
        C3227ys c3227ys;
        int e;
        HashMap hashMap = this.d[4];
        C3227ys c3227ys2 = (C3227ys) hashMap.get("Compression");
        if (c3227ys2 != null) {
            int e2 = c3227ys2.e(this.f);
            int i = 1;
            if (e2 != 1) {
                if (e2 != 6) {
                    if (e2 != 7) {
                        return;
                    }
                } else {
                    m(c3141xs, hashMap);
                    return;
                }
            }
            C3227ys c3227ys3 = (C3227ys) hashMap.get("BitsPerSample");
            if (c3227ys3 != null) {
                int[] iArr = (int[]) c3227ys3.g(this.f);
                int[] iArr2 = o;
                if (Arrays.equals(iArr2, iArr) || (this.c == 3 && (c3227ys = (C3227ys) hashMap.get("PhotometricInterpretation")) != null && (((e = c3227ys.e(this.f)) == 1 && Arrays.equals(iArr, p)) || (e == 6 && Arrays.equals(iArr, iArr2))))) {
                    C3227ys c3227ys4 = (C3227ys) hashMap.get("StripOffsets");
                    C3227ys c3227ys5 = (C3227ys) hashMap.get("StripByteCounts");
                    if (c3227ys4 != null && c3227ys5 != null) {
                        long[] m2 = AbstractC2870uj.m(c3227ys4.g(this.f));
                        long[] m3 = AbstractC2870uj.m(c3227ys5.g(this.f));
                        if (m2 != null && m2.length != 0) {
                            if (m3 != null && m3.length != 0) {
                                if (m2.length != m3.length) {
                                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                    return;
                                }
                                long j = 0;
                                for (long j2 : m3) {
                                    j += j2;
                                }
                                byte[] bArr = new byte[(int) j];
                                this.g = true;
                                int i2 = 0;
                                int i3 = 0;
                                int i4 = 0;
                                while (i2 < m2.length) {
                                    int i5 = (int) m2[i2];
                                    int i6 = (int) m3[i2];
                                    if (i2 < m2.length - i && i5 + i6 != m2[i2 + 1]) {
                                        this.g = false;
                                    }
                                    int i7 = i5 - i3;
                                    if (i7 < 0) {
                                        Log.d("ExifInterface", "Invalid strip offset value");
                                        return;
                                    }
                                    long j3 = i7;
                                    if (c3141xs.skip(j3) != j3) {
                                        Log.d("ExifInterface", "Failed to skip " + i7 + " bytes.");
                                        return;
                                    }
                                    int i8 = i3 + i7;
                                    byte[] bArr2 = new byte[i6];
                                    if (c3141xs.read(bArr2) != i6) {
                                        Log.d("ExifInterface", "Failed to read " + i6 + " bytes.");
                                        return;
                                    }
                                    i3 = i8 + i6;
                                    System.arraycopy(bArr2, 0, bArr, i4, i6);
                                    i4 += i6;
                                    i2++;
                                    i = 1;
                                }
                                if (this.g) {
                                    long j4 = m2[0];
                                    return;
                                }
                                return;
                            }
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        }
                        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                        return;
                    }
                    return;
                }
            }
            if (l) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        m(c3141xs, hashMap);
    }

    public final void v(int i, int i2) {
        HashMap[] hashMapArr = this.d;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z2 = l;
        if (!isEmpty && !hashMapArr[i2].isEmpty()) {
            C3227ys c3227ys = (C3227ys) hashMapArr[i].get("ImageLength");
            C3227ys c3227ys2 = (C3227ys) hashMapArr[i].get("ImageWidth");
            C3227ys c3227ys3 = (C3227ys) hashMapArr[i2].get("ImageLength");
            C3227ys c3227ys4 = (C3227ys) hashMapArr[i2].get("ImageWidth");
            if (c3227ys != null && c3227ys2 != null) {
                if (c3227ys3 != null && c3227ys4 != null) {
                    int e = c3227ys.e(this.f);
                    int e2 = c3227ys2.e(this.f);
                    int e3 = c3227ys3.e(this.f);
                    int e4 = c3227ys4.e(this.f);
                    if (e < e3 && e2 < e4) {
                        HashMap hashMap = hashMapArr[i];
                        hashMapArr[i] = hashMapArr[i2];
                        hashMapArr[i2] = hashMap;
                    }
                } else if (z2) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                }
            } else if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
        } else if (z2) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void w(C0178Bs c0178Bs, int i) {
        C3227ys c;
        C3227ys c2;
        HashMap[] hashMapArr = this.d;
        C3227ys c3227ys = (C3227ys) hashMapArr[i].get("DefaultCropSize");
        C3227ys c3227ys2 = (C3227ys) hashMapArr[i].get("SensorTopBorder");
        C3227ys c3227ys3 = (C3227ys) hashMapArr[i].get("SensorLeftBorder");
        C3227ys c3227ys4 = (C3227ys) hashMapArr[i].get("SensorBottomBorder");
        C3227ys c3227ys5 = (C3227ys) hashMapArr[i].get("SensorRightBorder");
        if (c3227ys != null) {
            if (c3227ys.a == 5) {
                C0152As[] c0152AsArr = (C0152As[]) c3227ys.g(this.f);
                if (c0152AsArr != null && c0152AsArr.length == 2) {
                    c = C3227ys.b(c0152AsArr[0], this.f);
                    c2 = C3227ys.b(c0152AsArr[1], this.f);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c0152AsArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) c3227ys.g(this.f);
                if (iArr != null && iArr.length == 2) {
                    c = C3227ys.c(iArr[0], this.f);
                    c2 = C3227ys.c(iArr[1], this.f);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i].put("ImageWidth", c);
            hashMapArr[i].put("ImageLength", c2);
        } else if (c3227ys2 != null && c3227ys3 != null && c3227ys4 != null && c3227ys5 != null) {
            int e = c3227ys2.e(this.f);
            int e2 = c3227ys4.e(this.f);
            int e3 = c3227ys5.e(this.f);
            int e4 = c3227ys3.e(this.f);
            if (e2 > e && e3 > e4) {
                C3227ys c3 = C3227ys.c(e2 - e, this.f);
                C3227ys c4 = C3227ys.c(e3 - e4, this.f);
                hashMapArr[i].put("ImageLength", c3);
                hashMapArr[i].put("ImageWidth", c4);
            }
        } else {
            C3227ys c3227ys6 = (C3227ys) hashMapArr[i].get("ImageLength");
            C3227ys c3227ys7 = (C3227ys) hashMapArr[i].get("ImageWidth");
            if (c3227ys6 == null || c3227ys7 == null) {
                C3227ys c3227ys8 = (C3227ys) hashMapArr[i].get("JPEGInterchangeFormat");
                C3227ys c3227ys9 = (C3227ys) hashMapArr[i].get("JPEGInterchangeFormatLength");
                if (c3227ys8 != null && c3227ys9 != null) {
                    int e5 = c3227ys8.e(this.f);
                    int e6 = c3227ys8.e(this.f);
                    c0178Bs.b(e5);
                    byte[] bArr = new byte[e6];
                    c0178Bs.read(bArr);
                    e(new C3141xs(bArr), e5, i);
                }
            }
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.d;
        C3227ys c3227ys = (C3227ys) hashMapArr[1].get("PixelXDimension");
        C3227ys c3227ys2 = (C3227ys) hashMapArr[1].get("PixelYDimension");
        if (c3227ys != null && c3227ys2 != null) {
            hashMapArr[0].put("ImageWidth", c3227ys);
            hashMapArr[0].put("ImageLength", c3227ys2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!n(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
