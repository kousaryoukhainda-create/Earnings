package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.ArrayList;
/* renamed from: wP  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3013wP implements K5 {
    public static final byte[] d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Ascii.FS, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, Ascii.VT, -103, 87, 83, 1, Ascii.DLE, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public static final long[] f = {128, 64, 32, 16, 8, 4, 2, 1};
    public int a;
    public int b;
    public Object c;

    public C3013wP() {
        this.c = new byte[8];
    }

    public static long d(boolean z, int i, byte[] bArr) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static int e(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            if ((f[i2] & i) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    public static void g(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byte b;
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        boolean z2 = false;
        byteBuffer.put((byte) 0);
        if (z) {
            b = 2;
        } else {
            b = 0;
        }
        byteBuffer.put(b);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        long j2 = i2;
        if ((j2 >> 8) == 0) {
            z2 = true;
        }
        B10.k(z2, "out of range: %s", j2);
        byteBuffer.put((byte) j2);
    }

    @Override // defpackage.K5
    public int a() {
        return this.a;
    }

    @Override // defpackage.K5
    public int b() {
        return this.b;
    }

    @Override // defpackage.K5
    public int c() {
        int i = this.a;
        if (i == -1) {
            return ((NQ) this.c).y();
        }
        return i;
    }

    public long f(C2277nn c2277nn, boolean z, boolean z2, int i) {
        int i2 = this.a;
        byte[] bArr = (byte[]) this.c;
        if (i2 == 0) {
            if (!c2277nn.c(bArr, 0, 1, z)) {
                return -1L;
            }
            int e2 = e(bArr[0] & 255);
            this.b = e2;
            if (e2 != -1) {
                this.a = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i3 = this.b;
        if (i3 > i) {
            this.a = 0;
            return -2L;
        }
        if (i3 != 1) {
            c2277nn.c(bArr, 1, i3 - 1, false);
        }
        this.a = 0;
        return d(z2, this.b, bArr);
    }

    public C3013wP(Context context, XmlResourceParser xmlResourceParser) {
        this.c = new ArrayList();
        this.b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC2503qU.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.b);
                this.b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0375Jh().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
