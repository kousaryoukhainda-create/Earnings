package defpackage;

import androidx.media3.common.b;
import java.util.ArrayList;
/* renamed from: kW  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1989kW extends AbstractC2161mW implements InterfaceC2101ll {
    public final AbstractC2937vZ h;

    public C1989kW(long j, b bVar, AbstractC2571rD abstractC2571rD, AbstractC2937vZ abstractC2937vZ, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(bVar, abstractC2571rD, abstractC2937vZ, arrayList, arrayList2, arrayList3);
        this.h = abstractC2937vZ;
    }

    @Override // defpackage.InterfaceC2101ll
    public final long B(long j) {
        return this.h.d(j);
    }

    @Override // defpackage.InterfaceC2101ll
    public final long C(long j, long j2) {
        return this.h.b(j, j2);
    }

    @Override // defpackage.InterfaceC2101ll
    public final long a(long j) {
        return this.h.g(j);
    }

    @Override // defpackage.AbstractC2161mW
    public final String b() {
        return null;
    }

    @Override // defpackage.AbstractC2161mW
    public final CU d() {
        return null;
    }

    @Override // defpackage.InterfaceC2101ll
    public final long e(long j, long j2) {
        return this.h.e(j, j2);
    }

    @Override // defpackage.InterfaceC2101ll
    public final long h(long j, long j2) {
        return this.h.c(j, j2);
    }

    @Override // defpackage.InterfaceC2101ll
    public final long j(long j, long j2) {
        AbstractC2937vZ abstractC2937vZ = this.h;
        if (abstractC2937vZ.f != null) {
            return -9223372036854775807L;
        }
        long b = abstractC2937vZ.b(j, j2) + abstractC2937vZ.c(j, j2);
        return (abstractC2937vZ.e(b, j) + abstractC2937vZ.g(b)) - abstractC2937vZ.i;
    }

    @Override // defpackage.InterfaceC2101ll
    public final CU k(long j) {
        return this.h.h(this, j);
    }

    @Override // defpackage.InterfaceC2101ll
    public final long q(long j, long j2) {
        return this.h.f(j, j2);
    }

    @Override // defpackage.InterfaceC2101ll
    public final boolean w() {
        return this.h.i();
    }

    @Override // defpackage.InterfaceC2101ll
    public final long y() {
        return this.h.d;
    }

    @Override // defpackage.AbstractC2161mW
    public final InterfaceC2101ll c() {
        return this;
    }
}
