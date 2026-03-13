package com.fyber.fairbid;

import java.util.Arrays;
import java.util.List;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum d uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class v7 {
    public static final v7 b;
    public static final v7 c;
    public static final v7 d;
    public static final v7 e;
    public static final v7 f;
    public static final v7 g;
    public static final /* synthetic */ v7[] h;
    public final List<v7> a;

    static {
        v7 v7Var = new v7("failed", 0, new v7[0]);
        b = v7Var;
        v7 v7Var2 = new v7("shown", 1, new v7[0]);
        c = v7Var2;
        v7 v7Var3 = new v7("dirty", 2, v7Var2);
        d = v7Var3;
        v7 v7Var4 = new v7("ready", 3, v7Var3, v7Var2);
        e = v7Var4;
        v7 v7Var5 = new v7("fetching", 4, v7Var, v7Var4);
        f = v7Var5;
        v7 v7Var6 = new v7("init", 5, v7Var5);
        g = v7Var6;
        h = new v7[]{v7Var, v7Var2, v7Var3, v7Var4, v7Var5, v7Var6};
    }

    public v7(String str, int i, v7... v7VarArr) {
        this.a = Arrays.asList(v7VarArr);
    }

    public static v7 valueOf(String str) {
        return (v7) Enum.valueOf(v7.class, str);
    }

    public static v7[] values() {
        return (v7[]) h.clone();
    }
}
