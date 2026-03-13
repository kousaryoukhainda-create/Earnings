package defpackage;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
/* renamed from: GF  reason: default package */
/* loaded from: classes.dex */
public final class GF extends JsonWriter {
    public static final FF f = new FF();
    public static final AF g = new AF("closed");
    public final ArrayList b;
    public String c;
    public AbstractC3003wF d;

    public GF() {
        super(f);
        this.b = new ArrayList();
        this.d = C3175yF.b;
    }

    public final AbstractC3003wF a() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return this.d;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final AbstractC3003wF b() {
        return (AbstractC3003wF) AbstractC0324Hi.c(1, this.b);
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginArray() {
        C2573rF c2573rF = new C2573rF();
        c(c2573rF);
        this.b.add(c2573rF);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginObject() {
        C3261zF c3261zF = new C3261zF();
        c(c3261zF);
        this.b.add(c3261zF);
        return this;
    }

    public final void c(AbstractC3003wF abstractC3003wF) {
        if (this.c != null) {
            if (!(abstractC3003wF instanceof C3175yF) || getSerializeNulls()) {
                C3261zF c3261zF = (C3261zF) b();
                String str = this.c;
                c3261zF.getClass();
                c3261zF.b.put(str, abstractC3003wF);
            }
            this.c = null;
        } else if (this.b.isEmpty()) {
            this.d = abstractC3003wF;
        } else {
            AbstractC3003wF b = b();
            if (b instanceof C2573rF) {
                ((C2573rF) b).b.add(abstractC3003wF);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            arrayList.add(g);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endArray() {
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty() && this.c == null) {
            if (b() instanceof C2573rF) {
                arrayList.remove(arrayList.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endObject() {
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty() && this.c == null) {
            if (b() instanceof C3261zF) {
                arrayList.remove(arrayList.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter name(String str) {
        if (str != null) {
            if (!this.b.isEmpty() && this.c == null) {
                if (b() instanceof C3261zF) {
                    this.c = str;
                    return this;
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter nullValue() {
        c(C3175yF.b);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Boolean bool) {
        if (bool == null) {
            c(C3175yF.b);
            return this;
        }
        c(new AF(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Number number) {
        if (number == null) {
            c(C3175yF.b);
            return this;
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        c(new AF(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(String str) {
        if (str == null) {
            c(C3175yF.b);
            return this;
        }
        c(new AF(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(boolean z) {
        c(new AF(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(float f2) {
        if (!isLenient() && (Float.isNaN(f2) || Float.isInfinite(f2))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f2);
        }
        c(new AF(Float.valueOf(f2)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(double d) {
        if (!isLenient() && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
        c(new AF(Double.valueOf(d)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(long j) {
        c(new AF(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public final void flush() {
    }
}
