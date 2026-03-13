package defpackage;

import android.app.Application;
import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;
/* renamed from: SX  reason: default package */
/* loaded from: classes2.dex */
public final class SX {
    public static final C2741tB a = new C2741tB(SX.class.getSimpleName(), 8);

    public static String a(Application application, String str, ContentProviderClient contentProviderClient) {
        Cursor query;
        C2741tB c2741tB = a;
        try {
            Uri parse = Uri.parse(str);
            String[] strArr = {"encrypted_data"};
            String[] strArr2 = {application.getPackageName()};
            if (contentProviderClient != null) {
                query = contentProviderClient.query(parse, strArr, "package_name=?", strArr2, null);
            } else {
                query = application.getContentResolver().query(parse, strArr, null, null, null);
            }
            if (query == null) {
                c2741tB.b("Read content provider cursor null content uri [%s]", str);
                return null;
            } else if (!query.moveToFirst()) {
                c2741tB.b("Read content provider cursor empty content uri [%s]", str);
                query.close();
                return null;
            } else {
                String string = query.getString(0);
                c2741tB.a("Read Content Provider Payload is " + string);
                query.close();
                return string;
            }
        } catch (Throwable th) {
            c2741tB.e("Exception read content provider uri [%s] error [%s]", str, th.getMessage());
            return null;
        }
    }
}
