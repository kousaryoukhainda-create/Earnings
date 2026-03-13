package defpackage;

import java.lang.reflect.Field;
/* renamed from: du  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public enum C1226du extends EnumC2026ku {
    public C1226du() {
        super("IDENTITY", 0);
    }

    @Override // com.google.gson.FieldNamingStrategy
    public final String translateName(Field field) {
        return field.getName();
    }
}
