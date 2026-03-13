package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: yS  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C3188yS {
    public final Object[] a;
    public int b;

    public C3188yS(int i) {
        if (i > 0) {
            this.a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public Object a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        Intrinsics.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    public void b(C1329f5 c1329f5) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = c1329f5;
            this.b = i + 1;
        }
    }

    public boolean c(Object instance) {
        Object[] objArr;
        boolean z;
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i = this.b;
        int i2 = 0;
        while (true) {
            objArr = this.a;
            if (i2 < i) {
                if (objArr[i2] == instance) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            int i3 = this.b;
            if (i3 >= objArr.length) {
                return false;
            }
            objArr[i3] = instance;
            this.b = i3 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public C3188yS() {
        this.a = new Object[UserVerificationMethods.USER_VERIFY_HANDPRINT];
    }
}
