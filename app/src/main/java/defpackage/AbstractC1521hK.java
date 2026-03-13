package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: hK  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1521hK {
    public final MeasurementManager a;

    public AbstractC1521hK(MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.a = mMeasurementManager;
    }

    public static Object b(AbstractC1521hK abstractC1521hK, AbstractC0719Wo abstractC0719Wo, InterfaceC2868ui interfaceC2868ui) {
        new C1911jc(1, B10.N(interfaceC2868ui)).s();
        MeasurementManager measurementManager = abstractC1521hK.a;
        throw null;
    }

    public static Object d(AbstractC1521hK abstractC1521hK, InterfaceC2868ui frame) {
        C1911jc c1911jc = new C1911jc(1, B10.N(frame));
        c1911jc.s();
        abstractC1521hK.a.getMeasurementApiStatus(new S4(2), new C3212yi(c1911jc));
        Object r = c1911jc.r();
        if (r == EnumC0661Ui.b) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r;
    }

    public static Object g(AbstractC1521hK abstractC1521hK, AbstractC0908b30 abstractC0908b30, InterfaceC2868ui interfaceC2868ui) {
        Object o = AbstractC1281eb.o(new C1435gK(abstractC1521hK, null), interfaceC2868ui);
        if (o == EnumC0661Ui.b) {
            return o;
        }
        return B90.a;
    }

    public static Object h(AbstractC1521hK abstractC1521hK, Uri uri, InputEvent inputEvent, InterfaceC2868ui frame) {
        C1911jc c1911jc = new C1911jc(1, B10.N(frame));
        c1911jc.s();
        abstractC1521hK.a.registerSource(uri, inputEvent, new S4(2), new C3212yi(c1911jc));
        Object r = c1911jc.r();
        EnumC0661Ui enumC0661Ui = EnumC0661Ui.b;
        if (r == enumC0661Ui) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (r == enumC0661Ui) {
            return r;
        }
        return B90.a;
    }

    public static Object j(AbstractC1521hK abstractC1521hK, Uri uri, InterfaceC2868ui frame) {
        C1911jc c1911jc = new C1911jc(1, B10.N(frame));
        c1911jc.s();
        abstractC1521hK.a.registerTrigger(uri, new S4(2), new C3212yi(c1911jc));
        Object r = c1911jc.r();
        EnumC0661Ui enumC0661Ui = EnumC0661Ui.b;
        if (r == enumC0661Ui) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (r == enumC0661Ui) {
            return r;
        }
        return B90.a;
    }

    public static Object l(AbstractC1521hK abstractC1521hK, Rc0 rc0, InterfaceC2868ui interfaceC2868ui) {
        new C1911jc(1, B10.N(interfaceC2868ui)).s();
        MeasurementManager measurementManager = abstractC1521hK.a;
        throw null;
    }

    public static Object n(AbstractC1521hK abstractC1521hK, Sc0 sc0, InterfaceC2868ui interfaceC2868ui) {
        new C1911jc(1, B10.N(interfaceC2868ui)).s();
        MeasurementManager measurementManager = abstractC1521hK.a;
        throw null;
    }

    public Object a(@NotNull AbstractC0719Wo abstractC0719Wo, @NotNull InterfaceC2868ui interfaceC2868ui) {
        return b(this, abstractC0719Wo, interfaceC2868ui);
    }

    public Object c(@NotNull InterfaceC2868ui interfaceC2868ui) {
        return d(this, interfaceC2868ui);
    }

    public Object e(@NotNull AbstractC0908b30 abstractC0908b30, @NotNull InterfaceC2868ui interfaceC2868ui) {
        return g(this, abstractC0908b30, interfaceC2868ui);
    }

    public Object f(@NotNull Uri uri, InputEvent inputEvent, @NotNull InterfaceC2868ui interfaceC2868ui) {
        return h(this, uri, inputEvent, interfaceC2868ui);
    }

    public Object i(@NotNull Uri uri, @NotNull InterfaceC2868ui interfaceC2868ui) {
        return j(this, uri, interfaceC2868ui);
    }

    public Object k(@NotNull Rc0 rc0, @NotNull InterfaceC2868ui interfaceC2868ui) {
        return l(this, rc0, interfaceC2868ui);
    }

    public Object m(@NotNull Sc0 sc0, @NotNull InterfaceC2868ui interfaceC2868ui) {
        return n(this, sc0, interfaceC2868ui);
    }
}
