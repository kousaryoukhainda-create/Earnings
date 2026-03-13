package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: TA  reason: default package */
/* loaded from: classes.dex */
public final class TA {
    public final AbstractCollection a;
    public final Object b;

    public TA(List topics, List encryptedTopics) {
        Intrinsics.checkNotNullParameter(topics, "topics");
        Intrinsics.checkNotNullParameter(encryptedTopics, "encryptedTopics");
        this.a = (AbstractCollection) topics;
        this.b = encryptedTopics;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.AbstractCollection, java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TA)) {
            return false;
        }
        ?? r1 = this.a;
        TA ta = (TA) obj;
        if (r1.size() == ta.a.size()) {
            ?? r3 = this.b;
            int size = r3.size();
            ?? r5 = ta.b;
            if (size == r5.size() && new HashSet((Collection) r1).equals(new HashSet(ta.a)) && new HashSet((Collection) r3).equals(new HashSet((Collection) r5))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "GetTopicsResponse: Topics=" + this.a + ", EncryptedTopics=" + this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TA(List topics) {
        this(topics, C2968vr.b);
        Intrinsics.checkNotNullParameter(topics, "topics");
    }
}
