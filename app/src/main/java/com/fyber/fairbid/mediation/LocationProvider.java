package com.fyber.fairbid.mediation;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public class LocationProvider {
    public final ConcurrentLinkedQueue<a> a = new ConcurrentLinkedQueue<>();

    /* loaded from: classes.dex */
    public static class a {
        public a(b bVar, ExecutorService executorService) {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }
}
