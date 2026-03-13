package com.fyber.fairbid.common.concurrency;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class VerifiableSettableFuture<V> extends SettableFuture<V> {
    @NotNull
    public static final a Companion = new a();
    public b<V> c;

    /* loaded from: classes.dex */
    public static final class a {
        public static VerifiableSettableFuture a(a aVar) {
            aVar.getClass();
            return new VerifiableSettableFuture(null, null);
        }
    }

    /* loaded from: classes.dex */
    public interface b<V> {
        V a(V v) throws Exception;
    }

    public /* synthetic */ VerifiableSettableFuture(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    @Override // com.fyber.fairbid.common.concurrency.SettableFuture, com.fyber.fairbid.common.concurrency.AbstractFuture
    public boolean set(V v) {
        Object k;
        boolean z;
        try {
            b<V> bVar = this.c;
            if (bVar != null && bVar.a(v) != null) {
                z = super.set(v);
            } else {
                z = super.set(v);
            }
            k = Boolean.valueOf(z);
        } catch (Throwable th) {
            k = AbstractC1522hL.k(th);
        }
        Throwable a2 = JW.a(k);
        if (a2 == null) {
            return ((Boolean) k).booleanValue();
        }
        return super.setException(a2);
    }

    public final void setVerifier(b<V> bVar) {
        this.c = bVar;
    }

    public VerifiableSettableFuture(b<V> bVar) {
        this.c = bVar;
    }
}
