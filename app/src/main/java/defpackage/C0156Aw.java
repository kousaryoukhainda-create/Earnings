package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Aw  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156Aw {
    public static final C0156Aw a = new Object();
    public static final Map b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static C3231yw a(H00 h00) {
        Map dependencies = b;
        Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
        Object obj = dependencies.get(h00);
        if (obj != null) {
            Intrinsics.checkNotNullExpressionValue(obj, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return (C3231yw) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + h00 + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0 A[Catch: all -> 0x00c9, TRY_ENTER, TryCatch #0 {all -> 0x00c9, blocks: (B:22:0x0099, B:25:0x00b0, B:26:0x00c8), top: B:31:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0097 -> B:21:0x0098). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.AbstractC3040wi r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.C3317zw
            if (r0 == 0) goto L13
            r0 = r11
            zw r0 = (defpackage.C3317zw) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            zw r0 = new zw
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.i
            Ui r1 = defpackage.EnumC0661Ui.b
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r2 = r0.h
            java.util.Map r4 = r0.g
            java.util.Map r4 = (java.util.Map) r4
            AN r5 = r0.f
            H00 r6 = r0.d
            java.util.Iterator r7 = r0.c
            java.util.Map r8 = r0.b
            java.util.Map r8 = (java.util.Map) r8
            defpackage.AbstractC1522hL.T(r11)
            goto L98
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3f:
            defpackage.AbstractC1522hL.T(r11)
            java.util.Map r11 = defpackage.C0156Aw.b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r11.size()
            int r4 = defpackage.C2062lJ.a(r4)
            r2.<init>(r4)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r7 = r11
            r4 = r2
        L60:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Ld0
            java.lang.Object r11 = r7.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r5 = r11.getKey()
            r6 = r5
            H00 r6 = (defpackage.H00) r6
            java.lang.Object r11 = r11.getValue()
            yw r11 = (defpackage.C3231yw) r11
            DN r5 = r11.a
            r11 = r4
            java.util.Map r11 = (java.util.Map) r11
            r0.b = r11
            r0.c = r7
            r0.d = r6
            r0.f = r5
            r0.g = r11
            r0.h = r2
            r0.k = r3
            java.lang.Object r11 = r5.d(r0)
            if (r11 != r1) goto L97
            return r1
        L97:
            r8 = r4
        L98:
            r11 = 0
            java.lang.String r9 = "subscriberName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r9)     // Catch: java.lang.Throwable -> Lc9
            yw r9 = a(r6)     // Catch: java.lang.Throwable -> Lc9
            ej r9 = r9.b     // Catch: java.lang.Throwable -> Lc9
            if (r9 == 0) goto Lb0
            DN r5 = (defpackage.DN) r5
            r5.f(r11)
            r4.put(r2, r9)
            r4 = r8
            goto L60
        Lb0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc9
            r1.append(r6)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc9
            throw r0     // Catch: java.lang.Throwable -> Lc9
        Lc9:
            r0 = move-exception
            DN r5 = (defpackage.DN) r5
            r5.f(r11)
            throw r0
        Ld0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0156Aw.b(wi):java.lang.Object");
    }
}
