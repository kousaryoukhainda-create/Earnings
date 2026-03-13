package defpackage;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: y2  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3154y2 implements InterfaceC3304zl {
    public final InterfaceC3304zl b;
    public final byte[] c;
    public final byte[] d;
    public CipherInputStream f;

    public C3154y2(InterfaceC3304zl interfaceC3304zl, byte[] bArr, byte[] bArr2) {
        this.b = interfaceC3304zl;
        this.c = bArr;
        this.d = bArr2;
    }

    @Override // defpackage.InterfaceC3304zl
    public final Uri A() {
        return this.b.A();
    }

    @Override // defpackage.InterfaceC3304zl
    public final void close() {
        if (this.f != null) {
            this.f = null;
            this.b.close();
        }
    }

    @Override // defpackage.InterfaceC3304zl
    public final long g(C0223Dl c0223Dl) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.c, "AES"), new IvParameterSpec(this.d));
                C0171Bl c0171Bl = new C0171Bl(this.b, c0223Dl);
                this.f = new CipherInputStream(c0171Bl, cipher);
                c0171Bl.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.InterfaceC3304zl
    public final void i(U70 u70) {
        u70.getClass();
        this.b.i(u70);
    }

    @Override // defpackage.InterfaceC3046wl
    public final int read(byte[] bArr, int i, int i2) {
        this.f.getClass();
        int read = this.f.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // defpackage.InterfaceC3304zl
    public final Map t() {
        return this.b.t();
    }
}
