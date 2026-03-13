package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.android.HwBuildEx;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: U5  reason: default package */
/* loaded from: classes.dex */
public final class U5 {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object d;

    public static boolean a(String str) {
        if (!TextUtils.isEmpty(str) && Pattern.matches("^\\[!([A-Fa-f0-9]*)]", str)) {
            return true;
        }
        return false;
    }

    public static String b(String str) {
        try {
            Matcher matcher = Pattern.compile("^\\[!([A-Fa-f0-9]*)]").matcher(str);
            if (!matcher.find()) {
                return "";
            }
            return matcher.group(1);
        } catch (IllegalStateException | IndexOutOfBoundsException unused) {
            Log.e("AGC_Mark", "getRawString exception");
            return "";
        }
    }

    public String c(String str) {
        String str2;
        switch (this.a) {
            case 3:
                if (!this.b) {
                    InterfaceC3208yg interfaceC3208yg = (InterfaceC3208yg) this.c;
                    try {
                        this.d = Gi0.b(new C2948vf(interfaceC3208yg.getString("/code/code1", null), interfaceC3208yg.getString("/code/code2", null), interfaceC3208yg.getString("/code/code3", null), interfaceC3208yg.getString("/code/code4", null), "PBKDF2WithHmacSHA1", HwBuildEx.VersionCodes.CUR_DEVELOPMENT));
                    } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused) {
                        Log.e("AGC_Mark", "Exception when reading the 'K&I' for 'Config'.");
                        this.d = null;
                    }
                    this.b = true;
                }
                if (((SecretKeySpec) this.d) == null) {
                    str2 = "mKey is null, return default value";
                } else if (!a(str)) {
                    return null;
                } else {
                    try {
                        return new String(Gi0.e((SecretKeySpec) this.d, CB.a(b(str))), "UTF-8");
                    } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException unused2) {
                        str2 = "UnsupportedEncodingException||GeneralSecurityException||IllegalArgumentException";
                    }
                }
                Log.e("AGC_Mark", str2);
                return null;
            default:
                if (!this.b) {
                    try {
                        this.c = Gi0.b((C2948vf) this.d);
                    } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException unused3) {
                        Log.e("AGC_LocalResource", "Exception when reading the 'K&I' for 'Config'.");
                        this.c = null;
                    }
                    this.b = true;
                }
                if (((SecretKeySpec) this.c) == null || TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    return new String(Gi0.e((SecretKeySpec) this.c, CB.a(str)), "UTF-8");
                } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e) {
                    Log.e("AGC_LocalResource", "decrypt exception:" + e.getMessage());
                    return null;
                }
        }
    }

    public void d() {
        if (this.b) {
            ((Context) this.c).unregisterReceiver((T5) this.d);
            this.b = false;
        }
    }

    public U5(C2948vf c2948vf) {
        this.a = 4;
        this.b = false;
        this.d = c2948vf;
    }

    public U5(InterfaceC3208yg interfaceC3208yg) {
        this.a = 3;
        this.b = false;
        this.c = interfaceC3208yg;
    }

    public U5(Context context, Handler handler, SurfaceHolder$CallbackC0619Ss surfaceHolder$CallbackC0619Ss) {
        this.a = 0;
        this.c = context.getApplicationContext();
        this.d = new T5(this, handler, surfaceHolder$CallbackC0619Ss);
    }

    public U5(InterfaceC3218yl interfaceC3218yl) {
        this.a = 1;
        this.c = interfaceC3218yl;
        this.d = new C0539Pq(27);
    }
}
