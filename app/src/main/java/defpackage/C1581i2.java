package defpackage;

import com.fyber.fairbid.sdk.mediation.data.AdapterStatusRepository;
import java.util.Comparator;
/* renamed from: i2  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1581i2 implements Comparator {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C1581i2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return AdapterStatusRepository.a((AdapterStatusRepository.d) this.c, obj, obj2);
            default:
                FK fk = (FK) this.c;
                return fk.a(obj2) - fk.a(obj);
        }
    }
}
