package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;
/* renamed from: FI  reason: default package */
/* loaded from: classes2.dex */
public abstract class FI {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        return sb.toString();
    }
}
