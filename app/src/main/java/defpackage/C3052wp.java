package defpackage;

import android.view.View;
import androidx.fragment.app.i;
/* renamed from: wp  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3052wp extends AbstractC0288Fy {
    public final /* synthetic */ AbstractC0288Fy b;
    public final /* synthetic */ i c;

    public C3052wp(i iVar, AbstractC0288Fy abstractC0288Fy) {
        this.c = iVar;
        this.b = abstractC0288Fy;
    }

    @Override // defpackage.AbstractC0288Fy
    public final View b(int i) {
        AbstractC0288Fy abstractC0288Fy = this.b;
        if (abstractC0288Fy.c()) {
            return abstractC0288Fy.b(i);
        }
        return this.c.onFindViewById(i);
    }

    @Override // defpackage.AbstractC0288Fy
    public final boolean c() {
        if (!this.b.c() && !this.c.onHasView()) {
            return false;
        }
        return true;
    }
}
