package defpackage;

import java.io.IOException;
/* renamed from: FE  reason: default package */
/* loaded from: classes.dex */
public class FE extends IOException {
    public boolean b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, FE] */
    public static FE a() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [DE, java.io.IOException] */
    public static DE b() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, FE] */
    public static FE c() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, FE] */
    public static FE d() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, FE] */
    public static FE e() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
