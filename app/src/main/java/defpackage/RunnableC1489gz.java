package defpackage;

import android.view.View;
import java.lang.reflect.Field;
import java.util.ArrayList;
/* renamed from: gz  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1489gz implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ArrayList g;

    public RunnableC1489gz(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.b = i;
        this.c = arrayList;
        this.d = arrayList2;
        this.f = arrayList3;
        this.g = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.b; i++) {
            Field field = Sb0.a;
            Hb0.v((View) this.c.get(i), (String) this.d.get(i));
            Hb0.v((View) this.f.get(i), (String) this.g.get(i));
        }
    }
}
