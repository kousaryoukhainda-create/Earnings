package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class q extends l {
    private static final j$.sun.misc.a h;
    private static final long i;
    r e;
    volatile r f;
    volatile Thread g;
    volatile int lockState;

    static int i(Object obj, Object obj2) {
        int compareTo;
        return (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : compareTo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(r rVar) {
        super(-2, null, null);
        int i2;
        this.f = rVar;
        r rVar2 = null;
        while (rVar != null) {
            r rVar3 = (r) rVar.d;
            rVar.g = null;
            rVar.f = null;
            if (rVar2 == null) {
                rVar.e = null;
                rVar.i = false;
            } else {
                Object obj = rVar.b;
                int i3 = rVar.a;
                r rVar4 = rVar2;
                Class<?> cls = null;
                while (true) {
                    Object obj2 = rVar4.b;
                    int i4 = rVar4.a;
                    if (i4 > i3) {
                        i2 = -1;
                    } else if (i4 < i3) {
                        i2 = 1;
                    } else {
                        if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                            int i5 = ConcurrentHashMap.g;
                            int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                            if (compareTo != 0) {
                                i2 = compareTo;
                            }
                        }
                        i2 = i(obj, obj2);
                    }
                    r rVar5 = i2 <= 0 ? rVar4.f : rVar4.g;
                    if (rVar5 == null) {
                        break;
                    }
                    rVar4 = rVar5;
                }
                rVar.e = rVar4;
                if (i2 <= 0) {
                    rVar4.f = rVar;
                } else {
                    rVar4.g = rVar;
                }
                rVar = c(rVar2, rVar);
            }
            rVar2 = rVar;
            rVar = rVar3;
        }
        this.e = rVar2;
    }

    private final void d() {
        if (h.c(this, i, 0, 1)) {
            return;
        }
        boolean z = false;
        while (true) {
            int i2 = this.lockState;
            if ((i2 & (-3)) == 0) {
                if (h.c(this, i, i2, 1)) {
                    break;
                }
            } else if ((i2 & 2) == 0) {
                if (h.c(this, i, i2, i2 | 2)) {
                    this.g = Thread.currentThread();
                    z = true;
                }
            } else if (z) {
                LockSupport.park(this);
            }
        }
        if (z) {
            this.g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public final l a(Object obj, int i2) {
        Object obj2;
        Thread thread;
        Thread thread2;
        r rVar = null;
        if (obj != null) {
            l lVar = this.f;
            while (lVar != null) {
                int i3 = this.lockState;
                if ((i3 & 3) != 0) {
                    if (lVar.a == i2 && ((obj2 = lVar.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                        return lVar;
                    }
                    lVar = lVar.d;
                } else {
                    j$.sun.misc.a aVar = h;
                    long j = i;
                    if (aVar.c(this, j, i3, i3 + 4)) {
                        try {
                            r rVar2 = this.e;
                            if (rVar2 != null) {
                                rVar = rVar2.b(i2, obj, null);
                            }
                            if (aVar.f(this, j) == 6 && (thread2 = this.g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return rVar;
                        } catch (Throwable th) {
                            if (h.f(this, i) == 6 && (thread = this.g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b3, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.concurrent.r e(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.q.e(int, java.lang.Object, java.lang.Object):j$.util.concurrent.r");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0091 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:41:0x0068, B:43:0x006e, B:44:0x0070, B:59:0x0091, B:66:0x00a2, B:62:0x0099, B:64:0x009d, B:65:0x00a0, B:67:0x00a8, B:71:0x00b1, B:73:0x00b5, B:75:0x00b9, B:77:0x00bd, B:81:0x00c6, B:78:0x00c0, B:80:0x00c4, B:70:0x00ad, B:47:0x007a, B:49:0x007e, B:50:0x0081, B:34:0x0055, B:36:0x005b, B:38:0x005f, B:39:0x0062, B:40:0x0064), top: B:87:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ad A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:41:0x0068, B:43:0x006e, B:44:0x0070, B:59:0x0091, B:66:0x00a2, B:62:0x0099, B:64:0x009d, B:65:0x00a0, B:67:0x00a8, B:71:0x00b1, B:73:0x00b5, B:75:0x00b9, B:77:0x00bd, B:81:0x00c6, B:78:0x00c0, B:80:0x00c4, B:70:0x00ad, B:47:0x007a, B:49:0x007e, B:50:0x0081, B:34:0x0055, B:36:0x005b, B:38:0x005f, B:39:0x0062, B:40:0x0064), top: B:87:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b5 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:41:0x0068, B:43:0x006e, B:44:0x0070, B:59:0x0091, B:66:0x00a2, B:62:0x0099, B:64:0x009d, B:65:0x00a0, B:67:0x00a8, B:71:0x00b1, B:73:0x00b5, B:75:0x00b9, B:77:0x00bd, B:81:0x00c6, B:78:0x00c0, B:80:0x00c4, B:70:0x00ad, B:47:0x007a, B:49:0x007e, B:50:0x0081, B:34:0x0055, B:36:0x005b, B:38:0x005f, B:39:0x0062, B:40:0x0064), top: B:87:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00bd A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:41:0x0068, B:43:0x006e, B:44:0x0070, B:59:0x0091, B:66:0x00a2, B:62:0x0099, B:64:0x009d, B:65:0x00a0, B:67:0x00a8, B:71:0x00b1, B:73:0x00b5, B:75:0x00b9, B:77:0x00bd, B:81:0x00c6, B:78:0x00c0, B:80:0x00c4, B:70:0x00ad, B:47:0x007a, B:49:0x007e, B:50:0x0081, B:34:0x0055, B:36:0x005b, B:38:0x005f, B:39:0x0062, B:40:0x0064), top: B:87:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c0 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:41:0x0068, B:43:0x006e, B:44:0x0070, B:59:0x0091, B:66:0x00a2, B:62:0x0099, B:64:0x009d, B:65:0x00a0, B:67:0x00a8, B:71:0x00b1, B:73:0x00b5, B:75:0x00b9, B:77:0x00bd, B:81:0x00c6, B:78:0x00c0, B:80:0x00c4, B:70:0x00ad, B:47:0x007a, B:49:0x007e, B:50:0x0081, B:34:0x0055, B:36:0x005b, B:38:0x005f, B:39:0x0062, B:40:0x0064), top: B:87:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(j$.util.concurrent.r r11) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.q.f(j$.util.concurrent.r):boolean");
    }

    static r g(r rVar, r rVar2) {
        r rVar3;
        if (rVar2 != null && (rVar3 = rVar2.g) != null) {
            r rVar4 = rVar3.f;
            rVar2.g = rVar4;
            if (rVar4 != null) {
                rVar4.e = rVar2;
            }
            r rVar5 = rVar2.e;
            rVar3.e = rVar5;
            if (rVar5 == null) {
                rVar3.i = false;
                rVar = rVar3;
            } else if (rVar5.f == rVar2) {
                rVar5.f = rVar3;
            } else {
                rVar5.g = rVar3;
            }
            rVar3.f = rVar2;
            rVar2.e = rVar3;
        }
        return rVar;
    }

    static r h(r rVar, r rVar2) {
        r rVar3;
        if (rVar2 != null && (rVar3 = rVar2.f) != null) {
            r rVar4 = rVar3.g;
            rVar2.f = rVar4;
            if (rVar4 != null) {
                rVar4.e = rVar2;
            }
            r rVar5 = rVar2.e;
            rVar3.e = rVar5;
            if (rVar5 == null) {
                rVar3.i = false;
                rVar = rVar3;
            } else if (rVar5.g == rVar2) {
                rVar5.g = rVar3;
            } else {
                rVar5.f = rVar3;
            }
            rVar3.g = rVar2;
            rVar2.e = rVar3;
        }
        return rVar;
    }

    static r c(r rVar, r rVar2) {
        r rVar3;
        rVar2.i = true;
        while (true) {
            r rVar4 = rVar2.e;
            if (rVar4 == null) {
                rVar2.i = false;
                return rVar2;
            } else if (!rVar4.i || (rVar3 = rVar4.e) == null) {
                break;
            } else {
                r rVar5 = rVar3.f;
                if (rVar4 == rVar5) {
                    r rVar6 = rVar3.g;
                    if (rVar6 != null && rVar6.i) {
                        rVar6.i = false;
                        rVar4.i = false;
                        rVar3.i = true;
                        rVar2 = rVar3;
                    } else {
                        if (rVar2 == rVar4.g) {
                            rVar = g(rVar, rVar4);
                            r rVar7 = rVar4.e;
                            rVar3 = rVar7 == null ? null : rVar7.e;
                            rVar4 = rVar7;
                            rVar2 = rVar4;
                        }
                        if (rVar4 != null) {
                            rVar4.i = false;
                            if (rVar3 != null) {
                                rVar3.i = true;
                                rVar = h(rVar, rVar3);
                            }
                        }
                    }
                } else if (rVar5 != null && rVar5.i) {
                    rVar5.i = false;
                    rVar4.i = false;
                    rVar3.i = true;
                    rVar2 = rVar3;
                } else {
                    if (rVar2 == rVar4.f) {
                        rVar = h(rVar, rVar4);
                        r rVar8 = rVar4.e;
                        rVar3 = rVar8 == null ? null : rVar8.e;
                        rVar4 = rVar8;
                        rVar2 = rVar4;
                    }
                    if (rVar4 != null) {
                        rVar4.i = false;
                        if (rVar3 != null) {
                            rVar3.i = true;
                            rVar = g(rVar, rVar3);
                        }
                    }
                }
            }
        }
        return rVar;
    }

    static r b(r rVar, r rVar2) {
        while (rVar2 != null && rVar2 != rVar) {
            r rVar3 = rVar2.e;
            if (rVar3 == null) {
                rVar2.i = false;
                return rVar2;
            } else if (rVar2.i) {
                rVar2.i = false;
                return rVar;
            } else {
                r rVar4 = rVar3.f;
                if (rVar4 == rVar2) {
                    r rVar5 = rVar3.g;
                    if (rVar5 != null && rVar5.i) {
                        rVar5.i = false;
                        rVar3.i = true;
                        rVar = g(rVar, rVar3);
                        rVar3 = rVar2.e;
                        rVar5 = rVar3 == null ? null : rVar3.g;
                    }
                    if (rVar5 != null) {
                        r rVar6 = rVar5.f;
                        r rVar7 = rVar5.g;
                        if ((rVar7 == null || !rVar7.i) && (rVar6 == null || !rVar6.i)) {
                            rVar5.i = true;
                        } else {
                            if (rVar7 == null || !rVar7.i) {
                                if (rVar6 != null) {
                                    rVar6.i = false;
                                }
                                rVar5.i = true;
                                rVar = h(rVar, rVar5);
                                rVar3 = rVar2.e;
                                rVar5 = rVar3 != null ? rVar3.g : null;
                            }
                            if (rVar5 != null) {
                                rVar5.i = rVar3 == null ? false : rVar3.i;
                                r rVar8 = rVar5.g;
                                if (rVar8 != null) {
                                    rVar8.i = false;
                                }
                            }
                            if (rVar3 != null) {
                                rVar3.i = false;
                                rVar = g(rVar, rVar3);
                            }
                            rVar2 = rVar;
                        }
                    }
                    rVar2 = rVar3;
                } else {
                    if (rVar4 != null && rVar4.i) {
                        rVar4.i = false;
                        rVar3.i = true;
                        rVar = h(rVar, rVar3);
                        rVar3 = rVar2.e;
                        rVar4 = rVar3 == null ? null : rVar3.f;
                    }
                    if (rVar4 != null) {
                        r rVar9 = rVar4.f;
                        r rVar10 = rVar4.g;
                        if ((rVar9 == null || !rVar9.i) && (rVar10 == null || !rVar10.i)) {
                            rVar4.i = true;
                        } else {
                            if (rVar9 == null || !rVar9.i) {
                                if (rVar10 != null) {
                                    rVar10.i = false;
                                }
                                rVar4.i = true;
                                rVar = g(rVar, rVar4);
                                rVar3 = rVar2.e;
                                rVar4 = rVar3 != null ? rVar3.f : null;
                            }
                            if (rVar4 != null) {
                                rVar4.i = rVar3 == null ? false : rVar3.i;
                                r rVar11 = rVar4.f;
                                if (rVar11 != null) {
                                    rVar11.i = false;
                                }
                            }
                            if (rVar3 != null) {
                                rVar3.i = false;
                                rVar = h(rVar, rVar3);
                            }
                            rVar2 = rVar;
                        }
                    }
                    rVar2 = rVar3;
                }
            }
        }
        return rVar;
    }

    static {
        j$.sun.misc.a h2 = j$.sun.misc.a.h();
        h = h2;
        i = h2.j(q.class, "lockState");
    }
}
