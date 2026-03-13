package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.huawei.hms.framework.common.ExceptionCode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
@KeepForSdk
/* loaded from: classes3.dex */
public final class DynamiteModule {
    @KeepForSdk
    public static final int LOCAL = -1;
    @KeepForSdk
    public static final int NONE = 0;
    @KeepForSdk
    public static final int NO_SELECTION = 0;
    @KeepForSdk
    public static final int REMOTE = 1;
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static zzp zzk;
    private static zzq zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    @NonNull
    public static final VersionPolicy zza = new zzl();

    @DynamiteApi
    /* loaded from: classes3.dex */
    public static class DynamiteLoaderClassLoader {
        @NonNull
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzo zzoVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, zzo zzoVar) {
            super(str, th);
        }
    }

    /* loaded from: classes3.dex */
    public interface VersionPolicy {

        @KeepForSdk
        /* loaded from: classes3.dex */
        public interface IVersions {
            int zza(@NonNull Context context, @NonNull String str);

            int zzb(@NonNull Context context, @NonNull String str, boolean z) throws LoadingException;
        }

        @KeepForSdk
        /* loaded from: classes3.dex */
        public static class SelectionResult {
            @KeepForSdk
            public int localVersion = 0;
            @KeepForSdk
            public int remoteVersion = 0;
            @KeepForSdk
            public int selection = 0;
        }

        @NonNull
        @KeepForSdk
        SelectionResult selectModule(@NonNull Context context, @NonNull String str, @NonNull IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(@NonNull Context context, @NonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!Objects.equal(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(@NonNull Context context, @NonNull String str) {
        return zza(context, str, false);
    }

    @NonNull
    @KeepForSdk
    public static DynamiteModule load(@NonNull Context context, @NonNull VersionPolicy versionPolicy, @NonNull String str) throws LoadingException {
        DynamiteModule zzc2;
        Boolean bool;
        IObjectWrapper zzh2;
        DynamiteModule dynamiteModule;
        zzq zzqVar;
        boolean z;
        IObjectWrapper zze2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = zzg;
            zzm zzmVar = (zzm) threadLocal.get();
            zzm zzmVar2 = new zzm(null);
            threadLocal.set(zzmVar2);
            ThreadLocal threadLocal2 = zzh;
            Long l = (Long) threadLocal2.get();
            long longValue = l.longValue();
            try {
                threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
                VersionPolicy.SelectionResult selectModule = versionPolicy.selectModule(context, str, zzi);
                int i = selectModule.localVersion;
                int i2 = selectModule.remoteVersion;
                try {
                    Log.i("DynamiteModule", "Considering local module " + str + ":" + i + " and remote module " + str + ":" + i2);
                    int i3 = selectModule.selection;
                    if (i3 != 0) {
                        if (i3 == -1) {
                            if (selectModule.localVersion != 0) {
                                i3 = -1;
                            }
                        }
                        if (i3 != 1 || selectModule.remoteVersion != 0) {
                            if (i3 == -1) {
                                zzc2 = zzc(applicationContext, str);
                            } else if (i3 == 1) {
                                try {
                                    int i4 = selectModule.remoteVersion;
                                    try {
                                        synchronized (DynamiteModule.class) {
                                            if (zzf(context)) {
                                                bool = zzb;
                                            } else {
                                                throw new LoadingException("Remote loading disabled", null);
                                            }
                                        }
                                        if (bool != null) {
                                            if (bool.booleanValue()) {
                                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                                                synchronized (DynamiteModule.class) {
                                                    zzqVar = zzl;
                                                }
                                                if (zzqVar != null) {
                                                    zzm zzmVar3 = (zzm) threadLocal.get();
                                                    if (zzmVar3 != null && zzmVar3.zza != null) {
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor = zzmVar3.zza;
                                                        ObjectWrapper.wrap(null);
                                                        synchronized (DynamiteModule.class) {
                                                            if (zze >= 2) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                        }
                                                        if (z) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            zze2 = zzqVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i4, ObjectWrapper.wrap(cursor));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            zze2 = zzqVar.zze(ObjectWrapper.wrap(applicationContext2), str, i4, ObjectWrapper.wrap(cursor));
                                                        }
                                                        Context context2 = (Context) ObjectWrapper.unwrap(zze2);
                                                        if (context2 != null) {
                                                            dynamiteModule = new DynamiteModule(context2);
                                                        } else {
                                                            throw new LoadingException("Failed to get module context", null);
                                                        }
                                                    } else {
                                                        throw new LoadingException("No result cursor", null);
                                                    }
                                                } else {
                                                    throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                                }
                                            } else {
                                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                                                zzp zzg2 = zzg(context);
                                                if (zzg2 != null) {
                                                    int zze3 = zzg2.zze();
                                                    if (zze3 >= 3) {
                                                        zzm zzmVar4 = (zzm) threadLocal.get();
                                                        if (zzmVar4 != null) {
                                                            zzh2 = zzg2.zzi(ObjectWrapper.wrap(context), str, i4, ObjectWrapper.wrap(zzmVar4.zza));
                                                        } else {
                                                            throw new LoadingException("No cached result cursor holder", null);
                                                        }
                                                    } else if (zze3 == 2) {
                                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                        zzh2 = zzg2.zzj(ObjectWrapper.wrap(context), str, i4);
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                        zzh2 = zzg2.zzh(ObjectWrapper.wrap(context), str, i4);
                                                    }
                                                    Object unwrap = ObjectWrapper.unwrap(zzh2);
                                                    if (unwrap != null) {
                                                        dynamiteModule = new DynamiteModule((Context) unwrap);
                                                    } else {
                                                        throw new LoadingException("Failed to load remote module.", null);
                                                    }
                                                } else {
                                                    throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                                }
                                            }
                                            zzc2 = dynamiteModule;
                                        } else {
                                            throw new LoadingException("Failed to determine which loading route to use.", null);
                                        }
                                    } catch (RemoteException e) {
                                        throw new LoadingException("Failed to load remote module.", e, null);
                                    } catch (LoadingException e2) {
                                        throw e2;
                                    } catch (Throwable th) {
                                        CrashUtils.addDynamiteErrorToDropBox(context, th);
                                        throw new LoadingException("Failed to load remote module.", th, null);
                                    }
                                } catch (LoadingException e3) {
                                    String message = e3.getMessage();
                                    Log.w("DynamiteModule", "Failed to load remote module: " + message);
                                    int i5 = selectModule.localVersion;
                                    if (i5 != 0 && versionPolicy.selectModule(context, str, new zzn(i5, 0)).selection == -1) {
                                        zzc2 = zzc(applicationContext, str);
                                    } else {
                                        throw new LoadingException("Remote load failed. No local fallback found.", e3, null);
                                    }
                                }
                            } else {
                                throw new LoadingException("VersionPolicy returned invalid code:" + i3, null);
                            }
                            if (longValue == 0) {
                                zzh.remove();
                            } else {
                                zzh.set(l);
                            }
                            Cursor cursor2 = zzmVar2.zza;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            zzg.set(zzmVar);
                            return zzc2;
                        }
                    }
                    int i6 = selectModule.localVersion;
                    int i7 = selectModule.remoteVersion;
                    throw new LoadingException("No acceptable module " + str + " found. Local version is " + i6 + " and remote version is " + i7 + ".", null);
                } catch (Throwable th2) {
                    th = th2;
                    zzmVar = zzmVar;
                    if (longValue == 0) {
                        zzh.remove();
                    } else {
                        zzh.set(l);
                    }
                    Cursor cursor3 = zzmVar2.zza;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    zzg.set(zzmVar);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new LoadingException("null application Context", null);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x01bf -> B:130:0x01c4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x01c1 -> B:130:0x01c4). Please submit an issue!!! */
    public static int zza(@NonNull Context context, @NonNull String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                Cursor cursor2 = null;
                int i = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String obj = e2.toString();
                        Log.w("DynamiteModule", "Failed to load module via V2: " + obj);
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                zzd(classLoader);
                            } catch (LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else if (!zzf(context)) {
                            return 0;
                        } else {
                            if (!zzd) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int zzb2 = zzb(context, str, z, true);
                                        String str2 = zzc;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader zza2 = zzb.zza();
                                            if (zza2 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    J3.c();
                                                    String str3 = zzc;
                                                    Preconditions.checkNotNull(str3);
                                                    zza2 = J3.b(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = zzc;
                                                    Preconditions.checkNotNull(str4);
                                                    zza2 = new zzc(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            zzd(zza2);
                                            declaredField.set(null, zza2);
                                            zzb = bool2;
                                            return zzb2;
                                        }
                                        return zzb2;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        zzb = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzb(context, str, z, false);
                    } catch (LoadingException e3) {
                        String message = e3.getMessage();
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + message);
                        return 0;
                    }
                }
                zzp zzg2 = zzg(context);
                try {
                    if (zzg2 != null) {
                        try {
                            int zze2 = zzg2.zze();
                            if (zze2 >= 3) {
                                zzm zzmVar = (zzm) zzg.get();
                                if (zzmVar != null && (cursor = zzmVar.zza) != null) {
                                    i = cursor.getInt(0);
                                } else {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzg2.zzk(ObjectWrapper.wrap(context), str, z, ((Long) zzh.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i2 = cursor3.getInt(0);
                                                if (i2 <= 0 || !zze(cursor3)) {
                                                    cursor2 = cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i = i2;
                                            }
                                        } catch (RemoteException e4) {
                                            e = e4;
                                            cursor2 = cursor3;
                                            String message2 = e.getMessage();
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + message2);
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                }
                            } else if (zze2 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i = zzg2.zzg(ObjectWrapper.wrap(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i = zzg2.zzf(ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (RemoteException e5) {
                            e = e5;
                        }
                    }
                    return i;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0141, code lost:
        r4.close();
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x013d: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:92:0x013d */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int zzb(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule zzc(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzq zzqVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                zzqVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzq) {
                    zzqVar = (zzq) queryLocalInterface;
                } else {
                    zzqVar = new zzq(iBinder);
                }
            }
            zzl = zzqVar;
        } catch (ClassNotFoundException e) {
            e = e;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (InstantiationException e3) {
            e = e3;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzm zzmVar = (zzm) zzg.get();
        if (zzmVar != null && zzmVar.zza == null) {
            zzmVar.zza = cursor;
            return true;
        }
        return false;
    }

    private static boolean zzf(Context context) {
        int i;
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean z = false;
        if (zzf == null) {
            PackageManager packageManager = context.getPackageManager();
            if (true != PlatformVersion.isAtLeastQ()) {
                i = 0;
            } else {
                i = 268435456;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.chimera", i);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, ExceptionCode.CRASH_EXCEPTION) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            zzf = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zzd = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static zzp zzg(Context context) {
        zzp zzpVar;
        synchronized (DynamiteModule.class) {
            zzp zzpVar2 = zzk;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof zzp) {
                        zzpVar = (zzp) queryLocalInterface;
                    } else {
                        zzpVar = new zzp(iBinder);
                    }
                }
                if (zzpVar != null) {
                    zzk = zzpVar;
                    return zzpVar;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
            return null;
        }
    }

    @NonNull
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @NonNull
    @KeepForSdk
    public IBinder instantiate(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }
}
