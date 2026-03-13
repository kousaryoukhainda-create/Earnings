package com.fyber.fairbid;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public abstract class n5 {
    @NotNull
    public final HashMap a = new HashMap();
    public n5 b;

    /* loaded from: classes.dex */
    public static final class a extends Throwable {
    }

    public final boolean a(n5 n5Var) {
        n5 n5Var2 = this.b;
        if (n5Var2 != null) {
            if (n5Var2 == n5Var) {
                return true;
            }
            return n5Var2.a(n5Var);
        }
        return false;
    }

    public <T> T get$fairbid_sdk_release(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) get$fairbid_sdk_release(key, null);
    }

    public final void put$fairbid_sdk_release(@NotNull String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.a.put(key, obj);
    }

    public final void setDefaultValueProvider(@NotNull n5 defaultValueProvider) throws a {
        Intrinsics.checkNotNullParameter(defaultValueProvider, "defaultValueProvider");
        if (!defaultValueProvider.a(this)) {
            this.b = defaultValueProvider;
            return;
        }
        throw new a();
    }

    public <T> T get$fairbid_sdk_release(@NotNull String key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t2 = (T) this.a.get(key);
        if (t2 == null) {
            n5 n5Var = this.b;
            Object obj = n5Var != null ? n5Var.get$fairbid_sdk_release(key) : null;
            return obj == null ? t : (T) obj;
        }
        return t2;
    }
}
