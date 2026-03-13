package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class t4 implements Iterable {
    private final Object a = new Object();
    private final Map b = new HashMap();
    private Set c = Collections.emptySet();
    private List d = Collections.emptyList();

    public void a(Object obj) {
        synchronized (this.a) {
            try {
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.add(obj);
                this.d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.b.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.c);
                    hashSet.add(obj);
                    this.c = Collections.unmodifiableSet(hashSet);
                }
                this.b.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b(Object obj) {
        int i;
        synchronized (this.a) {
            try {
                if (this.b.containsKey(obj)) {
                    i = ((Integer) this.b.get(obj)).intValue();
                } else {
                    i = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public void c(Object obj) {
        synchronized (this.a) {
            try {
                Integer num = (Integer) this.b.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.d);
                arrayList.remove(obj);
                this.d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.b.remove(obj);
                    HashSet hashSet = new HashSet(this.c);
                    hashSet.remove(obj);
                    this.c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.b.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.a) {
            it = this.d.iterator();
        }
        return it;
    }

    public Set a() {
        Set set;
        synchronized (this.a) {
            set = this.c;
        }
        return set;
    }
}
