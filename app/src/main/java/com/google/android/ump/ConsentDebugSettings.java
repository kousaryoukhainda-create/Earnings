package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.consent_sdk.zzci;
import com.google.android.gms.internal.consent_sdk.zzcq;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ConsentDebugSettings {
    public final boolean a;
    public final int b;

    /* loaded from: classes.dex */
    public static class Builder {
        public final Context b;
        public boolean d;
        public final ArrayList a = new ArrayList();
        public int c = 0;

        public Builder(@RecentlyNonNull Context context) {
            this.b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.a.add(str);
            return this;
        }

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            boolean z = true;
            if (!zzcq.zza(true) && !this.a.contains(zzci.zza(this.b)) && !this.d) {
                z = false;
            }
            return new ConsentDebugSettings(z, this);
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i) {
            this.c = i;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setForceTesting(boolean z) {
            this.d = z;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;
        @Deprecated
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
        public static final int DEBUG_GEOGRAPHY_OTHER = 4;
        public static final int DEBUG_GEOGRAPHY_REGULATED_US_STATE = 3;
    }

    public /* synthetic */ ConsentDebugSettings(boolean z, Builder builder) {
        this.a = z;
        this.b = builder.c;
    }

    public int getDebugGeography() {
        return this.b;
    }

    public boolean isTestDevice() {
        return this.a;
    }
}
