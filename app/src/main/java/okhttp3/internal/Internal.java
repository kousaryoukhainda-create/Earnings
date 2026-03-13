package okhttp3.internal;

import java.io.IOException;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.StreamAllocation;
/* loaded from: classes2.dex */
public abstract class Internal {
    public static Internal a;

    public abstract void a(Headers.Builder builder, String str);

    public abstract void b(Headers.Builder builder, String str, String str2);

    public abstract void c(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z);

    public abstract int d(Response.Builder builder);

    public abstract boolean e(ConnectionPool connectionPool, RealConnection realConnection);

    public abstract Socket f(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation);

    public abstract boolean g(Address address, Address address2);

    public abstract RealConnection h(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation, Route route);

    public abstract void i(ConnectionPool connectionPool, RealConnection realConnection);

    public abstract RouteDatabase j(ConnectionPool connectionPool);

    public abstract IOException k(Call call, IOException iOException);
}
