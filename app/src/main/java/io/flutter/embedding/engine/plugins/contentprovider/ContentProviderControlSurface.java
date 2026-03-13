package io.flutter.embedding.engine.plugins.contentprovider;

import android.content.ContentProvider;
import androidx.annotation.NonNull;
/* loaded from: classes2.dex */
public interface ContentProviderControlSurface {
    void attachToContentProvider(@NonNull ContentProvider contentProvider, @NonNull CG cg);

    void detachFromContentProvider();
}
