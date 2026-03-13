package com.google.android.gms.internal.play_billing;

import java.util.Comparator;
import java.util.SortedSet;
/* loaded from: classes3.dex */
final class zzdv {
    public static boolean zza(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = zzdc.zza;
            }
        } else if (iterable instanceof zzdu) {
            comparator2 = ((zzdu) iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(comparator2);
    }
}
