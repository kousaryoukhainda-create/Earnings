package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.math.BigDecimal;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: V60  reason: default package */
/* loaded from: classes.dex */
public abstract class V60 implements W60 {
    public static final R60 b;
    public static final S60 c;
    public static final /* synthetic */ V60[] d;

    static {
        R60 r60 = new R60();
        b = r60;
        S60 s60 = new S60();
        c = s60;
        d = new V60[]{r60, s60, new V60() { // from class: T60
            @Override // defpackage.W60
            public final Number a(JsonReader jsonReader) {
                String nextString = jsonReader.nextString();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(nextString));
                    } catch (NumberFormatException unused) {
                        Double valueOf = Double.valueOf(nextString);
                        if (!valueOf.isInfinite()) {
                            if (valueOf.isNaN()) {
                            }
                            return valueOf;
                        }
                        if (!jsonReader.isLenient()) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + jsonReader.getPreviousPath());
                        }
                        return valueOf;
                    }
                } catch (NumberFormatException e) {
                    StringBuilder m = AbstractC0324Hi.m("Cannot parse ", nextString, "; at path ");
                    m.append(jsonReader.getPreviousPath());
                    throw new RuntimeException(m.toString(), e);
                }
            }
        }, new V60() { // from class: U60
            @Override // defpackage.W60
            public final Number a(JsonReader jsonReader) {
                String nextString = jsonReader.nextString();
                try {
                    return new BigDecimal(nextString);
                } catch (NumberFormatException e) {
                    StringBuilder m = AbstractC0324Hi.m("Cannot parse ", nextString, "; at path ");
                    m.append(jsonReader.getPreviousPath());
                    throw new RuntimeException(m.toString(), e);
                }
            }
        }};
    }

    public static V60 valueOf(String str) {
        return (V60) Enum.valueOf(V60.class, str);
    }

    public static V60[] values() {
        return (V60[]) d.clone();
    }
}
