package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: YF  reason: default package */
/* loaded from: classes2.dex */
public final class YF {
    public static final /* synthetic */ YF[] b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        YF[] yfArr = {new Enum("PUBLIC", 0), new Enum("PROTECTED", 1), new Enum("INTERNAL", 2), new Enum("PRIVATE", 3)};
        b = yfArr;
        AbstractC1281eb.u(yfArr);
    }

    public static YF valueOf(String str) {
        return (YF) Enum.valueOf(YF.class, str);
    }

    public static YF[] values() {
        return (YF[]) b.clone();
    }
}
