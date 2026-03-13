package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Log;
import android.view.View;
import androidx.media3.common.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: Xa  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0731Xa implements InterfaceC0988c1, EK, BY {
    public int b;
    public Object c;

    public /* synthetic */ C0731Xa(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.BY
    public void a() {
        C0216De c0216De = ((CX) this.c).n;
        if (c0216De == null) {
            return;
        }
        throw c0216De;
    }

    @Override // defpackage.InterfaceC0988c1
    public boolean b(View view) {
        ((BottomSheetBehavior) this.c).z(this.b);
        return true;
    }

    @Override // defpackage.EK
    public MediaCodecInfo c(int i) {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c)[i];
    }

    public void d(long j) {
        int i = this.b;
        long[] jArr = (long[]) this.c;
        if (i == jArr.length) {
            this.c = Arrays.copyOf(jArr, i * 2);
        }
        int i2 = this.b;
        this.b = i2 + 1;
        ((long[]) this.c)[i2] = j;
    }

    public void e(AbstractC2007kh abstractC2007kh) {
        int i = this.b;
        int i2 = i >> 7;
        int i3 = i & 127;
        AbstractC2007kh[][] abstractC2007khArr = (AbstractC2007kh[][]) this.c;
        int length = abstractC2007khArr.length;
        if (i2 >= length) {
            AbstractC2007kh[][] abstractC2007khArr2 = new AbstractC2007kh[length + 8];
            System.arraycopy(abstractC2007khArr, 0, abstractC2007khArr2, 0, length);
            this.c = abstractC2007khArr2;
        }
        AbstractC2007kh[][] abstractC2007khArr3 = (AbstractC2007kh[][]) this.c;
        if (abstractC2007khArr3[i2] == null) {
            abstractC2007khArr3[i2] = new AbstractC2007kh[UserVerificationMethods.USER_VERIFY_PATTERN];
        }
        abstractC2007khArr3[i2][i3] = abstractC2007kh;
        this.b++;
    }

    public void f(int i, int[] iArr, int[] iArr2) {
        this.b++;
        int length = iArr.length;
        ((ByteArrayOutputStream) this.c).write(length + 251);
        x(i);
        for (int i2 = 0; i2 < length; i2++) {
            y(iArr[i2], iArr2[i2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.E80 g(int r6, defpackage.C1611iO r7) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0731Xa.g(int, iO):E80");
    }

    @Override // defpackage.EK
    public boolean h(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public AbstractC2007kh i(int i) {
        if (i >= 0 && this.b > i) {
            return ((AbstractC2007kh[][]) this.c)[i >> 7][i & 127];
        }
        return null;
    }

    @Override // defpackage.BY
    public boolean isReady() {
        CX cx = (CX) this.c;
        if (!cx.s) {
            BX bx = (BX) cx.g.get(this.b);
            if (bx.c.w(bx.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.BY
    public int j(long j) {
        CX cx = (CX) this.c;
        if (cx.s) {
            return -3;
        }
        BX bx = (BX) cx.g.get(this.b);
        AY ay = bx.c;
        int t = ay.t(j, bx.d);
        ay.H(t);
        return t;
    }

    public void k(int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.b++;
        ((ByteArrayOutputStream) this.c).write(255);
        x(i);
        int length = iArr.length;
        x(length);
        for (int i2 = 0; i2 < length; i2++) {
            y(iArr[i2], iArr2[i2]);
        }
        int length2 = iArr3.length;
        x(length2);
        for (int i3 = 0; i3 < length2; i3++) {
            y(iArr3[i3], iArr4[i3]);
        }
    }

    @Override // defpackage.EK
    public boolean l(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // defpackage.EK
    public int m() {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c).length;
    }

    public long n(int i) {
        if (i >= 0 && i < this.b) {
            return ((long[]) this.c)[i];
        }
        StringBuilder i2 = AbstractC0324Hi.i(i, "Invalid index ", ", size is ");
        i2.append(this.b);
        throw new IndexOutOfBoundsException(i2.toString());
    }

    @Override // defpackage.EK
    public boolean o() {
        return true;
    }

    public List p(C1611iO c1611iO) {
        boolean z;
        String str;
        int i;
        List list;
        boolean s = s(32);
        List list2 = (List) this.c;
        if (s) {
            return list2;
        }
        NQ nq = new NQ((byte[]) c1611iO.d);
        while (nq.a() > 0) {
            int u = nq.u();
            int u2 = nq.b + nq.u();
            if (u == 134) {
                ArrayList arrayList = new ArrayList();
                int u3 = nq.u() & 31;
                for (int i2 = 0; i2 < u3; i2++) {
                    String s2 = nq.s(3, AbstractC1629id.c);
                    int u4 = nq.u();
                    if ((u4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = u4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte u5 = (byte) nq.u();
                    nq.H(1);
                    if (z) {
                        list = Collections.singletonList((u5 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C2717sy c2717sy = new C2717sy();
                    c2717sy.l = UM.l(str);
                    c2717sy.d = s2;
                    c2717sy.E = i;
                    c2717sy.o = list;
                    arrayList.add(new b(c2717sy));
                }
                list2 = arrayList;
            }
            nq.G(u2);
        }
        return list2;
    }

    public synchronized List q() {
        return Collections.unmodifiableList(new ArrayList((ArrayList) this.c));
    }

    @Override // defpackage.BY
    public int r(C0647Tu c0647Tu, C3134xm c3134xm, int i) {
        CX cx = (CX) this.c;
        if (cx.s) {
            return -3;
        }
        BX bx = (BX) cx.g.get(this.b);
        return bx.c.B(c0647Tu, c3134xm, i, bx.d);
    }

    public boolean s(int i) {
        if ((i & this.b) != 0) {
            return true;
        }
        return false;
    }

    public long t(C2277nn c2277nn) {
        NQ nq = (NQ) this.c;
        int i = 0;
        c2277nn.m(nq.a, 0, 1, false);
        int i2 = nq.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = UserVerificationMethods.USER_VERIFY_PATTERN;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        c2277nn.m(nq.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (nq.a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    public void u(int i) {
        this.b++;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.c;
        if (i < 64) {
            byteArrayOutputStream.write(i);
            return;
        }
        byteArrayOutputStream.write(251);
        x(i);
    }

    public void v(int i, int i2, int i3) {
        this.b++;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.c;
        if (i < 64) {
            byteArrayOutputStream.write(i + 64);
        } else {
            byteArrayOutputStream.write(247);
            x(i);
        }
        y(i2, i3);
    }

    public synchronized boolean w(List list) {
        ((ArrayList) this.c).clear();
        if (list.size() > this.b) {
            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.b, null);
            return ((ArrayList) this.c).addAll(list.subList(0, this.b));
        }
        return ((ArrayList) this.c).addAll(list);
    }

    public void x(int i) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.c;
        byteArrayOutputStream.write((i >>> 8) & 255);
        byteArrayOutputStream.write(i & 255);
    }

    public void y(int i, int i2) {
        ((ByteArrayOutputStream) this.c).write(i);
        if (i == 7 || i == 8) {
            x(i2);
        }
    }

    public /* synthetic */ C0731Xa(Object obj, int i) {
        this.c = obj;
        this.b = i;
    }

    public C0731Xa(int i, boolean z) {
        switch (i) {
            case 9:
                this.c = new ArrayList();
                this.b = UserVerificationMethods.USER_VERIFY_PATTERN;
                return;
            case 10:
            default:
                this.c = new long[32];
                return;
            case 11:
                this.c = new NQ(8);
                return;
        }
    }

    public C0731Xa(int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        this.c = byteArrayOutputStream;
        this.b = 0;
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
    }
}
