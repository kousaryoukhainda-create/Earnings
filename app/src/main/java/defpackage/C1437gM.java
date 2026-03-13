package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: gM  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1437gM {
    public final AbstractC1502h50 a;
    public final C2261nf b;
    public final AbstractC0910b40 c;
    public final InterfaceC0428Li d;

    public C1437gM(InterfaceC0652Tz transform, C2261nf ack, AbstractC0910b40 abstractC0910b40, InterfaceC0428Li callerContext) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(ack, "ack");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        this.a = (AbstractC1502h50) transform;
        this.b = ack;
        this.c = abstractC0910b40;
        this.d = callerContext;
    }
}
