package io.flutter.embedding.engine.plugins.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.flutter.embedding.android.ExclusiveAppComponent;
/* loaded from: classes2.dex */
public interface ActivityControlSurface {
    void attachToActivity(@NonNull ExclusiveAppComponent<Activity> exclusiveAppComponent, @NonNull CG cg);

    void detachFromActivity();

    void detachFromActivityForConfigChanges();

    boolean onActivityResult(int i, int i2, Intent intent);

    void onNewIntent(@NonNull Intent intent);

    boolean onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr);

    void onRestoreInstanceState(Bundle bundle);

    void onSaveInstanceState(@NonNull Bundle bundle);

    void onUserLeaveHint();
}
