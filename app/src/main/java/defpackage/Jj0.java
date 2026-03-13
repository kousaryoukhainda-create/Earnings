package defpackage;

import io.adjoe.sdk.Playtime;
/* renamed from: Jj0  reason: default package */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class Jj0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Playtime.CampaignType.values().length];
        a = iArr;
        try {
            iArr[Playtime.CampaignType.ORGANIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Playtime.CampaignType.AFFILIATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[Playtime.CampaignType.INCENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[Playtime.CampaignType.NETWORK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[Playtime.CampaignType.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
