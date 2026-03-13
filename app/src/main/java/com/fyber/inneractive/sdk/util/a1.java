package com.fyber.inneractive.sdk.util;
/* loaded from: classes.dex */
public class a1 {
    public static boolean a(String str, com.fyber.inneractive.sdk.model.vast.i iVar) {
        String str2;
        if (str != null) {
            str2 = str.substring(str.lastIndexOf(".") + 1);
        } else {
            str2 = "";
        }
        String str3 = iVar.toString();
        if (str3.equalsIgnoreCase(str2)) {
            return true;
        }
        if (!str2.equals("jpeg") && !str2.equals("jpg")) {
            return false;
        }
        if (str3.equals("Jpeg") || str3.equals("Jpg")) {
            return true;
        }
        return false;
    }
}
