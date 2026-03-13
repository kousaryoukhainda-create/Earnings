package defpackage;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: J10  reason: default package */
/* loaded from: classes.dex */
public final class J10 {
    public final EnumC1454gb0 a;

    public J10() {
        EnumC1454gb0 verificationMode = EnumC1454gb0.b;
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        this.a = verificationMode;
    }

    public static boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (Intrinsics.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState != null && sidecarDeviceState2 != null && E10.b(sidecarDeviceState) == E10.b(sidecarDeviceState2)) {
            return true;
        }
        return false;
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (Intrinsics.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return Intrinsics.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!b((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (Intrinsics.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return c(E10.c(sidecarWindowLayoutInfo), E10.c(sidecarWindowLayoutInfo2));
    }

    public final Ud0 e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new Ud0(C2968vr.b);
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        E10.d(sidecarDeviceState, E10.b(state));
        return new Ud0(f(E10.c(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    public final ArrayList f(List sidecarDisplayFeatures, SidecarDeviceState deviceState) {
        Intrinsics.checkNotNullParameter(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        Intrinsics.checkNotNullParameter(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            C2827uB g = g((SidecarDisplayFeature) it.next(), deviceState);
            if (g != null) {
                arrayList.add(g);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        if (r6 == 4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C2827uB g(androidx.window.sidecar.SidecarDisplayFeature r5, androidx.window.sidecar.SidecarDeviceState r6) {
        /*
            r4 = this;
            java.lang.String r0 = "feature"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "deviceState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "TAG"
            java.lang.String r1 = "J10"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            gb0 r0 = r4.a
            Na0 r0 = defpackage.C1314ew.w(r5, r0)
            F10 r1 = defpackage.F10.h
            java.lang.String r2 = "Type must be either TYPE_FOLD or TYPE_HINGE"
            af0 r0 = r0.g0(r2, r1)
            G10 r1 = defpackage.G10.h
            java.lang.String r2 = "Feature bounds must not be 0"
            af0 r0 = r0.g0(r2, r1)
            H10 r1 = defpackage.H10.h
            java.lang.String r2 = "TYPE_FOLD must have 0 area"
            af0 r0 = r0.g0(r2, r1)
            I10 r1 = defpackage.I10.h
            java.lang.String r2 = "Feature be pinned to either left or top"
            af0 r0 = r0.g0(r2, r1)
            java.lang.Object r0 = r0.I()
            androidx.window.sidecar.SidecarDisplayFeature r0 = (androidx.window.sidecar.SidecarDisplayFeature) r0
            r1 = 0
            if (r0 != 0) goto L41
            return r1
        L41:
            int r0 = r0.getType()
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L4f
            if (r0 == r2) goto L4c
            return r1
        L4c:
            tB r0 = defpackage.C2741tB.f
            goto L51
        L4f:
            tB r0 = defpackage.C2741tB.d
        L51:
            int r6 = defpackage.E10.b(r6)
            if (r6 == 0) goto L7a
            if (r6 == r3) goto L7a
            if (r6 == r2) goto L64
            Yx r2 = defpackage.C0780Yx.d
            r3 = 3
            if (r6 == r3) goto L66
            r3 = 4
            if (r6 == r3) goto L7a
            goto L66
        L64:
            Yx r2 = defpackage.C0780Yx.f
        L66:
            uB r6 = new uB
            fb r1 = new fb
            android.graphics.Rect r5 = r5.getRect()
            java.lang.String r3 = "feature.rect"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            r1.<init>(r5)
            r6.<init>(r1, r0, r2)
            return r6
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.J10.g(androidx.window.sidecar.SidecarDisplayFeature, androidx.window.sidecar.SidecarDeviceState):uB");
    }
}
