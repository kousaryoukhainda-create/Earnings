package com.fyber.fairbid;

import com.fyber.fairbid.mediation.display.NetworkModel;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* renamed from: com.fyber.fairbid.p0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1116p0 {
    @NotNull
    public static final C1116p0 k;
    @NotNull
    public final String a;
    public final int b;
    @NotNull
    public final List<v4> c;
    @NotNull
    public final List<NetworkModel> d;
    @NotNull
    public final String e;
    @NotNull
    public final C1110m0 f;
    @NotNull
    public final ik g;
    public final int h;
    public final boolean i;
    @NotNull
    public final String j;

    static {
        C2968vr c2968vr = C2968vr.b;
        k = new C1116p0("", -1, c2968vr, c2968vr, "", C1110m0.c, ik.UNDEFINED, -1, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1116p0(String str, int i, List<? extends v4> list, List<NetworkModel> list2, String str2, C1110m0 c1110m0, ik ikVar, int i2, boolean z, String str3) {
        this.a = str;
        this.b = i;
        this.c = list;
        this.d = list2;
        this.e = str2;
        this.f = c1110m0;
        this.g = ikVar;
        this.h = i2;
        this.i = z;
        this.j = str3 != null ? str3 : str2;
    }
}
