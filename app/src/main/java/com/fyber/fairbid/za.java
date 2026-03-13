package com.fyber.fairbid;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class za {
    @NotNull
    public static final String a(InputStream inputStream) throws IOException {
        Intrinsics.checkNotNullParameter("UTF-8", "charsetName");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (inputStream != null) {
            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
            while (true) {
                int read = inputStream.read(bArr, 0, UserVerificationMethods.USER_VERIFY_ALL);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }
        byteArrayOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "into.toByteArray()");
        return new String(byteArray, AbstractC1543hd.a);
    }

    @NotNull
    public static String a(@NotNull byte[] compressed) throws DataFormatException {
        Intrinsics.checkNotNullParameter(compressed, "compressed");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressed);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        while (true) {
            try {
                int read = gZIPInputStream.read(bArr, 0, UserVerificationMethods.USER_VERIFY_ALL);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    AbstractC1522hL.i(gZIPInputStream, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "decompressedStream.toByteArray()");
                    return new String(byteArray, AbstractC1543hd.a);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1522hL.i(gZIPInputStream, th);
                    throw th2;
                }
            }
        }
    }
}
