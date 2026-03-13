package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* renamed from: o30  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2298o30 extends L80 {
    public static final C1501h5 c = new C1501h5(2);
    public static final C1501h5 d = new C1501h5(3);
    public final /* synthetic */ int a;
    public final SimpleDateFormat b;

    public C2298o30(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new SimpleDateFormat("hh:mm:ss a");
                return;
            default:
                this.b = new SimpleDateFormat("MMM d, yyyy");
                return;
        }
    }

    private final Object c(JsonReader jsonReader) {
        Date parse;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        try {
            synchronized (this) {
                parse = this.b.parse(nextString);
            }
            return new java.sql.Date(parse.getTime());
        } catch (ParseException e) {
            StringBuilder m = AbstractC0324Hi.m("Failed parsing '", nextString, "' as SQL Date; at path ");
            m.append(jsonReader.getPreviousPath());
            throw new RuntimeException(m.toString(), e);
        }
    }

    private final void d(JsonWriter jsonWriter, Object obj) {
        String format;
        java.sql.Date date = (java.sql.Date) obj;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            format = this.b.format((Date) date);
        }
        jsonWriter.value(format);
    }

    @Override // defpackage.L80
    public final Object a(JsonReader jsonReader) {
        Time time;
        switch (this.a) {
            case 0:
                return c(jsonReader);
            default:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                try {
                    synchronized (this) {
                        time = new Time(this.b.parse(nextString).getTime());
                    }
                    return time;
                } catch (ParseException e) {
                    StringBuilder m = AbstractC0324Hi.m("Failed parsing '", nextString, "' as SQL Time; at path ");
                    m.append(jsonReader.getPreviousPath());
                    throw new RuntimeException(m.toString(), e);
                }
        }
    }

    @Override // defpackage.L80
    public final void b(JsonWriter jsonWriter, Object obj) {
        String format;
        switch (this.a) {
            case 0:
                d(jsonWriter, obj);
                return;
            default:
                Time time = (Time) obj;
                if (time == null) {
                    jsonWriter.nullValue();
                    return;
                }
                synchronized (this) {
                    format = this.b.format((Date) time);
                }
                jsonWriter.value(format);
                return;
        }
    }
}
