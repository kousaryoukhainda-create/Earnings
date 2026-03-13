package com.applovin.impl;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.l9;
import com.applovin.impl.x6;
import com.applovin.impl.y7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public final class l9 implements y7 {
    public static final y7.c d = new Object();
    private final UUID a;
    private final MediaDrm b;
    private int c;

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
            return requiresSecureDecoder;
        }
    }

    private l9(UUID uuid) {
        b1.a(uuid);
        b1.a(!t2.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm(a(uuid));
        this.b = mediaDrm;
        this.c = 1;
        if (t2.d.equals(uuid) && e()) {
            a(mediaDrm);
        }
    }

    private static boolean e() {
        return "ASUS_Z00AD".equals(xp.d);
    }

    @Override // com.applovin.impl.y7
    public y7.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new y7.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.applovin.impl.y7
    public int c() {
        return 2;
    }

    @Override // com.applovin.impl.y7
    /* renamed from: f */
    public k9 d(byte[] bArr) {
        boolean z;
        if (xp.a < 21 && t2.d.equals(this.a) && "L3".equals(a("securityLevel"))) {
            z = true;
        } else {
            z = false;
        }
        return new k9(a(this.a), bArr, z);
    }

    private static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static byte[] e(byte[] bArr) {
        int indexOf;
        ah ahVar = new ah(bArr);
        int m = ahVar.m();
        short o = ahVar.o();
        short o2 = ahVar.o();
        if (o == 1 && o2 == 1) {
            short o3 = ahVar.o();
            Charset charset = Charsets.UTF_16LE;
            String a2 = ahVar.a(o3, charset);
            if (a2.contains("<LA_URL>")) {
                return bArr;
            }
            if (a2.indexOf("</DATA>") == -1) {
                oc.d("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = a2.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + a2.substring(indexOf);
            int i = m + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i);
            allocate.putShort(o);
            allocate.putShort(o2);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(charset));
            return allocate.array();
        }
        oc.c("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    @Override // com.applovin.impl.y7
    public void c(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y7 b(UUID uuid) {
        try {
            return c(uuid);
        } catch (sp unused) {
            oc.b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new f7();
        }
    }

    public static l9 c(UUID uuid) {
        try {
            return new l9(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new sp(1, e);
        } catch (Exception e2) {
            throw new sp(2, e2);
        }
    }

    @Override // com.applovin.impl.y7
    public y7.a a(byte[] bArr, List list, int i, HashMap hashMap) {
        x6.b bVar;
        byte[] bArr2;
        String str;
        if (list != null) {
            bVar = a(this.a, list);
            bArr2 = b(this.a, (byte[]) b1.a(bVar.f));
            str = a(this.a, bVar.d);
        } else {
            bVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.b.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] a2 = a(this.a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar != null && !TextUtils.isEmpty(bVar.c)) {
            defaultUrl = bVar.c;
        }
        return new y7.a(a2, defaultUrl, xp.a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // com.applovin.impl.y7
    public byte[] d() {
        return this.b.openSession();
    }

    @Override // com.applovin.impl.y7
    public Map b(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // com.applovin.impl.y7
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (t2.c.equals(this.a)) {
            bArr2 = i3.b(bArr2);
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        if ("AFTT".equals(r0) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] b(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = com.applovin.impl.t2.e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = com.applovin.impl.ji.a(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = e(r4)
            byte[] r4 = com.applovin.impl.ji.a(r0, r4)
        L18:
            int r1 = com.applovin.impl.xp.a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = com.applovin.impl.t2.d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = com.applovin.impl.xp.c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.String r0 = com.applovin.impl.xp.d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = com.applovin.impl.ji.a(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.l9.b(java.util.UUID, byte[]):byte[]");
    }

    public String a(String str) {
        return this.b.getPropertyString(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(y7.b bVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        bVar.a(this, bArr, i, i2, bArr2);
    }

    @Override // com.applovin.impl.y7
    public void a(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // com.applovin.impl.y7
    public synchronized void a() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override // com.applovin.impl.y7
    public void a(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // com.applovin.impl.y7
    public void a(final y7.b bVar) {
        this.b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: uj0
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                l9.this.a(bVar, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    @Override // com.applovin.impl.y7
    public boolean a(byte[] bArr, String str) {
        if (xp.a >= 31) {
            return a.a(this.b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    private static x6.b a(UUID uuid, List list) {
        if (!t2.d.equals(uuid)) {
            return (x6.b) list.get(0);
        }
        if (xp.a >= 28 && list.size() > 1) {
            x6.b bVar = (x6.b) list.get(0);
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                x6.b bVar2 = (x6.b) list.get(i2);
                byte[] bArr = (byte[]) b1.a(bVar2.f);
                if (xp.a((Object) bVar2.d, (Object) bVar.d) && xp.a((Object) bVar2.c, (Object) bVar.c) && ji.a(bArr)) {
                    i += bArr.length;
                }
            }
            byte[] bArr2 = new byte[i];
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                byte[] bArr3 = (byte[]) b1.a(((x6.b) list.get(i4)).f);
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i3, length);
                i3 += length;
            }
            return bVar.a(bArr2);
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            x6.b bVar3 = (x6.b) list.get(i5);
            int d2 = ji.d((byte[]) b1.a(bVar3.f));
            int i6 = xp.a;
            if (i6 < 23 && d2 == 0) {
                return bVar3;
            }
            if (i6 >= 23 && d2 == 1) {
                return bVar3;
            }
        }
        return (x6.b) list.get(0);
    }

    private static UUID a(UUID uuid) {
        return (xp.a >= 27 || !t2.c.equals(uuid)) ? uuid : t2.b;
    }

    private static String a(UUID uuid, String str) {
        return (xp.a < 26 && t2.c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static byte[] a(UUID uuid, byte[] bArr) {
        return t2.c.equals(uuid) ? i3.a(bArr) : bArr;
    }
}
