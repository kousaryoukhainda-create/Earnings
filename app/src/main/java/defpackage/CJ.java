package defpackage;
/* renamed from: CJ  reason: default package */
/* loaded from: classes2.dex */
public final class CJ extends K {
    public final /* synthetic */ EJ b;

    public CJ(EJ ej) {
        this.b = ej;
    }

    @Override // defpackage.AbstractC2633s, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return super.contains((String) obj);
    }

    @Override // defpackage.AbstractC2633s
    public final int e() {
        return this.b.a.groupCount() + 1;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String group = this.b.a.group(i);
        if (group == null) {
            return "";
        }
        return group;
    }

    @Override // defpackage.K, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.indexOf((String) obj);
    }

    @Override // defpackage.K, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.lastIndexOf((String) obj);
    }
}
