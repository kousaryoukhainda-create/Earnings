package io.adjoe.sdk;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import org.jetbrains.annotations.NotNull;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class PlaytimeGender {
    public static final PlaytimeGender FEMALE;
    public static final PlaytimeGender MALE;
    public static final PlaytimeGender UNKNOWN;
    public static final /* synthetic */ PlaytimeGender[] b;
    public static final /* synthetic */ C0488Nr c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, io.adjoe.sdk.PlaytimeGender] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, io.adjoe.sdk.PlaytimeGender] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, io.adjoe.sdk.PlaytimeGender] */
    static {
        ?? r3 = new Enum("MALE", 0);
        MALE = r3;
        ?? r4 = new Enum("FEMALE", 1);
        FEMALE = r4;
        ?? r5 = new Enum(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        UNKNOWN = r5;
        PlaytimeGender[] playtimeGenderArr = {r3, r4, r5};
        b = playtimeGenderArr;
        c = AbstractC1281eb.u(playtimeGenderArr);
    }

    @NotNull
    public static InterfaceC0462Mr getEntries() {
        return c;
    }

    public static PlaytimeGender valueOf(String str) {
        return (PlaytimeGender) Enum.valueOf(PlaytimeGender.class, str);
    }

    public static PlaytimeGender[] values() {
        return (PlaytimeGender[]) b.clone();
    }
}
