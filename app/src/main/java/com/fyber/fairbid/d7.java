package com.fyber.fairbid;

import java.util.LinkedList;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class d7 {
    public static final Logger c = Logger.getLogger(d7.class.getName());
    public final LinkedList a = new LinkedList();
    public boolean b = false;

    /* loaded from: classes.dex */
    public static class a {
        public final Runnable a;
        public final Executor b;

        public a(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }
}
