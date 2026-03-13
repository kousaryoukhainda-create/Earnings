package defpackage;

import io.flutter.plugins.webviewflutter.ResultCompat;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: r  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements Function1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        B90 asCompatCallback$lambda$0;
        switch (this.b) {
            case 0:
                if (obj == ((AbstractC2633s) this.c)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 1:
                return ((DJ) this.c).f(((Integer) obj).intValue());
            case 2:
                asCompatCallback$lambda$0 = ResultCompat.Companion.asCompatCallback$lambda$0((Function1) this.c, (JW) obj);
                return asCompatCallback$lambda$0;
            default:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((ArrayList) this.c).add(it);
                return B90.a;
        }
    }
}
