package com.fyber.fairbid.user;

import android.content.Context;
import android.location.Location;
import android.util.Log;
import androidx.annotation.NonNull;
import com.fyber.fairbid.a9;
import com.fyber.fairbid.b9;
import com.fyber.fairbid.fa;
import com.fyber.fairbid.fc;
import com.fyber.fairbid.internal.Logger;
import com.fyber.fairbid.internal.e;
import com.fyber.fairbid.internal.f;
import com.fyber.fairbid.l6;
import com.fyber.fairbid.u1;
import com.fyber.fairbid.w1;
import com.fyber.fairbid.w4;
import com.fyber.fairbid.z1;
import com.google.android.gms.tagmanager.DataLayer;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes.dex */
public final class UserInfo {
    public static final UserInfo i = new UserInfo();
    public String b;
    public String c;
    public Location d;
    public Date e;
    public String g;
    public volatile boolean a = true;
    public Gender f = Gender.UNKNOWN;
    public boolean h = false;

    public static synchronized UserInfo a() {
        UserInfo userInfo;
        synchronized (UserInfo.class) {
            userInfo = i;
        }
        return userInfo;
    }

    public static void clearGdprConsent(@NonNull Context context) {
        setGdprConsentString(null, context);
    }

    public static void clearIabUsPrivacyString(@NonNull Context context) {
        setIabUsPrivacyString(null, context);
    }

    public static Integer getAgeFromBirthdate() {
        if (getBirthDate() != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(getBirthDate());
            Calendar calendar2 = Calendar.getInstance();
            int i2 = calendar2.get(1) - calendar.get(1);
            if (calendar.get(2) > calendar2.get(2) || (calendar.get(2) == calendar2.get(2) && calendar.get(5) > calendar2.get(5))) {
                i2--;
            }
            return Integer.valueOf(i2);
        }
        return null;
    }

    public static Date getBirthDate() {
        UserInfo userInfo;
        synchronized (UserInfo.class) {
            userInfo = i;
        }
        return userInfo.e;
    }

    public static Gender getGender() {
        UserInfo userInfo;
        synchronized (UserInfo.class) {
            userInfo = i;
        }
        return userInfo.f;
    }

    public static Location getLocation() {
        UserInfo userInfo;
        synchronized (UserInfo.class) {
            userInfo = i;
        }
        return userInfo.d;
    }

    public static String getPostalCode() {
        UserInfo userInfo;
        synchronized (UserInfo.class) {
            userInfo = i;
        }
        return userInfo.g;
    }

    public static String getRawUserId() {
        UserInfo userInfo;
        synchronized (UserInfo.class) {
            userInfo = i;
        }
        return userInfo.c;
    }

    public static String getUserId() {
        UserInfo userInfo = i;
        if (userInfo.b == null && userInfo.a) {
            fa.a b = e.b.j().b(500L);
            if (b != null) {
                return b.a;
            }
            return null;
        }
        return userInfo.b;
    }

    public static boolean isChild() {
        UserInfo userInfo;
        synchronized (UserInfo.class) {
            userInfo = i;
        }
        return userInfo.h;
    }

    public static void setBirthDate(Date date) {
        UserInfo userInfo;
        synchronized (UserInfo.class) {
            userInfo = i;
        }
        userInfo.e = date;
    }

    public static void setGdprConsent(boolean z, @NonNull Context context) {
        if (context != null) {
            f fVar = e.b;
            fVar.c().a(context);
            fVar.m().a(z);
            z1 a = fVar.a();
            u1 a2 = a.a.a(w1.GDPR_FLAG_CHANGE);
            a2.h = new a9(z);
            l6.a(a.f, a2, DataLayer.EVENT_KEY, a2, false);
            return;
        }
        Logger.error("The context cannot be null, not setting the GDPR Consent");
    }

    public static void setGdprConsentString(String str, @NonNull Context context) {
        if (context != null) {
            f fVar = e.b;
            fVar.c().a(context);
            fVar.m().a(str);
            z1 a = fVar.a();
            u1 a2 = a.a.a(w1.GDPR_STRING_CHANGE);
            a2.h = new b9(str);
            l6.a(a.f, a2, DataLayer.EVENT_KEY, a2, false);
            return;
        }
        Logger.error("The context cannot be null, not setting the GDPR Consent String");
    }

    public static void setGender(Gender gender) {
        UserInfo userInfo;
        if (gender == null) {
            a().f = Gender.UNKNOWN;
            return;
        }
        synchronized (UserInfo.class) {
            userInfo = i;
        }
        userInfo.f = gender;
    }

    public static void setIabUsPrivacyString(String str, @NonNull Context context) {
        if (context != null) {
            f fVar = e.b;
            fVar.c().a(context);
            fVar.m().b(str);
            z1 a = fVar.a();
            u1 a2 = a.a.a(w1.CCPA_STRING_CHANGE);
            a2.h = new w4(str);
            l6.a(a.f, a2, DataLayer.EVENT_KEY, a2, false);
            return;
        }
        Logger.error("The context cannot be null, not setting the IAB US Privacy String");
    }

    public static void setLgpdConsent(boolean z, @NonNull Context context) {
        if (context != null) {
            f fVar = e.b;
            fVar.c().a(context);
            fVar.m().b(z);
            z1 a = fVar.a();
            u1 a2 = a.a.a(w1.LGPD_FLAG_CHANGE);
            a2.h = new fc(z);
            l6.a(a.f, a2, DataLayer.EVENT_KEY, a2, false);
            return;
        }
        Logger.error("The context cannot be null, not setting the LGPD Consent");
    }

    public static void setLocation(Location location) {
        UserInfo userInfo;
        synchronized (UserInfo.class) {
            userInfo = i;
        }
        userInfo.d = location;
    }

    public static void setPostalCode(String str) {
        UserInfo userInfo;
        synchronized (UserInfo.class) {
            userInfo = i;
        }
        userInfo.g = str;
    }

    public static void setUserId(String str) {
        UserInfo userInfo = i;
        userInfo.c = str;
        if (str != null && str.length() > 256) {
            Locale locale = Locale.US;
            Log.w(Logger.TAG, "User ID \"" + str + "\" exceeded the limit of 256 characters. Setting User ID to 'null'.");
            userInfo.b = null;
            userInfo.a = false;
            return;
        }
        userInfo.a = true;
        userInfo.b = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserInfo{userId=");
        sb.append(this.b);
        sb.append(", location=");
        sb.append(this.d);
        sb.append(", birthDate=");
        sb.append(this.e);
        sb.append(", gender=");
        sb.append(this.f);
        sb.append(", postalCode='");
        return AbstractC0324Hi.h(sb, this.g, "'}");
    }
}
