package defpackage;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashMap;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: af  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0866af {
    public static final EnumC0866af b;
    public static final HashMap c;
    public static final /* synthetic */ EnumC0866af[] d;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC0866af EF10;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, af] */
    static {
        Enum r10 = new Enum("X86_32", 0);
        Enum r11 = new Enum("X86_64", 1);
        Enum r12 = new Enum("ARM_UNKNOWN", 2);
        Enum r13 = new Enum("PPC", 3);
        Enum r14 = new Enum("PPC64", 4);
        Enum r15 = new Enum("ARMV6", 5);
        Enum r5 = new Enum("ARMV7", 6);
        ?? r4 = new Enum(GrsBaseInfo.CountryCodeSource.UNKNOWN, 7);
        b = r4;
        Enum r3 = new Enum("ARMV7S", 8);
        Enum r2 = new Enum("ARM64", 9);
        d = new EnumC0866af[]{r10, r11, r12, r13, r14, r15, r5, r4, r3, r2};
        HashMap hashMap = new HashMap(4);
        c = hashMap;
        hashMap.put("armeabi-v7a", r5);
        hashMap.put("armeabi", r15);
        hashMap.put("arm64-v8a", r2);
        hashMap.put("x86", r10);
    }

    public static EnumC0866af valueOf(String str) {
        return (EnumC0866af) Enum.valueOf(EnumC0866af.class, str);
    }

    public static EnumC0866af[] values() {
        return (EnumC0866af[]) d.clone();
    }
}
