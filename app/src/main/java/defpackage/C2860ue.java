package defpackage;

import android.media.MediaCodec;
import java.util.ArrayList;
/* renamed from: ue  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2860ue {
    public int a;
    public int b;
    public int c;
    public int d;
    public Cloneable e;
    public Object f;
    public Object g;
    public Object h;
    public final Object i;
    public final Object j;

    public C2860ue() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = Ha0.a >= 24 ? new C0750Xt(cryptoInfo) : null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [K30, java.lang.Object, w3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Ae, O30] */
    public void a(int i, int i2, boolean z) {
        int i3 = this.a;
        if (i < i3 || (i == i3 && z)) {
            this.a = i3 + i2;
        }
        int i4 = this.c;
        if (i < i4 || (i == i4 && z)) {
            this.c = i4 + i2;
        }
        int i5 = this.d;
        if (i < i5 || (i == i5 && z)) {
            this.d = i5 + i2;
        }
        int i6 = this.b;
        if (i < i6 || (i == i6 && z)) {
            this.b = i6 + i2;
        }
        ((C1938js) this.e).c(i, i2, z);
        OG og = (OG) this.f;
        if (og != null) {
            og.j(i, i2, z);
        }
        C1433gI c1433gI = (C1433gI) this.g;
        if (c1433gI != null) {
            c1433gI.k(i, i2, z);
        }
        C1433gI c1433gI2 = (C1433gI) this.h;
        if (c1433gI2 != null) {
            c1433gI2.k(i, i2, z);
        }
        R30 r30 = (R30) this.i;
        if (r30 != null) {
            ?? abstractC0138Ae = new AbstractC0138Ae(r30.d);
            abstractC0138Ae.c = i;
            abstractC0138Ae.d = i2;
            abstractC0138Ae.h();
            P30 p30 = new P30(r30, i, i2, z);
            p30.h();
            byte[] bArr = p30.g;
            if (bArr != null) {
                p30.c.d = bArr;
            }
        }
        M30 m30 = (M30) this.j;
        if (m30 != null) {
            ?? obj = new Object();
            obj.a = m30.d;
            obj.b = i;
            obj.c = i2;
            obj.d = z;
            obj.p();
        }
    }

    public C2860ue(int i, int i2, int i3, int i4, C1938js c1938js, C2173me c2173me) {
        this.a = i;
        this.c = i2;
        this.d = i3;
        this.b = i4;
        this.e = c1938js;
        this.f = (OG) P5.e("LineNumberTable", c2173me.i);
        ArrayList arrayList = c2173me.i;
        this.g = (C1433gI) P5.e("LocalVariableTable", arrayList);
        this.h = (C1433gI) P5.e("LocalVariableTypeTable", arrayList);
        this.i = (R30) P5.e("StackMapTable", arrayList);
        this.j = (M30) P5.e("StackMap", arrayList);
    }
}
