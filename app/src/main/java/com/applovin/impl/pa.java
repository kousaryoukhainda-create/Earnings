package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.h5;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public interface pa extends h5 {

    /* loaded from: classes.dex */
    public static final class a extends c {
        public a(IOException iOException, k5 k5Var) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, k5Var, 2007, 1);
        }
    }

    /* loaded from: classes.dex */
    public interface b extends h5.a {
        @Override // com.applovin.impl.h5.a
        pa a();
    }

    /* loaded from: classes.dex */
    public static class c extends i5 {
        public final k5 b;
        public final int c;

        public c(k5 k5Var, int i, int i2) {
            super(a(i, i2));
            this.b = k5Var;
            this.c = i2;
        }

        private static int a(int i, int i2) {
            if (i == 2000 && i2 == 1) {
                return 2001;
            }
            return i;
        }

        public static c a(IOException iOException, k5 k5Var, int i) {
            int i2;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i2 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i2 = GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION;
            } else {
                i2 = (message == null || !Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            if (i2 == 2007) {
                return new a(iOException, k5Var);
            }
            return new c(iOException, k5Var, i2, i);
        }

        public c(IOException iOException, k5 k5Var, int i, int i2) {
            super(iOException, a(i, i2));
            this.b = k5Var;
            this.c = i2;
        }

        public c(String str, k5 k5Var, int i, int i2) {
            super(str, a(i, i2));
            this.b = k5Var;
            this.c = i2;
        }

        public c(String str, IOException iOException, k5 k5Var, int i, int i2) {
            super(str, iOException, a(i, i2));
            this.b = k5Var;
            this.c = i2;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends c {
        public final String d;

        public d(String str, k5 k5Var) {
            super(AbstractC2437ph.g("Invalid content type: ", str), k5Var, 2003, 1);
            this.d = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends c {
        public final int d;
        public final String f;
        public final Map g;
        public final byte[] h;

        public e(int i, String str, IOException iOException, Map map, k5 k5Var, byte[] bArr) {
            super(AbstractC0324Hi.e(i, "Response code: "), iOException, k5Var, 2004, 1);
            this.d = i;
            this.f = str;
            this.g = map;
            this.h = bArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {
        private final Map a = new HashMap();
        private Map b;

        public synchronized Map a() {
            try {
                if (this.b == null) {
                    this.b = Collections.unmodifiableMap(new HashMap(this.a));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.b;
        }
    }
}
