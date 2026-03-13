package com.fyber.inneractive.sdk.click;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.click.l;
import com.fyber.inneractive.sdk.network.w;
import java.util.List;
/* loaded from: classes.dex */
public class k implements w<c> {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ l c;

    public k(l lVar, String str, String str2) {
        this.c = lVar;
        this.a = str;
        this.b = str2;
    }

    @Override // com.fyber.inneractive.sdk.network.w
    public void a(c cVar, Exception exc, boolean z) {
        c cVar2 = cVar;
        if (exc != null) {
            l.a(this.c, (String) null, this.a, this.b);
        } else if (cVar2 != null) {
            String str = this.a;
            if (cVar2.a.size() > 1) {
                List<String> list = cVar2.a;
                str = list.get(list.size() - 1);
            }
            b a = this.c.a(str);
            if ((a == null || a.a == l.d.FAILED) && !TextUtils.isEmpty(cVar2.b)) {
                l.a(this.c, cVar2, str, true);
                l.a(this.c, cVar2.b, str, this.b);
                return;
            }
            l.a(this.c, cVar2, str, false);
            if (this.c.e.size() == 0) {
                this.c.e.add(new i(str, false, l.d.INTERNAL_REDIRECT, null));
            }
            this.c.a(l.a(str, "followRedirects", "Invalid response"));
        }
    }
}
