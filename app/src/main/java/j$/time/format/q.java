package j$.time.format;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class q implements InterfaceC1677f {
    public static final q INSENSITIVE;
    public static final q LENIENT;
    public static final q SENSITIVE;
    public static final q STRICT;
    private static final /* synthetic */ q[] a;

    @Override // j$.time.format.InterfaceC1677f
    public final boolean l(z zVar, StringBuilder sb) {
        return true;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) a.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, j$.time.format.q] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.time.format.q] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, j$.time.format.q] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, j$.time.format.q] */
    static {
        ?? r4 = new Enum("SENSITIVE", 0);
        SENSITIVE = r4;
        ?? r5 = new Enum("INSENSITIVE", 1);
        INSENSITIVE = r5;
        ?? r6 = new Enum("STRICT", 2);
        STRICT = r6;
        ?? r7 = new Enum("LENIENT", 3);
        LENIENT = r7;
        a = new q[]{r4, r5, r6, r7};
    }

    @Override // j$.time.format.InterfaceC1677f
    public final int n(w wVar, CharSequence charSequence, int i) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            wVar.m(true);
        } else if (ordinal == 1) {
            wVar.m(false);
        } else if (ordinal == 2) {
            wVar.q(true);
        } else if (ordinal == 3) {
            wVar.q(false);
        }
        return i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return "ParseStrict(false)";
                    }
                    throw new IllegalStateException("Unreachable");
                }
                return "ParseStrict(true)";
            }
            return "ParseCaseSensitive(false)";
        }
        return "ParseCaseSensitive(true)";
    }
}
