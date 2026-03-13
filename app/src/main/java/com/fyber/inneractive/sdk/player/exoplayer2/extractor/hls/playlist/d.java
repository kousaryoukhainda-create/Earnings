package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.huawei.hms.iap.entity.OrderStatusCode;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class d implements y.a<c> {
    public static final Pattern a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern b = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern c = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern d = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern e = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern f = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern g = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern h = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern i = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern j = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern k = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern l = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern m = Pattern.compile("METHOD=(NONE|AES-128)");
    public static final Pattern n = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern o = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern p = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern q = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern r = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern s = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern t = a("AUTOSELECT");
    public static final Pattern u = a("DEFAULT");
    public static final Pattern v = a("FORCED");

    /* loaded from: classes.dex */
    public static class a {
        public final BufferedReader a;
        public final Queue<String> b;
        public String c;

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.b = queue;
            this.a = bufferedReader;
        }

        public boolean a() throws IOException {
            String trim;
            if (this.c != null) {
                return true;
            }
            if (!this.b.isEmpty()) {
                this.c = this.b.poll();
                return true;
            }
            do {
                String readLine = this.a.readLine();
                this.c = readLine;
                if (readLine != null) {
                    trim = readLine.trim();
                    this.c = trim;
                } else {
                    return false;
                }
            } while (trim.isEmpty());
            return true;
        }

        public String b() throws IOException {
            if (!a()) {
                return null;
            }
            String str = this.c;
            this.c = null;
            return str;
        }
    }

    public static b b(a aVar, String str) throws IOException {
        int i2;
        String hexString;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        char c2 = 0;
        int i3 = 1;
        long j2 = 0;
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1;
        boolean z2 = false;
        b.a aVar2 = null;
        int i9 = 0;
        long j9 = -1;
        boolean z3 = false;
        while (true) {
            String str2 = null;
            String str3 = null;
            while (aVar.a()) {
                String b2 = aVar.b();
                if (b2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                    String b3 = b(b2, g);
                    if ("VOD".equals(b3)) {
                        i4 = 1;
                    } else if ("EVENT".equals(b3)) {
                        i4 = 2;
                    }
                } else if (b2.startsWith("#EXT-X-START")) {
                    j3 = (long) (Double.parseDouble(b(b2, j)) * 1000000.0d);
                } else if (b2.startsWith("#EXT-X-MAP")) {
                    String b4 = b(b2, n);
                    String a2 = a(b2, l);
                    if (a2 != null) {
                        String[] split = a2.split("@");
                        j9 = Long.parseLong(split[c2]);
                        if (split.length > i3) {
                            j6 = Long.parseLong(split[i3]);
                        }
                    }
                    aVar2 = new b.a(b4, 0L, -1, -9223372036854775807L, false, null, null, j6, j9);
                    j6 = j2;
                    j9 = -1;
                } else if (b2.startsWith("#EXT-X-TARGETDURATION")) {
                    j4 = 1000000 * Integer.parseInt(b(b2, e));
                } else if (b2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                    i9 = Integer.parseInt(b(b2, h));
                    i7 = i9;
                } else if (b2.startsWith("#EXT-X-VERSION")) {
                    i8 = Integer.parseInt(b(b2, f));
                } else if (b2.startsWith("#EXTINF")) {
                    j8 = (long) (Double.parseDouble(b(b2, i)) * 1000000.0d);
                } else if (b2.startsWith("#EXT-X-KEY")) {
                    z3 = "AES-128".equals(b(b2, m));
                    if (z3) {
                        str3 = b(b2, n);
                        str2 = a(b2, o);
                    }
                } else if (b2.startsWith("#EXT-X-BYTERANGE")) {
                    String[] split2 = b(b2, k).split("@");
                    j9 = Long.parseLong(split2[c2]);
                    if (split2.length > i3) {
                        j6 = Long.parseLong(split2[i3]);
                    }
                } else if (b2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                    i6 = Integer.parseInt(b2.substring(b2.indexOf(58) + i3));
                    z = true;
                } else if (b2.equals("#EXT-X-DISCONTINUITY")) {
                    i5++;
                } else if (b2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                    if (j5 == j2) {
                        String substring = b2.substring(b2.indexOf(58) + i3);
                        Matcher matcher = u.f.matcher(substring);
                        if (matcher.matches()) {
                            if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                i2 = 0;
                            } else {
                                i2 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                                if (matcher.group(11).equals("-")) {
                                    i2 *= -1;
                                }
                            }
                            GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
                            gregorianCalendar.clear();
                            gregorianCalendar.set(Integer.parseInt(matcher.group(i3)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                            if (!TextUtils.isEmpty(matcher.group(8))) {
                                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                            }
                            long timeInMillis = gregorianCalendar.getTimeInMillis();
                            if (i2 != 0) {
                                timeInMillis -= i2 * OrderStatusCode.ORDER_STATE_CANCEL;
                            }
                            j5 = com.fyber.inneractive.sdk.player.exoplayer2.b.a(timeInMillis) - j7;
                        } else {
                            throw new l(AbstractC2437ph.g("Invalid date/time format: ", substring));
                        }
                    }
                } else if (b2.startsWith("#EXT-X-DATERANGE")) {
                    arrayList2.add(b2);
                } else if (!b2.startsWith("#")) {
                    if (z3) {
                        hexString = str2 != null ? str2 : Integer.toHexString(i9);
                    } else {
                        hexString = null;
                    }
                    int i10 = i9 + 1;
                    int i11 = (j9 > (-1L) ? 1 : (j9 == (-1L) ? 0 : -1));
                    if (i11 == 0) {
                        j6 = 0;
                    }
                    arrayList.add(new b.a(b2, j8, i5, j7, z3, str3, hexString, j6, j9));
                    j7 += j8;
                    if (i11 != 0) {
                        j6 += j9;
                    }
                    i9 = i10;
                    j9 = -1;
                    c2 = 0;
                    i3 = 1;
                    j2 = 0;
                    j8 = 0;
                } else if (b2.equals("#EXT-X-ENDLIST")) {
                    c2 = 0;
                    i3 = 1;
                    j2 = 0;
                    z2 = true;
                }
                c2 = 0;
                i3 = 1;
                j2 = 0;
            }
            return new b(i4, str, j3, j5, z, i6, i7, i8, j4, z2, j5 != 0, aVar2, arrayList, arrayList2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
        r1 = r0.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
        if (r1 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
        r1 = r1.trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
        if (r1.isEmpty() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
        if (r1.startsWith("#EXT-X-STREAM-INF") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
        r8.add(r1);
        r7 = a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d.a(r8, r0), r7.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
        if (r1.startsWith("#EXT-X-TARGETDURATION") != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
        if (r1.startsWith("#EXT-X-MEDIA-SEQUENCE") != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
        if (r1.startsWith("#EXTINF") != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b4, code lost:
        if (r1.startsWith("#EXT-X-KEY") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
        if (r1.startsWith("#EXT-X-BYTERANGE") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
        if (r1.equals("#EXT-X-DISCONTINUITY") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cc, code lost:
        if (r1.equals("#EXT-X-DISCONTINUITY-SEQUENCE") != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d4, code lost:
        if (r1.equals("#EXT-X-ENDLIST") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d7, code lost:
        r8.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00db, code lost:
        r8.add(r1);
        r7 = b(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d.a(r8, r0), r7.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00eb, code lost:
        com.fyber.inneractive.sdk.player.exoplayer2.util.u.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ee, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ef, code lost:
        com.fyber.inneractive.sdk.player.exoplayer2.util.u.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f9, code lost:
        throw new com.fyber.inneractive.sdk.player.exoplayer2.l("Failed to parse the playlist, could not identify any tags.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(android.net.Uri r7, java.io.InputStream r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d.a(android.net.Uri, java.io.InputStream):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x001a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d.a r42, java.lang.String r43) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d$a, java.lang.String):com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a");
    }

    public static String a(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static boolean a(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals("YES") : z;
    }

    public static String b(String str, Pattern pattern) throws l {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new l("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static Pattern a(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }
}
