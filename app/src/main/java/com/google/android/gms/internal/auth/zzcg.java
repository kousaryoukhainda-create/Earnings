package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public final class zzcg implements zzcl {
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg;
    private volatile Map zzh;
    private final List zzi;
    private static final Map zzb = new Z10();
    public static final String[] zza = {Constants.KEY, "value"};

    private zzcg(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzcf zzcfVar = new zzcf(this, null);
        this.zzf = zzcfVar;
        this.zzg = new Object();
        this.zzi = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        contentResolver.registerContentObserver(uri, false, zzcfVar);
    }

    public static zzcg zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzcg zzcgVar;
        synchronized (zzcg.class) {
            Map map = zzb;
            zzcgVar = (zzcg) map.get(uri);
            if (zzcgVar == null) {
                try {
                    zzcg zzcgVar2 = new zzcg(contentResolver, uri, runnable);
                    try {
                        map.put(uri, zzcgVar2);
                    } catch (SecurityException unused) {
                    }
                    zzcgVar = zzcgVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzcgVar;
    }

    public static synchronized void zzd() {
        synchronized (zzcg.class) {
            try {
                for (zzcg zzcgVar : zzb.values()) {
                    zzcgVar.zzc.unregisterContentObserver(zzcgVar.zzf);
                }
                zzb.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        Map map;
        Map map2 = this.zzh;
        if (map2 == null) {
            synchronized (this.zzg) {
                map2 = this.zzh;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) zzcj.zza(new zzck() { // from class: com.google.android.gms.internal.auth.zzce
                            @Override // com.google.android.gms.internal.auth.zzck
                            public final Object zza() {
                                return zzcg.this.zzc();
                            }
                        });
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    }
                    this.zzh = map;
                    map2 = map;
                }
            }
        }
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        return (String) map2.get(str);
    }

    public final /* synthetic */ Map zzc() {
        Map hashMap;
        Cursor query = this.zzc.query(this.zzd, zza, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new C1243e5(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    public final void zze() {
        synchronized (this.zzg) {
            this.zzh = null;
            zzdc.zzc();
        }
        synchronized (this) {
            try {
                for (zzch zzchVar : this.zzi) {
                    zzchVar.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
