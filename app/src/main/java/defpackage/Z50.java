package defpackage;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.regex.Pattern;
/* renamed from: Z50  reason: default package */
/* loaded from: classes.dex */
public final class Z50 {
    public static final Pattern d = Pattern.compile("\\s+");
    public static final AbstractC3001wD e = AbstractC3001wD.p(2, "auto", DevicePublicKeyStringDef.NONE);
    public static final AbstractC3001wD f = AbstractC3001wD.p(3, "dot", "sesame", "circle");
    public static final AbstractC3001wD g = AbstractC3001wD.p(2, "filled", "open");
    public static final AbstractC3001wD h = AbstractC3001wD.p(3, "after", "before", "outside");
    public final int a;
    public final int b;
    public final int c;

    public Z50(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
