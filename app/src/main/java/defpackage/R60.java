package defpackage;

import com.google.gson.stream.JsonReader;
/* renamed from: R60  reason: default package */
/* loaded from: classes.dex */
public enum R60 extends V60 {
    public R60() {
        super("DOUBLE", 0);
    }

    @Override // defpackage.W60
    public final Number a(JsonReader jsonReader) {
        return Double.valueOf(jsonReader.nextDouble());
    }
}
