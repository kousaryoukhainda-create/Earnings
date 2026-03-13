package defpackage;

import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
/* renamed from: kC  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C1969kC extends C0145Al {
    public final int d;

    public C1969kC() {
        super(2008);
        this.d = 1;
    }

    public static int a(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    public static C1969kC b(IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION;
        } else if (message != null && AbstractC1906jZ.P(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        } else {
            i2 = 2001;
        }
        if (i2 == 2007) {
            return new C1969kC("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007);
        }
        return new C1969kC(iOException, i2, i);
    }

    public C1969kC(String str, int i) {
        super(str, a(i, 1));
        this.d = 1;
    }

    public C1969kC(IOException iOException, int i, int i2) {
        super(a(i, i2), iOException);
        this.d = i2;
    }

    public C1969kC(String str, IOException iOException, int i) {
        super(a(i, 1), str, iOException);
        this.d = 1;
    }
}
