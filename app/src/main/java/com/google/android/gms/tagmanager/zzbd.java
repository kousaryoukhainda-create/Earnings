package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzgb;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbd implements zzaw {
    private static final String zza = "CREATE TABLE IF NOT EXISTS datalayer ( 'ID' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 'key' STRING NOT NULL, 'value' BLOB NOT NULL, 'expires' INTEGER NOT NULL);";
    private final Executor zzb;
    private final Context zzc;
    private final zzbb zzd;
    private final Clock zze;

    public zzbd(Context context) {
        Clock defaultClock = DefaultClock.getInstance();
        ExecutorService zza2 = zzgb.zza().zza(2);
        this.zzc = context;
        this.zze = defaultClock;
        this.zzb = zza2;
        this.zzd = new zzbb(this, context, "google_tagmanager.db");
    }

    public static /* bridge */ /* synthetic */ List zzf(zzbd zzbdVar) {
        ObjectInputStream objectInputStream;
        try {
            zzbdVar.zzk(zzbdVar.zze.currentTimeMillis());
            SQLiteDatabase zzi = zzbdVar.zzi("Error opening database for loadSerialized.");
            ArrayList arrayList = new ArrayList();
            if (zzi != null) {
                Cursor query = zzi.query("datalayer", new String[]{Constants.KEY, "value"}, null, null, null, null, "ID", null);
                while (query.moveToNext()) {
                    arrayList.add(new zzbc(query.getString(0), query.getBlob(1)));
                }
                query.close();
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zzbc zzbcVar = (zzbc) it.next();
                String str = zzbcVar.zza;
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(zzbcVar.zzb);
                ObjectInputStream objectInputStream2 = null;
                r2 = null;
                r2 = null;
                r2 = null;
                Object obj = null;
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                } catch (IOException unused) {
                    objectInputStream = null;
                } catch (ClassNotFoundException unused2) {
                    objectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    obj = objectInputStream.readObject();
                    try {
                        objectInputStream.close();
                    } catch (IOException unused3) {
                    }
                } catch (IOException unused4) {
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    byteArrayInputStream.close();
                    arrayList2.add(new zzat(str, obj));
                } catch (ClassNotFoundException unused5) {
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    byteArrayInputStream.close();
                    arrayList2.add(new zzat(str, obj));
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream2 = objectInputStream;
                    if (objectInputStream2 != null) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException unused6) {
                            throw th;
                        }
                    }
                    byteArrayInputStream.close();
                    throw th;
                }
                byteArrayInputStream.close();
                arrayList2.add(new zzat(str, obj));
            }
            return arrayList2;
        } finally {
            zzbdVar.zzj();
        }
    }

    public static /* synthetic */ void zzg(zzbd zzbdVar, String str) {
        SQLiteDatabase zzi = zzbdVar.zzi("Error opening database for clearKeysWithPrefix.");
        try {
            if (zzi == null) {
                return;
            }
            int delete = zzi.delete("datalayer", "key = ? OR key LIKE ?", new String[]{str, str + ".%"});
            zzdg.zzb.zzd("Cleared " + delete + " items");
        } catch (SQLiteException e) {
            String obj = e.toString();
            Log.w("GoogleTagManager", "Error deleting entries with key prefix: " + str + " (" + obj + ").");
        } finally {
            zzbdVar.zzj();
        }
    }

    private final SQLiteDatabase zzi(String str) {
        try {
            return this.zzd.getWritableDatabase();
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", str);
            return null;
        }
    }

    private final void zzj() {
        try {
            this.zzd.close();
        } catch (SQLiteException unused) {
        }
    }

    private final void zzk(long j) {
        SQLiteDatabase zzi = zzi("Error opening database for deleteOlderThan.");
        if (zzi == null) {
            return;
        }
        try {
            int delete = zzi.delete("datalayer", "expires <= ?", new String[]{Long.toString(j)});
            zzdg.zzb.zzd("Deleted " + delete + " expired items");
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", "Error deleting old entries.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
        if (r7 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #3 {, blocks: (B:75:0x0174, B:4:0x0003, B:27:0x004c, B:29:0x0051, B:42:0x0091, B:65:0x0133, B:66:0x0136, B:53:0x00bb, B:55:0x00e4, B:58:0x00e8, B:60:0x00f0, B:61:0x0117, B:63:0x011d, B:67:0x0137, B:70:0x0142, B:71:0x0146, B:73:0x014c, B:16:0x0031, B:81:0x017d, B:82:0x0180, B:26:0x0048), top: B:88:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0133 A[Catch: all -> 0x0035, TryCatch #3 {, blocks: (B:75:0x0174, B:4:0x0003, B:27:0x004c, B:29:0x0051, B:42:0x0091, B:65:0x0133, B:66:0x0136, B:53:0x00bb, B:55:0x00e4, B:58:0x00e8, B:60:0x00f0, B:61:0x0117, B:63:0x011d, B:67:0x0137, B:70:0x0142, B:71:0x0146, B:73:0x014c, B:16:0x0031, B:81:0x017d, B:82:0x0180, B:26:0x0048), top: B:88:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0142 A[Catch: all -> 0x0035, TryCatch #3 {, blocks: (B:75:0x0174, B:4:0x0003, B:27:0x004c, B:29:0x0051, B:42:0x0091, B:65:0x0133, B:66:0x0136, B:53:0x00bb, B:55:0x00e4, B:58:0x00e8, B:60:0x00f0, B:61:0x0117, B:63:0x011d, B:67:0x0137, B:70:0x0142, B:71:0x0146, B:73:0x014c, B:16:0x0031, B:81:0x017d, B:82:0x0180, B:26:0x0048), top: B:88:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzl(java.util.List r19, long r20) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzbd.zzl(java.util.List, long):void");
    }

    @Override // com.google.android.gms.tagmanager.zzaw
    public final void zza(String str) {
        this.zzb.execute(new zzba(this, str));
    }

    @Override // com.google.android.gms.tagmanager.zzaw
    public final void zzb(zzav zzavVar) {
        this.zzb.execute(new zzaz(this, zzavVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r6 == null) goto L11;
     */
    @Override // com.google.android.gms.tagmanager.zzaw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc(java.util.List r8, long r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L9:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r8.next()
            com.google.android.gms.tagmanager.zzat r1 = (com.google.android.gms.tagmanager.zzat) r1
            com.google.android.gms.tagmanager.zzbc r2 = new com.google.android.gms.tagmanager.zzbc
            java.lang.String r3 = r1.zza
            java.lang.Object r1 = r1.zzb
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            r5 = 0
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r6.writeObject(r1)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            byte[] r5 = r4.toByteArray()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
        L2d:
            r6.close()     // Catch: java.io.IOException -> L4b
        L30:
            r4.close()     // Catch: java.io.IOException -> L4b
            goto L4b
        L34:
            r8 = move-exception
            goto L38
        L36:
            goto L48
        L38:
            r5 = r6
            goto L3e
        L3a:
            r8 = move-exception
            goto L3e
        L3c:
            goto L47
        L3e:
            if (r5 == 0) goto L43
            r5.close()     // Catch: java.io.IOException -> L46
        L43:
            r4.close()     // Catch: java.io.IOException -> L46
        L46:
            throw r8
        L47:
            r6 = r5
        L48:
            if (r6 == 0) goto L30
            goto L2d
        L4b:
            r2.<init>(r3, r5)
            r0.add(r2)
            goto L9
        L52:
            java.util.concurrent.Executor r8 = r7.zzb
            com.google.android.gms.tagmanager.zzay r1 = new com.google.android.gms.tagmanager.zzay
            r1.<init>(r7, r0, r9)
            r8.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzbd.zzc(java.util.List, long):void");
    }
}
