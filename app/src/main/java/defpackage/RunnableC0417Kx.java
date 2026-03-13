package defpackage;

import android.content.Context;
import android.os.Handler;
import io.flutter.embedding.engine.loader.FlutterLoader;
/* renamed from: Kx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0417Kx implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ FlutterLoader c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ String[] f;
    public final /* synthetic */ Handler g;
    public final /* synthetic */ Runnable h;

    public /* synthetic */ RunnableC0417Kx(FlutterLoader flutterLoader, Context context, String[] strArr, Handler handler, Runnable runnable, int i) {
        this.b = i;
        this.c = flutterLoader;
        this.d = context;
        this.f = strArr;
        this.g = handler;
        this.h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                FlutterLoader.b(this.c, this.d, this.f, this.g, this.h);
                return;
            default:
                FlutterLoader.a(this.c, this.d, this.f, this.g, this.h);
                return;
        }
    }
}
