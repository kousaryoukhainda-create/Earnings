package okhttp3.internal.http;

import java.net.ProtocolException;
import okhttp3.Protocol;
/* loaded from: classes2.dex */
public final class StatusLine {
    public final Protocol a;
    public final int b;
    public final String c;

    public StatusLine(Protocol protocol, int i, String str) {
        this.a = protocol;
        this.b = i;
        this.c = str;
    }

    public static StatusLine a(String str) {
        int i;
        String str2;
        boolean startsWith = str.startsWith("HTTP/1.");
        Protocol protocol = Protocol.HTTP_1_0;
        if (startsWith) {
            i = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        protocol = Protocol.HTTP_1_1;
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                }
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (str.startsWith("ICY ")) {
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() > i2) {
                    if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    str2 = "";
                }
                return new StatusLine(protocol, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }
        throw new ProtocolException("Unexpected status line: ".concat(str));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.a == Protocol.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(this.b);
        String str2 = this.c;
        if (str2 != null) {
            sb.append(' ');
            sb.append(str2);
        }
        return sb.toString();
    }
}
