package com.applovin.impl;

import android.graphics.Color;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class s3 {
    private static final Pattern a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    private static final Map d;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        AbstractC0324Hi.t(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        AbstractC0324Hi.y(hashMap, "aqua", -16711681, -8388652, "aquamarine");
        AbstractC0324Hi.t(-983041, hashMap, "azure", -657956, "beige");
        AbstractC0324Hi.t(-6972, hashMap, "bisque", -16777216, "black");
        AbstractC0324Hi.t(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        AbstractC0324Hi.t(-7722014, hashMap, "blueviolet", -5952982, "brown");
        AbstractC0324Hi.t(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        AbstractC0324Hi.t(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        AbstractC0324Hi.t(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        AbstractC0324Hi.t(-1828, hashMap, "cornsilk", -2354116, "crimson");
        AbstractC0324Hi.y(hashMap, "cyan", -16711681, -16777077, "darkblue");
        AbstractC0324Hi.t(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        AbstractC0324Hi.y(hashMap, "darkgray", -5658199, -16751616, "darkgreen");
        AbstractC0324Hi.y(hashMap, "darkgrey", -5658199, -4343957, "darkkhaki");
        AbstractC0324Hi.t(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        AbstractC0324Hi.t(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        AbstractC0324Hi.t(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        AbstractC0324Hi.t(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        hashMap.put("darkslategray", -13676721);
        hashMap.put("darkslategrey", -13676721);
        AbstractC0324Hi.y(hashMap, "darkturquoise", -16724271, -7077677, "darkviolet");
        AbstractC0324Hi.t(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        hashMap.put("dimgray", -9868951);
        hashMap.put("dimgrey", -9868951);
        AbstractC0324Hi.y(hashMap, "dodgerblue", -14774017, -5103070, "firebrick");
        AbstractC0324Hi.t(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        AbstractC0324Hi.y(hashMap, "fuchsia", -65281, -2302756, "gainsboro");
        AbstractC0324Hi.t(-460545, hashMap, "ghostwhite", -10496, "gold");
        hashMap.put("goldenrod", -2448096);
        hashMap.put("gray", -8355712);
        AbstractC0324Hi.t(-16744448, hashMap, "green", -5374161, "greenyellow");
        AbstractC0324Hi.y(hashMap, "grey", -8355712, -983056, "honeydew");
        AbstractC0324Hi.t(-38476, hashMap, "hotpink", -3318692, "indianred");
        AbstractC0324Hi.t(-11861886, hashMap, "indigo", -16, "ivory");
        AbstractC0324Hi.t(-989556, hashMap, "khaki", -1644806, "lavender");
        AbstractC0324Hi.t(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        AbstractC0324Hi.t(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        AbstractC0324Hi.t(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", -2894893);
        AbstractC0324Hi.t(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        AbstractC0324Hi.t(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        hashMap.put("lightslategray", -8943463);
        hashMap.put("lightslategrey", -8943463);
        AbstractC0324Hi.y(hashMap, "lightsteelblue", -5192482, -32, "lightyellow");
        AbstractC0324Hi.t(-16711936, hashMap, "lime", -13447886, "limegreen");
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        AbstractC0324Hi.t(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        AbstractC0324Hi.t(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        AbstractC0324Hi.t(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        AbstractC0324Hi.t(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        AbstractC0324Hi.t(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        AbstractC0324Hi.t(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        AbstractC0324Hi.t(-6943, hashMap, "mistyrose", -6987, "moccasin");
        AbstractC0324Hi.t(-8531, hashMap, "navajowhite", -16777088, "navy");
        AbstractC0324Hi.t(-133658, hashMap, "oldlace", -8355840, "olive");
        AbstractC0324Hi.t(-9728477, hashMap, "olivedrab", -23296, "orange");
        AbstractC0324Hi.t(-47872, hashMap, "orangered", -2461482, "orchid");
        AbstractC0324Hi.t(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        AbstractC0324Hi.t(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        AbstractC0324Hi.t(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        AbstractC0324Hi.t(-3308225, hashMap, "peru", -16181, "pink");
        AbstractC0324Hi.t(-2252579, hashMap, "plum", -5185306, "powderblue");
        AbstractC0324Hi.t(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        AbstractC0324Hi.t(-65536, hashMap, "red", -4419697, "rosybrown");
        AbstractC0324Hi.t(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        AbstractC0324Hi.t(-360334, hashMap, "salmon", -744352, "sandybrown");
        AbstractC0324Hi.t(-13726889, hashMap, "seagreen", -2578, "seashell");
        AbstractC0324Hi.t(-6270419, hashMap, "sienna", -4144960, "silver");
        AbstractC0324Hi.t(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        hashMap.put("slategray", -9404272);
        hashMap.put("slategrey", -9404272);
        AbstractC0324Hi.y(hashMap, "snow", -1286, -16711809, "springgreen");
        AbstractC0324Hi.t(-12156236, hashMap, "steelblue", -2968436, "tan");
        AbstractC0324Hi.t(-16744320, hashMap, "teal", -2572328, "thistle");
        AbstractC0324Hi.t(-40121, hashMap, "tomato", 0, "transparent");
        AbstractC0324Hi.t(-12525360, hashMap, "turquoise", -1146130, "violet");
        AbstractC0324Hi.t(-663885, hashMap, "wheat", -1, "white");
        AbstractC0324Hi.t(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    private static int a(String str, boolean z) {
        int parseInt;
        b1.a(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (z ? c : b).matcher(replace);
            if (matcher.matches()) {
                if (z) {
                    parseInt = (int) (Float.parseFloat((String) b1.a((Object) matcher.group(4))) * 255.0f);
                } else {
                    parseInt = Integer.parseInt((String) b1.a((Object) matcher.group(4)), 10);
                }
                return Color.argb(parseInt, Integer.parseInt((String) b1.a((Object) matcher.group(1)), 10), Integer.parseInt((String) b1.a((Object) matcher.group(2)), 10), Integer.parseInt((String) b1.a((Object) matcher.group(3)), 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = a.matcher(replace);
            if (matcher2.matches()) {
                return Color.rgb(Integer.parseInt((String) b1.a((Object) matcher2.group(1)), 10), Integer.parseInt((String) b1.a((Object) matcher2.group(2)), 10), Integer.parseInt((String) b1.a((Object) matcher2.group(3)), 10));
            }
        } else {
            Integer num = (Integer) d.get(Ascii.toLowerCase(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    public static int b(String str) {
        return a(str, false);
    }

    public static int a(String str) {
        return a(str, true);
    }
}
