package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.fairbid.http.connection.HttpConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzfk {
    @NotNull
    private final List zza;

    public zzfk() {
        this(true);
    }

    public static final boolean zzc(@NotNull Uri uri) {
        return zze(uri);
    }

    private final boolean zzd(String str) {
        List<String> list = this.zza;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String str2 : list) {
            if (D40.o(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zze(Uri uri) {
        if (!TextUtils.isEmpty(uri.toString()) && HttpConnection.DEFAULT_SCHEME.equals(uri.getScheme()) && !TextUtils.isEmpty(uri.getHost())) {
            return true;
        }
        return false;
    }

    private static final List zzf(List list) {
        ArrayList arrayList = new ArrayList(C0372Je.f(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + "/");
        }
        return arrayList;
    }

    public final boolean zza(@NotNull Uri uri) {
        if (zze(uri) && zzd(uri.toString())) {
            return true;
        }
        return false;
    }

    public final boolean zzb(@NotNull String str) {
        Uri parse = Uri.parse(str);
        Intrinsics.b(parse);
        if (zze(parse) && zzd(parse.toString())) {
            return true;
        }
        return false;
    }

    public zzfk(boolean z) {
        this.zza = zzf(C0346Ie.c("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"));
    }
}
