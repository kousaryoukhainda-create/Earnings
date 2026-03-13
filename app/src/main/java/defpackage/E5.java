package defpackage;
/* renamed from: E5  reason: default package */
/* loaded from: classes.dex */
public final class E5 implements QT {
    public final int a;

    public E5(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return QT.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QT)) {
            return false;
        }
        E5 e5 = (E5) ((QT) obj);
        if (this.a == e5.a) {
            Object obj2 = PT.b;
            e5.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.a) + (PT.b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + PT.b + ')';
    }
}
