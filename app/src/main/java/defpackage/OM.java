package defpackage;

import android.content.pm.PackageManager;
import android.view.WindowManager;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: OM  reason: default package */
/* loaded from: classes2.dex */
public final class OM implements MethodChannel.MethodCallHandler {
    public final PackageManager b;
    public final WindowManager c;

    public OM(PackageManager packageManager, WindowManager windowManager) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        this.b = packageManager;
        this.c = windowManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00c5, code lost:
        if (defpackage.D40.o(r1, "generic") == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0192 A[LOOP:1: B:43:0x018c->B:45:0x0192, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0241 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(io.flutter.plugin.common.MethodCall r12, io.flutter.plugin.common.MethodChannel.Result r13) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.OM.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }
}
