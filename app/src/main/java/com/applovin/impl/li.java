package com.applovin.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
/* loaded from: classes.dex */
public final class li extends a2 {
    private final Resources e;
    private final String f;
    private Uri g;
    private AssetFileDescriptor h;
    private InputStream i;
    private long j;
    private boolean k;

    /* loaded from: classes.dex */
    public static class a extends i5 {
        public a(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public li(Context context) {
        super(false);
        this.e = context.getResources();
        this.f = context.getPackageName();
    }

    @Override // com.applovin.impl.h5
    public long a(k5 k5Var) {
        int parseInt;
        Uri uri = k5Var.a;
        this.g = uri;
        if (!TextUtils.equals("rawresource", uri.getScheme()) && (!TextUtils.equals("android.resource", uri.getScheme()) || uri.getPathSegments().size() != 1 || !((String) b1.a((Object) uri.getLastPathSegment())).matches("\\d+"))) {
            if (TextUtils.equals("android.resource", uri.getScheme())) {
                String str = (String) b1.a((Object) uri.getPath());
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                String host = uri.getHost();
                parseInt = this.e.getIdentifier(AbstractC0324Hi.h(new StringBuilder(), TextUtils.isEmpty(host) ? "" : AbstractC0324Hi.f(host, ":"), str), "raw", this.f);
                if (parseInt == 0) {
                    throw new a("Resource not found.", null, 2005);
                }
            } else {
                throw new a("URI must either use scheme rawresource or android.resource", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            }
        } else {
            try {
                parseInt = Integer.parseInt((String) b1.a((Object) uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            }
        }
        b(k5Var);
        try {
            AssetFileDescriptor openRawResourceFd = this.e.openRawResourceFd(parseInt);
            this.h = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.i = fileInputStream;
                int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i != 0) {
                    try {
                        if (k5Var.g > length) {
                            throw new a(null, null, 2008);
                        }
                    } catch (a e) {
                        throw e;
                    } catch (IOException e2) {
                        throw new a(null, e2, 2000);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(k5Var.g + startOffset) - startOffset;
                if (skip == k5Var.g) {
                    if (i == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.j = -1L;
                        } else {
                            long size = channel.size() - channel.position();
                            this.j = size;
                            if (size < 0) {
                                throw new a(null, null, 2008);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.j = j;
                        if (j < 0) {
                            throw new i5(2008);
                        }
                    }
                    long j2 = k5Var.h;
                    if (j2 != -1) {
                        long j3 = this.j;
                        if (j3 != -1) {
                            j2 = Math.min(j3, j2);
                        }
                        this.j = j2;
                    }
                    this.k = true;
                    c(k5Var);
                    long j4 = k5Var.h;
                    return j4 != -1 ? j4 : this.j;
                }
                throw new a(null, null, 2008);
            }
            throw new a("Resource is compressed: " + uri, null, 2000);
        } catch (Resources.NotFoundException e3) {
            throw new a(null, e3, 2005);
        }
    }

    @Override // com.applovin.impl.h5
    public Uri c() {
        return this.g;
    }

    @Override // com.applovin.impl.h5
    public void close() {
        this.g = null;
        try {
            try {
                InputStream inputStream = this.i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new a(null, e, 2000);
                    }
                } finally {
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        g();
                    }
                }
            } catch (IOException e2) {
                throw new a(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        g();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new a(null, e3, 2000);
                }
            } finally {
                this.h = null;
                if (this.k) {
                    this.k = false;
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
        long j = this.j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(null, e, 2000);
            }
        }
        int read = ((InputStream) xp.a((Object) this.i)).read(bArr, i, i2);
        if (read == -1) {
            if (this.j == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.j;
        if (j2 != -1) {
            this.j = j2 - read;
        }
        d(read);
        return read;
    }
}
