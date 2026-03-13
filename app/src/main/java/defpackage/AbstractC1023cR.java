package defpackage;

import java.util.Locale;
/* renamed from: cR  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1023cR {
    public static void b(String str, String str2) {
        if (str != null && str.length() != 0) {
            if (str2 != null && str2.length() != 0) {
                if (str.length() <= 40) {
                    if (str2.length() <= 100) {
                        if (str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
                            return;
                        }
                        throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
                    }
                    Locale locale = Locale.US;
                    throw new IllegalArgumentException("Attribute value length must not exceed 100 characters");
                }
                Locale locale2 = Locale.US;
                throw new IllegalArgumentException("Attribute key length must not exceed 40 characters");
            }
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        throw new IllegalArgumentException("Attribute key must not be null or empty");
    }

    public static String c(String str) {
        String str2;
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            Locale locale = Locale.US;
            return "Metric name must not exceed 100 characters";
        } else if (!str.startsWith("_")) {
            return null;
        } else {
            for (int i : AbstractC0324Hi.B(6)) {
                switch (i) {
                    case 1:
                        str2 = "_fstec";
                        break;
                    case 2:
                        str2 = "_fsntc";
                        break;
                    case 3:
                        str2 = "_tsns";
                        break;
                    case 4:
                        str2 = "_fr_tot";
                        break;
                    case 5:
                        str2 = "_fr_slo";
                        break;
                    case 6:
                        str2 = "_fr_fzn";
                        break;
                    default:
                        throw null;
                }
                if (str2.equals(str)) {
                    return null;
                }
            }
            return "Metric name must not start with '_'";
        }
    }

    public abstract boolean a();
}
