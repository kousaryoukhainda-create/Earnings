package defpackage;

import com.google.android.gms.common.internal.Preconditions;
/* renamed from: vn0  reason: default package */
/* loaded from: classes.dex */
public final class vn0 extends AbstractC2121m1 {
    public final String b;

    public vn0(String str, String str2) {
        this.a = Preconditions.checkNotEmpty(str);
        this.b = Preconditions.checkNotEmpty(str2);
    }

    @Override // defpackage.AbstractC2121m1
    public final String b() {
        return (String) this.a;
    }
}
