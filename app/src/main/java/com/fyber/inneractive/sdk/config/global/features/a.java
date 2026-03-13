package com.fyber.inneractive.sdk.config.global.features;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
/* loaded from: classes.dex */
public class a extends g {
    public static final EnumC0061a e = EnumC0061a.NONE;

    /* renamed from: com.fyber.inneractive.sdk.config.global.features.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0061a {
        NONE(DevicePublicKeyStringDef.NONE),
        OPEN("open");
        
        public String mKey;

        EnumC0061a(String str) {
            this.mKey = str;
        }
    }

    public a() {
        super("ad_identifier");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.g
    public g b() {
        a aVar = new a();
        a(aVar);
        return aVar;
    }
}
