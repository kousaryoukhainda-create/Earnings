package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: Tj0  reason: default package */
/* loaded from: classes3.dex */
public abstract class Tj0 extends Xf0 implements Xj0 {
    @Override // defpackage.Xf0
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            AbstractC2522qg0.b(parcel);
            b((Bundle) AbstractC2522qg0.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
