package io.flutter.plugins.sharedpreferences;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes2.dex */
public final class ListEncoder implements SharedPreferencesListEncoder {
    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
    @NotNull
    public List<String> decode(@NotNull String listString) {
        Intrinsics.checkNotNullParameter(listString, "listString");
        Object readObject = new StringListObjectInputStream(new ByteArrayInputStream(Base64.decode(listString, 0))).readObject();
        Intrinsics.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) readObject) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
    @NotNull
    public String encode(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }
}
