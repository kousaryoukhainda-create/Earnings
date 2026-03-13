package com.fyber.inneractive.sdk.cache.session.enums;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum REWARDED_VIDEO uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b BANNER_DISPLAY;
    public static final b INTERSTITIAL_DISPLAY;
    public static final b INTERSTITIAL_VIDEO;
    public static final b NONE;
    public static final b RECTANGLE_DISPLAY;
    public static final b REWARDED_DISPLAY;
    public static final b REWARDED_VIDEO;
    private boolean mShouldCountCompletion;
    private UnitDisplayType mType;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UnitDisplayType.values().length];
            a = iArr;
            try {
                iArr[UnitDisplayType.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UnitDisplayType.MRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[UnitDisplayType.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[UnitDisplayType.INTERSTITIAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        UnitDisplayType unitDisplayType = UnitDisplayType.REWARDED;
        b bVar = new b("REWARDED_VIDEO", 0, unitDisplayType, true);
        REWARDED_VIDEO = bVar;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.INTERSTITIAL;
        b bVar2 = new b("INTERSTITIAL_VIDEO", 1, unitDisplayType2, true);
        INTERSTITIAL_VIDEO = bVar2;
        b bVar3 = new b("RECTANGLE_DISPLAY", 2, UnitDisplayType.MRECT, false);
        RECTANGLE_DISPLAY = bVar3;
        b bVar4 = new b("REWARDED_DISPLAY", 3, unitDisplayType, true);
        REWARDED_DISPLAY = bVar4;
        b bVar5 = new b("BANNER_DISPLAY", 4, UnitDisplayType.BANNER, false);
        BANNER_DISPLAY = bVar5;
        b bVar6 = new b("INTERSTITIAL_DISPLAY", 5, unitDisplayType2, false);
        INTERSTITIAL_DISPLAY = bVar6;
        b bVar7 = new b("NONE", 6, UnitDisplayType.DEFAULT, false);
        NONE = bVar7;
        $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
    }

    public b(String str, int i, UnitDisplayType unitDisplayType, boolean z) {
        this.mType = unitDisplayType;
        this.mShouldCountCompletion = z;
    }

    public static b a(String str, String str2) {
        int i = a.a[UnitDisplayType.fromValue(str).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    if (str2.contains("video")) {
                        return INTERSTITIAL_VIDEO;
                    }
                    return INTERSTITIAL_DISPLAY;
                }
                return BANNER_DISPLAY;
            }
            return RECTANGLE_DISPLAY;
        } else if (str2.contains("video")) {
            return REWARDED_VIDEO;
        } else {
            return REWARDED_DISPLAY;
        }
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public UnitDisplayType e() {
        return this.mType;
    }

    public boolean f() {
        return this.mShouldCountCompletion;
    }
}
