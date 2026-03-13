package defpackage;
/* renamed from: oO  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2325oO {
    public static final C2153mO a;
    public static final C2153mO b;

    /* JADX WARN: Type inference failed for: r0v3, types: [mO, java.lang.Object] */
    static {
        ST st = ST.c;
        C2153mO c2153mO = null;
        try {
            c2153mO = (C2153mO) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = c2153mO;
        b = new Object();
    }
}
