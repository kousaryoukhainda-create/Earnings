package defpackage;

import android.os.Build;
import java.util.HashSet;
/* renamed from: G3  reason: default package */
/* loaded from: classes.dex */
public abstract class G3 implements InterfaceC1919jg {
    public static final HashSet c = new HashSet();
    public final String a;
    public final String b;

    public G3(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = E3.a;
        String str = this.b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ((!"eng".equals(str2) && !"userdebug".equals(str2)) || !hashSet.contains(str.concat(":dev"))) {
                return false;
            }
        }
        return true;
    }
}
