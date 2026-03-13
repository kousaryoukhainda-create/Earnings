package okhttp3;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class MediaType {
    public static final Pattern b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;

    public MediaType(String str) {
        this.a = str;
    }

    public static MediaType a(String str) {
        Matcher matcher = b.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            group.toLowerCase(locale);
            matcher.group(2).toLowerCase(locale);
            Matcher matcher2 = c.matcher(str);
            String str2 = null;
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null && group2.equalsIgnoreCase("charset")) {
                        String group3 = matcher2.group(2);
                        if (group3 != null) {
                            if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                                group3 = group3.substring(1, group3.length() - 1);
                            }
                        } else {
                            group3 = matcher2.group(3);
                        }
                        if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                            StringBuilder q = BK.q("Multiple charsets defined: \"", str2, "\" and: \"", group3, "\" for: \"");
                            q.append(str);
                            q.append('\"');
                            throw new IllegalArgumentException(q.toString());
                        }
                        str2 = group3;
                    }
                } else {
                    throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
                }
            }
            return new MediaType(str);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof MediaType) && ((MediaType) obj).a.equals(this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
