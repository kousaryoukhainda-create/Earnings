package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
/* renamed from: h5  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1501h5 implements M80 {
    public final /* synthetic */ int b;

    public /* synthetic */ C1501h5(int i) {
        this.b = i;
    }

    @Override // defpackage.M80
    public final L80 create(Gson gson, TypeToken typeToken) {
        Type componentType;
        switch (this.b) {
            case 0:
                Type type = typeToken.getType();
                boolean z = type instanceof GenericArrayType;
                if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                if (z) {
                    componentType = ((GenericArrayType) type).getGenericComponentType();
                } else {
                    componentType = ((Class) type).getComponentType();
                }
                return new C1587i5(gson, gson.getAdapter(TypeToken.get(componentType)), AbstractC0957bf.F(componentType));
            case 1:
                if (typeToken.getRawType() == Date.class) {
                    return new C2189mm();
                }
                return null;
            case 2:
                if (typeToken.getRawType() == java.sql.Date.class) {
                    return new C2298o30(0);
                }
                return null;
            case 3:
                if (typeToken.getRawType() == Time.class) {
                    return new C2298o30(1);
                }
                return null;
            case 4:
                if (typeToken.getRawType() == Timestamp.class) {
                    return new C2384p30(gson.getAdapter(Date.class), 0);
                }
                return null;
            default:
                Class rawType = typeToken.getRawType();
                if (Enum.class.isAssignableFrom(rawType) && rawType != Enum.class) {
                    if (!rawType.isEnum()) {
                        rawType = rawType.getSuperclass();
                    }
                    return new RX(rawType);
                }
                return null;
        }
    }
}
