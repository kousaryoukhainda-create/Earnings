package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: Cz  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211Cz extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > 4) {
            return true;
        }
        return false;
    }
}
