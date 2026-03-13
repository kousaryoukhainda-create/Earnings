package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.network.w;
/* loaded from: classes.dex */
public class h implements w<String> {
    public final /* synthetic */ i a;

    public h(i iVar) {
        this.a = iVar;
    }

    @Override // com.fyber.inneractive.sdk.network.w
    public void a(String str, Exception exc, boolean z) {
        String str2 = str;
        if (str2 != null) {
            this.a.d = str2;
        }
    }
}
