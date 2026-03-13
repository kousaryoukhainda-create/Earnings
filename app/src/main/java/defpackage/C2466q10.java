package defpackage;

import android.content.Intent;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: q10  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2466q10 implements PluginRegistry.ActivityResultListener {
    public MethodChannel.Result b;
    public AtomicBoolean c;

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        MethodChannel.Result result;
        if (i != 22643) {
            return false;
        }
        String str = SharePlusPendingIntent.a;
        if (this.c.compareAndSet(false, true) && (result = this.b) != null) {
            result.success(str);
            this.b = null;
        }
        return true;
    }
}
