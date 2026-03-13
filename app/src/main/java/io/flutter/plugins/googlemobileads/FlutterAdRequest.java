package io.flutter.plugins.googlemobileads;

import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class FlutterAdRequest {
    private final Map<String, String> adMobExtras;
    private final String contentUrl;
    private final Integer httpTimeoutMillis;
    private final List<String> keywords;
    private final List<FlutterMediationExtras> mediationExtras;
    private final String mediationExtrasIdentifier;
    private final MediationNetworkExtrasProvider mediationNetworkExtrasProvider;
    private final List<String> neighboringContentUrls;
    private final Boolean nonPersonalizedAds;
    @NonNull
    private final String requestAgent;

    /* loaded from: classes2.dex */
    public static class Builder {
        private Map<String, String> adMobExtras;
        private String contentUrl;
        private Integer httpTimeoutMillis;
        private List<String> keywords;
        private List<FlutterMediationExtras> mediationExtras;
        private String mediationExtrasIdentifier;
        private MediationNetworkExtrasProvider mediationNetworkExtrasProvider;
        private List<String> neighboringContentUrls;
        private Boolean nonPersonalizedAds;
        @NonNull
        private String requestAgent;

        public FlutterAdRequest build() {
            return new FlutterAdRequest(this.keywords, this.contentUrl, this.nonPersonalizedAds, this.neighboringContentUrls, this.httpTimeoutMillis, this.mediationExtrasIdentifier, this.mediationNetworkExtrasProvider, this.adMobExtras, this.requestAgent, this.mediationExtras);
        }

        public Map<String, String> getAdMobExtras() {
            return this.adMobExtras;
        }

        public String getContentUrl() {
            return this.contentUrl;
        }

        public Integer getHttpTimeoutMillis() {
            return this.httpTimeoutMillis;
        }

        public List<String> getKeywords() {
            return this.keywords;
        }

        public List<FlutterMediationExtras> getMediationExtras() {
            return this.mediationExtras;
        }

        public String getMediationExtrasIdentifier() {
            return this.mediationExtrasIdentifier;
        }

        public MediationNetworkExtrasProvider getMediationNetworkExtrasProvider() {
            return this.mediationNetworkExtrasProvider;
        }

        public List<String> getNeighboringContentUrls() {
            return this.neighboringContentUrls;
        }

        public Boolean getNonPersonalizedAds() {
            return this.nonPersonalizedAds;
        }

        @NonNull
        public String getRequestAgent() {
            return this.requestAgent;
        }

        public Builder setAdMobExtras(Map<String, String> map) {
            this.adMobExtras = map;
            return this;
        }

        public Builder setContentUrl(String str) {
            this.contentUrl = str;
            return this;
        }

        public Builder setHttpTimeoutMillis(Integer num) {
            this.httpTimeoutMillis = num;
            return this;
        }

        public Builder setKeywords(List<String> list) {
            this.keywords = list;
            return this;
        }

        public Builder setMediationExtras(List<FlutterMediationExtras> list) {
            this.mediationExtras = list;
            return this;
        }

        public Builder setMediationNetworkExtrasIdentifier(String str) {
            this.mediationExtrasIdentifier = str;
            return this;
        }

        public Builder setMediationNetworkExtrasProvider(MediationNetworkExtrasProvider mediationNetworkExtrasProvider) {
            this.mediationNetworkExtrasProvider = mediationNetworkExtrasProvider;
            return this;
        }

        public Builder setNeighboringContentUrls(List<String> list) {
            this.neighboringContentUrls = list;
            return this;
        }

        public Builder setNonPersonalizedAds(Boolean bool) {
            this.nonPersonalizedAds = bool;
            return this;
        }

        public Builder setRequestAgent(String str) {
            this.requestAgent = str;
            return this;
        }
    }

    public FlutterAdRequest(List<String> list, String str, Boolean bool, List<String> list2, Integer num, String str2, MediationNetworkExtrasProvider mediationNetworkExtrasProvider, Map<String, String> map, String str3, List<FlutterMediationExtras> list3) {
        this.keywords = list;
        this.contentUrl = str;
        this.nonPersonalizedAds = bool;
        this.neighboringContentUrls = list2;
        this.httpTimeoutMillis = num;
        this.mediationExtrasIdentifier = str2;
        this.mediationNetworkExtrasProvider = mediationNetworkExtrasProvider;
        this.adMobExtras = map;
        this.requestAgent = str3;
        this.mediationExtras = list3;
    }

    private <T extends AbstractAdRequestBuilder<T>> void addNetworkExtras(AbstractAdRequestBuilder<T> abstractAdRequestBuilder, String str) {
        HashMap hashMap = new HashMap();
        List<FlutterMediationExtras> list = this.mediationExtras;
        if (list != null) {
            for (FlutterMediationExtras flutterMediationExtras : list) {
                Pair<Class<? extends MediationExtrasReceiver>, Bundle> mediationExtras = flutterMediationExtras.getMediationExtras();
                hashMap.put((Class) mediationExtras.first, (Bundle) mediationExtras.second);
            }
        } else {
            MediationNetworkExtrasProvider mediationNetworkExtrasProvider = this.mediationNetworkExtrasProvider;
            if (mediationNetworkExtrasProvider != null) {
                hashMap.putAll(mediationNetworkExtrasProvider.getMediationExtras(str, this.mediationExtrasIdentifier));
            }
        }
        Map<String, String> map = this.adMobExtras;
        if (map != null && !map.isEmpty()) {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.adMobExtras.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            hashMap.put(AdMobAdapter.class, bundle);
        }
        Boolean bool = this.nonPersonalizedAds;
        if (bool != null && bool.booleanValue()) {
            Bundle bundle2 = (Bundle) hashMap.get(AdMobAdapter.class);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("npa", "1");
            hashMap.put(AdMobAdapter.class, bundle2);
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            abstractAdRequestBuilder.addNetworkExtrasBundle((Class) entry2.getKey(), (Bundle) entry2.getValue());
        }
    }

    public AdRequest asAdRequest(String str) {
        return ((AdRequest.Builder) updateAdRequestBuilder(new AdRequest.Builder(), str)).build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterAdRequest)) {
            return false;
        }
        FlutterAdRequest flutterAdRequest = (FlutterAdRequest) obj;
        if (Objects.equals(this.keywords, flutterAdRequest.keywords) && Objects.equals(this.contentUrl, flutterAdRequest.contentUrl) && Objects.equals(this.nonPersonalizedAds, flutterAdRequest.nonPersonalizedAds) && Objects.equals(this.neighboringContentUrls, flutterAdRequest.neighboringContentUrls) && Objects.equals(this.httpTimeoutMillis, flutterAdRequest.httpTimeoutMillis) && Objects.equals(this.mediationExtrasIdentifier, flutterAdRequest.mediationExtrasIdentifier) && Objects.equals(this.mediationNetworkExtrasProvider, flutterAdRequest.mediationNetworkExtrasProvider) && Objects.equals(this.adMobExtras, flutterAdRequest.adMobExtras)) {
            return true;
        }
        return false;
    }

    public Map<String, String> getAdMobExtras() {
        return this.adMobExtras;
    }

    public String getContentUrl() {
        return this.contentUrl;
    }

    public Integer getHttpTimeoutMillis() {
        return this.httpTimeoutMillis;
    }

    public List<String> getKeywords() {
        return this.keywords;
    }

    public List<FlutterMediationExtras> getMediationExtras() {
        return this.mediationExtras;
    }

    public String getMediationExtrasIdentifier() {
        return this.mediationExtrasIdentifier;
    }

    public List<String> getNeighboringContentUrls() {
        return this.neighboringContentUrls;
    }

    public Boolean getNonPersonalizedAds() {
        return this.nonPersonalizedAds;
    }

    @NonNull
    public String getRequestAgent() {
        return this.requestAgent;
    }

    public int hashCode() {
        return Objects.hash(this.keywords, this.contentUrl, this.nonPersonalizedAds, this.neighboringContentUrls, this.httpTimeoutMillis, this.mediationExtrasIdentifier, this.mediationNetworkExtrasProvider, this.mediationExtras);
    }

    public <T extends AbstractAdRequestBuilder<T>> AbstractAdRequestBuilder<T> updateAdRequestBuilder(AbstractAdRequestBuilder<T> abstractAdRequestBuilder, String str) {
        List<String> list = this.keywords;
        if (list != null) {
            for (String str2 : list) {
                abstractAdRequestBuilder.addKeyword(str2);
            }
        }
        String str3 = this.contentUrl;
        if (str3 != null) {
            abstractAdRequestBuilder.setContentUrl(str3);
        }
        addNetworkExtras(abstractAdRequestBuilder, str);
        List<String> list2 = this.neighboringContentUrls;
        if (list2 != null) {
            abstractAdRequestBuilder.setNeighboringContentUrls(list2);
        }
        Integer num = this.httpTimeoutMillis;
        if (num != null) {
            abstractAdRequestBuilder.setHttpTimeoutMillis(num.intValue());
        }
        abstractAdRequestBuilder.setRequestAgent(this.requestAgent);
        return abstractAdRequestBuilder;
    }
}
