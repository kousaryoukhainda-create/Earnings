package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import okhttp3.Route;
/* loaded from: classes2.dex */
public final class RouteDatabase {
    public final LinkedHashSet a = new LinkedHashSet();

    public final synchronized void a(Route route) {
        this.a.remove(route);
    }
}
