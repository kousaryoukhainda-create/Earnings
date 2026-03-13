package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: KI  reason: default package */
/* loaded from: classes.dex */
public abstract class KI {
    public static final II b;
    public static final /* synthetic */ KI[] c;

    static {
        II ii = new II();
        b = ii;
        c = new KI[]{ii, new KI() { // from class: JI
        }};
    }

    public static KI valueOf(String str) {
        return (KI) Enum.valueOf(KI.class, str);
    }

    public static KI[] values() {
        return (KI[]) c.clone();
    }
}
