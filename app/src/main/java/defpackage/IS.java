package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: IS  reason: default package */
/* loaded from: classes.dex */
public final class IS extends AbstractC1502h50 implements InterfaceC0652Tz {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ AbstractC1502h50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IS(InterfaceC0652Tz interfaceC0652Tz, InterfaceC2868ui interfaceC2868ui) {
        super(2, interfaceC2868ui);
        this.d = (AbstractC1502h50) interfaceC0652Tz;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [h50, Tz] */
    @Override // defpackage.K9
    public final InterfaceC2868ui create(Object obj, InterfaceC2868ui interfaceC2868ui) {
        IS is = new IS(this.d, interfaceC2868ui);
        is.c = obj;
        return is;
    }

    @Override // defpackage.InterfaceC0652Tz
    public final Object invoke(Object obj, Object obj2) {
        return ((IS) create((C3097xN) obj, (InterfaceC2868ui) obj2)).invokeSuspend(B90.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h50, Tz] */
    @Override // defpackage.K9
    public final Object invokeSuspend(Object obj) {
        EnumC0661Ui enumC0661Ui = EnumC0661Ui.b;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                AbstractC1522hL.T(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1522hL.T(obj);
            this.b = 1;
            obj = this.d.invoke((C3097xN) this.c, this);
            if (obj == enumC0661Ui) {
                return enumC0661Ui;
            }
        }
        C3097xN c3097xN = (C3097xN) obj;
        Intrinsics.c(c3097xN, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) c3097xN.b.c).set(true);
        return c3097xN;
    }
}
