package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;
/* loaded from: classes.dex */
public class v0 implements Comparable<v0> {
    public a a;
    public Uri b;
    public List<String> c;

    /* loaded from: classes.dex */
    public enum a {
        Primary(1),
        FallBack(2);
        
        public Integer mPriority;

        a(Integer num) {
            this.mPriority = num;
        }
    }

    public v0(a aVar, Uri uri, List<String> list) {
        this.a = aVar;
        this.b = uri;
        this.c = list;
    }

    @Override // java.lang.Comparable
    public int compareTo(v0 v0Var) {
        return this.a.mPriority.compareTo(v0Var.a.mPriority);
    }
}
