package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class y {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    /* loaded from: classes.dex */
    public interface a extends j<Boolean> {
    }

    /* loaded from: classes.dex */
    public interface b extends j<Double> {
    }

    /* loaded from: classes.dex */
    public interface c {
        int a();
    }

    /* loaded from: classes.dex */
    public interface d<T extends c> {
        T a(int i);
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a(int i);
    }

    /* loaded from: classes.dex */
    public interface f extends j<Float> {
    }

    /* loaded from: classes.dex */
    public interface g extends j<Integer> {
    }

    /* loaded from: classes.dex */
    public static class h<F, T> extends AbstractList<T> {
        public final List<F> a;
        public final a<F, T> b;

        /* loaded from: classes.dex */
        public interface a<F, T> {
        }

        public h(List<F> list, a<F, T> aVar) {
            this.a = list;
            this.b = aVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            a<F, T> aVar = this.b;
            F f = this.a.get(i);
            ((TokenParametersOuterClass$TokenParameters.a) aVar).getClass();
            T t = (T) TokenParametersOuterClass$TokenParameters.k.a(((Integer) f).intValue());
            if (t == null) {
                return (T) TokenParametersOuterClass$TokenParameters.k.UNRECOGNIZED;
            }
            return t;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.a.size();
        }
    }

    /* loaded from: classes.dex */
    public interface i extends j<Long> {
    }

    /* loaded from: classes.dex */
    public interface j<E> extends List<E>, RandomAccess {
        j<E> b(int i);

        void b();

        boolean d();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        com.fyber.inneractive.sdk.protobuf.j.a(bArr, 0, 0, false);
    }

    public static int a(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static Object a(Object obj, Object obj2) {
        o0 o0Var = (o0) obj2;
        a.AbstractC0102a abstractC0102a = (a.AbstractC0102a) ((o0) obj).toBuilder();
        abstractC0102a.getClass();
        GeneratedMessageLite.b bVar = (GeneratedMessageLite.b) abstractC0102a;
        if (bVar.a.getClass().isInstance(o0Var)) {
            bVar.c();
            bVar.a(bVar.b, (GeneratedMessageLite) ((com.fyber.inneractive.sdk.protobuf.a) o0Var));
            return bVar.b();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
