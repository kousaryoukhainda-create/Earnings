package crypto.bitcoin.ethereum.litecoin.cloud.mining.eth.btc.ltc.hash.pool.cloud_mining;

import android.util.Log;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata
/* loaded from: classes2.dex */
public final class MainActivity extends FlutterActivity {
    public static final /* synthetic */ int f = 0;
    public final ArrayList b = new ArrayList();
    public final String c = "lowhillgames.com/ads";
    public final String d = "lowhillgames.com/events";

    public final void a(HashMap event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((EventChannel.EventSink) it.next()).success(event);
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivity, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public final void configureFlutterEngine(FlutterEngine flutterEngine) {
        Intrinsics.checkNotNullParameter(flutterEngine, "flutterEngine");
        super.configureFlutterEngine(flutterEngine);
        StringBuilder sb = new StringBuilder();
        String str = this.c;
        sb.append(str);
        sb.append(" configureFlutterEngine");
        Log.d("MainActivity", sb.toString());
        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), str).setMethodCallHandler(new C3318zx(this, 12));
        new EventChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), this.d).setStreamHandler(new PI(this));
    }
}
