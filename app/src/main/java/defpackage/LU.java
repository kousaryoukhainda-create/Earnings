package defpackage;

import java.io.File;
import java.io.FilenameFilter;
/* renamed from: LU  reason: default package */
/* loaded from: classes.dex */
public final class LU implements FilenameFilter {
    public final /* synthetic */ String a;

    public LU(String str) {
        this.a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.a);
    }
}
