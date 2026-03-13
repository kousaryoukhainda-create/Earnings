package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/* renamed from: HF  reason: default package */
/* loaded from: classes.dex */
public final class HF implements InterfaceC2240nP, Pa0 {
    public final boolean a = true;
    public final JsonWriter b;
    public final HashMap c;
    public final HashMap d;
    public final C2659sF e;
    public final boolean f;

    public HF(Writer writer, HashMap hashMap, HashMap hashMap2, C2659sF c2659sF, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = hashMap;
        this.d = hashMap2;
        this.e = c2659sF;
        this.f = z;
    }

    @Override // defpackage.InterfaceC2240nP
    public final InterfaceC2240nP a(C0980bu c0980bu, Object obj) {
        i(obj, c0980bu.a);
        return this;
    }

    @Override // defpackage.Pa0
    public final Pa0 b(String str) {
        j();
        this.b.value(str);
        return this;
    }

    @Override // defpackage.Pa0
    public final Pa0 c(boolean z) {
        j();
        this.b.value(z);
        return this;
    }

    @Override // defpackage.InterfaceC2240nP
    public final InterfaceC2240nP d(C0980bu c0980bu, boolean z) {
        String str = c0980bu.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z);
        return this;
    }

    @Override // defpackage.InterfaceC2240nP
    public final InterfaceC2240nP e(C0980bu c0980bu, int i) {
        String str = c0980bu.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i);
        return this;
    }

    @Override // defpackage.InterfaceC2240nP
    public final InterfaceC2240nP f(C0980bu c0980bu, double d) {
        String str = c0980bu.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d);
        return this;
    }

    @Override // defpackage.InterfaceC2240nP
    public final InterfaceC2240nP g(C0980bu c0980bu, long j) {
        String str = c0980bu.a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j);
        return this;
    }

    public final HF h(Object obj) {
        int i = 0;
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                j();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    jsonWriter.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    long j = jArr[i];
                    j();
                    jsonWriter.value(j);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    jsonWriter.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    jsonWriter.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i < length5) {
                    h(numberArr[i]);
                    i++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i < length6) {
                    h(objArr[i]);
                    i++;
                }
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Collection) {
            jsonWriter.beginArray();
            for (Object obj2 : (Collection) obj) {
                h(obj2);
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    i(entry.getValue(), (String) key);
                } catch (ClassCastException e) {
                    throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            jsonWriter.endObject();
            return this;
        } else {
            InterfaceC2154mP interfaceC2154mP = (InterfaceC2154mP) this.c.get(obj.getClass());
            if (interfaceC2154mP != null) {
                jsonWriter.beginObject();
                interfaceC2154mP.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            Oa0 oa0 = (Oa0) this.d.get(obj.getClass());
            if (oa0 != null) {
                oa0.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                if (obj instanceof InterfaceC1982kP) {
                    int e2 = ((InterfaceC1982kP) obj).e();
                    j();
                    jsonWriter.value(e2);
                } else {
                    String name = ((Enum) obj).name();
                    j();
                    jsonWriter.value(name);
                }
                return this;
            } else {
                jsonWriter.beginObject();
                this.e.a(obj, this);
                throw null;
            }
        }
    }

    public final HF i(Object obj, String str) {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj != null) {
                j();
                jsonWriter.name(str);
                h(obj);
            }
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            h(obj);
        }
        return this;
    }

    public final void j() {
        if (this.a) {
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
