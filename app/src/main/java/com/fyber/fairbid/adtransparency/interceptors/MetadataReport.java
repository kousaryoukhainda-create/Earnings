package com.fyber.fairbid.adtransparency.interceptors;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class MetadataReport {
    public final String a;
    public final String b;

    public MetadataReport(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static /* synthetic */ MetadataReport copy$default(MetadataReport metadataReport, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = metadataReport.a;
        }
        if ((i & 2) != 0) {
            str2 = metadataReport.b;
        }
        return metadataReport.copy(str, str2);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    @NotNull
    public final MetadataReport copy(String str, String str2) {
        return new MetadataReport(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MetadataReport) {
            MetadataReport metadataReport = (MetadataReport) obj;
            return Intrinsics.a(this.a, metadataReport.a) && Intrinsics.a(this.b, metadataReport.b);
        }
        return false;
    }

    public final String getLoadInterceptorContent() {
        return this.b;
    }

    public final String getWebviewInterceptorContent() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isEmpty() {
        String str;
        String str2 = this.a;
        if ((str2 != null && !d.x(str2)) || ((str = this.b) != null && !d.x(str))) {
            return false;
        }
        return true;
    }

    @NotNull
    public String toString() {
        return "MetadataReport(webviewInterceptorContent=" + this.a + ", loadInterceptorContent=" + this.b + ')';
    }
}
