package com.applovin.impl;

import java.nio.ByteBuffer;
import java.util.UUID;
/* loaded from: classes.dex */
public abstract class ji {

    /* loaded from: classes.dex */
    public static class a {
        private final UUID a;
        private final int b;
        private final byte[] c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.a = uuid;
            this.b = i;
            this.c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return a(uuid, null, bArr);
    }

    private static a b(byte[] bArr) {
        ah ahVar = new ah(bArr);
        if (ahVar.e() < 32) {
            return null;
        }
        ahVar.f(0);
        if (ahVar.j() != ahVar.a() + 4 || ahVar.j() != 1886614376) {
            return null;
        }
        int c = j1.c(ahVar.j());
        if (c > 1) {
            Kh0.i(c, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(ahVar.s(), ahVar.s());
        if (c == 1) {
            ahVar.g(ahVar.A() * 16);
        }
        int A = ahVar.A();
        if (A != ahVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[A];
        ahVar.a(bArr2, 0, A);
        return new a(uuid, c, bArr2);
    }

    public static UUID c(byte[] bArr) {
        a b = b(bArr);
        if (b != null) {
            return b.a;
        }
        return null;
    }

    public static int d(byte[] bArr) {
        a b = b(bArr);
        if (b != null) {
            return b.b;
        }
        return -1;
    }

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean a(byte[] bArr) {
        return b(bArr) != null;
    }

    public static byte[] a(byte[] bArr, UUID uuid) {
        a b = b(bArr);
        if (b == null) {
            return null;
        }
        if (uuid.equals(b.a)) {
            return b.c;
        }
        oc.d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + b.a + ".");
        return null;
    }
}
