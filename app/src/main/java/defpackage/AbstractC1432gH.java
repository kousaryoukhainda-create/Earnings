package defpackage;
/* renamed from: gH  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1432gH {
    public static final C1346fH a;
    public static final C1346fH b;

    /* JADX WARN: Type inference failed for: r0v3, types: [fH, java.lang.Object] */
    static {
        ST st = ST.c;
        C1346fH c1346fH = null;
        try {
            c1346fH = (C1346fH) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = c1346fH;
        b = new Object();
    }
}
