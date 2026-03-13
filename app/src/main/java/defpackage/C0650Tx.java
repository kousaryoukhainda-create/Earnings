package defpackage;

import com.applovin.impl.sdk.ad.a;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.tl;
import io.flutter.embedding.android.FlutterView;
/* renamed from: Tx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0650Tx implements InterfaceC0608Sh {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0650Tx(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC0608Sh
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((FlutterView) this.b).setWindowInfoListenerDisplayFeatures((Ud0) obj);
                return;
            case 1:
                ((C1986kT) ((InterfaceC2072lT) this.b)).e((Ud0) obj);
                return;
            case 2:
                a.k1((a) this.b, (tl) obj);
                return;
            default:
                b.a((String) this.b, (tl) obj);
                return;
        }
    }
}
