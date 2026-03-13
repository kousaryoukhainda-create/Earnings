package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileOutputStream;
/* loaded from: classes.dex */
public class v<ResultData> {
    public final Context a;
    public com.fyber.inneractive.sdk.cache.a<ResultData> b;
    public SharedPreferences c;

    /* loaded from: classes.dex */
    public static class a extends Exception {
    }

    public v(Context context, com.fyber.inneractive.sdk.cache.a<ResultData> aVar) {
        this.a = context;
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    public boolean a(String str, String str2) {
        boolean z;
        int i = 1;
        IAlog.a("caching file %s", str);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                fileOutputStream = this.a.openFileOutput(str, 0);
                fileOutputStream.write(str2.getBytes());
            } catch (Throwable th) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e) {
                        Object[] objArr = new Object[i];
                        objArr[0] = e.getMessage();
                        IAlog.e("Failed closing cache file: %s", objArr);
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
        try {
            IAlog.a("File cached successfully", new Object[0]);
            try {
                fileOutputStream.close();
                return true;
            } catch (Exception e3) {
                IAlog.e("Failed closing cache file: %s", e3.getMessage());
                return true;
            }
        } catch (Exception e4) {
            e = e4;
            z = true;
            IAlog.e("Failed caching file: %s", e.getMessage());
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e5) {
                    IAlog.e("Failed closing cache file: %s", e5.getMessage());
                }
            }
            i = z;
            return i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r9) throws java.io.FileNotFoundException {
        /*
            r8 = this;
            java.lang.String r0 = "Failed closing local file: %s"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r9
            java.lang.String r4 = "reading local file: %s"
            com.fyber.inneractive.sdk.util.IAlog.a(r4, r2)
            r2 = 0
            android.content.Context r4 = r8.a     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            java.io.FileInputStream r4 = r4.openFileInput(r9)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            int r5 = r4.available()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            r4.read(r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            java.lang.String r7 = "UTF-8"
            r6.<init>(r5, r7)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            r4.close()     // Catch: java.lang.Exception -> L28
            goto L34
        L28:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r3] = r2
            com.fyber.inneractive.sdk.util.IAlog.e(r0, r4)
        L34:
            r2 = r6
            goto L62
        L36:
            r9 = move-exception
            r2 = r4
            goto L72
        L39:
            r5 = move-exception
            goto L3f
        L3b:
            r9 = move-exception
            goto L72
        L3d:
            r5 = move-exception
            r4 = r2
        L3f:
            boolean r6 = r5 instanceof java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L36
            if (r6 != 0) goto L6c
            java.lang.String r6 = "Failed reading local file: %s"
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L36
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L36
            r7[r3] = r5     // Catch: java.lang.Throwable -> L36
            com.fyber.inneractive.sdk.util.IAlog.a(r6, r7)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L62
            r4.close()     // Catch: java.lang.Exception -> L56
            goto L62
        L56:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r3] = r4
            com.fyber.inneractive.sdk.util.IAlog.e(r0, r5)
        L62:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r3] = r9
            java.lang.String r9 = "local file %s read successfully"
            com.fyber.inneractive.sdk.util.IAlog.a(r9, r0)
            return r2
        L6c:
            java.io.FileNotFoundException r9 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L36
            r9.<init>()     // Catch: java.lang.Throwable -> L36
            throw r9     // Catch: java.lang.Throwable -> L36
        L72:
            if (r2 == 0) goto L84
            r2.close()     // Catch: java.lang.Exception -> L78
            goto L84
        L78:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r2
            com.fyber.inneractive.sdk.util.IAlog.e(r0, r1)
        L84:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.v.a(java.lang.String):java.lang.String");
    }
}
