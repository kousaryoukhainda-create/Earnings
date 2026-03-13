package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/* renamed from: VT  reason: default package */
/* loaded from: classes.dex */
public final class VT implements InterfaceC2240nP {
    public static final Charset f = Charset.forName("UTF-8");
    public static final C0980bu g = new C0980bu(Constants.KEY, AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(1))));
    public static final C0980bu h = new C0980bu("value", AbstractC0324Hi.p(AbstractC0324Hi.n(QT.class, new E5(2))));
    public static final C2659sF i = new C2659sF(1);
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final C2659sF d;
    public final WT e = new WT(this);

    public VT(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, C2659sF c2659sF) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = c2659sF;
    }

    public static int j(C0980bu c0980bu) {
        QT qt = (QT) ((Annotation) c0980bu.b.get(QT.class));
        if (qt != null) {
            return ((E5) qt).a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // defpackage.InterfaceC2240nP
    public final InterfaceC2240nP a(C0980bu c0980bu, Object obj) {
        h(c0980bu, obj, true);
        return this;
    }

    public final void b(C0980bu c0980bu, double d, boolean z) {
        if (z && d == 0.0d) {
            return;
        }
        k((j(c0980bu) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(C0980bu c0980bu, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        QT qt = (QT) ((Annotation) c0980bu.b.get(QT.class));
        if (qt != null) {
            k(((E5) qt).a << 3);
            k(i2);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // defpackage.InterfaceC2240nP
    public final InterfaceC2240nP d(C0980bu c0980bu, boolean z) {
        c(c0980bu, z ? 1 : 0, true);
        return this;
    }

    @Override // defpackage.InterfaceC2240nP
    public final InterfaceC2240nP e(C0980bu c0980bu, int i2) {
        c(c0980bu, i2, true);
        return this;
    }

    @Override // defpackage.InterfaceC2240nP
    public final InterfaceC2240nP f(C0980bu c0980bu, double d) {
        b(c0980bu, d, true);
        return this;
    }

    @Override // defpackage.InterfaceC2240nP
    public final InterfaceC2240nP g(C0980bu c0980bu, long j) {
        if (j != 0) {
            QT qt = (QT) ((Annotation) c0980bu.b.get(QT.class));
            if (qt != null) {
                k(((E5) qt).a << 3);
                l(j);
            } else {
                throw new RuntimeException("Field has no @Protobuf config");
            }
        }
        return this;
    }

    public final void h(C0980bu c0980bu, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            k((j(c0980bu) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            k(bytes.length);
            this.a.write(bytes);
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                h(c0980bu, obj2, false);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                i(i, c0980bu, entry, false);
            }
        } else if (obj instanceof Double) {
            b(c0980bu, ((Double) obj).doubleValue(), z);
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z || floatValue != 0.0f) {
                k((j(c0980bu) << 3) | 5);
                this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            }
        } else if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (!z || longValue != 0) {
                QT qt = (QT) ((Annotation) c0980bu.b.get(QT.class));
                if (qt != null) {
                    k(((E5) qt).a << 3);
                    l(longValue);
                    return;
                }
                throw new RuntimeException("Field has no @Protobuf config");
            }
        } else if (obj instanceof Boolean) {
            c(c0980bu, ((Boolean) obj).booleanValue() ? 1 : 0, z);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            k((j(c0980bu) << 3) | 2);
            k(bArr.length);
            this.a.write(bArr);
        } else {
            InterfaceC2154mP interfaceC2154mP = (InterfaceC2154mP) this.b.get(obj.getClass());
            if (interfaceC2154mP != null) {
                i(interfaceC2154mP, c0980bu, obj, z);
                return;
            }
            Oa0 oa0 = (Oa0) this.c.get(obj.getClass());
            if (oa0 != null) {
                WT wt = this.e;
                wt.a = false;
                wt.c = c0980bu;
                wt.b = z;
                oa0.a(obj, wt);
            } else if (obj instanceof OT) {
                c(c0980bu, ((OT) obj).e(), true);
            } else if (obj instanceof Enum) {
                c(c0980bu, ((Enum) obj).ordinal(), true);
            } else {
                i(this.d, c0980bu, obj, z);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, tG] */
    public final void i(InterfaceC2154mP interfaceC2154mP, C0980bu c0980bu, Object obj, boolean z) {
        ?? outputStream = new OutputStream();
        outputStream.b = 0L;
        try {
            OutputStream outputStream2 = this.a;
            this.a = outputStream;
            interfaceC2154mP.a(obj, this);
            this.a = outputStream2;
            long j = outputStream.b;
            outputStream.close();
            if (z && j == 0) {
                return;
            }
            k((j(c0980bu) << 3) | 2);
            l(j);
            interfaceC2154mP.a(obj, this);
        } catch (Throwable th) {
            try {
                outputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void k(int i2) {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void l(long j) {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }
}
