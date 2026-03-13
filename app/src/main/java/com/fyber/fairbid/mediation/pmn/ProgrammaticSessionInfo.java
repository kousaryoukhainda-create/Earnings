package com.fyber.fairbid.mediation.pmn;
/* loaded from: classes.dex */
public class ProgrammaticSessionInfo {
    public final String a;
    public final String b;
    public final String c;

    public ProgrammaticSessionInfo(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public String getAppId() {
        return this.b;
    }

    public String getProgrammaticName() {
        return this.a;
    }

    public String getSessionId() {
        return this.c;
    }
}
