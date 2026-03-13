package defpackage;

import com.google.android.gms.tagmanager.DataLayer;
import java.io.File;
import java.io.FilenameFilter;
/* renamed from: dj  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1212dj implements FilenameFilter {
    public final /* synthetic */ int a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                return str.startsWith(DataLayer.EVENT_KEY);
            default:
                if (str.startsWith(DataLayer.EVENT_KEY) && !str.endsWith("_")) {
                    return true;
                }
                return false;
        }
    }
}
