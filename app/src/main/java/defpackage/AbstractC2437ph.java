package defpackage;

import android.util.Log;
import androidx.fragment.app.n;
import com.applovin.mediation.MaxAdListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.perf.util.Timer;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPluginException;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
/* renamed from: ph  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2437ph {
    public static /* synthetic */ int a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    public static int b(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static String c(int i, String str, String str2) {
        return str + i + str2;
    }

    public static /* synthetic */ String d(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) " ");
            }
        }
        return sb.toString();
    }

    public static String e(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String f(String str, n nVar, String str2) {
        return str + nVar + str2;
    }

    public static String g(String str, String str2) {
        return str + str2;
    }

    public static String h(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String i(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String j(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String k(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String l(StringBuilder sb, String str) {
        return str + ((Object) sb);
    }

    public static String m(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static StringBuilder n(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static void o(int i, String str, String str2) {
        Log.w(str2, str + i);
    }

    public static void p(IW iw, Function1 function1) {
        function1.invoke(new JW(iw));
    }

    public static void q(B90 b90, Function1 function1) {
        function1.invoke(new JW(b90));
    }

    public static void r(Timer timer, C1020cO c1020cO, C1020cO c1020cO2) {
        c1020cO.m(timer.c());
        AbstractC1182dO.c(c1020cO2);
    }

    public static void s(GeneratedAndroidFirebaseAuth.Result result, Task task) {
        result.error(FlutterFirebaseAuthPluginException.parserExceptionToFlutter(task.getException()));
    }

    public static /* synthetic */ void t(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void u(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void v(StringBuilder sb, MaxAdListener maxAdListener, com.applovin.impl.sdk.n nVar, String str) {
        sb.append(maxAdListener);
        nVar.a(str, sb.toString());
    }

    public static void w(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }
}
