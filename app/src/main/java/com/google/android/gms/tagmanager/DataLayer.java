package com.google.android.gms.tagmanager;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes3.dex */
public class DataLayer {
    @NonNull
    public static final String EVENT_KEY = "event";
    @NonNull
    public static final Object OBJECT_NOT_PRESENT = new Object();
    static final String[] zza = "gtm.lifetime".split("\\.");
    private static final Pattern zzb = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ConcurrentHashMap zzc;
    private final Map zzd;
    private final ReentrantLock zze;
    private final LinkedList zzf;
    private final zzaw zzg;
    private final CountDownLatch zzh;

    public DataLayer() {
        this(new zzar());
    }

    @NonNull
    public static List<Object> listOf(@NonNull Object... objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    @NonNull
    public static Map<String, Object> mapOf(@NonNull Object... objArr) {
        if ((objArr.length & 1) == 0) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < objArr.length; i += 2) {
                Object obj = objArr[i];
                if (obj instanceof String) {
                    hashMap.put((String) obj, objArr[i + 1]);
                } else {
                    throw new IllegalArgumentException("key is not a string: ".concat(String.valueOf(obj)));
                }
            }
            return hashMap;
        }
        throw new IllegalArgumentException("expected even number of key-value pairs");
    }

    private final void zzh(Map map, String str, Collection collection) {
        String str2;
        for (Map.Entry entry : map.entrySet()) {
            int length = str.length();
            String str3 = (String) entry.getKey();
            StringBuilder l = AbstractC0324Hi.l(str);
            if (length == 0) {
                str2 = "";
            } else {
                str2 = ".";
            }
            String h = AbstractC0324Hi.h(l, str2, str3);
            if (entry.getValue() instanceof Map) {
                zzh((Map) entry.getValue(), h, collection);
            } else if (!h.equals("gtm.lifetime")) {
                collection.add(new zzat(h, entry.getValue()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzi(Map map) {
        Long l;
        long j;
        this.zze.lock();
        try {
            this.zzf.offer(map);
            if (this.zze.getHoldCount() == 1) {
                int i = 0;
                while (true) {
                    Map map2 = (Map) this.zzf.poll();
                    if (map2 == null) {
                        break;
                    }
                    synchronized (this.zzd) {
                        for (String str : map2.keySet()) {
                            zzf(zza(str, map2.get(str)), this.zzd);
                        }
                    }
                    for (zzau zzauVar : this.zzc.keySet()) {
                        zzauVar.zza(map2);
                    }
                    i++;
                    if (i > 500) {
                        this.zzf.clear();
                        throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
                    }
                }
            }
            String[] strArr = zza;
            int length = strArr.length;
            Object obj = map;
            int i2 = 0;
            while (true) {
                l = null;
                if (i2 >= length) {
                    break;
                }
                String str2 = strArr[i2];
                if (!(obj instanceof Map)) {
                    obj = null;
                    break;
                } else {
                    obj = ((Map) obj).get(str2);
                    i2++;
                }
            }
            if (obj != null) {
                String obj2 = obj.toString();
                Matcher matcher = zzb.matcher(obj2);
                if (!matcher.matches()) {
                    zzdg.zzb.zzb("unknown _lifetime: ".concat(String.valueOf(obj2)));
                } else {
                    try {
                        String group = matcher.group(1);
                        Preconditions.checkNotNull(group);
                        j = Long.parseLong(group);
                    } catch (NumberFormatException unused) {
                        Log.w("GoogleTagManager", "illegal number in _lifetime value: ".concat(String.valueOf(obj2)));
                        j = 0;
                    }
                    if (j <= 0) {
                        zzdg.zzb.zzb("non-positive _lifetime: ".concat(String.valueOf(obj2)));
                    } else {
                        String group2 = matcher.group(2);
                        Preconditions.checkNotNull(group2);
                        if (group2.length() == 0) {
                            l = Long.valueOf(j);
                        } else {
                            char charAt = group2.charAt(0);
                            if (charAt != 'd') {
                                if (charAt != 'h') {
                                    if (charAt != 'm') {
                                        if (charAt != 's') {
                                            Log.w("GoogleTagManager", "unknown units in _lifetime: ".concat(String.valueOf(obj2)));
                                        } else {
                                            l = Long.valueOf(j * 1000);
                                        }
                                    } else {
                                        l = Long.valueOf(j * 60000);
                                    }
                                } else {
                                    l = Long.valueOf(j * 3600000);
                                }
                            } else {
                                l = Long.valueOf(j * 86400000);
                            }
                        }
                    }
                }
            }
            if (l != null) {
                ArrayList arrayList = new ArrayList();
                zzh(map, "", arrayList);
                this.zzg.zzc(arrayList, l.longValue());
            }
            this.zze.unlock();
        } catch (Throwable th) {
            this.zze.unlock();
            throw th;
        }
    }

    public Object get(@NonNull String str) {
        String[] split;
        synchronized (this.zzd) {
            try {
                Object obj = this.zzd;
                for (String str2 : str.split("\\.")) {
                    if (!(obj instanceof Map)) {
                        return null;
                    }
                    obj = ((Map) obj).get(str2);
                    if (obj == null) {
                        return null;
                    }
                }
                return obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void push(@NonNull String str, Object obj) {
        push(zza(str, obj));
    }

    public void pushEvent(@NonNull String str, @NonNull Map<String, Object> map) {
        HashMap hashMap = new HashMap(map);
        hashMap.put(EVENT_KEY, str);
        push(hashMap);
    }

    @NonNull
    public String toString() {
        String sb;
        synchronized (this.zzd) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (Map.Entry entry : this.zzd.entrySet()) {
                    sb2.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", entry.getKey(), entry.getValue()));
                }
                sb = sb2.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb;
    }

    public final Map zza(String str, Object obj) {
        HashMap hashMap = new HashMap();
        String[] split = str.toString().split("\\.");
        int i = 0;
        HashMap hashMap2 = hashMap;
        while (true) {
            int length = split.length - 1;
            if (i < length) {
                HashMap hashMap3 = new HashMap();
                hashMap2.put(split[i], hashMap3);
                i++;
                hashMap2 = hashMap3;
            } else {
                hashMap2.put(split[length], obj);
                return hashMap;
            }
        }
    }

    public final void zzd(String str) {
        push(str, null);
        this.zzg.zza(str);
    }

    public final void zze(List list, List list2) {
        while (list2.size() < list.size()) {
            list2.add(null);
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof List) {
                if (!(list2.get(i) instanceof List)) {
                    list2.set(i, new ArrayList());
                }
                Object obj2 = list2.get(i);
                Preconditions.checkNotNull(obj2);
                zze((List) obj, (List) obj2);
            } else if (obj instanceof Map) {
                if (!(list2.get(i) instanceof Map)) {
                    list2.set(i, new HashMap());
                }
                Object obj3 = list2.get(i);
                Preconditions.checkNotNull(obj3);
                zzf((Map) obj, (Map) obj3);
            } else if (obj != OBJECT_NOT_PRESENT) {
                list2.set(i, obj);
            }
        }
    }

    public final void zzf(Map map, Map map2) {
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof List) {
                if (!(map2.get(str) instanceof List)) {
                    map2.put(str, new ArrayList());
                }
                Object obj2 = map2.get(str);
                Preconditions.checkNotNull(obj2);
                zze((List) obj, (List) obj2);
            } else if (obj instanceof Map) {
                if (!(map2.get(str) instanceof Map)) {
                    map2.put(str, new HashMap());
                }
                Object obj3 = map2.get(str);
                Preconditions.checkNotNull(obj3);
                zzf((Map) obj, (Map) obj3);
            } else {
                map2.put(str, obj);
            }
        }
    }

    public final void zzg(zzau zzauVar) {
        this.zzc.put(zzauVar, 0);
    }

    public DataLayer(zzaw zzawVar) {
        this.zzg = zzawVar;
        this.zzc = new ConcurrentHashMap();
        this.zzd = new HashMap();
        this.zze = new ReentrantLock();
        this.zzf = new LinkedList();
        this.zzh = new CountDownLatch(1);
        zzawVar.zzb(new zzas(this));
    }

    public void push(@NonNull Map<String, Object> map) {
        try {
            this.zzh.await();
        } catch (InterruptedException unused) {
            Log.w("GoogleTagManager", "DataLayer.push: unexpected InterruptedException");
        }
        zzi(map);
    }
}
