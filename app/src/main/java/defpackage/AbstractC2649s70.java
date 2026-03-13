package defpackage;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: s70  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2649s70 {
    public final TopicsManager a;

    public AbstractC2649s70(TopicsManager mTopicsManager) {
        Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
        this.a = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(defpackage.AbstractC2649s70 r5, defpackage.SA r6, defpackage.InterfaceC2868ui r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C2563r70
            if (r0 == 0) goto L13
            r0 = r7
            r70 r0 = (defpackage.C2563r70) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            r70 r0 = new r70
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            Ui r1 = defpackage.EnumC0661Ui.b
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            s70 r5 = r0.b
            defpackage.AbstractC1522hL.T(r7)
            goto L66
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.AbstractC1522hL.T(r7)
            android.adservices.topics.GetTopicsRequest r6 = r5.a(r6)
            r0.b = r5
            r0.f = r3
            jc r7 = new jc
            ui r2 = defpackage.B10.N(r0)
            r7.<init>(r3, r2)
            r7.s()
            android.adservices.topics.TopicsManager r2 = r5.a
            S4 r3 = new S4
            r4 = 2
            r3.<init>(r4)
            yi r4 = new yi
            r4.<init>(r7)
            defpackage.AbstractC2738t9.v(r2, r6, r3, r4)
            java.lang.Object r7 = r7.r()
            if (r7 != r1) goto L63
            java.lang.String r6 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
        L63:
            if (r7 != r1) goto L66
            return r1
        L66:
            android.adservices.topics.GetTopicsResponse r6 = defpackage.AbstractC2738t9.k(r7)
            TA r5 = r5.b(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2649s70.d(s70, SA, ui):java.lang.Object");
    }

    public GetTopicsRequest a(SA request) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest build;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(request, "request");
        GetTopicsRequest.Builder g = AbstractC2738t9.g();
        request.getClass();
        adsSdkName = g.setAdsSdkName(MobileAds.ERROR_DOMAIN);
        build = adsSdkName.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }

    public TA b(GetTopicsResponse response) {
        List<Object> topics;
        long taxonomyVersion;
        long modelVersion;
        int topicId;
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(response, "response");
        ArrayList arrayList = new ArrayList();
        topics = response.getTopics();
        for (Object obj : topics) {
            Topic l = AbstractC2738t9.l(obj);
            taxonomyVersion = l.getTaxonomyVersion();
            modelVersion = l.getModelVersion();
            topicId = l.getTopicId();
            arrayList.add(new C2134m70(taxonomyVersion, modelVersion, topicId));
        }
        return new TA(arrayList);
    }

    public Object c(@NotNull SA sa, @NotNull InterfaceC2868ui interfaceC2868ui) {
        return d(this, sa, interfaceC2868ui);
    }
}
