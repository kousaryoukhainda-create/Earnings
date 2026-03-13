package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: ib0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1626ib0 {
    public final C1243e5 a;
    public final C1243e5 b;
    public final C1243e5 c;

    public AbstractC1626ib0(C1243e5 c1243e5, C1243e5 c1243e52, C1243e5 c1243e53) {
        this.a = c1243e5;
        this.b = c1243e52;
        this.c = c1243e53;
    }

    public abstract C1910jb0 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C1243e5 c1243e5 = this.c;
        Class cls2 = (Class) c1243e5.getOrDefault(name, null);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(BK.m(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
            c1243e5.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        C1243e5 c1243e5 = this.a;
        Method method = (Method) c1243e5.getOrDefault(str, null);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, AbstractC1626ib0.class.getClassLoader()).getDeclaredMethod("read", AbstractC1626ib0.class);
            c1243e5.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C1243e5 c1243e5 = this.b;
        Method method = (Method) c1243e5.getOrDefault(name, null);
        if (method == null) {
            Class b = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b.getDeclaredMethod("write", cls, AbstractC1626ib0.class);
            c1243e5.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        if (!e(i2)) {
            return i;
        }
        return ((C1910jb0) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((C1910jb0) this).e.readParcelable(C1910jb0.class.getClassLoader());
    }

    public final InterfaceC1996kb0 h() {
        String readString = ((C1910jb0) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (InterfaceC1996kb0) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((C1910jb0) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((C1910jb0) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(InterfaceC1996kb0 interfaceC1996kb0) {
        if (interfaceC1996kb0 == null) {
            ((C1910jb0) this).e.writeString(null);
            return;
        }
        try {
            ((C1910jb0) this).e.writeString(b(interfaceC1996kb0.getClass()).getName());
            C1910jb0 a = a();
            try {
                d(interfaceC1996kb0.getClass()).invoke(null, interfaceC1996kb0, a);
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    Parcel parcel = a.e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC1996kb0.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
