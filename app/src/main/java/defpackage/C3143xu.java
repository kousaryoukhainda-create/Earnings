package defpackage;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: xu  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3143xu {
    public final File a;
    public final Object b;

    public C3143xu(File root, List segments) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.a = root;
        this.b = segments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3143xu)) {
            return false;
        }
        C3143xu c3143xu = (C3143xu) obj;
        if (this.a.equals(c3143xu.a) && this.b.equals(c3143xu.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.a + ", segments=" + this.b + ')';
    }
}
