package com.fyber.inneractive.sdk.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class z {
    public List<b> a = new CopyOnWriteArrayList();
    public boolean b;
    public Context c;
    public BroadcastReceiver d;

    /* loaded from: classes.dex */
    public static class a {
        public static z a = new z();
    }

    /* loaded from: classes.dex */
    public interface b {
        void c(boolean z);
    }
}
