package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.GmsClient;
/* renamed from: Lq  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436Lq extends GmsClient {
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, java.lang.Object, xC] */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        int i = AbstractBinderC3172yC.b;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC3258zC)) {
            return (InterfaceC3258zC) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.b = iBinder;
        return obj;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }
}
