package com.fyber;

import java.util.EnumMap;
/* loaded from: classes.dex */
public final class c {
    public static final c c = new c();
    public boolean a = true;
    public final EnumMap b;

    public c() {
        EnumMap enumMap = new EnumMap(b.class);
        this.b = enumMap;
        enumMap.put((EnumMap) b.b, (b) "Error");
        this.b.put((EnumMap) b.c, (b) "Dismiss");
        this.b.put((EnumMap) b.d, (b) "An error happened when performing this operation");
        this.b.put((EnumMap) b.f, (b) "An error happened when loading the offer wall");
        this.b.put((EnumMap) b.g, (b) "An error happened when loading the offer wall (no internet connection)");
        this.b.put((EnumMap) b.h, (b) "Loading...");
        this.b.put((EnumMap) b.i, (b) "You don't have the Google Play Store application on your device to complete App Install offers.");
        this.b.put((EnumMap) b.j, (b) "Congratulations! You've earned %.0f %s!");
        this.b.put((EnumMap) b.k, (b) "coins");
    }
}
