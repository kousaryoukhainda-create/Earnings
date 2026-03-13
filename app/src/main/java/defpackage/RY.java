package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: RY  reason: default package */
/* loaded from: classes.dex */
public final class RY {
    public static final RY b;
    public static final RY c;
    public static final RY d;
    public static final /* synthetic */ RY[] f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, RY] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, RY] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, RY] */
    static {
        ?? r3 = new Enum("NETWORK_UNMETERED", 0);
        b = r3;
        ?? r4 = new Enum("DEVICE_IDLE", 1);
        c = r4;
        ?? r5 = new Enum("DEVICE_CHARGING", 2);
        d = r5;
        f = new RY[]{r3, r4, r5};
    }

    public static RY valueOf(String str) {
        return (RY) Enum.valueOf(RY.class, str);
    }

    public static RY[] values() {
        return (RY[]) f.clone();
    }
}
