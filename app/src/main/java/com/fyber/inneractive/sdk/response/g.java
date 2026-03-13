package com.fyber.inneractive.sdk.response;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.model.vast.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class g extends e {
    public long J;
    public com.fyber.inneractive.sdk.model.vast.b K;
    public final List<com.fyber.inneractive.sdk.measurement.f> N = new ArrayList();
    public Map<o, com.fyber.inneractive.sdk.flow.vast.g> L = new LinkedHashMap();
    public List<com.fyber.inneractive.sdk.model.vast.g> M = new ArrayList();
    public LinkedHashMap<String, String> O = new LinkedHashMap<>();

    @Override // com.fyber.inneractive.sdk.response.e
    public InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest) {
        return a(null, null);
    }

    public List<com.fyber.inneractive.sdk.measurement.f> d() {
        return this.N;
    }

    public com.fyber.inneractive.sdk.model.vast.b e() {
        return this.K;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(19:3|(1:5)|110|111|(5:8|(1:10)(1:15)|11|(1:13)|14)|16|(9:20|(1:22)(1:59)|23|(14:26|27|28|29|(1:31)(1:46)|32|(1:34)|35|(1:37)|(1:39)|40|(2:42|43)(1:45)|44|24)|52|53|54|55|56)|60|(1:62)(1:109)|63|(1:65)(1:108)|66|(1:68)(1:107)|69|70|71|72|(2:74|(9:76|(1:78)(1:102)|79|(7:82|83|84|(1:86)|(3:88|89|90)(1:92)|91|80)|95|96|97|98|99))|103)(19:112|(2:114|(19:120|(8:123|124|125|(1:127)(1:135)|128|(2:130|131)(2:133|134)|132|121)|138|139|(0)|16|(10:18|20|(0)(0)|23|(1:24)|52|53|54|55|56)|60|(0)(0)|63|(0)(0)|66|(0)(0)|69|70|71|72|(0)|103))(2:140|(1:142)(2:143|(1:145)(2:146|(1:148)(2:149|(1:151)(17:152|111|(0)|16|(0)|60|(0)(0)|63|(0)(0)|66|(0)(0)|69|70|71|72|(0)|103)))))|110|111|(0)|16|(0)|60|(0)(0)|63|(0)(0)|66|(0)(0)|69|70|71|72|(0)|103)|6|(0)|16|(0)|60|(0)(0)|63|(0)(0)|66|(0)(0)|69|70|71|72|(0)|103) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0233, code lost:
        com.fyber.inneractive.sdk.util.IAlog.e("Got exception adding param to json object: %s, %s", "number_of_endcards", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0209  */
    @Override // com.fyber.inneractive.sdk.response.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fyber.inneractive.sdk.external.InneractiveErrorCode a(com.fyber.inneractive.sdk.external.InneractiveAdRequest r17, com.fyber.inneractive.sdk.config.global.s r18) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.response.g.a(com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.config.global.s):com.fyber.inneractive.sdk.external.InneractiveErrorCode");
    }
}
