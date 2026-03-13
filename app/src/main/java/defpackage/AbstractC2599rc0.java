package defpackage;

import androidx.fragment.app.n;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: rc0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2599rc0 extends RuntimeException {
    public final n b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2599rc0(n fragment, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.b = fragment;
    }
}
