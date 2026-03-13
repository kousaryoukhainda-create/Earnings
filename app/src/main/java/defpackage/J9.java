package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* renamed from: J9  reason: default package */
/* loaded from: classes.dex */
public abstract class J9 implements InterfaceC2217n6 {
    public C2045l6 b;
    public C2045l6 c;
    public C2045l6 d;
    public C2045l6 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public J9() {
        ByteBuffer byteBuffer = InterfaceC2217n6.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        C2045l6 c2045l6 = C2045l6.e;
        this.d = c2045l6;
        this.e = c2045l6;
        this.b = c2045l6;
        this.c = c2045l6;
    }

    @Override // defpackage.InterfaceC2217n6
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = InterfaceC2217n6.a;
        return byteBuffer;
    }

    @Override // defpackage.InterfaceC2217n6
    public final C2045l6 c(C2045l6 c2045l6) {
        this.d = c2045l6;
        this.e = f(c2045l6);
        if (isActive()) {
            return this.e;
        }
        return C2045l6.e;
    }

    @Override // defpackage.InterfaceC2217n6
    public final void d() {
        this.h = true;
        h();
    }

    @Override // defpackage.InterfaceC2217n6
    public boolean e() {
        if (this.h && this.g == InterfaceC2217n6.a) {
            return true;
        }
        return false;
    }

    public abstract C2045l6 f(C2045l6 c2045l6);

    @Override // defpackage.InterfaceC2217n6
    public final void flush() {
        this.g = InterfaceC2217n6.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        g();
    }

    @Override // defpackage.InterfaceC2217n6
    public boolean isActive() {
        if (this.e != C2045l6.e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer j(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.InterfaceC2217n6
    public final void reset() {
        flush();
        this.f = InterfaceC2217n6.a;
        C2045l6 c2045l6 = C2045l6.e;
        this.d = c2045l6;
        this.e = c2045l6;
        this.b = c2045l6;
        this.c = c2045l6;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
