package defpackage;

import android.os.Build;
/* renamed from: F3  reason: default package */
/* loaded from: classes.dex */
public class F3 extends G3 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F3(String str, String str2, int i) {
        super(str, str2);
        this.d = i;
    }

    @Override // defpackage.G3
    public final boolean a() {
        switch (this.d) {
            case 0:
                if (Build.VERSION.SDK_INT >= 23) {
                    return true;
                }
                return false;
            case 1:
                if (Build.VERSION.SDK_INT >= 24) {
                    return true;
                }
                return false;
            case 2:
                return false;
            case 3:
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
                return false;
            case 4:
                if (Build.VERSION.SDK_INT >= 27) {
                    return true;
                }
                return false;
            case 5:
                if (Build.VERSION.SDK_INT >= 28) {
                    return true;
                }
                return false;
            default:
                if (Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
        }
    }
}
