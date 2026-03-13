package defpackage;
/* renamed from: Xa0  reason: default package */
/* loaded from: classes.dex */
public abstract class Xa0 extends Wa0 {
    public VQ[] a;
    public String b;
    public int c;

    public Xa0() {
        this.a = null;
        this.c = 0;
    }

    public VQ[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(VQ[] vqArr) {
        if (!AbstractC1281eb.j(this.a, vqArr)) {
            this.a = AbstractC1281eb.s(vqArr);
            return;
        }
        VQ[] vqArr2 = this.a;
        for (int i = 0; i < vqArr.length; i++) {
            vqArr2[i].a = vqArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = vqArr[i].b;
                if (i2 < fArr.length) {
                    vqArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public Xa0(Xa0 xa0) {
        this.a = null;
        this.c = 0;
        this.b = xa0.b;
        this.a = AbstractC1281eb.s(xa0.a);
    }
}
