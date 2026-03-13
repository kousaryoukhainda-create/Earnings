package defpackage;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
/* renamed from: wF  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3003wF {
    public boolean e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final C3261zF f() {
        if (this instanceof C3261zF) {
            return (C3261zF) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public String g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            N80 n80 = S80.a;
            C0922bB.e(this, jsonWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
