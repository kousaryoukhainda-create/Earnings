package com.applovin.mediation.nativeAds.adPlacer;

import androidx.annotation.NonNull;
import com.applovin.impl.sdk.n;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Set;
import java.util.TreeSet;
/* loaded from: classes.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;
    private final String a;
    private String b;
    private final Set c = new TreeSet();
    private int d = 0;
    private int e = UserVerificationMethods.USER_VERIFY_HANDPRINT;
    private int f = 4;

    public MaxAdPlacerSettings(String str) {
        this.a = str;
    }

    public void addFixedPosition(int i) {
        this.c.add(Integer.valueOf(i));
    }

    public String getAdUnitId() {
        return this.a;
    }

    public Set<Integer> getFixedPositions() {
        return this.c;
    }

    public int getMaxAdCount() {
        return this.e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f;
    }

    public String getPlacement() {
        return this.b;
    }

    public int getRepeatingInterval() {
        return this.d;
    }

    public boolean hasValidPositioning() {
        if (this.c.isEmpty() && !isRepeatingEnabled()) {
            return false;
        }
        return true;
    }

    public boolean isRepeatingEnabled() {
        if (this.d >= 2) {
            return true;
        }
        return false;
    }

    public void resetFixedPositions() {
        this.c.clear();
    }

    public void setMaxAdCount(int i) {
        this.e = i;
    }

    public void setMaxPreloadedAdCount(int i) {
        this.f = i;
    }

    public void setPlacement(String str) {
        this.b = str;
    }

    public void setRepeatingInterval(int i) {
        if (i >= 2) {
            this.d = i;
            n.g("MaxAdPlacerSettings", "Repeating interval set to " + i);
            return;
        }
        this.d = 0;
        n.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i + ", which is less than minimum value of 2");
    }

    @NonNull
    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.a + "', fixedPositions=" + this.c + ", repeatingInterval=" + this.d + ", maxAdCount=" + this.e + ", maxPreloadedAdCount=" + this.f + '}';
    }
}
