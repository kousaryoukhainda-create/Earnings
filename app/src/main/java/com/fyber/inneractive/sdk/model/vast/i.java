package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public enum i {
    Jpeg("image/jpeg"),
    Jpg("image/jpg"),
    Gif("image/gif"),
    Png("image/png");
    
    private static final Map<String, i> sCreativeTypeMap = new HashMap();
    private String mMimeType;

    static {
        i[] values;
        for (i iVar : values()) {
            sCreativeTypeMap.put(iVar.mMimeType, iVar);
        }
    }

    i(String str) {
        this.mMimeType = str;
    }

    public static i a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return sCreativeTypeMap.get(str.toLowerCase());
        }
        return null;
    }

    public String e() {
        return this.mMimeType;
    }
}
