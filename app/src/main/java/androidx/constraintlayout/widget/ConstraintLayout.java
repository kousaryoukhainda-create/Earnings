package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static C2809u10 t;
    public final SparseArray b;
    public final ArrayList c;
    public final C0452Mh d;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public C0375Jh l;
    public C0750Xt m;
    public int n;
    public HashMap o;
    public final SparseArray p;
    public final C0141Ah q;
    public int r;
    public int s;

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new SparseArray();
        this.c = new ArrayList(4);
        this.d = new C0452Mh();
        this.f = 0;
        this.g = 0;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
        this.j = true;
        this.k = 257;
        this.l = null;
        this.m = null;
        this.n = -1;
        this.o = new HashMap();
        this.p = new SparseArray();
        this.q = new C0141Ah(this, this);
        this.r = 0;
        this.s = 0;
        i(attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, zh] */
    public static C3296zh g() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.a = -1;
        marginLayoutParams.b = -1;
        marginLayoutParams.c = -1.0f;
        marginLayoutParams.d = true;
        marginLayoutParams.e = -1;
        marginLayoutParams.f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.k = -1;
        marginLayoutParams.l = -1;
        marginLayoutParams.m = -1;
        marginLayoutParams.n = -1;
        marginLayoutParams.o = -1;
        marginLayoutParams.p = -1;
        marginLayoutParams.q = 0;
        marginLayoutParams.r = 0.0f;
        marginLayoutParams.s = -1;
        marginLayoutParams.t = -1;
        marginLayoutParams.u = -1;
        marginLayoutParams.v = -1;
        marginLayoutParams.w = Integer.MIN_VALUE;
        marginLayoutParams.x = Integer.MIN_VALUE;
        marginLayoutParams.y = Integer.MIN_VALUE;
        marginLayoutParams.z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = Integer.MIN_VALUE;
        marginLayoutParams.D = 0;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 0;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = 1.0f;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = -1;
        marginLayoutParams.W = false;
        marginLayoutParams.X = false;
        marginLayoutParams.Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.a0 = true;
        marginLayoutParams.b0 = true;
        marginLayoutParams.c0 = false;
        marginLayoutParams.d0 = false;
        marginLayoutParams.e0 = false;
        marginLayoutParams.f0 = -1;
        marginLayoutParams.g0 = -1;
        marginLayoutParams.h0 = -1;
        marginLayoutParams.i0 = -1;
        marginLayoutParams.j0 = Integer.MIN_VALUE;
        marginLayoutParams.k0 = Integer.MIN_VALUE;
        marginLayoutParams.l0 = 0.5f;
        marginLayoutParams.p0 = new C0427Lh();
        return marginLayoutParams;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [u10, java.lang.Object] */
    public static C2809u10 getSharedValues() {
        if (t == null) {
            ?? obj = new Object();
            new SparseIntArray();
            new HashMap();
            t = obj;
        }
        return t;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3296zh;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC3124xh) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.j = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object, zh] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.a = -1;
        marginLayoutParams.b = -1;
        marginLayoutParams.c = -1.0f;
        marginLayoutParams.d = true;
        marginLayoutParams.e = -1;
        marginLayoutParams.f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.k = -1;
        marginLayoutParams.l = -1;
        marginLayoutParams.m = -1;
        marginLayoutParams.n = -1;
        marginLayoutParams.o = -1;
        marginLayoutParams.p = -1;
        marginLayoutParams.q = 0;
        marginLayoutParams.r = 0.0f;
        marginLayoutParams.s = -1;
        marginLayoutParams.t = -1;
        marginLayoutParams.u = -1;
        marginLayoutParams.v = -1;
        marginLayoutParams.w = Integer.MIN_VALUE;
        marginLayoutParams.x = Integer.MIN_VALUE;
        marginLayoutParams.y = Integer.MIN_VALUE;
        marginLayoutParams.z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = Integer.MIN_VALUE;
        marginLayoutParams.D = 0;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 0;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = 1.0f;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = -1;
        marginLayoutParams.W = false;
        marginLayoutParams.X = false;
        marginLayoutParams.Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.a0 = true;
        marginLayoutParams.b0 = true;
        marginLayoutParams.c0 = false;
        marginLayoutParams.d0 = false;
        marginLayoutParams.e0 = false;
        marginLayoutParams.f0 = -1;
        marginLayoutParams.g0 = -1;
        marginLayoutParams.h0 = -1;
        marginLayoutParams.i0 = -1;
        marginLayoutParams.j0 = Integer.MIN_VALUE;
        marginLayoutParams.k0 = Integer.MIN_VALUE;
        marginLayoutParams.l0 = 0.5f;
        marginLayoutParams.p0 = new C0427Lh();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2503qU.b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = AbstractC3210yh.a.get(index);
            switch (i2) {
                case 1:
                    marginLayoutParams.V = obtainStyledAttributes.getInt(index, marginLayoutParams.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.p);
                    marginLayoutParams.p = resourceId;
                    if (resourceId == -1) {
                        marginLayoutParams.p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    marginLayoutParams.q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.q);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, marginLayoutParams.r) % 360.0f;
                    marginLayoutParams.r = f;
                    if (f < 0.0f) {
                        marginLayoutParams.r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    marginLayoutParams.a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.a);
                    break;
                case 6:
                    marginLayoutParams.b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.b);
                    break;
                case 7:
                    marginLayoutParams.c = obtainStyledAttributes.getFloat(index, marginLayoutParams.c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.e);
                    marginLayoutParams.e = resourceId2;
                    if (resourceId2 == -1) {
                        marginLayoutParams.e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f);
                    marginLayoutParams.f = resourceId3;
                    if (resourceId3 == -1) {
                        marginLayoutParams.f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.g);
                    marginLayoutParams.g = resourceId4;
                    if (resourceId4 == -1) {
                        marginLayoutParams.g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.h);
                    marginLayoutParams.h = resourceId5;
                    if (resourceId5 == -1) {
                        marginLayoutParams.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.i);
                    marginLayoutParams.i = resourceId6;
                    if (resourceId6 == -1) {
                        marginLayoutParams.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.j);
                    marginLayoutParams.j = resourceId7;
                    if (resourceId7 == -1) {
                        marginLayoutParams.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.k);
                    marginLayoutParams.k = resourceId8;
                    if (resourceId8 == -1) {
                        marginLayoutParams.k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.l);
                    marginLayoutParams.l = resourceId9;
                    if (resourceId9 == -1) {
                        marginLayoutParams.l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.m);
                    marginLayoutParams.m = resourceId10;
                    if (resourceId10 == -1) {
                        marginLayoutParams.m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.s);
                    marginLayoutParams.s = resourceId11;
                    if (resourceId11 == -1) {
                        marginLayoutParams.s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.t);
                    marginLayoutParams.t = resourceId12;
                    if (resourceId12 == -1) {
                        marginLayoutParams.t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.u);
                    marginLayoutParams.u = resourceId13;
                    if (resourceId13 == -1) {
                        marginLayoutParams.u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.v);
                    marginLayoutParams.v = resourceId14;
                    if (resourceId14 == -1) {
                        marginLayoutParams.v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    marginLayoutParams.w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.w);
                    break;
                case 22:
                    marginLayoutParams.x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.x);
                    break;
                case 23:
                    marginLayoutParams.y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.y);
                    break;
                case 24:
                    marginLayoutParams.z = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.z);
                    break;
                case 25:
                    marginLayoutParams.A = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A);
                    break;
                case 26:
                    marginLayoutParams.B = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.B);
                    break;
                case 27:
                    marginLayoutParams.W = obtainStyledAttributes.getBoolean(index, marginLayoutParams.W);
                    break;
                case 28:
                    marginLayoutParams.X = obtainStyledAttributes.getBoolean(index, marginLayoutParams.X);
                    break;
                case 29:
                    marginLayoutParams.E = obtainStyledAttributes.getFloat(index, marginLayoutParams.E);
                    break;
                case 30:
                    marginLayoutParams.F = obtainStyledAttributes.getFloat(index, marginLayoutParams.F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.N = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.N) == -2) {
                            marginLayoutParams.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.P = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.P) == -2) {
                            marginLayoutParams.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.R));
                    marginLayoutParams.L = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.O = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.O) == -2) {
                            marginLayoutParams.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.Q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.Q) == -2) {
                            marginLayoutParams.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.S));
                    marginLayoutParams.M = 2;
                    break;
                default:
                    switch (i2) {
                        case TokenParametersOuterClass$TokenParameters.BATTERYLEVEL_FIELD_NUMBER /* 44 */:
                            C0375Jh.h(marginLayoutParams, obtainStyledAttributes.getString(index));
                            continue;
                        case TokenParametersOuterClass$TokenParameters.HEADSETPLUGGED_FIELD_NUMBER /* 45 */:
                            marginLayoutParams.H = obtainStyledAttributes.getFloat(index, marginLayoutParams.H);
                            continue;
                        case TokenParametersOuterClass$TokenParameters.BLUETOOTHPLUGGED_FIELD_NUMBER /* 46 */:
                            marginLayoutParams.I = obtainStyledAttributes.getFloat(index, marginLayoutParams.I);
                            continue;
                        case TokenParametersOuterClass$TokenParameters.FREESPACE_FIELD_NUMBER /* 47 */:
                            marginLayoutParams.J = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER /* 48 */:
                            marginLayoutParams.K = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case TokenParametersOuterClass$TokenParameters.DARKMODE_FIELD_NUMBER /* 49 */:
                            marginLayoutParams.T = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.T);
                            continue;
                        case 50:
                            marginLayoutParams.U = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.U);
                            continue;
                        case TokenParametersOuterClass$TokenParameters.DNDMODE_FIELD_NUMBER /* 51 */:
                            marginLayoutParams.Y = obtainStyledAttributes.getString(index);
                            continue;
                        case TokenParametersOuterClass$TokenParameters.ISRINGMUTED_FIELD_NUMBER /* 52 */:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.n);
                            marginLayoutParams.n = resourceId15;
                            if (resourceId15 == -1) {
                                marginLayoutParams.n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                continue;
                            }
                        case TokenParametersOuterClass$TokenParameters.AMAZONID_FIELD_NUMBER /* 53 */:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.o);
                            marginLayoutParams.o = resourceId16;
                            if (resourceId16 == -1) {
                                marginLayoutParams.o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                continue;
                            }
                        case TokenParametersOuterClass$TokenParameters.AAID_FIELD_NUMBER /* 54 */:
                            marginLayoutParams.D = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.D);
                            continue;
                        case TokenParametersOuterClass$TokenParameters.APPBUILDVERSION_FIELD_NUMBER /* 55 */:
                            marginLayoutParams.C = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.C);
                            continue;
                        default:
                            switch (i2) {
                                case 64:
                                    C0375Jh.g(marginLayoutParams, obtainStyledAttributes, index, 0);
                                    continue;
                                case 65:
                                    C0375Jh.g(marginLayoutParams, obtainStyledAttributes, index, 1);
                                    continue;
                                case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                                    marginLayoutParams.Z = obtainStyledAttributes.getInt(index, marginLayoutParams.Z);
                                    continue;
                                case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                                    marginLayoutParams.d = obtainStyledAttributes.getBoolean(index, marginLayoutParams.d);
                                    continue;
                                    continue;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.i;
    }

    public int getMaxWidth() {
        return this.h;
    }

    public int getMinHeight() {
        return this.g;
    }

    public int getMinWidth() {
        return this.f;
    }

    public int getOptimizationLevel() {
        return this.d.C0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C0452Mh c0452Mh = this.d;
        if (c0452Mh.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c0452Mh.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c0452Mh.j = "parent";
            }
        }
        if (c0452Mh.g0 == null) {
            c0452Mh.g0 = c0452Mh.j;
            Log.v("ConstraintLayout", " setDebugName " + c0452Mh.g0);
        }
        Iterator it = c0452Mh.p0.iterator();
        while (it.hasNext()) {
            C0427Lh c0427Lh = (C0427Lh) it.next();
            View view = c0427Lh.e0;
            if (view != null) {
                if (c0427Lh.j == null && (id = view.getId()) != -1) {
                    c0427Lh.j = getContext().getResources().getResourceEntryName(id);
                }
                if (c0427Lh.g0 == null) {
                    c0427Lh.g0 = c0427Lh.j;
                    Log.v("ConstraintLayout", " setDebugName " + c0427Lh.g0);
                }
            }
        }
        c0452Mh.l(sb);
        return sb.toString();
    }

    public final C0427Lh h(View view) {
        if (view == this) {
            return this.d;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof C3296zh) {
                return ((C3296zh) view.getLayoutParams()).p0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof C3296zh) {
                return ((C3296zh) view.getLayoutParams()).p0;
            }
            return null;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        C0452Mh c0452Mh = this.d;
        c0452Mh.e0 = this;
        C0141Ah c0141Ah = this.q;
        c0452Mh.t0 = c0141Ah;
        c0452Mh.r0.f = c0141Ah;
        this.b.put(getId(), this);
        this.l = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2503qU.b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == 17) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == 14) {
                    this.h = obtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                } else if (index == 15) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(index, this.i);
                } else if (index == 113) {
                    this.k = obtainStyledAttributes.getInt(index, this.k);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.m = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0375Jh c0375Jh = new C0375Jh();
                        this.l = c0375Jh;
                        c0375Jh.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.l = null;
                    }
                    this.n = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c0452Mh.C0 = this.k;
        UG.p = c0452Mh.S(512);
    }

    public final void j(int i) {
        int eventType;
        C3013wP c3013wP;
        Context context = getContext();
        C0750Xt c0750Xt = new C0750Xt(13, (char) 0);
        c0750Xt.c = new SparseArray();
        c0750Xt.d = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            c3013wP = null;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
        while (true) {
            char c = 1;
            if (eventType != 1) {
                if (eventType != 0) {
                    if (eventType != 2) {
                        continue;
                    } else {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 80204913:
                                if (name.equals("State")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1657696882:
                                if (name.equals("layoutDescription")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c != 2) {
                            if (c != 3) {
                                if (c != 4) {
                                    continue;
                                } else {
                                    c0750Xt.q(context, xml);
                                    continue;
                                }
                            } else {
                                C0167Bh c0167Bh = new C0167Bh(context, xml);
                                if (c3013wP != null) {
                                    ((ArrayList) c3013wP.c).add(c0167Bh);
                                    continue;
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            c3013wP = new C3013wP(context, xml);
                            ((SparseArray) c0750Xt.c).put(c3013wP.a, c3013wP);
                            continue;
                        }
                    }
                } else {
                    xml.getName();
                    continue;
                }
                eventType = xml.next();
            } else {
                this.m = c0750Xt;
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x04d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.C0452Mh r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(Mh, int, int, int):void");
    }

    public final void l(C0427Lh c0427Lh, C3296zh c3296zh, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.b.get(i);
        C0427Lh c0427Lh2 = (C0427Lh) sparseArray.get(i);
        if (c0427Lh2 != null && view != null && (view.getLayoutParams() instanceof C3296zh)) {
            c3296zh.c0 = true;
            if (i2 == 6) {
                C3296zh c3296zh2 = (C3296zh) view.getLayoutParams();
                c3296zh2.c0 = true;
                c3296zh2.p0.E = true;
            }
            c0427Lh.g(6).a(c0427Lh2.g(i2), c3296zh.D, c3296zh.C);
            c0427Lh.E = true;
            c0427Lh.g(3).g();
            c0427Lh.g(5).g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C3296zh c3296zh = (C3296zh) childAt.getLayoutParams();
            C0427Lh c0427Lh = c3296zh.p0;
            if (childAt.getVisibility() != 8 || c3296zh.d0 || c3296zh.e0 || isInEditMode) {
                int p = c0427Lh.p();
                int q = c0427Lh.q();
                childAt.layout(p, q, c0427Lh.o() + p, c0427Lh.i() + q);
            }
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC3124xh) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0421  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 1557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0427Lh h = h(view);
        if ((view instanceof Guideline) && !(h instanceof C1169dB)) {
            C3296zh c3296zh = (C3296zh) view.getLayoutParams();
            C1169dB c1169dB = new C1169dB();
            c3296zh.p0 = c1169dB;
            c3296zh.d0 = true;
            c1169dB.O(c3296zh.V);
        }
        if (view instanceof AbstractC3124xh) {
            AbstractC3124xh abstractC3124xh = (AbstractC3124xh) view;
            abstractC3124xh.e();
            ((C3296zh) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.c;
            if (!arrayList.contains(abstractC3124xh)) {
                arrayList.add(abstractC3124xh);
            }
        }
        this.b.put(view.getId(), view);
        this.j = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.b.remove(view.getId());
        C0427Lh h = h(view);
        this.d.p0.remove(h);
        h.A();
        this.c.remove(view);
        this.j = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.j = true;
        super.requestLayout();
    }

    public void setConstraintSet(C0375Jh c0375Jh) {
        this.l = c0375Jh;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.b;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.h) {
            return;
        }
        this.h = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0504Oh abstractC0504Oh) {
        C0750Xt c0750Xt = this.m;
        if (c0750Xt != null) {
            c0750Xt.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.k = i;
        C0452Mh c0452Mh = this.d;
        c0452Mh.C0 = i;
        UG.p = c0452Mh.S(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new SparseArray();
        this.c = new ArrayList(4);
        this.d = new C0452Mh();
        this.f = 0;
        this.g = 0;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
        this.j = true;
        this.k = 257;
        this.l = null;
        this.m = null;
        this.n = -1;
        this.o = new HashMap();
        this.p = new SparseArray();
        this.q = new C0141Ah(this, this);
        this.r = 0;
        this.s = 0;
        i(attributeSet, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, zh] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.a = -1;
        marginLayoutParams.b = -1;
        marginLayoutParams.c = -1.0f;
        marginLayoutParams.d = true;
        marginLayoutParams.e = -1;
        marginLayoutParams.f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.k = -1;
        marginLayoutParams.l = -1;
        marginLayoutParams.m = -1;
        marginLayoutParams.n = -1;
        marginLayoutParams.o = -1;
        marginLayoutParams.p = -1;
        marginLayoutParams.q = 0;
        marginLayoutParams.r = 0.0f;
        marginLayoutParams.s = -1;
        marginLayoutParams.t = -1;
        marginLayoutParams.u = -1;
        marginLayoutParams.v = -1;
        marginLayoutParams.w = Integer.MIN_VALUE;
        marginLayoutParams.x = Integer.MIN_VALUE;
        marginLayoutParams.y = Integer.MIN_VALUE;
        marginLayoutParams.z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = Integer.MIN_VALUE;
        marginLayoutParams.D = 0;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 0;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = 1.0f;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = -1;
        marginLayoutParams.W = false;
        marginLayoutParams.X = false;
        marginLayoutParams.Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.a0 = true;
        marginLayoutParams.b0 = true;
        marginLayoutParams.c0 = false;
        marginLayoutParams.d0 = false;
        marginLayoutParams.e0 = false;
        marginLayoutParams.f0 = -1;
        marginLayoutParams.g0 = -1;
        marginLayoutParams.h0 = -1;
        marginLayoutParams.i0 = -1;
        marginLayoutParams.j0 = Integer.MIN_VALUE;
        marginLayoutParams.k0 = Integer.MIN_VALUE;
        marginLayoutParams.l0 = 0.5f;
        marginLayoutParams.p0 = new C0427Lh();
        return marginLayoutParams;
    }
}
