package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.concurrent.Executors;
/* renamed from: c10  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0989c10 {
    public static final int[] i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};
    public final int a;
    public final int b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public C0989c10() {
        this.h = new Path();
        Paint paint = new Paint();
        this.g = paint;
        Paint paint2 = new Paint();
        this.d = paint2;
        this.a = AbstractC0683Ve.d(-16777216, 68);
        this.b = AbstractC0683Ve.d(-16777216, 20);
        this.c = AbstractC0683Ve.d(-16777216, 0);
        paint2.setColor(this.a);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.e = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f = new Paint(paint3);
    }

    public C0989c10(C0539Pq c0539Pq) {
        this.d = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC0374Jg(false));
        this.e = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC0374Jg(true));
        String str = Me0.a;
        this.f = new Object();
        this.g = new C1486gw(4);
        this.h = new Oc0(14);
        this.a = 4;
        this.b = Integer.MAX_VALUE;
        this.c = 20;
    }
}
