package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
/* renamed from: EF  reason: default package */
/* loaded from: classes.dex */
public final class EF extends JsonReader {
    public static final DF g = new DF();
    public static final Object h = new Object();
    public Object[] b;
    public int c;
    public String[] d;
    public int[] f;

    public EF(AbstractC3003wF abstractC3003wF) {
        super(g);
        this.b = new Object[32];
        this.c = 0;
        this.d = new String[32];
        this.f = new int[32];
        f(abstractC3003wF);
    }

    public final void a(JsonToken jsonToken) {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + b());
    }

    public final String b() {
        return " at path " + getPath(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginArray() {
        a(JsonToken.BEGIN_ARRAY);
        f(((C2573rF) c()).b.iterator());
        this.f[this.c - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginObject() {
        a(JsonToken.BEGIN_OBJECT);
        f(((YG) ((C3261zF) c()).b.entrySet()).iterator());
    }

    public final Object c() {
        return this.b[this.c - 1];
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b = new Object[]{h};
        this.c = 1;
    }

    public final Object e() {
        Object[] objArr = this.b;
        int i = this.c - 1;
        this.c = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endArray() {
        a(JsonToken.END_ARRAY);
        e();
        e();
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endObject() {
        a(JsonToken.END_OBJECT);
        e();
        e();
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final void f(Object obj) {
        int i = this.c;
        Object[] objArr = this.b;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.b = Arrays.copyOf(objArr, i2);
            this.f = Arrays.copyOf(this.f, i2);
            this.d = (String[]) Arrays.copyOf(this.d, i2);
        }
        Object[] objArr2 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        objArr2[i3] = obj;
    }

    public final String getPath(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.c;
            if (i < i2) {
                Object[] objArr = this.b;
                Object obj = objArr[i];
                if (obj instanceof C2573rF) {
                    i++;
                    if (i < i2 && (objArr[i] instanceof Iterator)) {
                        int i3 = this.f[i];
                        if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                            i3--;
                        }
                        sb.append('[');
                        sb.append(i3);
                        sb.append(']');
                    }
                } else if ((obj instanceof C3261zF) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                    sb.append('.');
                    String str = this.d[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPreviousPath() {
        return getPath(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean hasNext() {
        JsonToken peek = peek();
        if (peek != JsonToken.END_OBJECT && peek != JsonToken.END_ARRAY && peek != JsonToken.END_DOCUMENT) {
            return true;
        }
        return false;
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean nextBoolean() {
        a(JsonToken.BOOLEAN);
        boolean e = ((AF) e()).e();
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return e;
    }

    @Override // com.google.gson.stream.JsonReader
    public final double nextDouble() {
        double parseDouble;
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + b());
        }
        AF af = (AF) c();
        if (af.b instanceof Number) {
            parseDouble = af.h().doubleValue();
        } else {
            parseDouble = Double.parseDouble(af.g());
        }
        if (!isLenient() && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + parseDouble);
        }
        e();
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return parseDouble;
    }

    @Override // com.google.gson.stream.JsonReader
    public final int nextInt() {
        int parseInt;
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + b());
        }
        AF af = (AF) c();
        if (af.b instanceof Number) {
            parseInt = af.h().intValue();
        } else {
            parseInt = Integer.parseInt(af.g());
        }
        e();
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return parseInt;
    }

    @Override // com.google.gson.stream.JsonReader
    public final long nextLong() {
        long parseLong;
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + b());
        }
        AF af = (AF) c();
        if (af.b instanceof Number) {
            parseLong = af.h().longValue();
        } else {
            parseLong = Long.parseLong(af.g());
        }
        e();
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return parseLong;
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextName() {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) c()).next();
        String str = (String) entry.getKey();
        this.d[this.c - 1] = str;
        f(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void nextNull() {
        a(JsonToken.NULL);
        e();
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextString() {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek != jsonToken && peek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + b());
        }
        String g2 = ((AF) e()).g();
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return g2;
    }

    @Override // com.google.gson.stream.JsonReader
    public final JsonToken peek() {
        if (this.c == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object c = c();
        if (c instanceof Iterator) {
            boolean z = this.b[this.c - 2] instanceof C3261zF;
            Iterator it = (Iterator) c;
            if (it.hasNext()) {
                if (z) {
                    return JsonToken.NAME;
                }
                f(it.next());
                return peek();
            } else if (z) {
                return JsonToken.END_OBJECT;
            } else {
                return JsonToken.END_ARRAY;
            }
        } else if (c instanceof C3261zF) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (c instanceof C2573rF) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (c instanceof AF) {
                Serializable serializable = ((AF) c).b;
                if (serializable instanceof String) {
                    return JsonToken.STRING;
                }
                if (serializable instanceof Boolean) {
                    return JsonToken.BOOLEAN;
                }
                if (serializable instanceof Number) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (c instanceof C3175yF) {
                return JsonToken.NULL;
            } else {
                if (c == h) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final void skipValue() {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.d[this.c - 2] = "null";
        } else {
            e();
            int i = this.c;
            if (i > 0) {
                this.d[i - 1] = "null";
            }
        }
        int i2 = this.c;
        if (i2 > 0) {
            int[] iArr = this.f;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String toString() {
        return EF.class.getSimpleName() + b();
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPath() {
        return getPath(false);
    }
}
