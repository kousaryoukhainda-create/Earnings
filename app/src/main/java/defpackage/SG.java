package defpackage;

import android.view.View;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.i;
import java.util.List;
/* renamed from: SG  reason: default package */
/* loaded from: classes.dex */
public final class SG {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int layoutPosition;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((i) this.k.get(i2)).itemView;
            C1189dV c1189dV = (C1189dV) view3.getLayoutParams();
            if (view3 != view && !c1189dV.a.isRemoved() && (layoutPosition = (c1189dV.a.getLayoutPosition() - this.d) * this.e) >= 0 && layoutPosition < i) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                }
                i = layoutPosition;
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((C1189dV) view2.getLayoutParams()).a.getLayoutPosition();
        }
    }

    public final View b(g gVar) {
        List list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((i) this.k.get(i)).itemView;
                C1189dV c1189dV = (C1189dV) view.getLayoutParams();
                if (!c1189dV.a.isRemoved() && this.d == c1189dV.a.getLayoutPosition()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = gVar.i(this.d, Long.MAX_VALUE).itemView;
        this.d += this.e;
        return view2;
    }
}
