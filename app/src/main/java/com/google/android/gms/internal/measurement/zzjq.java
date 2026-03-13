package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public final class zzjq implements zzju {
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private volatile Map zzh;
    private static final Map zzb = new Z10();
    public static final String[] zza = {Constants.KEY, "value"};
    private final Object zzg = new Object();
    private final List zzi = new ArrayList();

    private zzjq(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        this.zzf = new zzjo(this, null);
    }

    public static zzjq zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzjq zzjqVar;
        synchronized (zzjq.class) {
            Map map = zzb;
            zzjqVar = (zzjq) map.get(uri);
            if (zzjqVar == null) {
                try {
                    zzjq zzjqVar2 = new zzjq(contentResolver, uri, runnable);
                    try {
                        contentResolver.registerContentObserver(uri, false, zzjqVar2.zzf);
                        map.put(uri, zzjqVar2);
                    } catch (SecurityException unused) {
                    }
                    zzjqVar = zzjqVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzjqVar;
    }

    public static synchronized void zzd() {
        synchronized (zzjq.class) {
            try {
                Map map = zzb;
                for (zzjq zzjqVar : map.values()) {
                    zzjqVar.zzc.unregisterContentObserver(zzjqVar.zzf);
                }
                map.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Map zzb() {
        Map emptyMap;
        Map map = this.zzh;
        if (map == null) {
            synchronized (this.zzg) {
                map = this.zzh;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        emptyMap = (Map) an0.a(new zzjt() { // from class: com.google.android.gms.internal.measurement.zzjp
                            @Override // com.google.android.gms.internal.measurement.zzjt
                            public final /* synthetic */ Object zza() {
                                return zzjq.this.zzf();
                            }
                        });
                    } catch (SQLiteException | IllegalStateException | SecurityException e) {
                        Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                        emptyMap = Collections.emptyMap();
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    this.zzh = emptyMap;
                    map = emptyMap;
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    public final void zzc() {
        synchronized (this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized (this) {
            try {
                for (zzjr zzjrVar : this.zzi) {
                    zzjrVar.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzju
    public final /* bridge */ /* synthetic */ Object zze(String str) {
        return (String) zzb().get(str);
    }

    public final /* synthetic */ Map zzf() {
        Map emptyMap;
        Cursor query;
        Map hashMap;
        Map emptyMap2;
        ContentResolver contentResolver = this.zzc;
        Uri uri = this.zzd;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.emptyMap();
            }
            try {
                query = acquireUnstableContentProviderClient.query(uri, zza, null, null, null);
                try {
                } catch (Throwable th) {
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (RemoteException e) {
                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
                emptyMap = Collections.emptyMap();
            }
            if (query == null) {
                Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                emptyMap = Collections.emptyMap();
                acquireUnstableContentProviderClient.release();
                return emptyMap;
            }
            int count = query.getCount();
            if (count == 0) {
                emptyMap2 = Collections.emptyMap();
            } else {
                if (count <= 256) {
                    hashMap = new C1243e5(count);
                } else {
                    hashMap = new HashMap(count, 1.0f);
                }
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                if (!query.isAfterLast()) {
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    emptyMap2 = Collections.emptyMap();
                } else {
                    query.close();
                    acquireUnstableContentProviderClient.release();
                    return hashMap;
                }
            }
            query.close();
            acquireUnstableContentProviderClient.release();
            return emptyMap2;
        } catch (Throwable th3) {
            acquireUnstableContentProviderClient.release();
            throw th3;
        }
    }
}
