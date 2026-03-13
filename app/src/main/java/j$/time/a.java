package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class a extends b implements Serializable {
    static final a b;
    private static final long serialVersionUID = 6740630888130243051L;
    private final ZoneId a;

    static {
        System.currentTimeMillis();
        b = new a(ZoneOffset.UTC);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(ZoneId zoneId) {
        this.a = zoneId;
    }

    @Override // j$.time.b
    public final ZoneId a() {
        return this.a;
    }

    @Override // j$.time.b
    public final long b() {
        return System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a.equals(((a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }
}
