package defpackage;

import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: lJ  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2062lJ extends C1976kJ {
    public static int a(int i) {
        if (i >= 0) {
            if (i < 3) {
                return i + 1;
            }
            if (i < 1073741824) {
                return (int) ((i / 0.75f) + 1.0f);
            }
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public static Map b(JQ pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.b, pair.c);
        Intrinsics.checkNotNullExpressionValue(singletonMap, "singletonMap(...)");
        return singletonMap;
    }
}
