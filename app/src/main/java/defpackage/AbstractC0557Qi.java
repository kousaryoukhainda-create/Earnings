package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;
/* renamed from: Qi  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0557Qi {
    public static final List a;

    static {
        try {
            a = RZ.b0(RZ.X(Arrays.asList(new Y2()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
