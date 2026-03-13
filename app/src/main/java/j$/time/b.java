package j$.time;
/* loaded from: classes4.dex */
public abstract class b {
    public abstract ZoneId a();

    public abstract long b();

    public static b d() {
        return a.b;
    }

    public static b c() {
        return new a(ZoneId.systemDefault());
    }
}
