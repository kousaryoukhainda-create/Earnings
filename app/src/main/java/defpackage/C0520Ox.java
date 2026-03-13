package defpackage;

import io.flutter.plugin.common.MethodChannel;
/* renamed from: Ox  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0520Ox implements InterfaceC1442gR {
    public final /* synthetic */ MethodChannel.Result a;

    public C0520Ox(MethodChannel.Result result) {
        this.a = result;
    }

    @Override // defpackage.InterfaceC1442gR
    public final void a() {
        this.a.error("permissionRequestInProgress", "Another permission request is already in progress", null);
    }

    @Override // defpackage.InterfaceC1442gR
    public final void b(boolean z) {
        this.a.success(Boolean.valueOf(z));
    }
}
