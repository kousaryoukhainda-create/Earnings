package defpackage;

import android.content.pm.PackageInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
/* renamed from: x40  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3073x40 implements Function1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ C3073x40(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean x = d.x(it);
                String str = this.c;
                if (x) {
                    if (it.length() < str.length()) {
                        return str;
                    }
                    return it;
                }
                return AbstractC0324Hi.f(str, it);
            default:
                return Boolean.valueOf(((PackageInfo) obj).packageName.equals(this.c));
        }
    }
}
