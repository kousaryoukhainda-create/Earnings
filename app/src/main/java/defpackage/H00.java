package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: H00  reason: default package */
/* loaded from: classes.dex */
public final class H00 {
    public static final H00 b;
    public static final H00 c;
    public static final /* synthetic */ H00[] d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, H00] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, H00] */
    static {
        ?? r3 = new Enum("CRASHLYTICS", 0);
        b = r3;
        ?? r4 = new Enum("PERFORMANCE", 1);
        c = r4;
        d = new H00[]{r3, r4, new Enum("MATT_SAYS_HI", 2)};
    }

    public static H00 valueOf(String str) {
        return (H00) Enum.valueOf(H00.class, str);
    }

    public static H00[] values() {
        return (H00[]) d.clone();
    }
}
