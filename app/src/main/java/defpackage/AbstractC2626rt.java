package defpackage;
/* renamed from: rt  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2626rt {
    public static final C2455pt a = new Object();
    public static final C2455pt b;

    /* JADX WARN: Type inference failed for: r0v0, types: [pt, java.lang.Object] */
    static {
        ST st = ST.c;
        C2455pt c2455pt = null;
        try {
            c2455pt = (C2455pt) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = c2455pt;
    }
}
