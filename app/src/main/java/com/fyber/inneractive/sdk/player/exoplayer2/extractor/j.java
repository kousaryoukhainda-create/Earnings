package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.metadata.a;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class j {
    public static final g.a c = new a();
    public static final Pattern d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    /* loaded from: classes.dex */
    public class a implements g.a {
    }

    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.metadata.a aVar) {
        int i = 0;
        while (true) {
            a.b[] bVarArr = aVar.a;
            if (i >= bVarArr.length) {
                return false;
            }
            a.b bVar = bVarArr[i];
            if (bVar instanceof com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e) {
                com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e eVar = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e) bVar;
                String str = eVar.c;
                String str2 = eVar.d;
                if ("iTunSMPB".equals(str)) {
                    Matcher matcher = d.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int parseInt = Integer.parseInt(matcher.group(1), 16);
                            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                            if (parseInt > 0 || parseInt2 > 0) {
                                this.a = parseInt;
                                this.b = parseInt2;
                                return true;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    public boolean a() {
        return (this.a == -1 || this.b == -1) ? false : true;
    }
}
