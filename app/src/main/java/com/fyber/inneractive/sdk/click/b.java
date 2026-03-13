package com.fyber.inneractive.sdk.click;

import com.fyber.inneractive.sdk.click.l;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class b {
    public final l.d a;
    public final Throwable b;
    public final String c;
    public final String d;
    public long e;
    public List<i> f = new ArrayList();

    public b(String str, l.d dVar, String str2, Throwable th) {
        this.d = str;
        this.a = dVar;
        this.c = str2;
        this.b = th;
    }

    public String toString() {
        String str;
        l.d dVar = this.a;
        if (dVar == l.d.FAILED) {
            Throwable th = this.b;
            if (th != null) {
                str = th.getMessage();
            } else {
                str = DevicePublicKeyStringDef.NONE;
            }
            return AbstractC2437ph.g("Open result: Failed! error: ", str);
        }
        String str2 = this.c;
        return "Open result: Success! target: " + dVar + " method: " + str2;
    }
}
