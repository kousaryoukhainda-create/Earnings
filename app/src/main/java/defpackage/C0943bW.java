package defpackage;

import android.net.Uri;
import com.fyber.fairbid.http.connection.HttpConnection;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: bW  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0943bW {
    public final P4 a;
    public final InterfaceC0428Li b;

    public C0943bW(P4 appInfo, InterfaceC0428Li blockingDispatcher) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        this.a = appInfo;
        this.b = blockingDispatcher;
    }

    public static final URL a(C0943bW c0943bW) {
        c0943bW.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme(HttpConnection.DEFAULT_SCHEME).authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        P4 p4 = c0943bW.a;
        Uri.Builder appendPath2 = appendPath.appendPath(p4.a).appendPath("settings");
        U2 u2 = p4.d;
        return new URL(appendPath2.appendQueryParameter("build_version", u2.c).appendQueryParameter("display_version", u2.b).build().toString());
    }
}
