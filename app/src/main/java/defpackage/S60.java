package defpackage;

import com.google.gson.stream.JsonReader;
/* renamed from: S60  reason: default package */
/* loaded from: classes.dex */
public enum S60 extends V60 {
    public S60() {
        super("LAZILY_PARSED_NUMBER", 1);
    }

    @Override // defpackage.W60
    public final Number a(JsonReader jsonReader) {
        return new C1887jG(jsonReader.nextString());
    }
}
