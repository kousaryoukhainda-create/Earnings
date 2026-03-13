package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: sr  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2710sr implements InterfaceC0428Li, Serializable {
    public static final C2710sr b = new Object();

    @Override // defpackage.InterfaceC0428Li
    public final Object fold(Object obj, InterfaceC0652Tz operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return obj;
    }

    @Override // defpackage.InterfaceC0428Li
    public final InterfaceC0376Ji get(InterfaceC0402Ki key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.InterfaceC0428Li
    public final InterfaceC0428Li minusKey(InterfaceC0402Ki key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this;
    }

    @Override // defpackage.InterfaceC0428Li
    public final InterfaceC0428Li plus(InterfaceC0428Li context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
