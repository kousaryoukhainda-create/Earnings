package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: Q80  reason: default package */
/* loaded from: classes.dex */
public final class Q80 extends L80 {
    public final /* synthetic */ int a;

    public /* synthetic */ Q80(int i) {
        this.a = i;
    }

    @Override // defpackage.L80
    public final Object a(JsonReader jsonReader) {
        switch (this.a) {
            case 0:
                return new AtomicBoolean(jsonReader.nextBoolean());
            default:
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
        }
    }

    @Override // defpackage.L80
    public final void b(JsonWriter jsonWriter, Object obj) {
        switch (this.a) {
            case 0:
                jsonWriter.value(((AtomicBoolean) obj).get());
                return;
            default:
                jsonWriter.value(((AtomicInteger) obj).get());
                return;
        }
    }
}
