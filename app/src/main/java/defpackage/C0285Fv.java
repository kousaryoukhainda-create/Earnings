package defpackage;

import com.google.android.gms.common.internal.Preconditions;
/* renamed from: Fv  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C0285Fv extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0285Fv(String str) {
        super(str);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0285Fv(String str, Throwable th) {
        super(str, th);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
