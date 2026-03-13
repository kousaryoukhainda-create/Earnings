package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.v;
/* loaded from: classes.dex */
public final class b {
    public static boolean a(e eVar, int i, Exception exc, long j) {
        if (a(exc)) {
            boolean a = eVar.a(i, j);
            int i2 = ((v) exc).a;
            if (a) {
                Log.w("ChunkedTrackBlacklist", "Blacklisted: duration=" + j + ", responseCode=" + i2 + ", format=" + eVar.a(i));
            } else {
                StringBuilder i3 = AbstractC0324Hi.i(i2, "Blacklisting failed (cannot blacklist last enabled track): responseCode=", ", format=");
                i3.append(eVar.a(i));
                Log.w("ChunkedTrackBlacklist", i3.toString());
            }
            return a;
        }
        return false;
    }

    public static boolean a(Exception exc) {
        if (exc instanceof v) {
            int i = ((v) exc).a;
            return i == 404 || i == 410;
        }
        return false;
    }
}
