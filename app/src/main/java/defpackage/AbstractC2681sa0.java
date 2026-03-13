package defpackage;

import android.content.Context;
import android.os.UserManager;
/* renamed from: sa0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2681sa0 {
    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
