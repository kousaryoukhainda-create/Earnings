package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
/* renamed from: NN  reason: default package */
/* loaded from: classes.dex */
public final class NN {
    public ViewParent a;
    public ViewParent b;
    public final ViewGroup c;
    public boolean d;
    public int[] e;

    public NN(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    public final boolean a(float f, float f2, boolean z) {
        ViewParent e;
        if (!this.d || (e = e(0)) == null) {
            return false;
        }
        try {
            return AbstractC1542hc0.a(e, this.c, f, f2, z);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public final boolean b(float f, float f2) {
        ViewParent e;
        if (!this.d || (e = e(0)) == null) {
            return false;
        }
        try {
            return AbstractC1542hc0.b(e, this.c, f, f2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public final boolean c(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent e;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.d || (e = e(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            iArr3 = this.e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e instanceof ON) {
            ((ON) e).f(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                AbstractC1542hc0.c(e, viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final boolean d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent e;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.d || (e = e(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr4 = this.e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (e instanceof PN) {
            ((PN) e).b(viewGroup, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (e instanceof ON) {
                ((ON) e).c(viewGroup, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    AbstractC1542hc0.d(e, viewGroup, i, i2, i3, i4);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedScroll", e2);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final ViewParent e(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.b;
        }
        return this.a;
    }

    public final boolean f(int i) {
        if (e(i) != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i, int i2) {
        boolean f;
        if (f(i2)) {
            return true;
        }
        if (this.d) {
            View view = this.c;
            ViewParent parent = view.getParent();
            View view2 = view;
            while (parent != null) {
                boolean z = parent instanceof ON;
                if (z) {
                    f = ((ON) parent).d(view2, view, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            f = AbstractC1542hc0.f(parent, view2, view, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        }
                    }
                    f = false;
                }
                if (f) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            this.b = parent;
                        }
                    } else {
                        this.a = parent;
                    }
                    if (z) {
                        ((ON) parent).e(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            AbstractC1542hc0.e(parent, view2, view, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
                parent = parent.getParent();
                view2 = view2;
            }
        }
        return false;
    }

    public final void h(int i) {
        ViewParent e = e(i);
        if (e != null) {
            boolean z = e instanceof ON;
            ViewGroup viewGroup = this.c;
            if (z) {
                ((ON) e).a(i, viewGroup);
            } else if (i == 0) {
                try {
                    AbstractC1542hc0.g(e, viewGroup);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i != 0) {
                if (i == 1) {
                    this.b = null;
                    return;
                }
                return;
            }
            this.a = null;
        }
    }
}
