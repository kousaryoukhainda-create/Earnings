package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
/* renamed from: Qk  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC0559Qk implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, AbstractC0378Jk abstractC0378Jk);

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, tC] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        InterfaceC2914vC interfaceC2914vC;
        if (this.mApplicationContext != null) {
            int i = AbstractBinderC2828uC.b;
            if (iBinder == null) {
                interfaceC2914vC = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC2914vC.T7);
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC2914vC)) {
                    interfaceC2914vC = (InterfaceC2914vC) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.b = iBinder;
                    interfaceC2914vC = obj;
                }
            }
            onCustomTabsServiceConnected(componentName, new AbstractC0378Jk(interfaceC2914vC, componentName));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }

    public void setApplicationContext(@NonNull Context context) {
        this.mApplicationContext = context;
    }
}
