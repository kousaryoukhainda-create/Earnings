package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
/* loaded from: classes.dex */
public class h {
    public InputStream a(InputStream inputStream, boolean z) {
        InputStream bufferedInputStream;
        try {
            if (z) {
                IAlog.a("HttpExecutorBase: getInputStream found gzip encoding", new Object[0]);
                bufferedInputStream = new GZIPInputStream(inputStream);
            } else {
                IAlog.a("HttpExecutorBase: getInputStream no gzip encoding", new Object[0]);
                bufferedInputStream = new BufferedInputStream(inputStream);
            }
            return bufferedInputStream;
        } catch (Exception unused) {
            return null;
        }
    }

    public j a(InputStream inputStream, int i, String str, Map<String, List<String>> map, String str2) throws x0, b {
        try {
            j jVar = new j();
            jVar.c = inputStream;
            jVar.a = i;
            jVar.b = str;
            jVar.d = map;
            jVar.e = str2;
            if (i / 100 != 5) {
                return jVar;
            }
            throw new b(String.format("server returned error %d", Integer.valueOf(jVar.a)));
        } catch (b e) {
            IAlog.a("failed executing network request", e, new Object[0]);
            throw new b(e);
        } catch (Exception e2) {
            IAlog.a("failed reading network response", e2, new Object[0]);
            throw new x0(e2);
        }
    }
}
