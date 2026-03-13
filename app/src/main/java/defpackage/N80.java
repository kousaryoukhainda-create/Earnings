package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
/* renamed from: N80  reason: default package */
/* loaded from: classes.dex */
public final class N80 implements M80 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ L80 d;

    public /* synthetic */ N80(Object obj, L80 l80, int i) {
        this.b = i;
        this.c = obj;
        this.d = l80;
    }

    @Override // defpackage.M80
    public final L80 create(Gson gson, TypeToken typeToken) {
        switch (this.b) {
            case 0:
                if (typeToken.getRawType() == ((Class) this.c)) {
                    return this.d;
                }
                return null;
            case 1:
                Class<?> rawType = typeToken.getRawType();
                if (!((Class) this.c).isAssignableFrom(rawType)) {
                    return null;
                }
                return new C1587i5(this, rawType);
            default:
                if (typeToken.equals((TypeToken) this.c)) {
                    return this.d;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.b) {
            case 0:
                return "Factory[type=" + ((Class) this.c).getName() + ",adapter=" + this.d + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.c).getName() + ",adapter=" + this.d + "]";
            default:
                return super.toString();
        }
    }
}
