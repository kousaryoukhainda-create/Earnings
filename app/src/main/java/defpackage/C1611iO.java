package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.ImageView;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzej;
import com.google.android.gms.location.LocationRequest;
import j$.util.function.Consumer;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
/* renamed from: iO  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1611iO implements zzej {
    public static C1611iO e;
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public C1611iO(C3307zm0 c3307zm0, int i, Consumer consumer, Runnable runnable) {
        this.a = i;
        this.b = consumer;
        this.c = runnable;
        this.d = c3307zm0;
    }

    public static void a(int i, C1611iO c1611iO) {
        synchronized (c1611iO.d) {
            try {
                if (c1611iO.a != i) {
                    c1611iO.a = i;
                    Iterator it = ((CopyOnWriteArrayList) c1611iO.c).iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        C0769Ym c0769Ym = (C0769Ym) weakReference.get();
                        if (c0769Ym != null) {
                            c0769Ym.a(i);
                        } else {
                            ((CopyOnWriteArrayList) c1611iO.c).remove(weakReference);
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static synchronized C1611iO d(Context context) {
        C1611iO c1611iO;
        synchronized (C1611iO.class) {
            try {
                if (e == null) {
                    e = new C1611iO(context);
                }
                c1611iO = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1611iO;
    }

    public void b() {
        ImageView imageView = (ImageView) this.b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC1137cq.a(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 && i == 21) {
                if (((M60) this.d) == null) {
                    this.d = new Object();
                }
                M60 m60 = (M60) this.d;
                m60.c = null;
                m60.b = false;
                m60.d = null;
                m60.a = false;
                ColorStateList a = AbstractC1428gD.a(imageView);
                if (a != null) {
                    m60.b = true;
                    m60.c = a;
                }
                PorterDuff.Mode b = AbstractC1428gD.b(imageView);
                if (b != null) {
                    m60.a = true;
                    m60.d = b;
                }
                if (m60.b || m60.a) {
                    Z3.d(drawable, m60, imageView.getDrawableState());
                    return;
                }
            }
            M60 m602 = (M60) this.c;
            if (m602 != null) {
                Z3.d(drawable, m602, imageView.getDrawableState());
            }
        }
    }

    public String c(C1235e1 c1235e1, Uri uri, int i) {
        int i2 = this.a;
        if (i2 != 1) {
            if (i2 == 2) {
                String str = (String) this.c;
                String str2 = (String) this.b;
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    String h = KX.h(i);
                    Charset charset = IX.i;
                    String Y = Ha0.Y(messageDigest.digest((Ha0.Y(messageDigest.digest((c1235e1.b + ":" + str2 + ":" + c1235e1.c).getBytes(charset))) + ":" + str + ":" + Ha0.Y(messageDigest.digest((h + ":" + uri).getBytes(charset)))).getBytes(charset)));
                    String str3 = (String) this.d;
                    if (str3.isEmpty()) {
                        return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", c1235e1.b, str2, str, uri, Y);
                    }
                    return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", c1235e1.b, str2, str, uri, Y, str3);
                } catch (NoSuchAlgorithmException e2) {
                    throw new QQ(null, e2, false, 4);
                }
            }
            throw new QQ(null, new UnsupportedOperationException(), false, 4);
        }
        String encodeToString = Base64.encodeToString((c1235e1.b + ":" + c1235e1.c).getBytes(IX.i), 0);
        int i3 = Ha0.a;
        Locale locale = Locale.US;
        return AbstractC2437ph.g("Basic ", encodeToString);
    }

    public int e() {
        int i;
        synchronized (this.d) {
            i = this.a;
        }
        return i;
    }

    public int f() {
        int i = this.a;
        if (i != 2) {
            if (i != 3) {
                return 0;
            }
            return 512;
        }
        return 2048;
    }

    public void g(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.b;
        Context context = imageView.getContext();
        int[] iArr = AbstractC3104xU.e;
        YZ E = YZ.E(context, attributeSet, iArr, i);
        Sb0.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) E.c, i);
        try {
            Drawable drawable3 = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) E.c;
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = AbstractC1522hL.y(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                AbstractC1137cq.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList y = E.y(2);
                int i2 = Build.VERSION.SDK_INT;
                AbstractC1428gD.c(imageView, y);
                if (i2 == 21 && (drawable2 = imageView.getDrawable()) != null && AbstractC1428gD.a(imageView) != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode c = AbstractC1137cq.c(typedArray.getInt(3, -1), null);
                int i3 = Build.VERSION.SDK_INT;
                AbstractC1428gD.d(imageView, c);
                if (i3 == 21 && (drawable = imageView.getDrawable()) != null && AbstractC1428gD.a(imageView) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            E.H();
        } catch (Throwable th) {
            E.H();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzej
    public void zza(Throwable th) {
        boolean z = th instanceof TimeoutException;
        C3307zm0 c3307zm0 = (C3307zm0) this.d;
        if (z) {
            c3307zm0.T(114, 28, Im0.E);
            zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            c3307zm0.T(107, 28, Im0.E);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.c).run();
    }

    @Override // com.google.android.gms.internal.play_billing.zzej
    public void zzb(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() > 0) {
            int intValue = num.intValue();
            C3307zm0 c3307zm0 = (C3307zm0) this.d;
            c3307zm0.getClass();
            C0316Ha a = Im0.a(intValue, "Billing override value was set by a license tester.");
            c3307zm0.T(LocationRequest.PRIORITY_NO_POWER, this.a, a);
            ((Consumer) this.b).accept(a);
            return;
        }
        ((Runnable) this.c).run();
    }

    public C1611iO(ImageView imageView) {
        this.a = 0;
        this.b = imageView;
    }

    public C1611iO(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public C1611iO(Context context) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new CopyOnWriteArrayList();
        this.d = new Object();
        this.a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C2381p2(this, 5), intentFilter);
    }

    public C1611iO(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.b = str;
        this.a = i2;
        if (arrayList == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.c = unmodifiableList;
        this.d = bArr;
    }
}
