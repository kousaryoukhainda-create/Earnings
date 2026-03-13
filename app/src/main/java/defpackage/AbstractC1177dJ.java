package defpackage;
/* renamed from: dJ  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1177dJ {
    public static final C0930bJ a;
    public static final C0930bJ b;

    /* JADX WARN: Type inference failed for: r0v3, types: [bJ, java.lang.Object] */
    static {
        ST st = ST.c;
        C0930bJ c0930bJ = null;
        try {
            c0930bJ = (C0930bJ) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = c0930bJ;
        b = new Object();
    }
}
