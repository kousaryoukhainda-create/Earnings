package com.fyber.fairbid.plugin.adtransparency;

import com.android.build.api.variant.AndroidComponentsExtension;
import com.android.build.api.variant.VariantSelector;
import com.android.build.gradle.BaseExtension;
import com.fyber.fairbid.plugin.adtransparency.utils.TpnInfoCollector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.gradle.api.Project;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class ApplyNewTransformKt {
    public static final void applyNewTransform(@NotNull Project project, @NotNull TpnInfoCollector tpnInfoCollector, @NotNull String currentFairBidVersion, @NotNull String agpVersion) {
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(tpnInfoCollector, "tpnInfoCollector");
        Intrinsics.checkNotNullParameter(currentFairBidVersion, "currentFairBidVersion");
        Intrinsics.checkNotNullParameter(agpVersion, "agpVersion");
        Object byType = project.getExtensions().getByType(AndroidComponentsExtension.class);
        Intrinsics.checkNotNullExpressionValue(byType, "project.extensions.getBy…ntsExtension::class.java)");
        AndroidComponentsExtension androidComponentsExtension = (AndroidComponentsExtension) byType;
        Object findByName = project.getExtensions().findByName("android");
        if (!(findByName instanceof BaseExtension)) {
            findByName = null;
        }
        BaseExtension baseExtension = (BaseExtension) findByName;
        if (baseExtension != null) {
            AndroidComponentsExtension.onVariants$default(androidComponentsExtension, (VariantSelector) null, new ApplyNewTransformKt$applyNewTransform$1(project, baseExtension, tpnInfoCollector, currentFairBidVersion, agpVersion), 1, (Object) null);
        }
    }
}
