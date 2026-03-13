package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.b;
import com.fyber.inneractive.sdk.protobuf.a;
import com.fyber.inneractive.sdk.protobuf.e;
import com.fyber.inneractive.sdk.protobuf.o0;
import com.fyber.inneractive.sdk.protobuf.q;
import com.fyber.inneractive.sdk.protobuf.r1;
import com.fyber.inneractive.sdk.protobuf.u;
import com.fyber.inneractive.sdk.protobuf.y;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends com.fyber.inneractive.sdk.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public l1 unknownFields = l1.f;
    public int memoizedSerializedSize = -1;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[r1.c.values().length];
            a = iArr;
            try {
                iArr[r1.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[r1.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c<T extends GeneratedMessageLite<T, ?>> extends com.fyber.inneractive.sdk.protobuf.b<T> {
        public final T a;

        public c(T t) {
            this.a = t;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements u.b<d> {
        public final y.d<?> a;
        public final int b;
        public final r1.b c;
        public final boolean d;
        public final boolean e;

        public d(y.d<?> dVar, int i, r1.b bVar, boolean z, boolean z2) {
            this.a = dVar;
            this.b = i;
            this.c = bVar;
            this.d = z;
            this.e = z2;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.u.b
        public int a() {
            return this.b;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.u.b
        public boolean b() {
            return this.d;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.u.b
        public r1.b c() {
            return this.c;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.b - ((d) obj).b;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.u.b
        public r1.c d() {
            return this.c.e();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.u.b
        public boolean isPacked() {
            return this.e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fyber.inneractive.sdk.protobuf.u.b
        public o0.a a(o0.a aVar, o0 o0Var) {
            return ((b) aVar).a((GeneratedMessageLite) o0Var);
        }
    }

    /* loaded from: classes.dex */
    public static class e<ContainingType extends o0, Type> extends o<ContainingType, Type> {
        public final ContainingType a;
        public final Type b;
        public final o0 c;
        public final d d;

        /* JADX WARN: Multi-variable type inference failed */
        public e(o0 o0Var, Object obj, o0 o0Var2, d dVar) {
            if (o0Var != 0) {
                if (dVar.c() == r1.b.MESSAGE && o0Var2 == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.a = o0Var;
                this.b = obj;
                this.c = o0Var2;
                this.d = dVar;
                return;
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }

        public Object a(Object obj) {
            if (this.d.c.e() == r1.c.ENUM) {
                return this.d.a.a(((Integer) obj).intValue());
            }
            return obj;
        }

        public Object b(Object obj) {
            if (this.d.c.e() == r1.c.ENUM) {
                return Integer.valueOf(((y.c) obj).a());
            }
            return obj;
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e checkIsLite(o oVar) {
        oVar.getClass();
        return (e) oVar;
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t) throws z {
        if (t != null && !t.isInitialized()) {
            j1 newUninitializedMessageException = t.newUninitializedMessageException();
            newUninitializedMessageException.getClass();
            throw new z(newUninitializedMessageException.getMessage());
        }
        return t;
    }

    public static y.a emptyBooleanList() {
        return g.d;
    }

    public static y.b emptyDoubleList() {
        return n.d;
    }

    public static y.f emptyFloatList() {
        return v.d;
    }

    public static y.g emptyIntList() {
        return x.d;
    }

    public static y.i emptyLongList() {
        return f0.d;
    }

    public static <E> y.j<E> emptyProtobufList() {
        return a1.d;
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == l1.f) {
            this.unknownFields = l1.c();
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (generatedMessageLite == null) {
            try {
                generatedMessageLite = (T) ((GeneratedMessageLite) p1.a.allocateInstance(cls)).getDefaultInstanceForType();
                if (generatedMessageLite != null) {
                    defaultInstanceMap.put(cls, generatedMessageLite);
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw new IllegalStateException(th);
            }
        }
        return (T) generatedMessageLite;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e2);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static y.g mutableCopy(y.g gVar) {
        x xVar = (x) gVar;
        int i = xVar.c;
        return xVar.b(i == 0 ? 10 : i * 2);
    }

    public static Object newMessageInfo(o0 o0Var, String str, Object[] objArr) {
        return new b1(o0Var, str, objArr);
    }

    public static <ContainingType extends o0, Type> e<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, o0 o0Var, y.d<?> dVar, int i, r1.b bVar, boolean z, Class cls) {
        return new e<>(containingtype, Collections.emptyList(), o0Var, new d(dVar, i, bVar, true, z));
    }

    public static <ContainingType extends o0, Type> e<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, o0 o0Var, y.d<?> dVar, int i, r1.b bVar, Class cls) {
        return new e<>(containingtype, type, o0Var, new d(dVar, i, bVar, false, false));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) throws z {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, q.a()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, q qVar) throws z {
        return (T) checkMessageInitialized(parseFrom(t, j.a(byteBuffer, false), qVar));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, q qVar) throws z {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            if ((read & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                read &= 127;
                int i = 7;
                while (true) {
                    if (i < 32) {
                        int read2 = inputStream.read();
                        if (read2 != -1) {
                            read |= (read2 & 127) << i;
                            if ((read2 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                                break;
                            }
                            i += 7;
                        } else {
                            throw z.i();
                        }
                    } else {
                        while (i < 64) {
                            int read3 = inputStream.read();
                            if (read3 != -1) {
                                if ((read3 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                    i += 7;
                                }
                            } else {
                                throw z.i();
                            }
                        }
                        throw z.e();
                    }
                }
            }
            j a2 = j.a(new a.AbstractC0102a.C0103a(inputStream, read));
            T t2 = (T) parsePartialFrom(t, a2, qVar);
            a2.a(0);
            return t2;
        } catch (IOException e2) {
            throw new z(e2.getMessage());
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, j jVar, q qVar) throws z {
        T t2 = (T) t.dynamicMethod(f.NEW_MUTABLE_INSTANCE);
        try {
            z0 z0Var = z0.c;
            z0Var.getClass();
            d1 a2 = z0Var.a(t2.getClass());
            k kVar = jVar.d;
            if (kVar == null) {
                kVar = new k(jVar);
            }
            a2.a(t2, kVar, qVar);
            a2.c(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof z) {
                throw ((z) e2.getCause());
            }
            throw new z(e2.getMessage());
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof z) {
                throw ((z) e3.getCause());
            }
            throw e3;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(f.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(f.NEW_BUILDER);
    }

    public Object dynamicMethod(f fVar, Object obj) {
        return dynamicMethod(fVar, obj, null);
    }

    public abstract Object dynamicMethod(f fVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z0 z0Var = z0.c;
        z0Var.getClass();
        return z0Var.a(getClass()).b(this, (GeneratedMessageLite) obj);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.a
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final w0<MessageType> getParserForType() {
        return (w0) dynamicMethod(f.GET_PARSER);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.o0
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            z0 z0Var = z0.c;
            z0Var.getClass();
            this.memoizedSerializedSize = z0Var.a(getClass()).b(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        z0 z0Var = z0.c;
        z0Var.getClass();
        int d2 = z0Var.a(getClass()).d(this);
        this.memoizedHashCode = d2;
        return d2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.p0
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public void makeImmutable() {
        z0 z0Var = z0.c;
        z0Var.getClass();
        z0Var.a(getClass()).c(this);
    }

    public void mergeLengthDelimitedField(int i, i iVar) {
        ensureUnknownFieldsInitialized();
        l1 l1Var = this.unknownFields;
        l1Var.a();
        if (i != 0) {
            l1Var.a(r1.a(i, 2), iVar);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final void mergeUnknownFields(l1 l1Var) {
        this.unknownFields = l1.a(this.unknownFields, l1Var);
    }

    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        l1 l1Var = this.unknownFields;
        l1Var.a();
        if (i != 0) {
            l1Var.a(r1.a(i, 0), Long.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public boolean parseUnknownField(int i, j jVar) throws IOException {
        int i2 = r1.a;
        if ((i & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.a(i, jVar);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.a
    public void setMemoizedSerializedSize(int i) {
        this.memoizedSerializedSize = i;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        q0.a(this, sb, 0);
        return sb.toString();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.o0
    public void writeTo(l lVar) throws IOException {
        z0 z0Var = z0.c;
        z0Var.getClass();
        d1 a2 = z0Var.a(getClass());
        m mVar = lVar.a;
        if (mVar == null) {
            mVar = new m(lVar);
        }
        a2.a((d1) this, (s1) mVar);
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        byte byteValue = ((Byte) t.dynamicMethod(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        z0 z0Var = z0.c;
        z0Var.getClass();
        boolean a2 = z0Var.a(t.getClass()).a(t);
        if (z) {
            t.dynamicMethod(f.SET_MEMOIZED_IS_INITIALIZED, a2 ? t : null);
        }
        return a2;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        BuilderType createBuilder = createBuilder();
        createBuilder.c();
        createBuilder.a(createBuilder.b, messagetype);
        return createBuilder;
    }

    public Object dynamicMethod(f fVar) {
        return dynamicMethod(fVar, null, null);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.p0
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(f.GET_DEFAULT_INSTANCE);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.o0
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(f.NEW_BUILDER);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.o0
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) dynamicMethod(f.NEW_BUILDER);
        buildertype.c();
        buildertype.a(buildertype.b, this);
        return buildertype;
    }

    /* loaded from: classes.dex */
    public static abstract class b<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends a.AbstractC0102a<MessageType, BuilderType> {
        public final MessageType a;
        public MessageType b;
        public boolean c = false;

        public b(MessageType messagetype) {
            this.a = messagetype;
            this.b = (MessageType) messagetype.dynamicMethod(f.NEW_MUTABLE_INSTANCE);
        }

        public final void a(MessageType messagetype, MessageType messagetype2) {
            z0 z0Var = z0.c;
            z0Var.getClass();
            z0Var.a(messagetype.getClass()).a(messagetype, messagetype2);
        }

        public MessageType b() {
            if (this.c) {
                return this.b;
            }
            this.b.makeImmutable();
            this.c = true;
            return this.b;
        }

        public final void c() {
            if (this.c) {
                MessageType messagetype = (MessageType) this.b.dynamicMethod(f.NEW_MUTABLE_INSTANCE);
                MessageType messagetype2 = this.b;
                z0 z0Var = z0.c;
                z0Var.getClass();
                z0Var.a(messagetype.getClass()).a(messagetype, messagetype2);
                this.b = messagetype;
                this.c = false;
            }
        }

        public Object clone() throws CloneNotSupportedException {
            b newBuilderForType = this.a.newBuilderForType();
            newBuilderForType.a(b());
            return newBuilderForType;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.p0
        public o0 getDefaultInstanceForType() {
            return this.a;
        }

        public final MessageType a() {
            MessageType b = b();
            if (b.isInitialized()) {
                return b;
            }
            throw new j1();
        }

        public BuilderType a(MessageType messagetype) {
            c();
            a(this.b, messagetype);
            return this;
        }

        public BuilderType a(j jVar, q qVar) throws IOException {
            c();
            try {
                z0 z0Var = z0.c;
                MessageType messagetype = this.b;
                z0Var.getClass();
                d1 a = z0Var.a(messagetype.getClass());
                MessageType messagetype2 = this.b;
                k kVar = jVar.d;
                if (kVar == null) {
                    kVar = new k(jVar);
                }
                a.a(messagetype2, kVar, qVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    public static y.i mutableCopy(y.i iVar) {
        f0 f0Var = (f0) iVar;
        int i = f0Var.c;
        return f0Var.b(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, q qVar) throws z {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) throws z {
        return (T) parseFrom(t, byteBuffer, q.a());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, i iVar) throws z {
        return (T) checkMessageInitialized(parseFrom(t, iVar, q.a()));
    }

    public static y.f mutableCopy(y.f fVar) {
        v vVar = (v) fVar;
        int i = vVar.c;
        return vVar.b(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, i iVar, q qVar) throws z {
        return (T) checkMessageInitialized(parsePartialFrom(t, iVar, qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws z {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, q.a()));
    }

    public static y.b mutableCopy(y.b bVar) {
        n nVar = (n) bVar;
        int i = nVar.c;
        return nVar.b(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, q qVar) throws z {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, qVar));
    }

    /* loaded from: classes.dex */
    public static abstract class ExtendableMessage extends GeneratedMessageLite implements p0 {
        public u<d> extensions = u.b();

        /* loaded from: classes.dex */
        public class a {
            public a(ExtendableMessage extendableMessage, boolean z) {
                Iterator<Map.Entry<d, Object>> f = extendableMessage.extensions.f();
                if (f.hasNext()) {
                    f.next();
                }
            }
        }

        private void eagerlyMergeMessageSetExtension(j jVar, e<?, ?> eVar, q qVar, int i) throws IOException {
            parseExtension(jVar, qVar, eVar, r1.a(i, 2), i);
        }

        private void mergeMessageSetExtensionFromBytes(i iVar, q qVar, e<?, ?> eVar) throws IOException {
            o0.a aVar;
            o0 o0Var = (o0) this.extensions.a((u<d>) eVar.d);
            if (o0Var != null) {
                aVar = o0Var.toBuilder();
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = eVar.c.newBuilderForType();
            }
            a.AbstractC0102a abstractC0102a = (a.AbstractC0102a) aVar;
            abstractC0102a.getClass();
            try {
                j g = iVar.g();
                ((b) abstractC0102a).a(g, qVar);
                g.a(0);
                ensureExtensionsAreMutable().c(eVar.d, eVar.b(((b) aVar).a()));
            } catch (z e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading " + abstractC0102a.getClass().getName() + " from a ByteString threw an IOException (should never happen).", e2);
            }
        }

        private <MessageType extends o0> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, j jVar, q qVar) throws IOException {
            int i = 0;
            i iVar = null;
            e<?, ?> eVar = null;
            while (true) {
                int t = jVar.t();
                if (t == 0) {
                    break;
                } else if (t == r1.c) {
                    i = jVar.u();
                    if (i != 0) {
                        eVar = qVar.a.get(new q.a(messagetype, i));
                    }
                } else if (t == r1.d) {
                    if (i != 0 && eVar != null) {
                        eagerlyMergeMessageSetExtension(jVar, eVar, qVar, i);
                        iVar = null;
                    } else {
                        iVar = jVar.e();
                    }
                } else if (!jVar.e(t)) {
                    break;
                }
            }
            jVar.a(r1.b);
            if (iVar != null && i != 0) {
                if (eVar != null) {
                    mergeMessageSetExtensionFromBytes(iVar, qVar, eVar);
                } else {
                    mergeLengthDelimitedField(i, iVar);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean parseExtension(com.fyber.inneractive.sdk.protobuf.j r6, com.fyber.inneractive.sdk.protobuf.q r7, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.e<?, ?> r8, int r9, int r10) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.ExtendableMessage.parseExtension(com.fyber.inneractive.sdk.protobuf.j, com.fyber.inneractive.sdk.protobuf.q, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$e, int, int):boolean");
        }

        private void verifyExtensionContainingType(e<ExtendableMessage, ?> eVar) {
            if (eVar.a == getDefaultInstanceForType()) {
                return;
            }
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public u<d> ensureExtensionsAreMutable() {
            u<d> uVar = this.extensions;
            if (uVar.b) {
                this.extensions = uVar.clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.e();
        }

        public int extensionsSerializedSize() {
            return this.extensions.d();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.c();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite, com.fyber.inneractive.sdk.protobuf.p0
        public /* bridge */ /* synthetic */ o0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [Type, java.util.ArrayList] */
        public final <Type> Type getExtension(o<ExtendableMessage, Type> oVar) {
            e<ExtendableMessage, ?> checkIsLite = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(checkIsLite);
            Type type = (Type) this.extensions.a((u<d>) checkIsLite.d);
            if (type == null) {
                return checkIsLite.b;
            }
            d dVar = checkIsLite.d;
            if (dVar.d) {
                if (dVar.c.e() == r1.c.ENUM) {
                    ?? r1 = (Type) new ArrayList();
                    for (Object obj : (List) type) {
                        r1.add(checkIsLite.a(obj));
                    }
                    return r1;
                }
                return type;
            }
            return (Type) checkIsLite.a(type);
        }

        public final <Type> int getExtensionCount(o<ExtendableMessage, List<Type>> oVar) {
            e<ExtendableMessage, ?> checkIsLite = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(checkIsLite);
            u<d> uVar = this.extensions;
            d dVar = checkIsLite.d;
            uVar.getClass();
            if (dVar.b()) {
                Object a2 = uVar.a((u<d>) dVar);
                if (a2 == null) {
                    return 0;
                }
                return ((List) a2).size();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        public final <Type> boolean hasExtension(o<ExtendableMessage, Type> oVar) {
            e<ExtendableMessage, ?> checkIsLite = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(checkIsLite);
            u<d> uVar = this.extensions;
            d dVar = checkIsLite.d;
            uVar.getClass();
            if (!dVar.b()) {
                if (uVar.a.get(dVar) != null) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }

        public final void mergeExtensionFields(ExtendableMessage extendableMessage) {
            u<d> uVar = this.extensions;
            if (uVar.b) {
                this.extensions = uVar.clone();
            }
            this.extensions.a(extendableMessage.extensions);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite, com.fyber.inneractive.sdk.protobuf.o0
        public /* bridge */ /* synthetic */ o0.a newBuilderForType() {
            return newBuilderForType();
        }

        public com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage.a newExtensionWriter() {
            return new a(this, false);
        }

        public com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage.a newMessageSetExtensionWriter() {
            return new a(this, true);
        }

        public <MessageType extends o0> boolean parseUnknownField(MessageType messagetype, j jVar, q qVar, int i) throws IOException {
            int i2 = r1.a;
            int i3 = i >>> 3;
            return parseExtension(jVar, qVar, qVar.a.get(new q.a(messagetype, i3)), i, i3);
        }

        public <MessageType extends o0> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, j jVar, q qVar, int i) throws IOException {
            if (i == r1.a) {
                mergeMessageSetExtensionFromCodedStream(messagetype, jVar, qVar);
                return true;
            } else if ((i & 7) == 2) {
                return parseUnknownField(messagetype, jVar, qVar, i);
            } else {
                return jVar.e(i);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite, com.fyber.inneractive.sdk.protobuf.o0
        public /* bridge */ /* synthetic */ o0.a toBuilder() {
            return toBuilder();
        }

        public final <Type> Type getExtension(o<ExtendableMessage, List<Type>> oVar, int i) {
            e<ExtendableMessage, ?> checkIsLite = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(checkIsLite);
            u<d> uVar = this.extensions;
            d dVar = checkIsLite.d;
            uVar.getClass();
            if (dVar.b()) {
                Object a2 = uVar.a((u<d>) dVar);
                if (a2 != null) {
                    return (Type) checkIsLite.a(((List) a2).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
    }

    public static y.a mutableCopy(y.a aVar) {
        g gVar = (g) aVar;
        int i = gVar.c;
        return gVar.b(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream) throws z {
        return (T) checkMessageInitialized(parsePartialFrom(t, j.a(inputStream), q.a()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, q qVar) throws z {
        T t2 = (T) t.dynamicMethod(f.NEW_MUTABLE_INSTANCE);
        try {
            z0 z0Var = z0.c;
            z0Var.getClass();
            d1 a2 = z0Var.a(t2.getClass());
            a2.a(t2, bArr, i, i + i2, new e.b(qVar));
            a2.c(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof z) {
                throw ((z) e2.getCause());
            }
            throw new z(e2.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw z.i();
        }
    }

    public static <E> y.j<E> mutableCopy(y.j<E> jVar) {
        int size = jVar.size();
        return jVar.b(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream, q qVar) throws z {
        return (T) checkMessageInitialized(parsePartialFrom(t, j.a(inputStream), qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, j jVar) throws z {
        return (T) parseFrom(t, jVar, q.a());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, j jVar, q qVar) throws z {
        return (T) checkMessageInitialized(parsePartialFrom(t, jVar, qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, j jVar) throws z {
        return (T) parsePartialFrom(t, jVar, q.a());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, i iVar, q qVar) throws z {
        j g = iVar.g();
        T t2 = (T) parsePartialFrom(t, g, qVar);
        g.a(0);
        return t2;
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, q qVar) throws z {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, qVar));
    }
}
