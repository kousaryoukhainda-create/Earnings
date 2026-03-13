package defpackage;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* renamed from: uF  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2831uF implements Oa0 {
    public static final SimpleDateFormat a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override // defpackage.InterfaceC0229Dr
    public final void a(Object obj, Object obj2) {
        ((Pa0) obj2).b(a.format((Date) obj));
    }
}
