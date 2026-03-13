package defpackage;

import java.io.File;
import java.io.FilenameFilter;
/* renamed from: RE  reason: default package */
/* loaded from: classes2.dex */
public final class RE implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith(".jar") && !lowerCase.endsWith(".zip")) {
            return false;
        }
        return true;
    }
}
