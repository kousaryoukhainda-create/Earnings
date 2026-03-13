package j$.util.concurrent;
/* loaded from: classes4.dex */
final class w extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final Object initialValue() {
        return new ThreadLocalRandom(0);
    }
}
