package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.fairbid.sdk.session.UserSessionStorage;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class c extends d {
    public long b;

    public c(n nVar) {
        super(null);
        this.b = -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d
    public boolean a(k kVar) {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d
    public void b(k kVar, long j) throws l {
        if (kVar.l() == 2) {
            int q = kVar.q();
            int i = kVar.b;
            kVar.f(q);
            if ("onMetaData".equals(new String(kVar.a, i, q)) && kVar.l() == 8) {
                HashMap<String, Object> b = b(kVar);
                if (b.containsKey(UserSessionStorage.DURATION)) {
                    double doubleValue = ((Double) b.get(UserSessionStorage.DURATION)).doubleValue();
                    if (doubleValue > 0.0d) {
                        this.b = (long) (doubleValue * 1000000.0d);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new l();
    }

    public static Object a(k kVar, int i) {
        if (i == 8) {
            return b(kVar);
        }
        if (i == 10) {
            int o = kVar.o();
            ArrayList arrayList = new ArrayList(o);
            for (int i2 = 0; i2 < o; i2++) {
                arrayList.add(a(kVar, kVar.l()));
            }
            return arrayList;
        } else if (i == 11) {
            Date date = new Date((long) Double.longBitsToDouble(kVar.i()));
            kVar.f(2);
            return date;
        } else if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(kVar.i()));
        } else {
            if (i == 1) {
                return Boolean.valueOf(kVar.l() == 1);
            } else if (i == 2) {
                int q = kVar.q();
                int i3 = kVar.b;
                kVar.f(q);
                return new String(kVar.a, i3, q);
            } else if (i != 3) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                while (true) {
                    int q2 = kVar.q();
                    int i4 = kVar.b;
                    kVar.f(q2);
                    String str = new String(kVar.a, i4, q2);
                    int l = kVar.l();
                    if (l == 9) {
                        return hashMap;
                    }
                    hashMap.put(str, a(kVar, l));
                }
            }
        }
    }

    public static HashMap<String, Object> b(k kVar) {
        int o = kVar.o();
        HashMap<String, Object> hashMap = new HashMap<>(o);
        for (int i = 0; i < o; i++) {
            int q = kVar.q();
            int i2 = kVar.b;
            kVar.f(q);
            hashMap.put(new String(kVar.a, i2, q), a(kVar, kVar.l()));
        }
        return hashMap;
    }
}
