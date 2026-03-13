package defpackage;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: R00  reason: default package */
/* loaded from: classes2.dex */
public class R00 {
    public static Set a(Object obj) {
        Set singleton = Collections.singleton(obj);
        Intrinsics.checkNotNullExpressionValue(singleton, "singleton(...)");
        return singleton;
    }
}
