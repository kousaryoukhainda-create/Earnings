package defpackage;

import android.view.View;
import java.util.ArrayList;
/* renamed from: jz  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1945jz implements InterfaceC1003c80 {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;

    public C1945jz(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.InterfaceC1003c80
    public final void a(AbstractC1165d80 abstractC1165d80) {
        abstractC1165d80.z(this);
        abstractC1165d80.a(this);
    }

    @Override // defpackage.InterfaceC1003c80
    public final void c(AbstractC1165d80 abstractC1165d80) {
        abstractC1165d80.z(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.InterfaceC1003c80
    public final void b() {
    }

    @Override // defpackage.InterfaceC1003c80
    public final void d() {
    }

    @Override // defpackage.InterfaceC1003c80
    public final void e() {
    }
}
