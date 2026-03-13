package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* renamed from: n6  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2217n6 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    void b(ByteBuffer byteBuffer);

    C2045l6 c(C2045l6 c2045l6);

    void d();

    boolean e();

    void flush();

    boolean isActive();

    void reset();
}
