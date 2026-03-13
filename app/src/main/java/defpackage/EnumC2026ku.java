package defpackage;

import com.google.gson.FieldNamingStrategy;
import java.lang.reflect.Field;
import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ku  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class EnumC2026ku implements FieldNamingStrategy {
    public static final C1226du b;
    public static final /* synthetic */ EnumC2026ku[] c;

    static {
        C1226du c1226du = new C1226du();
        b = c1226du;
        c = new EnumC2026ku[]{c1226du, new EnumC2026ku() { // from class: eu
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return EnumC2026ku.b(field.getName());
            }
        }, new EnumC2026ku() { // from class: fu
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return EnumC2026ku.b(EnumC2026ku.a(field.getName(), ' '));
            }
        }, new EnumC2026ku() { // from class: gu
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return EnumC2026ku.a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new EnumC2026ku() { // from class: hu
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return EnumC2026ku.a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC2026ku() { // from class: iu
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return EnumC2026ku.a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC2026ku() { // from class: ju
            @Override // com.google.gson.FieldNamingStrategy
            public final String translateName(Field field) {
                return EnumC2026ku.a(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String a(String str, char c2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String b(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static EnumC2026ku valueOf(String str) {
        return (EnumC2026ku) Enum.valueOf(EnumC2026ku.class, str);
    }

    public static EnumC2026ku[] values() {
        return (EnumC2026ku[]) c.clone();
    }
}
