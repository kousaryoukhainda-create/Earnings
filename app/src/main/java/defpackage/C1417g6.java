package defpackage;

import android.media.AudioManager;
import android.os.Handler;
/* renamed from: g6  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1417g6 implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final /* synthetic */ C1503h6 b;

    public C1417g6(C1503h6 c1503h6, Handler handler) {
        this.b = c1503h6;
        this.a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.a.post(new RunnableC1331f6(i, 0, this));
    }
}
