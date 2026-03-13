package defpackage;
/* renamed from: mG  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2145mG implements YT {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile YT b;

    public C2145mG(YT yt) {
        this.b = yt;
    }

    @Override // defpackage.YT
    public final Object get() {
        Object obj = this.a;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.a;
                    if (obj == obj2) {
                        obj = this.b.get();
                        this.a = obj;
                        this.b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
