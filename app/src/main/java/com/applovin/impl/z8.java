package com.applovin.impl;

import com.applovin.impl.e9;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class z8 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final a k;
    private final af l;

    /* loaded from: classes.dex */
    public static class a {
        public final long[] a;
        public final long[] b;

        public a(long[] jArr, long[] jArr2) {
            this.a = jArr;
            this.b = jArr2;
        }
    }

    private z8(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, a aVar, af afVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = b(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = aVar;
        this.l = afVar;
    }

    private static int a(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        return i != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int b(int i) {
        switch (i) {
            case JosStatusCodes.RTN_CODE_COMMON_ERROR /* 8000 */:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static af a(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] b = xp.b(str, ContainerUtils.KEY_VALUE_DELIMITER);
            if (b.length != 2) {
                BK.z("Failed to parse Vorbis comment: ", str, "FlacStreamMetadata");
            } else {
                arrayList.add(new dr(b[0], b[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new af(arrayList);
    }

    public z8 b(List list) {
        return new z8(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, a(a(list, Collections.emptyList())));
    }

    public long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public z8(byte[] bArr, int i) {
        zg zgVar = new zg(bArr);
        zgVar.c(i * 8);
        this.a = zgVar.a(16);
        this.b = zgVar.a(16);
        this.c = zgVar.a(24);
        this.d = zgVar.a(24);
        int a2 = zgVar.a(20);
        this.e = a2;
        this.f = b(a2);
        this.g = zgVar.a(3) + 1;
        int a3 = zgVar.a(5) + 1;
        this.h = a3;
        this.i = a(a3);
        this.j = zgVar.b(36);
        this.k = null;
        this.l = null;
    }

    public z8 a(List list) {
        return new z8(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, a(a(Collections.emptyList(), list)));
    }

    public long a() {
        long j;
        long j2;
        int i = this.d;
        if (i > 0) {
            j = (i + this.c) / 2;
            j2 = 1;
        } else {
            int i2 = this.a;
            j = ((((i2 != this.b || i2 <= 0) ? 4096L : i2) * this.g) * this.h) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    public e9 a(byte[] bArr, af afVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        return new e9.b().f("audio/flac").i(i).c(this.g).n(this.e).a(Collections.singletonList(bArr)).a(a(afVar)).a();
    }

    public af a(af afVar) {
        af afVar2 = this.l;
        return afVar2 == null ? afVar : afVar2.a(afVar);
    }

    public long a(long j) {
        return xp.b((j * this.e) / 1000000, 0L, this.j - 1);
    }

    public z8 a(a aVar) {
        return new z8(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, aVar, this.l);
    }
}
