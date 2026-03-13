package com.fyber.fairbid.plugin.adtransparency;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.logging.Logger;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class AdTransparencyPlugin implements Plugin<Project> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String currentFairBidSdkVersion = "3.46.1";

    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VersionNumber getAndroidGradlePluginVersion(Project project) {
        return getClasspathVersion(project, "com.android.tools.build:gradle");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0074, code lost:
        if (r4 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0109, code lost:
        if (r3 == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.fyber.fairbid.plugin.adtransparency.VersionNumber getClasspathVersion(org.gradle.api.Project r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.fairbid.plugin.adtransparency.AdTransparencyPlugin.getClasspathVersion(org.gradle.api.Project, java.lang.String):com.fyber.fairbid.plugin.adtransparency.VersionNumber");
    }

    public void apply(@NotNull Project project) {
        Intrinsics.checkNotNullParameter(project, "project");
        Logger logger = project.getLogger();
        logger.info("FairBidSdkPlugin - Applying plugin to " + project.getName());
        if (project.findProperty("failIfInjectionProblemWithNetwork") != null) {
            project.delete(new Object[]{project.getBuildDir() + "/intermediates/transforms"});
        }
        project.getPlugins().withId("com.android.application", new AdTransparencyPlugin$apply$2(this, project));
    }
}
