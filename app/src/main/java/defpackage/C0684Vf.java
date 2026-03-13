package defpackage;

import android.util.Base64;
/* renamed from: Vf  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0684Vf implements X40 {
    public final /* synthetic */ int b;

    @Override // defpackage.X40
    public final Object get() {
        switch (this.b) {
            case 0:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object invoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    invoke.getClass();
                    return (InterfaceC2340ob0) invoke;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                byte[] bArr = new byte[12];
                C0888ao.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                return new C0614Sn();
            default:
                throw new IllegalStateException();
        }
    }
}
