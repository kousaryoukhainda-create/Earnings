package com.applovin.exoplayer2.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final e strategy;
    private final CharMatcher trimmer;

    /* loaded from: classes.dex */
    public class a implements e {
        final /* synthetic */ CharMatcher a;

        /* renamed from: com.applovin.exoplayer2.common.base.Splitter$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0002a extends d {
            public C0002a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int a(int i) {
                return i + 1;
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int b(int i) {
                return a.this.a.indexIn(this.c, i);
            }
        }

        public a(CharMatcher charMatcher) {
            this.a = charMatcher;
        }

        @Override // com.applovin.exoplayer2.common.base.Splitter.e
        /* renamed from: b */
        public d a(Splitter splitter, CharSequence charSequence) {
            return new C0002a(splitter, charSequence);
        }
    }

    /* loaded from: classes.dex */
    public class b implements e {
        final /* synthetic */ String a;

        /* loaded from: classes.dex */
        public class a extends d {
            public a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int a(int i) {
                return b.this.a.length() + i;
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
                r6 = r6 + 1;
             */
            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public int b(int r6) {
                /*
                    r5 = this;
                    com.applovin.exoplayer2.common.base.Splitter$b r0 = com.applovin.exoplayer2.common.base.Splitter.b.this
                    java.lang.String r0 = r0.a
                    int r0 = r0.length()
                    java.lang.CharSequence r1 = r5.c
                    int r1 = r1.length()
                    int r1 = r1 - r0
                Lf:
                    if (r6 > r1) goto L2d
                    r2 = 0
                L12:
                    if (r2 >= r0) goto L2c
                    java.lang.CharSequence r3 = r5.c
                    int r4 = r2 + r6
                    char r3 = r3.charAt(r4)
                    com.applovin.exoplayer2.common.base.Splitter$b r4 = com.applovin.exoplayer2.common.base.Splitter.b.this
                    java.lang.String r4 = r4.a
                    char r4 = r4.charAt(r2)
                    if (r3 == r4) goto L29
                    int r6 = r6 + 1
                    goto Lf
                L29:
                    int r2 = r2 + 1
                    goto L12
                L2c:
                    return r6
                L2d:
                    r6 = -1
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.common.base.Splitter.b.a.b(int):int");
            }
        }

        public b(String str) {
            this.a = str;
        }

        @Override // com.applovin.exoplayer2.common.base.Splitter.e
        /* renamed from: b */
        public d a(Splitter splitter, CharSequence charSequence) {
            return new a(splitter, charSequence);
        }
    }

    /* loaded from: classes.dex */
    public class c implements e {
        final /* synthetic */ int a;

        /* loaded from: classes.dex */
        public class a extends d {
            public a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int a(int i) {
                return i;
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.d
            public int b(int i) {
                int i2 = i + c.this.a;
                if (i2 >= this.c.length()) {
                    return -1;
                }
                return i2;
            }
        }

        public c(int i) {
            this.a = i;
        }

        @Override // com.applovin.exoplayer2.common.base.Splitter.e
        /* renamed from: b */
        public d a(Splitter splitter, CharSequence charSequence) {
            return new a(splitter, charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d extends com.applovin.exoplayer2.common.base.b {
        final CharSequence c;
        final CharMatcher d;
        final boolean f;
        int g = 0;
        int h;

        public d(Splitter splitter, CharSequence charSequence) {
            this.d = splitter.trimmer;
            this.f = splitter.omitEmptyStrings;
            this.h = splitter.limit;
            this.c = charSequence;
        }

        public abstract int a(int i);

        public abstract int b(int i);

        @Override // com.applovin.exoplayer2.common.base.b
        /* renamed from: d */
        public String a() {
            int b;
            int i = this.g;
            while (true) {
                int i2 = this.g;
                if (i2 != -1) {
                    b = b(i2);
                    if (b == -1) {
                        b = this.c.length();
                        this.g = -1;
                    } else {
                        this.g = a(b);
                    }
                    int i3 = this.g;
                    if (i3 == i) {
                        int i4 = i3 + 1;
                        this.g = i4;
                        if (i4 > this.c.length()) {
                            this.g = -1;
                        }
                    } else {
                        while (i < b && this.d.matches(this.c.charAt(i))) {
                            i++;
                        }
                        while (b > i && this.d.matches(this.c.charAt(b - 1))) {
                            b--;
                        }
                        if (!this.f || i != b) {
                            break;
                        }
                        i = this.g;
                    }
                } else {
                    return (String) b();
                }
            }
            int i5 = this.h;
            if (i5 == 1) {
                b = this.c.length();
                this.g = -1;
                while (b > i && this.d.matches(this.c.charAt(b - 1))) {
                    b--;
                }
            } else {
                this.h = i5 - 1;
            }
            return this.c.subSequence(i, b).toString();
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        Iterator a(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(e eVar) {
        this(eVar, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    public static Splitter fixedLength(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "The length may not be less than 1");
        return new Splitter(new c(i));
    }

    public static Splitter on(char c2) {
        return on(CharMatcher.is(c2));
    }

    private Iterator<String> splittingIterator(CharSequence charSequence) {
        return this.strategy.a(this, charSequence);
    }

    public Splitter limit(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "must be greater than zero: %s", i);
        return new Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, i);
    }

    public Splitter omitEmptyStrings() {
        return new Splitter(this.strategy, true, this.trimmer, this.limit);
    }

    public List<String> splitToList(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Iterator<String> splittingIterator = splittingIterator(charSequence);
        ArrayList arrayList = new ArrayList();
        while (splittingIterator.hasNext()) {
            arrayList.add(splittingIterator.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Splitter trimResults() {
        return trimResults(CharMatcher.whitespace());
    }

    private Splitter(e eVar, boolean z, CharMatcher charMatcher, int i) {
        this.strategy = eVar;
        this.omitEmptyStrings = z;
        this.trimmer = charMatcher;
        this.limit = i;
    }

    public static Splitter on(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(new a(charMatcher));
    }

    public Splitter trimResults(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(this.strategy, this.omitEmptyStrings, charMatcher, this.limit);
    }

    public static Splitter on(String str) {
        Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return on(str.charAt(0));
        }
        return new Splitter(new b(str));
    }
}
