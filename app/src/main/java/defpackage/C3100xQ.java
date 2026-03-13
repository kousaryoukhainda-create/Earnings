package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.f;
/* renamed from: xQ  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3100xQ extends AbstractC0695Vq {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3100xQ(f fVar, int i) {
        super(fVar);
        this.d = i;
    }

    @Override // defpackage.AbstractC0695Vq
    public final int b(View view) {
        switch (this.d) {
            case 0:
                ((f) this.b).getClass();
                return view.getRight() + ((C1189dV) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) ((C1189dV) view.getLayoutParams())).rightMargin;
            default:
                ((f) this.b).getClass();
                return view.getBottom() + ((C1189dV) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) ((C1189dV) view.getLayoutParams())).bottomMargin;
        }
    }

    @Override // defpackage.AbstractC0695Vq
    public final int c(View view) {
        switch (this.d) {
            case 0:
                C1189dV c1189dV = (C1189dV) view.getLayoutParams();
                ((f) this.b).getClass();
                Rect rect = ((C1189dV) view.getLayoutParams()).b;
                return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1189dV).leftMargin + ((ViewGroup.MarginLayoutParams) c1189dV).rightMargin;
            default:
                C1189dV c1189dV2 = (C1189dV) view.getLayoutParams();
                ((f) this.b).getClass();
                Rect rect2 = ((C1189dV) view.getLayoutParams()).b;
                return view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1189dV2).topMargin + ((ViewGroup.MarginLayoutParams) c1189dV2).bottomMargin;
        }
    }

    @Override // defpackage.AbstractC0695Vq
    public final int d(View view) {
        switch (this.d) {
            case 0:
                C1189dV c1189dV = (C1189dV) view.getLayoutParams();
                ((f) this.b).getClass();
                Rect rect = ((C1189dV) view.getLayoutParams()).b;
                return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1189dV).topMargin + ((ViewGroup.MarginLayoutParams) c1189dV).bottomMargin;
            default:
                C1189dV c1189dV2 = (C1189dV) view.getLayoutParams();
                ((f) this.b).getClass();
                Rect rect2 = ((C1189dV) view.getLayoutParams()).b;
                return view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c1189dV2).leftMargin + ((ViewGroup.MarginLayoutParams) c1189dV2).rightMargin;
        }
    }

    @Override // defpackage.AbstractC0695Vq
    public final int e(View view) {
        switch (this.d) {
            case 0:
                ((f) this.b).getClass();
                return (view.getLeft() - ((C1189dV) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) ((C1189dV) view.getLayoutParams())).leftMargin;
            default:
                ((f) this.b).getClass();
                return (view.getTop() - ((C1189dV) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) ((C1189dV) view.getLayoutParams())).topMargin;
        }
    }

    @Override // defpackage.AbstractC0695Vq
    public final int f() {
        switch (this.d) {
            case 0:
                return ((f) this.b).n;
            default:
                return ((f) this.b).o;
        }
    }

    @Override // defpackage.AbstractC0695Vq
    public final int g() {
        switch (this.d) {
            case 0:
                f fVar = (f) this.b;
                return fVar.n - fVar.B();
            default:
                f fVar2 = (f) this.b;
                return fVar2.o - fVar2.z();
        }
    }

    @Override // defpackage.AbstractC0695Vq
    public final int h() {
        switch (this.d) {
            case 0:
                return ((f) this.b).B();
            default:
                return ((f) this.b).z();
        }
    }

    @Override // defpackage.AbstractC0695Vq
    public final int i() {
        switch (this.d) {
            case 0:
                return ((f) this.b).l;
            default:
                return ((f) this.b).m;
        }
    }

    @Override // defpackage.AbstractC0695Vq
    public final int j() {
        switch (this.d) {
            case 0:
                return ((f) this.b).m;
            default:
                return ((f) this.b).l;
        }
    }

    @Override // defpackage.AbstractC0695Vq
    public final int k() {
        switch (this.d) {
            case 0:
                return ((f) this.b).A();
            default:
                return ((f) this.b).C();
        }
    }

    @Override // defpackage.AbstractC0695Vq
    public final int l() {
        switch (this.d) {
            case 0:
                f fVar = (f) this.b;
                return (fVar.n - fVar.A()) - fVar.B();
            default:
                f fVar2 = (f) this.b;
                return (fVar2.o - fVar2.C()) - fVar2.z();
        }
    }

    @Override // defpackage.AbstractC0695Vq
    public final int n(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.c;
                ((f) this.b).G(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.c;
                ((f) this.b).G(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // defpackage.AbstractC0695Vq
    public final int o(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.c;
                ((f) this.b).G(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.c;
                ((f) this.b).G(view, rect2);
                return rect2.top;
        }
    }

    @Override // defpackage.AbstractC0695Vq
    public final void p(int i) {
        switch (this.d) {
            case 0:
                ((f) this.b).K(i);
                return;
            default:
                ((f) this.b).L(i);
                return;
        }
    }
}
