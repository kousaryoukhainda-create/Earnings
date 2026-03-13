package defpackage;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
/* renamed from: Ik  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0352Ik extends Binder implements InterfaceC2656sC {
    public final Handler b;
    public final /* synthetic */ AbstractC0196Ck c;

    public BinderC0352Ik(AbstractC0196Ck abstractC0196Ck) {
        this.c = abstractC0196Ck;
        attachInterface(this, InterfaceC2656sC.S7);
        this.b = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        Bundle extraCallbackWithResult;
        String str = InterfaceC2656sC.S7;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.b;
        AbstractC0196Ck abstractC0196Ck = this.c;
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) AbstractC2870uj.c(parcel, Bundle.CREATOR);
                if (abstractC0196Ck != null) {
                    handler.post(new A1(this, readInt, bundle, 5));
                    break;
                }
                break;
            case 3:
                String readString = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC2870uj.c(parcel, Bundle.CREATOR);
                if (abstractC0196Ck != null) {
                    handler.post(new RunnableC0248Ek(this, readString, bundle2, 0));
                    break;
                }
                break;
            case 4:
                Bundle bundle3 = (Bundle) AbstractC2870uj.c(parcel, Bundle.CREATOR);
                if (abstractC0196Ck != null) {
                    handler.post(new RunnableC0222Dk(this, bundle3, 1));
                }
                parcel2.writeNoException();
                break;
            case 5:
                String readString2 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC2870uj.c(parcel, Bundle.CREATOR);
                if (abstractC0196Ck != null) {
                    handler.post(new RunnableC0248Ek(this, readString2, bundle4, 1));
                }
                parcel2.writeNoException();
                break;
            case 6:
                int readInt2 = parcel.readInt();
                Uri uri = (Uri) AbstractC2870uj.c(parcel, Uri.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                Bundle bundle5 = (Bundle) AbstractC2870uj.c(parcel, Bundle.CREATOR);
                if (abstractC0196Ck != null) {
                    handler.post(new RunnableC0274Fk(this, readInt2, uri, z, bundle5));
                    break;
                }
                break;
            case 7:
                String readString3 = parcel.readString();
                Bundle bundle6 = (Bundle) AbstractC2870uj.c(parcel, Bundle.CREATOR);
                if (abstractC0196Ck == null) {
                    extraCallbackWithResult = null;
                } else {
                    extraCallbackWithResult = abstractC0196Ck.extraCallbackWithResult(readString3, bundle6);
                }
                parcel2.writeNoException();
                if (extraCallbackWithResult != null) {
                    parcel2.writeInt(1);
                    extraCallbackWithResult.writeToParcel(parcel2, 1);
                    break;
                } else {
                    parcel2.writeInt(0);
                    break;
                }
            case 8:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                Bundle bundle7 = (Bundle) AbstractC2870uj.c(parcel, Bundle.CREATOR);
                if (abstractC0196Ck != null) {
                    handler.post(new RunnableC0300Gk(this, readInt3, readInt4, bundle7));
                    break;
                }
                break;
            case 9:
                Bundle bundle8 = (Bundle) AbstractC2870uj.c(parcel, Bundle.CREATOR);
                if (abstractC0196Ck != null) {
                    handler.post(new RunnableC0222Dk(this, bundle8, 2));
                    break;
                }
                break;
            case 10:
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                int readInt9 = parcel.readInt();
                Bundle bundle9 = (Bundle) AbstractC2870uj.c(parcel, Bundle.CREATOR);
                if (abstractC0196Ck != null) {
                    handler.post(new RunnableC0326Hk(this, readInt5, readInt6, readInt7, readInt8, readInt9, bundle9));
                    break;
                }
                break;
            case 11:
                Bundle bundle10 = (Bundle) AbstractC2870uj.c(parcel, Bundle.CREATOR);
                if (abstractC0196Ck != null) {
                    handler.post(new RunnableC0222Dk(this, bundle10, 3));
                    break;
                }
                break;
            case 12:
                Bundle bundle11 = (Bundle) AbstractC2870uj.c(parcel, Bundle.CREATOR);
                if (abstractC0196Ck != null) {
                    handler.post(new RunnableC0222Dk(this, bundle11, 0));
                    break;
                }
                break;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
