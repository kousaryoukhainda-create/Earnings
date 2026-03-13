package defpackage;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
/* renamed from: pa0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2424pa0 {
    asian("asian"),
    black("black"),
    hispanic("hispanic"),
    indian("indian"),
    middle_eastern("middle eastern"),
    native_american("native american"),
    pacific_islander("pacific islander"),
    white("white"),
    other(InneractiveMediationNameConsts.OTHER);
    
    public final String b;

    EnumC2424pa0(String str) {
        this.b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }
}
