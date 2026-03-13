package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class e {
    public C2407pK a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(i iVar) {
        int i = iVar.mFlags;
        if (!iVar.isInvalid() && (i & 4) == 0) {
            iVar.getOldPosition();
            iVar.getAdapterPosition();
        }
    }

    public abstract boolean a(i iVar, i iVar2, C1901jU c1901jU, C1901jU c1901jU2);

    public final void c(i iVar) {
        C2407pK c2407pK = this.a;
        if (c2407pK != null) {
            boolean z = true;
            iVar.setIsRecyclable(true);
            if (iVar.mShadowedHolder != null && iVar.mShadowingHolder == null) {
                iVar.mShadowedHolder = null;
            }
            iVar.mShadowingHolder = null;
            if (!iVar.shouldBeKeptAsChild()) {
                View view = iVar.itemView;
                RecyclerView recyclerView = (RecyclerView) c2407pK.c;
                recyclerView.b0();
                C3244z4 c3244z4 = recyclerView.g;
                Oc0 oc0 = (Oc0) c3244z4.c;
                int indexOfChild = ((RecyclerView) oc0.c).indexOfChild(view);
                if (indexOfChild == -1) {
                    c3244z4.i0(view);
                } else {
                    C2257nd c2257nd = (C2257nd) c3244z4.d;
                    if (c2257nd.G(indexOfChild)) {
                        c2257nd.I(indexOfChild);
                        c3244z4.i0(view);
                        oc0.l0(indexOfChild);
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    i H = RecyclerView.H(view);
                    g gVar = recyclerView.c;
                    gVar.j(H);
                    gVar.g(H);
                }
                recyclerView.c0(!z);
                if (!z && iVar.isTmpDetached()) {
                    recyclerView.removeDetachedView(iVar.itemView, false);
                }
            }
        }
    }

    public abstract void d(i iVar);

    public abstract void e();

    public abstract boolean f();
}
