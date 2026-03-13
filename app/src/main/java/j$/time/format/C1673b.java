package j$.time.format;

import java.util.Iterator;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.b  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1673b extends C {
    final /* synthetic */ B e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1673b(B b) {
        this.e = b;
    }

    @Override // j$.time.format.C
    public final String e(j$.time.chrono.m mVar, j$.time.temporal.s sVar, long j, H h, Locale locale) {
        return this.e.a(j, h);
    }

    @Override // j$.time.format.C
    public final String f(j$.time.temporal.s sVar, long j, H h, Locale locale) {
        return this.e.a(j, h);
    }

    @Override // j$.time.format.C
    public final Iterator g(j$.time.chrono.m mVar, j$.time.temporal.s sVar, H h, Locale locale) {
        return this.e.b(h);
    }

    @Override // j$.time.format.C
    public final Iterator h(j$.time.temporal.s sVar, H h, Locale locale) {
        return this.e.b(h);
    }
}
