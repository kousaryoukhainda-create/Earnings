package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
public abstract class zzjk implements Iterable {
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        for (Object obj : this) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(obj);
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
