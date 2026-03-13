package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;
/* renamed from: ue0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2861ue0 {
    public static final String a = EI.e("WrkDbPathHelper");
    public static final String[] b = {"-journal", "-shm", "-wal"};

    public static void a(Context context) {
        String format;
        File file;
        String[] strArr;
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && databasePath.exists()) {
            String str = a;
            EI.c().a(str, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap = new HashMap();
            if (i >= 23) {
                File databasePath2 = context.getDatabasePath("androidx.work.workdb");
                if (i < 23) {
                    file = context.getDatabasePath("androidx.work.workdb");
                } else {
                    file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
                }
                hashMap.put(databasePath2, file);
                for (String str2 : b) {
                    hashMap.put(new File(databasePath2.getPath() + str2), new File(file.getPath() + str2));
                }
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        EI.c().f(str, String.format("Over-writing contents of %s", file3), new Throwable[0]);
                    }
                    if (file2.renameTo(file3)) {
                        format = String.format("Migrated %s to %s", file2, file3);
                    } else {
                        format = String.format("Renaming %s to %s failed", file2, file3);
                    }
                    EI.c().a(str, format, new Throwable[0]);
                }
            }
        }
    }
}
