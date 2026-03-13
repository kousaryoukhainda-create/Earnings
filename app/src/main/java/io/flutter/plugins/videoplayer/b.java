package io.flutter.plugins.videoplayer;

import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugins.videoplayer.VideoPlayerPlugin;
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements VideoPlayerPlugin.KeyForAssetFn, VideoPlayerPlugin.KeyForAssetAndPackageName {
    public final /* synthetic */ FlutterLoader a;

    @Override // io.flutter.plugins.videoplayer.VideoPlayerPlugin.KeyForAssetFn
    public String get(String str) {
        return this.a.getLookupKeyForAsset(str);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerPlugin.KeyForAssetAndPackageName
    public String get(String str, String str2) {
        return this.a.getLookupKeyForAsset(str, str2);
    }
}
