package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;
/* renamed from: Rk  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585Rk {
    public final Object a = new Object();
    public final InterfaceC2914vC b;
    public final BinderC0352Ik c;
    public final ComponentName d;

    public C0585Rk(InterfaceC2914vC interfaceC2914vC, BinderC0352Ik binderC0352Ik, ComponentName componentName) {
        this.b = interfaceC2914vC;
        this.c = binderC0352Ik;
        this.d = componentName;
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.a) {
            try {
                try {
                    ((C2742tC) this.b).g(this.c, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
