package defpackage;

import android.app.RemoteInput;
/* renamed from: TV  reason: default package */
/* loaded from: classes.dex */
public abstract class TV {
    public static int a(Object obj) {
        return ((RemoteInput) obj).getEditChoicesBeforeSending();
    }

    public static RemoteInput.Builder b(RemoteInput.Builder builder, int i) {
        return builder.setEditChoicesBeforeSending(i);
    }
}
