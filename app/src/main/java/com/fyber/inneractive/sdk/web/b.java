package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.web.d;
/* loaded from: classes.dex */
public class b {
    public final com.fyber.inneractive.sdk.model.vast.b a;
    public String b;
    public com.fyber.inneractive.sdk.flow.vast.e c;

    /* loaded from: classes.dex */
    public static class a {
        public final String a;
        public final int b;

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }
    }

    public b(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.g gVar, com.fyber.inneractive.sdk.config.global.s sVar, com.fyber.inneractive.sdk.model.vast.b bVar) {
        this.a = bVar;
    }

    public final void a(d.InterfaceC0110d interfaceC0110d, d dVar, String str) {
        if (interfaceC0110d != null) {
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.g.COULD_NOT_LOAD_FMP_ENDCARD_TO_WEBVIEW);
            if (!TextUtils.isEmpty(str)) {
                inneractiveInfrastructureError.setCause(new Exception(str));
            }
            interfaceC0110d.a(dVar, inneractiveInfrastructureError);
        }
    }

    public void a(com.fyber.inneractive.sdk.flow.vast.e eVar) {
        this.c = eVar;
    }
}
