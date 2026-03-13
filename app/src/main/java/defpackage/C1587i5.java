package defpackage;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
/* renamed from: i5  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1587i5 extends L80 {
    public static final C1501h5 d = new C1501h5(0);
    public final /* synthetic */ int a = 3;
    public final Object b;
    public final Object c;

    public C1587i5(AbstractC1391fn abstractC1391fn, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        abstractC1391fn.getClass();
        this.c = abstractC1391fn;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (WE.a >= 9) {
            arrayList.add(AbstractC1906jZ.A(i, i2));
        }
    }

    @Override // defpackage.L80
    public final Object a(JsonReader jsonReader) {
        Date b;
        switch (this.a) {
            case 0:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(((L80) ((RX) this.b).c).a(jsonReader));
                }
                jsonReader.endArray();
                int size = arrayList.size();
                Object newInstance = Array.newInstance((Class) this.c, size);
                for (int i = 0; i < size; i++) {
                    Array.set(newInstance, i, arrayList.get(i));
                }
                return newInstance;
            case 1:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                Collection collection = (Collection) ((InterfaceC2068lP) this.c).t();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    collection.add(((L80) ((RX) this.b).c).a(jsonReader));
                }
                jsonReader.endArray();
                return collection;
            case 2:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                synchronized (((ArrayList) this.b)) {
                    try {
                        Iterator it = ((ArrayList) this.b).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                try {
                                    b = ((DateFormat) it.next()).parse(nextString);
                                } catch (ParseException unused) {
                                }
                            } else {
                                try {
                                    b = LC.b(nextString, new ParsePosition(0));
                                } catch (ParseException e) {
                                    StringBuilder m = AbstractC0324Hi.m("Failed parsing '", nextString, "' as Date; at path ");
                                    m.append(jsonReader.getPreviousPath());
                                    throw new RuntimeException(m.toString(), e);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return ((AbstractC1391fn) this.c).a(b);
            default:
                Object a = ((N80) this.b).d.a(jsonReader);
                if (a != null) {
                    Class cls = (Class) this.c;
                    if (!cls.isInstance(a)) {
                        throw new RuntimeException("Expected a " + cls.getName() + " but was " + a.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
                    }
                }
                return a;
        }
    }

    @Override // defpackage.L80
    public final void b(JsonWriter jsonWriter, Object obj) {
        String format;
        switch (this.a) {
            case 0:
                if (obj == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginArray();
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    ((RX) this.b).b(jsonWriter, Array.get(obj, i));
                }
                jsonWriter.endArray();
                return;
            case 1:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginArray();
                for (Object obj2 : collection) {
                    ((RX) this.b).b(jsonWriter, obj2);
                }
                jsonWriter.endArray();
                return;
            case 2:
                Date date = (Date) obj;
                if (date == null) {
                    jsonWriter.nullValue();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.b).get(0);
                synchronized (((ArrayList) this.b)) {
                    format = dateFormat.format(date);
                }
                jsonWriter.value(format);
                return;
            default:
                ((N80) this.b).d.b(jsonWriter, obj);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.b).get(0);
                if (dateFormat instanceof SimpleDateFormat) {
                    return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
                }
                return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
            default:
                return super.toString();
        }
    }

    public C1587i5(AbstractC1391fn abstractC1391fn, String str) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        abstractC1391fn.getClass();
        this.c = abstractC1391fn;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    public C1587i5(N80 n80, Class cls) {
        this.b = n80;
        this.c = cls;
    }

    public C1587i5(Gson gson, L80 l80, Class cls) {
        this.b = new RX(gson, l80, cls);
        this.c = cls;
    }

    public C1587i5(Gson gson, Type type, L80 l80, InterfaceC2068lP interfaceC2068lP) {
        this.b = new RX(gson, l80, type);
        this.c = interfaceC2068lP;
    }
}
