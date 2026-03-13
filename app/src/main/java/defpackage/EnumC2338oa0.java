package defpackage;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
/* renamed from: oa0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2338oa0 {
    other(InneractiveMediationNameConsts.OTHER),
    none(DevicePublicKeyStringDef.NONE),
    high_school("high school"),
    in_college("in college"),
    some_college("some college"),
    associates("associates"),
    bachelors("bachelors"),
    masters("masters"),
    doctorate("doctorate");
    
    public final String b;

    EnumC2338oa0(String str) {
        this.b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }
}
