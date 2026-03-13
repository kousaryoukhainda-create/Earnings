package com.fyber;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final /* synthetic */ b[] l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, com.fyber.b] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, com.fyber.b] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, com.fyber.b] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, com.fyber.b] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, com.fyber.b] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, com.fyber.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.fyber.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.fyber.b] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Enum, com.fyber.b] */
    static {
        ?? r9 = new Enum("ERROR_DIALOG_TITLE", 0);
        b = r9;
        ?? r10 = new Enum("DISMISS_ERROR_DIALOG", 1);
        c = r10;
        ?? r11 = new Enum("GENERIC_ERROR", 2);
        d = r11;
        ?? r12 = new Enum("ERROR_LOADING_OFFERWALL", 3);
        f = r12;
        ?? r13 = new Enum("ERROR_LOADING_OFFERWALL_NO_INTERNET_CONNECTION", 4);
        g = r13;
        ?? r14 = new Enum("LOADING_OFFERWALL", 5);
        h = r14;
        ?? r15 = new Enum("ERROR_PLAY_STORE_UNAVAILABLE", 6);
        i = r15;
        ?? r3 = new Enum("VCS_COINS_NOTIFICATION", 7);
        j = r3;
        ?? r2 = new Enum("VCS_DEFAULT_CURRENCY", 8);
        k = r2;
        l = new b[]{r9, r10, r11, r12, r13, r14, r15, r3, r2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) l.clone();
    }
}
