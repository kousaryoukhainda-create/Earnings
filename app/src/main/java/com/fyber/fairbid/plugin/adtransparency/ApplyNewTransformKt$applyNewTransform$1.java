package com.fyber.fairbid.plugin.adtransparency;

import com.android.build.api.artifact.ScopedArtifact;
import com.android.build.api.variant.ScopedArtifacts;
import com.android.build.api.variant.Variant;
import com.android.build.gradle.BaseExtension;
import com.fyber.fairbid.plugin.adtransparency.tasks.InjectClassesTask;
import com.fyber.fairbid.plugin.adtransparency.utils.TpnInfoCollector;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.gradle.api.Action;
import org.gradle.api.Project;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.tasks.TaskProvider;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class ApplyNewTransformKt$applyNewTransform$1 extends AbstractC1431gG implements Function1 {
    final /* synthetic */ String $agpVersion;
    final /* synthetic */ BaseExtension $android;
    final /* synthetic */ String $currentFairBidVersion;
    final /* synthetic */ Project $project;
    final /* synthetic */ TpnInfoCollector $tpnInfoCollector;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata
    /* renamed from: com.fyber.fairbid.plugin.adtransparency.ApplyNewTransformKt$applyNewTransform$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class AnonymousClass1 extends KT {
        public static final VF INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(InjectClassesTask.class, "allIncomingJars", "getAllIncomingJars()Lorg/gradle/api/provider/ListProperty;", 0);
        }

        @Override // defpackage.KT, defpackage.VF
        public Object get(Object obj) {
            return ((InjectClassesTask) obj).getAllIncomingJars();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata
    /* renamed from: com.fyber.fairbid.plugin.adtransparency.ApplyNewTransformKt$applyNewTransform$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class AnonymousClass2 extends KT {
        public static final VF INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(InjectClassesTask.class, "allDirectories", "getAllDirectories()Lorg/gradle/api/provider/ListProperty;", 0);
        }

        @Override // defpackage.KT, defpackage.VF
        public Object get(Object obj) {
            return ((InjectClassesTask) obj).getAllDirectories();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata
    /* renamed from: com.fyber.fairbid.plugin.adtransparency.ApplyNewTransformKt$applyNewTransform$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class AnonymousClass3 extends KT {
        public static final VF INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(InjectClassesTask.class, "destination", "getDestination()Lorg/gradle/api/file/RegularFileProperty;", 0);
        }

        @Override // defpackage.KT, defpackage.VF
        public Object get(Object obj) {
            return ((InjectClassesTask) obj).getDestination();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplyNewTransformKt$applyNewTransform$1(Project project, BaseExtension baseExtension, TpnInfoCollector tpnInfoCollector, String str, String str2) {
        super(1);
        this.$project = project;
        this.$android = baseExtension;
        this.$tpnInfoCollector = tpnInfoCollector;
        this.$currentFairBidVersion = str;
        this.$agpVersion = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Variant) obj);
        return B90.a;
    }

    public final void invoke(@NotNull Variant variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        TaskProvider register = this.$project.getTasks().register(AbstractC0324Hi.h(new StringBuilder(), variant.getName(), "InjectClasses"), InjectClassesTask.class, new Action() { // from class: com.fyber.fairbid.plugin.adtransparency.ApplyNewTransformKt$applyNewTransform$1$taskProvider$1
            public final void execute(@NotNull InjectClassesTask receiver) {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                ListProperty<String> androidJars = receiver.getAndroidJars();
                List<File> bootClasspath = ApplyNewTransformKt$applyNewTransform$1.this.$android.getBootClasspath();
                ArrayList arrayList = new ArrayList(C0372Je.f(bootClasspath));
                for (File file : bootClasspath) {
                    arrayList.add(file.getAbsolutePath());
                }
                androidJars.set(arrayList);
                receiver.getTpnInfoCollector().set(ApplyNewTransformKt$applyNewTransform$1.this.$tpnInfoCollector);
                receiver.getCurrentFairBidVersion().set(ApplyNewTransformKt$applyNewTransform$1.this.$currentFairBidVersion);
                receiver.getAgpVersion().set(ApplyNewTransformKt$applyNewTransform$1.this.$agpVersion);
            }
        });
        Intrinsics.checkNotNullExpressionValue(register, "project.tasks.register(\"…agpVersion)\n            }");
        variant.getArtifacts().forScope(ScopedArtifacts.Scope.ALL).use(register).toTransform(ScopedArtifact.CLASSES.INSTANCE, AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE, AnonymousClass3.INSTANCE);
    }
}
