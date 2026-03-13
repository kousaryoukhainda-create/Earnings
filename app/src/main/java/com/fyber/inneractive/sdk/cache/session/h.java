package com.fyber.inneractive.sdk.cache.session;

import java.util.PriorityQueue;
/* loaded from: classes.dex */
public class h extends PriorityQueue<e> {
    public int a;

    public h(int i) {
        super(1, new i());
        this.a = i;
    }

    @Override // java.util.PriorityQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    /* renamed from: a */
    public boolean add(e eVar) {
        boolean add = super.add(eVar);
        if (super.size() > this.a) {
            poll();
        }
        return add;
    }

    @Override // java.util.PriorityQueue, java.util.AbstractCollection, java.util.Collection
    public int size() {
        return super.size();
    }
}
