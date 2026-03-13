package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class AppLovinBroadcastManager {
    private static final Map a = new HashMap();
    private static final Map b = new HashMap();
    private static final ArrayList c = new ArrayList();
    private static final Handler d = new a(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public interface Receiver {
        void onReceive(Intent intent, Map<String, Object> map);
    }

    /* loaded from: classes.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.b();
            } else {
                super.handleMessage(message);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        final Intent a;
        final Map b;
        final List c;

        public b(Intent intent, Map map, List list) {
            this.a = intent;
            this.b = map;
            this.c = list;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        final IntentFilter a;
        final Receiver b;
        boolean c;
        boolean d;

        public c(IntentFilter intentFilter, Receiver receiver) {
            this.a = intentFilter;
            this.b = receiver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (a) {
                try {
                    ArrayList arrayList = c;
                    size = arrayList.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    arrayList.toArray(bVarArr);
                    arrayList.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i = 0; i < size; i++) {
                b bVar = bVarArr[i];
                if (bVar != null) {
                    for (c cVar : bVar.c) {
                        if (cVar != null && !cVar.d) {
                            cVar.b.onReceive(bVar.a, bVar.b);
                        }
                    }
                }
            }
        }
    }

    public static void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        Map map = a;
        synchronized (map) {
            try {
                c cVar = new c(intentFilter, receiver);
                ArrayList arrayList = (ArrayList) map.get(receiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    map.put(receiver, arrayList);
                }
                arrayList.add(cVar);
                Iterator<String> actionsIterator = intentFilter.actionsIterator();
                while (actionsIterator.hasNext()) {
                    String next = actionsIterator.next();
                    Map map2 = b;
                    ArrayList arrayList2 = (ArrayList) map2.get(next);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        map2.put(next, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean sendBroadcast(Intent intent, Map<String, Object> map) {
        synchronized (a) {
            try {
                List a2 = a(intent);
                if (a2 == null) {
                    return false;
                }
                c.add(new b(intent, map, a2));
                Handler handler = d;
                if (!handler.hasMessages(1)) {
                    handler.sendEmptyMessage(1);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void sendBroadcastSync(Intent intent, Map<String, Object> map) {
        List<c> a2 = a(intent);
        if (a2 == null) {
            return;
        }
        for (c cVar : a2) {
            if (!cVar.d) {
                cVar.b.onReceive(intent, map);
            }
        }
    }

    public static void sendBroadcastSyncWithPendingBroadcasts(Intent intent, Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            b();
        }
    }

    public static boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("ad", obj);
        return sendBroadcast(new Intent(str), hashMap);
    }

    public static void unregisterReceiver(Receiver receiver) {
        Map map = a;
        synchronized (map) {
            try {
                List<c> list = (List) map.remove(receiver);
                if (list == null) {
                    return;
                }
                for (c cVar : list) {
                    cVar.d = true;
                    Iterator<String> actionsIterator = cVar.a.actionsIterator();
                    while (actionsIterator.hasNext()) {
                        String next = actionsIterator.next();
                        List list2 = (List) b.get(next);
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (((c) it.next()).b == receiver) {
                                    cVar.d = true;
                                    it.remove();
                                }
                            }
                            if (list2.size() <= 0) {
                                b.remove(next);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static List a(Intent intent) {
        synchronized (a) {
            try {
                String action = intent.getAction();
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                List<c> list = (List) b.get(action);
                if (list == null) {
                    return null;
                }
                ArrayList<c> arrayList = null;
                for (c cVar : list) {
                    if (!cVar.c && cVar.a.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(cVar);
                        cVar.c = true;
                    }
                }
                if (arrayList == null) {
                    return null;
                }
                for (c cVar2 : arrayList) {
                    cVar2.c = false;
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
