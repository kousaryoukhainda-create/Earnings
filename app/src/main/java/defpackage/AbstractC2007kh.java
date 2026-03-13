package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;
/* renamed from: kh  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2007kh {
    public final int a;

    public AbstractC2007kh(int i) {
        this.a = i;
    }

    public abstract int a(L5 l5, L5 l52, Map map);

    public abstract int b();

    public abstract void c(PrintWriter printWriter);

    public abstract void d(DataOutputStream dataOutputStream);

    public final String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c(new PrintWriter(byteArrayOutputStream));
        return byteArrayOutputStream.toString();
    }
}
