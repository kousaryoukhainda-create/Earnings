package com.google.android.recaptcha;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public interface RecaptchaTasksClient {
    @NotNull
    Task<String> executeTask(@NonNull RecaptchaAction recaptchaAction);

    @NotNull
    Task<String> executeTask(@NonNull RecaptchaAction recaptchaAction, long j);
}
