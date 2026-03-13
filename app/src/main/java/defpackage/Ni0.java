package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: Ni0  reason: default package */
/* loaded from: classes3.dex */
public abstract class Ni0 extends Xf0 implements Yi0 {
    @Override // defpackage.Xf0
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return false;
                    }
                    AbstractC2522qg0.b(parcel);
                    b((Bundle) AbstractC2522qg0.a(parcel, Bundle.CREATOR));
                    return true;
                }
                AbstractC2522qg0.b(parcel);
                d((Bundle) AbstractC2522qg0.a(parcel, Bundle.CREATOR));
                return true;
            }
            AbstractC2522qg0.b(parcel);
            c((Bundle) AbstractC2522qg0.a(parcel, Bundle.CREATOR));
            return true;
        }
        AbstractC2522qg0.b(parcel);
        e((Bundle) AbstractC2522qg0.a(parcel, Bundle.CREATOR));
        return true;
    }
}
