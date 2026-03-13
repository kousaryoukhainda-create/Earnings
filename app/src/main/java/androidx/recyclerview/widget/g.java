package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class g {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public C1532hV g;
    public final /* synthetic */ RecyclerView h;

    public g(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(i iVar, boolean z) {
        F0 f0;
        RecyclerView.i(iVar);
        View view = iVar.itemView;
        RecyclerView recyclerView = this.h;
        C2504qV c2504qV = recyclerView.n0;
        if (c2504qV != null) {
            C2418pV c2418pV = c2504qV.e;
            if (c2418pV instanceof C2418pV) {
                f0 = (F0) c2418pV.e.remove(view);
            } else {
                f0 = null;
            }
            Sb0.l(view, f0);
        }
        if (z) {
            d dVar = recyclerView.n;
            if (dVar != null) {
                dVar.onViewRecycled(iVar);
            }
            if (recyclerView.g0 != null) {
                recyclerView.h.E(iVar);
            }
        }
        iVar.mOwnerRecyclerView = null;
        C1532hV c = c();
        c.getClass();
        int itemViewType = iVar.getItemViewType();
        ArrayList arrayList = c.a(itemViewType).a;
        if (((C1446gV) c.a.get(itemViewType)).b > arrayList.size()) {
            iVar.resetInternal();
            arrayList.add(iVar);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.g0.b()) {
            if (!recyclerView.g0.g) {
                return i;
            }
            return recyclerView.f.y(i, 0);
        }
        StringBuilder i2 = AbstractC0324Hi.i(i, "invalid position ", ". State item count is ");
        i2.append(recyclerView.g0.b());
        i2.append(recyclerView.x());
        throw new IndexOutOfBoundsException(i2.toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hV] */
    public final C1532hV c() {
        if (this.g == null) {
            ?? obj = new Object();
            obj.a = new SparseArray();
            obj.b = 0;
            this.g = obj;
        }
        return this.g;
    }

    public final void d() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        if (RecyclerView.z0) {
            C0164Be c0164Be = this.h.f0;
            int[] iArr = (int[]) c0164Be.d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0164Be.c = 0;
        }
    }

    public final void e(int i) {
        ArrayList arrayList = this.c;
        a((i) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void f(View view) {
        i H = RecyclerView.H(view);
        boolean isTmpDetached = H.isTmpDetached();
        RecyclerView recyclerView = this.h;
        if (isTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (H.isScrap()) {
            H.unScrap();
        } else if (H.wasReturnedFromScrap()) {
            H.clearReturnedFromScrapFlag();
        }
        g(H);
        if (recyclerView.L != null && !H.isRecyclable()) {
            recyclerView.L.d(H);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009a, code lost:
        r5 = r5 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(androidx.recyclerview.widget.i r12) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.g.g(androidx.recyclerview.widget.i):void");
    }

    public final void h(View view) {
        e eVar;
        i H = RecyclerView.H(view);
        boolean hasAnyOfTheFlags = H.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.h;
        if (!hasAnyOfTheFlags && H.isUpdated() && (eVar = recyclerView.L) != null) {
            C0458Mn c0458Mn = (C0458Mn) eVar;
            if (H.getUnmodifiedPayloads().isEmpty() && c0458Mn.g && !H.isInvalid()) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                H.setScrapContainer(this, true);
                this.b.add(H);
                return;
            }
        }
        if (H.isInvalid() && !H.isRemoved() && !recyclerView.n.hasStableIds()) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.x());
        }
        H.setScrapContainer(this, false);
        this.a.add(H);
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x0413, code lost:
        if ((r9 + r12) >= r29) goto L221;
     */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.i i(int r28, long r29) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.g.i(int, long):androidx.recyclerview.widget.i");
    }

    public final void j(i iVar) {
        if (iVar.mInChangeScrap) {
            this.b.remove(iVar);
        } else {
            this.a.remove(iVar);
        }
        iVar.mScrapContainer = null;
        iVar.mInChangeScrap = false;
        iVar.clearReturnedFromScrapFlag();
    }

    public final void k() {
        int i;
        f fVar = this.h.o;
        if (fVar != null) {
            i = fVar.j;
        } else {
            i = 0;
        }
        this.f = this.e + i;
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            e(size);
        }
    }
}
