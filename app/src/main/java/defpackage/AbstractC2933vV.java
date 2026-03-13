package defpackage;

import com.fyber.fairbid.http.connection.HttpConnection;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
/* renamed from: vV  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2933vV {
    public static final C2741tB a = new C2741tB(AbstractC2933vV.class.getSimpleName(), 8);

    public static HttpsURLConnection a(String str, HashMap hashMap) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpsURLConnection.setConnectTimeout(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        httpsURLConnection.setReadTimeout(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setRequestProperty(HttpConnection.USER_AGENT_HEADER, InterfaceC2608rh.c);
        httpsURLConnection.setRequestProperty(HttpConnection.CONTENT_TYPE_HEADER, "application/json");
        httpsURLConnection.setRequestProperty(HttpConnection.ACCEPT_ENCODING, HttpConnection.ENCODING_GZIP);
        JSONObject jSONObject = new JSONObject(hashMap);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpsURLConnection.getOutputStream(), "UTF-8");
        outputStreamWriter.write(jSONObject.toString());
        outputStreamWriter.close();
        return httpsURLConnection;
    }

    public static String b(String str, String str2, String str3) {
        try {
            if (str.contains("?")) {
                str = str + ContainerUtils.FIELD_DELIMITER + str2 + ContainerUtils.KEY_VALUE_DELIMITER + URLEncoder.encode(str3, "UTF-8");
            } else {
                str = str + "?" + str2 + ContainerUtils.KEY_VALUE_DELIMITER + URLEncoder.encode(str3, "UTF-8");
            }
        } catch (UnsupportedEncodingException e) {
            a.b("Error in encoding ", e);
        }
        return str;
    }
}
