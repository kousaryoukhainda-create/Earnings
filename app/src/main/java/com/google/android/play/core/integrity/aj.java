package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
/* loaded from: classes3.dex */
final class aj {
    final C3121xf0 a;
    private final Rk0 b;
    private final String c;
    private final Context d;
    private final at e;
    private final k f;

    public aj(Context context, Rk0 rk0, at atVar, k kVar) {
        this.c = context.getPackageName();
        this.b = rk0;
        this.e = atVar;
        this.f = kVar;
        this.d = context;
        Rk0 rk02 = Af0.a;
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                rk02.c("Play Store package is disabled.", new Object[0]);
            } else {
                try {
                    if (Af0.b(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.a = new C3121xf0(context, rk0, "IntegrityService", ak.a, new Fl0() { // from class: com.google.android.play.core.integrity.ae
                            @Override // defpackage.Fl0
                            public final Object a(IBinder iBinder) {
                                int i = Ej0.g;
                                if (iBinder == null) {
                                    return null;
                                }
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                                if (queryLocalInterface instanceof Nj0) {
                                    return (Nj0) queryLocalInterface;
                                }
                                return new AbstractC2090lf0(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
                            }
                        });
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    rk02.c("Play Store package is not found.", new Object[0]);
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            rk02.c("Play Store package is not found.", new Object[0]);
        }
        Object[] objArr = new Object[0];
        rk0.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", Rk0.d(rk0.a, "Phonesky is not installed.", objArr));
        }
        this.a = null;
    }

    public static Bundle a(aj ajVar, byte[] bArr, Long l, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        if (parcelable != null) {
            bundle.putParcelable("network", parcelable);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2352oh0(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC1424g90.a(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i = bundle.getInt("dialog.intent.type");
        this.b.b("requestAndShowDialog(%s, %s)", this.c, Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.a != null) {
            if (Af0.a(this.d) >= 82380000) {
                try {
                    byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
                    Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
                    if (Build.VERSION.SDK_INT >= 23 && (integrityTokenRequest instanceof ao)) {
                        ao aoVar = (ao) integrityTokenRequest;
                    }
                    this.b.b("requestIntegrityToken(%s)", integrityTokenRequest);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    this.a.c(new af(this, taskCompletionSource, decode, cloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
                    return taskCompletionSource.getTask();
                } catch (IllegalArgumentException e) {
                    return Tasks.forException(new IntegrityServiceException(-13, e));
                }
            }
            return Tasks.forException(new IntegrityServiceException(-14, null));
        }
        return Tasks.forException(new IntegrityServiceException(-2, null));
    }
}
