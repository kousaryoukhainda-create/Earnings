package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
/* renamed from: zu  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3315zu {
    public final String a;
    public final HashMap b = new HashMap();

    public C3315zu(String str) {
        this.a = str;
    }

    public static boolean a(String str, String str2) {
        String a = AbstractC0154Au.a(str);
        String a2 = AbstractC0154Au.a(str2);
        if (!a.equals(a2)) {
            if (!a.startsWith(a2 + '/')) {
                return false;
            }
        }
        return true;
    }

    public final File b(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.b.get(decode);
        if (file != null) {
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (a(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }
        throw new IllegalArgumentException("Unable to find configured root for " + uri);
    }
}
