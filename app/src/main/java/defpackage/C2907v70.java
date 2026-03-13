package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: v70  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2907v70 {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;
    public final Context a;
    public final C1048ci b;
    public final Y3 c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final C2735t70 h;
    public final C1243e5 e = new Z10();
    public boolean g = false;

    /* JADX WARN: Type inference failed for: r0v0, types: [e5, Z10] */
    public C2907v70(FirebaseMessaging firebaseMessaging, C1048ci c1048ci, C2735t70 c2735t70, Y3 y3, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = c1048ci;
        this.h = c2735t70;
        this.c = y3;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void b(Task task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e2);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static boolean e() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    public final void a(C2220n70 c2220n70, TaskCompletionSource taskCompletionSource) {
        ArrayDeque arrayDeque;
        synchronized (this.e) {
            try {
                String str = c2220n70.c;
                if (this.e.containsKey(str)) {
                    arrayDeque = (ArrayDeque) this.e.getOrDefault(str, null);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.e.put(str, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str) {
        String a = this.d.a();
        Y3 y3 = this.c;
        y3.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        b(y3.j(y3.s(a, "/topics/" + str, bundle)));
    }

    public final void d(String str) {
        String a = this.d.a();
        Y3 y3 = this.c;
        y3.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        b(y3.j(y3.s(a, "/topics/" + str, bundle)));
    }

    public final void f(C2220n70 c2220n70) {
        synchronized (this.e) {
            try {
                String str = c2220n70.c;
                if (!this.e.containsKey(str)) {
                    return;
                }
                ArrayDeque arrayDeque = (ArrayDeque) this.e.getOrDefault(str, null);
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.e.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Task g(C2220n70 c2220n70) {
        C2735t70 c2735t70 = this.h;
        synchronized (c2735t70) {
            c2735t70.b.b(c2220n70.c);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(c2220n70, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final synchronized void h(boolean z) {
        this.g = z;
    }

    public final void i() {
        boolean z;
        if (this.h.a() != null) {
            synchronized (this) {
                z = this.g;
            }
            if (!z) {
                k(0L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c A[Catch: IOException -> 0x0040, TryCatch #1 {IOException -> 0x0040, blocks: (B:14:0x0027, B:31:0x0055, B:33:0x005b, B:34:0x0070, B:36:0x0079, B:37:0x008c, B:39:0x0095, B:19:0x0036, B:24:0x0042), top: B:58:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2907v70.j():boolean");
    }

    public final void k(long j2) {
        long min = Math.min(Math.max(30L, 2 * j2), i);
        this.f.schedule(new RunnableC3079x70(this, this.a, this.b, min), j2, TimeUnit.SECONDS);
        h(true);
    }
}
