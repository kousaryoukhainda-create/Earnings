package defpackage;

import android.system.ErrnoException;
import android.system.OsConstants;
/* renamed from: qu  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2542qu {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Throwable th) {
        if ((th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES) {
            return true;
        }
        return false;
    }
}
