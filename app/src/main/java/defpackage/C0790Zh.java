package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* renamed from: Zh  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0790Zh extends L9 {
    public final ContentResolver g;
    public Uri h;
    public AssetFileDescriptor i;
    public FileInputStream j;
    public long k;
    public boolean l;

    public C0790Zh(Context context) {
        super(false);
        this.g = context.getContentResolver();
    }

    @Override // defpackage.InterfaceC3304zl
    public final Uri A() {
        return this.h;
    }

    @Override // defpackage.InterfaceC3304zl
    public final void close() {
        this.h = null;
        try {
            try {
                FileInputStream fileInputStream = this.j;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.j = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.i;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C0145Al(2000, e);
                    }
                } finally {
                    this.i = null;
                    if (this.l) {
                        this.l = false;
                        e();
                    }
                }
            } catch (IOException e2) {
                throw new C0145Al(2000, e2);
            }
        } catch (Throwable th) {
            this.j = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.i;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.i = null;
                    if (this.l) {
                        this.l = false;
                        e();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new C0145Al(2000, e3);
                }
            } finally {
                this.i = null;
                if (this.l) {
                    this.l = false;
                    e();
                }
            }
        }
    }

    @Override // defpackage.InterfaceC3304zl
    public final long g(C0223Dl c0223Dl) {
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        int i = 2000;
        try {
            Uri normalizeScheme = c0223Dl.a.normalizeScheme();
            this.h = normalizeScheme;
            h();
            boolean equals = AppLovinEventTypes.USER_VIEWED_CONTENT.equals(normalizeScheme.getScheme());
            ContentResolver contentResolver = this.g;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.i = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.j = fileInputStream;
                long j = c0223Dl.e;
                int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i2 != 0 && j > length) {
                    throw new C0145Al(2008, (Exception) null);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j) - startOffset;
                if (skip == j) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.k = -1L;
                        } else {
                            long position = size - channel.position();
                            this.k = position;
                            if (position < 0) {
                                throw new C0145Al(2008, (Exception) null);
                            }
                        }
                    } else {
                        long j2 = length - skip;
                        this.k = j2;
                        if (j2 < 0) {
                            throw new C0145Al(2008, (Exception) null);
                        }
                    }
                    long j3 = c0223Dl.f;
                    int i3 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
                    if (i3 != 0) {
                        long j4 = this.k;
                        if (j4 == -1) {
                            min = j3;
                        } else {
                            min = Math.min(j4, j3);
                        }
                        this.k = min;
                    }
                    this.l = true;
                    j(c0223Dl);
                    if (i3 == 0) {
                        return this.k;
                    }
                    return j3;
                }
                throw new C0145Al(2008, (Exception) null);
            }
            throw new C0145Al(2000, new IOException("Could not open file descriptor for: " + normalizeScheme));
        } catch (C0764Yh e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            }
            throw new C0145Al(i, e2);
        }
    }

    @Override // defpackage.InterfaceC3046wl
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.k;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C0145Al(2000, e);
            }
        }
        FileInputStream fileInputStream = this.j;
        int i3 = Ha0.a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.k;
        if (j2 != -1) {
            this.k = j2 - read;
        }
        a(read);
        return read;
    }
}
