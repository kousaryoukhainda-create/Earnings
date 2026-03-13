package com.fyber.inneractive.sdk.config;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class z implements Iterable<a0> {
    public List<a0> a = new LinkedList();
    public boolean b = true;

    public a0 c(int i) {
        return this.a.get(i);
    }

    @Override // java.lang.Iterable
    public Iterator<a0> iterator() {
        return this.a.iterator();
    }
}
