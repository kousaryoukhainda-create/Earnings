package io.flutter.plugins.googlemobileads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
class FlutterInitializationStatus {
    @NonNull
    final Map<String, FlutterAdapterStatus> adapterStatuses;

    public FlutterInitializationStatus(@NonNull Map<String, FlutterAdapterStatus> map) {
        this.adapterStatuses = map;
    }

    public FlutterInitializationStatus(@NonNull InitializationStatus initializationStatus) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, AdapterStatus> entry : initializationStatus.getAdapterStatusMap().entrySet()) {
            hashMap.put(entry.getKey(), new FlutterAdapterStatus(entry.getValue()));
        }
        this.adapterStatuses = hashMap;
    }
}
