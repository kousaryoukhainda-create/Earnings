package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: classes.dex */
public final class k implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a {
    public final File a;
    public final f b;
    public final i d;
    public a.C0100a g;
    public long f = 0;
    public final HashMap<String, g> c = new HashMap<>();
    public final HashMap<String, ArrayList<a.b>> e = new HashMap<>();

    /* loaded from: classes.dex */
    public class a extends Thread {
        public final /* synthetic */ ConditionVariable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.a = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (k.this) {
                this.a.open();
                try {
                    k.a(k.this);
                } catch (a.C0100a e) {
                    k.this.g = e;
                }
                k.this.b.getClass();
            }
        }
    }

    public k(File file, f fVar, byte[] bArr) {
        this.a = file;
        this.b = fVar;
        this.d = new i(file, null);
        ConditionVariable conditionVariable = new ConditionVariable();
        new a("SimpleCache.initialize()", conditionVariable).start();
        conditionVariable.block();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
    public synchronized long a() {
        return this.f;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
    public g b(String str, long j) throws InterruptedException, a.C0100a {
        l c;
        synchronized (this) {
            while (true) {
                c = c(str, j);
                if (c == null) {
                    wait();
                }
            }
        }
        return c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
    /* renamed from: d */
    public synchronized l c(String str, long j) throws a.C0100a {
        l floor;
        l lVar;
        try {
            a.C0100a c0100a = this.g;
            if (c0100a == null) {
                h hVar = this.d.a.get(str);
                if (hVar == null) {
                    lVar = new l(str, j, -1L, -9223372036854775807L, null);
                } else {
                    while (true) {
                        l lVar2 = new l(hVar.b, j, -1L, -9223372036854775807L, null);
                        floor = hVar.c.floor(lVar2);
                        if (floor == null || floor.b + floor.c <= j) {
                            l ceiling = hVar.c.ceiling(lVar2);
                            if (ceiling == null) {
                                floor = new l(hVar.b, j, -1L, -9223372036854775807L, null);
                            } else {
                                floor = new l(hVar.b, j, ceiling.b - j, -9223372036854775807L, null);
                            }
                        }
                        if (!floor.d || floor.e.length() == floor.c) {
                            break;
                        }
                        b();
                    }
                    lVar = floor;
                }
                if (lVar.d) {
                    h hVar2 = this.d.a.get(str);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(hVar2.c.remove(lVar));
                    int i = hVar2.a;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(lVar.d);
                    long currentTimeMillis = System.currentTimeMillis();
                    File a2 = l.a(lVar.e.getParentFile(), i, lVar.b, currentTimeMillis);
                    l lVar3 = new l(lVar.a, lVar.b, lVar.c, currentTimeMillis, a2);
                    if (lVar.e.renameTo(a2)) {
                        hVar2.c.add(lVar3);
                        ArrayList<a.b> arrayList = this.e.get(lVar.a);
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                arrayList.get(size).a(this, lVar, lVar3);
                            }
                        }
                        j jVar = (j) this.b;
                        jVar.a.remove(lVar);
                        jVar.b -= lVar.c;
                        jVar.b(this, lVar3);
                        return lVar3;
                    }
                    throw new a.C0100a("Renaming of " + lVar.e + " to " + a2 + " failed.");
                } else if (!this.c.containsKey(str)) {
                    this.c.put(str, lVar);
                    return lVar;
                } else {
                    return null;
                }
            }
            throw c0100a;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
    public synchronized File a(String str, long j, long j2) throws a.C0100a {
        File file;
        h hVar;
        try {
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.c.containsKey(str));
            if (!this.a.exists()) {
                b();
                this.a.mkdirs();
            }
            ((j) this.b).a(this, j2);
            file = this.a;
            i iVar = this.d;
            hVar = iVar.a.get(str);
            if (hVar == null) {
                hVar = iVar.a(str, -1L);
            }
        } catch (Throwable th) {
            throw th;
        }
        return l.a(file, hVar.a, j, System.currentTimeMillis());
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
    public synchronized void b(g gVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(gVar == this.c.remove(gVar.a));
        notifyAll();
    }

    public final void b() throws a.C0100a {
        LinkedList linkedList = new LinkedList();
        for (h hVar : this.d.a.values()) {
            Iterator<l> it = hVar.c.iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (next.e.length() != next.c) {
                    linkedList.add(next);
                }
            }
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            a((g) it2.next(), false);
        }
        this.d.b();
        this.d.c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
    public synchronized void a(File file) throws a.C0100a {
        l a2 = l.a(file, this.d);
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(a2 != null);
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.c.containsKey(a2.a));
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            String str = a2.a;
            synchronized (this) {
                h hVar = this.d.a.get(str);
                long j = hVar == null ? -1L : hVar.d;
                if (j != -1) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(a2.b + a2.c <= j);
                }
                a(a2);
                this.d.c();
                notifyAll();
            }
        }
    }

    public static void a(k kVar) throws a.C0100a {
        if (!kVar.a.exists()) {
            kVar.a.mkdirs();
            return;
        }
        i iVar = kVar.d;
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(!iVar.f);
        if (!iVar.a()) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.b bVar = iVar.c;
            bVar.a.delete();
            bVar.b.delete();
            iVar.a.clear();
            iVar.b.clear();
        }
        File[] listFiles = kVar.a.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.getName().equals("cached_content_index.exi")) {
                l a2 = file.length() > 0 ? l.a(file, kVar.d) : null;
                if (a2 != null) {
                    kVar.a(a2);
                } else {
                    file.delete();
                }
            }
        }
        kVar.d.b();
        kVar.d.c();
    }

    public final void a(l lVar) {
        i iVar = this.d;
        String str = lVar.a;
        h hVar = iVar.a.get(str);
        if (hVar == null) {
            hVar = iVar.a(str, -1L);
        }
        hVar.c.add(lVar);
        this.f += lVar.c;
        ArrayList<a.b> arrayList = this.e.get(lVar.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).b(this, lVar);
            }
        }
        ((j) this.b).b(this, lVar);
    }

    public final void a(g gVar, boolean z) throws a.C0100a {
        h a2 = this.d.a(gVar.a);
        if (a2 == null || !a2.c.remove(gVar)) {
            return;
        }
        gVar.e.delete();
        this.f -= gVar.c;
        if (z && a2.c.isEmpty()) {
            this.d.b(a2.b);
            this.d.c();
        }
        ArrayList<a.b> arrayList = this.e.get(gVar.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(this, gVar);
            }
        }
        j jVar = (j) this.b;
        jVar.a.remove(gVar);
        jVar.b -= gVar.c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
    public synchronized void a(g gVar) throws a.C0100a {
        a(gVar, true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
    public synchronized void a(String str, long j) throws a.C0100a {
        try {
            i iVar = this.d;
            h hVar = iVar.a.get(str);
            if (hVar != null) {
                if (hVar.d != j) {
                    hVar.d = j;
                    iVar.f = true;
                }
            } else {
                iVar.a(str, j);
            }
            this.d.c();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
    public synchronized long a(String str) {
        h hVar;
        hVar = this.d.a.get(str);
        return hVar == null ? -1L : hVar.d;
    }
}
