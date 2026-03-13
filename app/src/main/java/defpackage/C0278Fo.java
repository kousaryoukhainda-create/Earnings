package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
/* renamed from: Fo  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278Fo extends AbstractC1606iJ {
    public static final AbstractC3014wQ i = new C1461gf(new R9(6));
    public final Object c;
    public final C2999wB d;
    public final boolean e;
    public final C3223yo f;
    public final C0148Ao g;
    public S5 h;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, Ao] */
    public C0278Fo(Context context) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        boolean z;
        C0148Ao c0148Ao;
        C2999wB c2999wB = new C2999wB(14);
        int i2 = C3223yo.A;
        C3223yo c3223yo = new C3223yo(new C3137xo(context));
        this.c = new Object();
        context.getApplicationContext();
        this.d = c2999wB;
        this.f = c3223yo;
        this.h = S5.c;
        boolean L = Ha0.L(context);
        this.e = L;
        if (!L && Ha0.a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                spatializer = audioManager.getSpatializer();
                ?? obj = new Object();
                obj.b = spatializer;
                immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
                if (immersiveAudioLevel != 0) {
                    z = true;
                } else {
                    z = false;
                }
                obj.a = z;
                c0148Ao = obj;
            } else {
                c0148Ao = null;
            }
            this.g = c0148Ao;
        }
    }

    public static int c(int i2, int i3) {
        if (i2 != 0 && i2 == i3) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(i2 & i3);
    }

    public static int d(b bVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(bVar.d)) {
            return 4;
        }
        String f = f(str);
        String f2 = f(bVar.d);
        if (f2 != null && f != null) {
            if (!f2.startsWith(f) && !f.startsWith(f2)) {
                int i2 = Ha0.a;
                if (!f2.split("-", 2)[0].equals(f.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z || f2 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair h(int i2, C1262eJ c1262eJ, int[][][] iArr, InterfaceC0200Co interfaceC0200Co, Comparator comparator) {
        RandomAccess randomAccess;
        C1262eJ c1262eJ2 = c1262eJ;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < c1262eJ2.a) {
            if (i2 == ((int[]) c1262eJ2.b)[i3]) {
                J70 j70 = ((J70[]) c1262eJ2.c)[i3];
                for (int i4 = 0; i4 < j70.a; i4++) {
                    I70 a = j70.a(i4);
                    FV d = interfaceC0200Co.d(i3, a, iArr[i3][i4]);
                    int i5 = a.a;
                    boolean[] zArr = new boolean[i5];
                    for (int i6 = 0; i6 < i5; i6++) {
                        AbstractC0226Do abstractC0226Do = (AbstractC0226Do) d.get(i6);
                        int e = abstractC0226Do.e();
                        if (!zArr[i6] && e != 0) {
                            if (e == 1) {
                                randomAccess = AbstractC2571rD.x(abstractC0226Do);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC0226Do);
                                for (int i7 = i6 + 1; i7 < i5; i7++) {
                                    AbstractC0226Do abstractC0226Do2 = (AbstractC0226Do) d.get(i7);
                                    if (abstractC0226Do2.e() == 2 && abstractC0226Do.f(abstractC0226Do2)) {
                                        arrayList2.add(abstractC0226Do2);
                                        zArr[i7] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                    }
                }
            }
            i3++;
            c1262eJ2 = c1262eJ;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((AbstractC0226Do) list.get(i8)).d;
        }
        AbstractC0226Do abstractC0226Do3 = (AbstractC0226Do) list.get(0);
        return Pair.create(new C1140ct(abstractC0226Do3.c, iArr2), Integer.valueOf(abstractC0226Do3.b));
    }

    @Override // defpackage.AbstractC1606iJ
    public final void a() {
        C0148Ao c0148Ao;
        C3309zo c3309zo;
        synchronized (this.c) {
            try {
                if (Ha0.a >= 32 && (c0148Ao = this.g) != null && (c3309zo = (C3309zo) c0148Ao.d) != null && ((Handler) c0148Ao.c) != null) {
                    ((Spatializer) c0148Ao.b).removeOnSpatializerStateChangedListener(c3309zo);
                    ((Handler) c0148Ao.c).removeCallbacksAndMessages(null);
                    c0148Ao.c = null;
                    c0148Ao.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = null;
        this.b = null;
    }

    @Override // defpackage.AbstractC1606iJ
    public final void b(S5 s5) {
        boolean equals;
        synchronized (this.c) {
            equals = this.h.equals(s5);
            this.h = s5;
        }
        if (!equals) {
            e();
        }
    }

    public final void e() {
        boolean z;
        C0979bt c0979bt;
        C0148Ao c0148Ao;
        synchronized (this.c) {
            try {
                if (this.f.v && !this.e && Ha0.a >= 32 && (c0148Ao = this.g) != null && c0148Ao.a) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z && (c0979bt = this.a) != null) {
            c0979bt.j.e(10);
        }
    }

    public final void g() {
        synchronized (this.c) {
            this.f.getClass();
        }
    }
}
