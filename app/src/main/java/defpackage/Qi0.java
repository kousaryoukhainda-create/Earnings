package defpackage;

import android.media.AudioRouting;
import java.util.Comparator;
import java.util.PriorityQueue;
/* renamed from: Qi0  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class Qi0 {
    public static /* bridge */ /* synthetic */ AudioRouting.OnRoutingChangedListener e(Object obj) {
        return (AudioRouting.OnRoutingChangedListener) obj;
    }

    public static /* synthetic */ PriorityQueue h(Comparator comparator) {
        return new PriorityQueue(comparator);
    }
}
