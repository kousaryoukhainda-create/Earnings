package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: aI  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0838aI extends WH {
    public final Object a;
    public final ZH b;

    public C0838aI(HG hg, C1284ec0 c1284ec0) {
        this.a = hg;
        YZ yz = new YZ(c1284ec0, ZH.f);
        Intrinsics.checkNotNullParameter(ZH.class, "modelClass");
        String canonicalName = ZH.class.getCanonicalName();
        if (canonicalName != null) {
            this.b = (ZH) yz.w(ZH.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C1240e30 c1240e30 = this.b.d;
        if (c1240e30.d > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < c1240e30.d; i++) {
                XH xh = (XH) c1240e30.c[i];
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(c1240e30.b[i]);
                printWriter.print(": ");
                printWriter.println(xh.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                TH th = xh.a;
                printWriter.println(th);
                th.dump(str2 + "  ", fileDescriptor, printWriter, strArr);
                if (xh.c != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(xh.c);
                    YH yh = xh.c;
                    yh.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(yh.c);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                printWriter.println(th.dataToString(xh.getValue()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(xh.hasActiveObservers());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) UserVerificationMethods.USER_VERIFY_PATTERN);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
