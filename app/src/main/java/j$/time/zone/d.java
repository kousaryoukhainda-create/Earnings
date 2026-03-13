package j$.time.zone;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {
    public static final d STANDARD;
    public static final d UTC;
    public static final d WALL;
    private static final /* synthetic */ d[] a;

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) a.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j$.time.zone.d] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, j$.time.zone.d] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.time.zone.d] */
    static {
        ?? r3 = new Enum("UTC", 0);
        UTC = r3;
        ?? r4 = new Enum("WALL", 1);
        WALL = r4;
        ?? r5 = new Enum("STANDARD", 2);
        STANDARD = r5;
        a = new d[]{r3, r4, r5};
    }
}
