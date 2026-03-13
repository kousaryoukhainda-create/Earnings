package okhttp3.internal.connection;

import java.io.IOException;
/* loaded from: classes2.dex */
public final class RouteException extends RuntimeException {
    public final IOException b;
    public IOException c;

    public RouteException(IOException iOException) {
        super(iOException);
        this.b = iOException;
        this.c = iOException;
    }
}
