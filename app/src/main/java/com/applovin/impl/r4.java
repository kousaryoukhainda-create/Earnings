package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* loaded from: classes.dex */
public final class r4 extends a2 {
    private final ContentResolver e;
    private Uri f;
    private AssetFileDescriptor g;
    private FileInputStream h;
    private long i;
    private boolean j;

    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Bundle bundle) {
            ApplicationMediaCapabilities.Builder addSupportedVideoMimeType;
            ApplicationMediaCapabilities.Builder addSupportedHdrType;
            ApplicationMediaCapabilities.Builder addSupportedHdrType2;
            ApplicationMediaCapabilities.Builder addSupportedHdrType3;
            ApplicationMediaCapabilities.Builder addSupportedHdrType4;
            ApplicationMediaCapabilities build;
            addSupportedVideoMimeType = Gk0.d().addSupportedVideoMimeType("video/hevc");
            addSupportedHdrType = addSupportedVideoMimeType.addSupportedHdrType("android.media.feature.hdr.dolby_vision");
            addSupportedHdrType2 = addSupportedHdrType.addSupportedHdrType("android.media.feature.hdr.hdr10");
            addSupportedHdrType3 = addSupportedHdrType2.addSupportedHdrType("android.media.feature.hdr.hdr10_plus");
            addSupportedHdrType4 = addSupportedHdrType3.addSupportedHdrType("android.media.feature.hdr.hlg");
            build = addSupportedHdrType4.build();
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", build);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends i5 {
        public b(IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public r4(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // com.applovin.impl.h5
    public long a(k5 k5Var) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = k5Var.a;
            this.f = uri;
            b(k5Var);
            if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(k5Var.a.getScheme())) {
                Bundle bundle = new Bundle();
                if (xp.a >= 31) {
                    a.a(bundle);
                }
                openAssetFileDescriptor = this.e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.e.openAssetFileDescriptor(uri, "r");
            }
            this.g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new b(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.h = fileInputStream;
            int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
            if (i != 0 && k5Var.g > length) {
                throw new b(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(k5Var.g + startOffset) - startOffset;
            if (skip == k5Var.g) {
                if (i == 0) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.i = -1L;
                    } else {
                        long position = size - channel.position();
                        this.i = position;
                        if (position < 0) {
                            throw new b(null, 2008);
                        }
                    }
                } else {
                    long j = length - skip;
                    this.i = j;
                    if (j < 0) {
                        throw new b(null, 2008);
                    }
                }
                long j2 = k5Var.h;
                if (j2 != -1) {
                    long j3 = this.i;
                    if (j3 != -1) {
                        j2 = Math.min(j3, j2);
                    }
                    this.i = j2;
                }
                this.j = true;
                c(k5Var);
                long j4 = k5Var.h;
                return j4 != -1 ? j4 : this.i;
            }
            throw new b(null, 2008);
        } catch (b e) {
            throw e;
        } catch (IOException e2) {
            throw new b(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.applovin.impl.h5
    public Uri c() {
        return this.f;
    }

    @Override // com.applovin.impl.h5
    public void close() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new b(e, 2000);
                    }
                } finally {
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        g();
                    }
                }
            } catch (IOException e2) {
                throw new b(e2, 2000);
            }
        } catch (Throwable th) {
            this.h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        g();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new b(e3, 2000);
                }
            } finally {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    g();
                }
            }
        }
    }

    @Override // com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new b(e, 2000);
            }
        }
        int read = ((FileInputStream) xp.a((Object) this.h)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - read;
        }
        d(read);
        return read;
    }
}
