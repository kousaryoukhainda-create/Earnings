package io.flutter.plugins.sharedpreferences;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes2.dex */
public final class StringListObjectInputStream extends ObjectInputStream {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringListObjectInputStream(@NotNull InputStream input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
        String str;
        Set c = S00.c("java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;");
        if (objectStreamClass != null) {
            str = objectStreamClass.getName();
        } else {
            str = null;
        }
        if (str != null && !c.contains(str)) {
            throw new ClassNotFoundException(objectStreamClass.getName());
        }
        return super.resolveClass(objectStreamClass);
    }
}
