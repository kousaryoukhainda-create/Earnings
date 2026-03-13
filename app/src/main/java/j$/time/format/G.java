package j$.time.format;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class G {
    public static final G ALWAYS;
    public static final G EXCEEDS_PAD;
    public static final G NEVER;
    public static final G NORMAL;
    public static final G NOT_NEGATIVE;
    private static final /* synthetic */ G[] a;

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) a.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [j$.time.format.G, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [j$.time.format.G, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [j$.time.format.G, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [j$.time.format.G, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [j$.time.format.G, java.lang.Enum] */
    static {
        ?? r5 = new Enum("NORMAL", 0);
        NORMAL = r5;
        ?? r6 = new Enum("ALWAYS", 1);
        ALWAYS = r6;
        ?? r7 = new Enum("NEVER", 2);
        NEVER = r7;
        ?? r8 = new Enum("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = r8;
        ?? r9 = new Enum("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = r9;
        a = new G[]{r5, r6, r7, r8, r9};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l(boolean z, boolean z2, boolean z3) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return (z && z2) ? false : true;
        } else if (ordinal == 1 || ordinal == 4) {
            return true;
        } else {
            return (z2 || z3) ? false : true;
        }
    }
}
