package com.google.android.gms.tagmanager;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
/* loaded from: classes3.dex */
public interface ContainerHolder extends Result, Releasable {

    /* loaded from: classes3.dex */
    public interface ContainerAvailableListener {
        void onContainerAvailable(@NonNull ContainerHolder containerHolder, @NonNull String str);
    }

    @NonNull
    Container getContainer();

    void refresh();

    void setContainerAvailableListener(@NonNull ContainerAvailableListener containerAvailableListener);
}
