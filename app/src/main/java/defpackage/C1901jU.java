package defpackage;

import android.view.View;
import androidx.recyclerview.widget.i;
/* renamed from: jU  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1901jU {
    public static final C1901jU d = new C1901jU(0, 0, 0);
    public final /* synthetic */ int a;
    public int b;
    public int c;

    public /* synthetic */ C1901jU(int i) {
        this.a = i;
    }

    public int a() {
        int i = this.c;
        if (i != 2) {
            if (i != 5) {
                if (i != 29) {
                    if (i != 42) {
                        if (i != 22) {
                            if (i != 23) {
                                return 0;
                            }
                            return 15;
                        }
                        return 1073741824;
                    }
                    return 16;
                }
                return 12;
            }
            return 11;
        }
        return 10;
    }

    public void b(i iVar) {
        View view = iVar.itemView;
        this.b = view.getLeft();
        this.c = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(C1901jU.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.b);
                sb.append(", length = ");
                return AbstractC2437ph.k(sb, this.c, "]");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C1901jU(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
