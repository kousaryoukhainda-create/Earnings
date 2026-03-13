package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
/* renamed from: cB  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1007cB extends L80 {
    public L80 a;

    @Override // defpackage.L80
    public final Object a(JsonReader jsonReader) {
        L80 l80 = this.a;
        if (l80 != null) {
            return l80.a(jsonReader);
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.L80
    public final void b(JsonWriter jsonWriter, Object obj) {
        L80 l80 = this.a;
        if (l80 != null) {
            l80.b(jsonWriter, obj);
            return;
        }
        throw new IllegalStateException();
    }
}
