package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
/* renamed from: p30  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2384p30 extends L80 {
    public static final C1501h5 c = new C1501h5(4);
    public final /* synthetic */ int a;
    public final L80 b;

    public /* synthetic */ C2384p30(L80 l80, int i) {
        this.a = i;
        this.b = l80;
    }

    @Override // defpackage.L80
    public final Object a(JsonReader jsonReader) {
        switch (this.a) {
            case 0:
                Date date = (Date) this.b.a(jsonReader);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            case 1:
                return new AtomicLong(((Number) this.b.a(jsonReader)).longValue());
            case 2:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) this.b.a(jsonReader)).longValue()));
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            default:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return this.b.a(jsonReader);
        }
    }

    @Override // defpackage.L80
    public final void b(JsonWriter jsonWriter, Object obj) {
        switch (this.a) {
            case 0:
                this.b.b(jsonWriter, (Timestamp) obj);
                return;
            case 1:
                this.b.b(jsonWriter, Long.valueOf(((AtomicLong) obj).get()));
                return;
            case 2:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                jsonWriter.beginArray();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.b.b(jsonWriter, Long.valueOf(atomicLongArray.get(i)));
                }
                jsonWriter.endArray();
                return;
            default:
                if (obj == null) {
                    jsonWriter.nullValue();
                    return;
                } else {
                    this.b.b(jsonWriter, obj);
                    return;
                }
        }
    }
}
