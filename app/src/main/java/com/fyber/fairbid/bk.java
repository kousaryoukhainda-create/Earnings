package com.fyber.fairbid;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class bk {
    public final int a;
    @NotNull
    public final String b;
    @NotNull
    public final List<ck> c;
    @NotNull
    public final List<ck> d;
    @NotNull
    public final List<ck> e;
    @NotNull
    public final String f;

    public bk(int i, @NotNull String name, @NotNull List<ck> waterfallInstances, @NotNull List<ck> programmaticInstances, @NotNull List<ck> nonTraditionalInstances) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        Intrinsics.checkNotNullParameter(programmaticInstances, "programmaticInstances");
        Intrinsics.checkNotNullParameter(nonTraditionalInstances, "nonTraditionalInstances");
        this.a = i;
        this.b = name;
        this.c = waterfallInstances;
        this.d = programmaticInstances;
        this.e = nonTraditionalInstances;
        this.f = String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bk) {
            bk bkVar = (bk) obj;
            return this.a == bkVar.a && Intrinsics.a(this.b, bkVar.b) && Intrinsics.a(this.c, bkVar.c) && Intrinsics.a(this.d, bkVar.d) && Intrinsics.a(this.e, bkVar.e);
        }
        return false;
    }

    public final int hashCode() {
        int a = fm.a(this.b, this.a * 31, 31);
        int hashCode = this.d.hashCode();
        return this.e.hashCode() + ((hashCode + ((this.c.hashCode() + a) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "TestSuiteAdUnit(id=" + this.a + ", name=" + this.b + ", waterfallInstances=" + this.c + ", programmaticInstances=" + this.d + ", nonTraditionalInstances=" + this.e + ')';
    }
}
