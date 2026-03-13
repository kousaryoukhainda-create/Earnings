package com.fyber.fairbid;

import com.fyber.fairbid.http.responses.ResponseHandler;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public abstract class a2<T> implements ResponseHandler<T> {
    @NotNull
    public final HashSet<a> a = new HashSet<>();

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onSuccess();
    }

    public abstract void a(int i, T t, String str);

    public final void a(@NotNull b2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.a.add(callback);
    }

    public abstract boolean a(int i, T t);

    @Override // com.fyber.fairbid.http.responses.ResponseHandler
    public final void onError(int i, @NotNull Map<String, ? extends List<String>> headers, T t, String str) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        a(i, t, str);
        for (a aVar : this.a) {
            aVar.a();
        }
    }

    @Override // com.fyber.fairbid.http.responses.ResponseHandler
    public final void onSuccess(int i, @NotNull Map<String, ? extends List<String>> headers, T t) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (a(i, t)) {
            for (a aVar : this.a) {
                aVar.onSuccess();
            }
            return;
        }
        for (a aVar2 : this.a) {
            aVar2.a();
        }
    }
}
