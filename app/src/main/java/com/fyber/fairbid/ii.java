package com.fyber.fairbid;

import androidx.annotation.NonNull;
import com.fyber.fairbid.internal.Framework;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class ii implements u6 {
    public final a a;
    public final String b;
    public final String c;

    /* loaded from: classes.dex */
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        UNITY(Framework.UNITY),
        /* JADX INFO: Fake field, exist only in values array */
        FLUTTER("flutter");
        
        public static final HashMap b = new HashMap();
        public final String a;

        static {
            a[] values;
            for (a aVar : values()) {
                b.put(aVar.a, aVar);
            }
        }

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.a;
        }
    }

    public ii(@NonNull a aVar, String str, @NonNull String str2) {
        this.a = aVar;
        this.b = str;
        this.c = str2;
    }

    @Override // com.fyber.fairbid.u6
    @NonNull
    public final Map<String, ?> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("plugin_sdk_version", this.c);
        hashMap.put("plugin_framework", this.a.a);
        hashMap.put("plugin_framework_version", this.b);
        return hashMap;
    }
}
