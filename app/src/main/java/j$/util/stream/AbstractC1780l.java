package j$.util.stream;

import j$.util.stream.Collector;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
/* renamed from: j$.util.stream.l  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1780l {
    static final Set a;

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        Collections.unmodifiableSet(EnumSet.of(characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        a = Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }
}
