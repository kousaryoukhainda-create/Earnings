package defpackage;

import java.lang.reflect.AccessibleObject;
/* renamed from: AV  reason: default package */
/* loaded from: classes.dex */
public abstract class AV {
    public static final AV a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [AV] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    static {
        /*
            int r0 = defpackage.WE.a
            r1 = 9
            if (r0 < r1) goto L1c
            java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
            java.lang.String r1 = "canAccess"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1c
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L1c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1c
            yV r1 = new yV     // Catch: java.lang.NoSuchMethodException -> L1c
            r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L1c
            goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r1 != 0) goto L24
            zV r1 = new zV
            r1.<init>()
        L24:
            defpackage.AV.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AV.<clinit>():void");
    }

    public abstract boolean a(AccessibleObject accessibleObject, Object obj);
}
