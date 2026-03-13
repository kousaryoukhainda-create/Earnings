package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class AFc1gSDK<Body> implements ResponseNetwork<Body> {
    @NonNull
    private final Body AFInAppEventParameterName;
    @NonNull
    final Map<String, List<String>> AFInAppEventType;
    final boolean AFKeystoreWrapper;
    final int valueOf;
    @NonNull
    public final AFc1kSDK values;

    public AFc1gSDK(@NonNull Body body, int i, boolean z, Map<String, List<String>> map, @NonNull AFc1kSDK aFc1kSDK) {
        this.AFInAppEventParameterName = body;
        this.valueOf = i;
        this.AFKeystoreWrapper = z;
        this.AFInAppEventType = new HashMap(map);
        this.values = aFc1kSDK;
    }

    public final String AFInAppEventType(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField != null && !headerField.isEmpty()) {
            Iterator<String> it = headerField.iterator();
            StringBuilder sb = new StringBuilder(it.next());
            while (it.hasNext()) {
                sb.append(", ");
                sb.append(it.next());
            }
            return sb.toString();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFc1gSDK aFc1gSDK = (AFc1gSDK) obj;
        if (this.valueOf != aFc1gSDK.valueOf || this.AFKeystoreWrapper != aFc1gSDK.AFKeystoreWrapper || !this.AFInAppEventParameterName.equals(aFc1gSDK.AFInAppEventParameterName) || !this.AFInAppEventType.equals(aFc1gSDK.AFInAppEventType)) {
            return false;
        }
        return this.values.equals(aFc1gSDK.values);
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.AFInAppEventType.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.AFInAppEventType.get(str2);
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.valueOf;
    }

    public int hashCode() {
        int hashCode = this.AFInAppEventType.hashCode();
        return this.values.hashCode() + ((hashCode + (((((this.AFInAppEventParameterName.hashCode() * 31) + this.valueOf) * 31) + (this.AFKeystoreWrapper ? 1 : 0)) * 31)) * 31);
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.AFKeystoreWrapper;
    }
}
