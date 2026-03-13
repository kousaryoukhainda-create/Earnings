package defpackage;

import java.util.HashMap;
/* renamed from: kA  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1967kA {
    public static final C1967kA b = new C1967kA();
    public final K3 a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, K3, java.util.HashMap] */
    public C1967kA() {
        ?? hashMap = new HashMap();
        hashMap.put("installs", "https://service.fyber.com/installs/v2");
        hashMap.put("vcs", "https://api.fyber.com/vcs/v1/new_credit.json");
        hashMap.put("ofw", "https://offer.fyber.com/mobile");
        this.a = hashMap;
    }
}
