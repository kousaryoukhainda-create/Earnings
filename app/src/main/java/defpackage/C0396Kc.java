package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.reflect.Field;
/* renamed from: Kc  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396Kc extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0396Kc(String str, int i, Class cls) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                C0473Nc c0473Nc = (C0473Nc) obj;
                return null;
            case 1:
                C0473Nc c0473Nc2 = (C0473Nc) obj;
                return null;
            case 2:
                View view = (View) obj;
                return null;
            case 3:
                View view2 = (View) obj;
                return null;
            case 4:
                View view3 = (View) obj;
                return null;
            case 5:
                return Float.valueOf(((SwitchCompat) obj).B);
            case 6:
                return Float.valueOf(AbstractC1998kc0.a.t0((View) obj));
            default:
                Field field = Sb0.a;
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                C0473Nc c0473Nc = (C0473Nc) obj;
                PointF pointF = (PointF) obj2;
                c0473Nc.getClass();
                c0473Nc.a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0473Nc.b = round;
                int i = c0473Nc.f + 1;
                c0473Nc.f = i;
                if (i == c0473Nc.g) {
                    AbstractC1998kc0.a(c0473Nc.e, c0473Nc.a, round, c0473Nc.c, c0473Nc.d);
                    c0473Nc.f = 0;
                    c0473Nc.g = 0;
                    return;
                }
                return;
            case 1:
                C0473Nc c0473Nc2 = (C0473Nc) obj;
                PointF pointF2 = (PointF) obj2;
                c0473Nc2.getClass();
                c0473Nc2.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0473Nc2.d = round2;
                int i2 = c0473Nc2.g + 1;
                c0473Nc2.g = i2;
                if (c0473Nc2.f == i2) {
                    AbstractC1998kc0.a(c0473Nc2.e, c0473Nc2.a, c0473Nc2.b, c0473Nc2.c, round2);
                    c0473Nc2.f = 0;
                    c0473Nc2.g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC1998kc0.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC1998kc0.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                AbstractC1998kc0.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case 5:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
            case 6:
                float floatValue = ((Float) obj2).floatValue();
                AbstractC1998kc0.a.u0((View) obj, floatValue);
                return;
            default:
                Field field = Sb0.a;
                ((View) obj).setClipBounds((Rect) obj2);
                return;
        }
    }
}
