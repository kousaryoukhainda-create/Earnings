package com.google.android.gms.internal.p002firebaseauthapi;

import com.fyber.fairbid.http.connection.HttpConnection;
import com.google.android.gms.common.internal.Preconditions;
import com.huawei.hms.iap.entity.OrderStatusCode;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafm  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzafm {
    private static final boolean zza(int i) {
        return i >= 200 && i < 300;
    }

    private static void zza(HttpURLConnection httpURLConnection, zzafn<?> zzafnVar, Type type) {
        InputStream errorStream;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (zza(responseCode)) {
                    errorStream = httpURLConnection.getInputStream();
                } else {
                    errorStream = httpURLConnection.getErrorStream();
                }
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String sb2 = sb.toString();
                if (!zza(responseCode)) {
                    zzafnVar.zza((String) zzaep.zza(sb2, String.class));
                } else {
                    zzafnVar.zza((zzafn<?>) ((zzaer) zzaep.zza(sb2, type)));
                }
                httpURLConnection.disconnect();
            } catch (zzaci e) {
                e = e;
                zzafnVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            } catch (SocketTimeoutException unused) {
                zzafnVar.zza("TIMEOUT");
                httpURLConnection.disconnect();
            } catch (IOException e2) {
                e = e2;
                zzafnVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            }
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    public static void zza(String str, zzafn<?> zzafnVar, Type type, zzaew zzaewVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(OrderStatusCode.ORDER_STATE_CANCEL);
            zzaewVar.zza(httpURLConnection);
            zza(httpURLConnection, zzafnVar, type);
        } catch (SocketTimeoutException unused) {
            zzafnVar.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzafnVar.zza("<<Network Error>>");
        } catch (IOException e) {
            zzafnVar.zza(e.getMessage());
        }
    }

    public static void zza(String str, zzaes zzaesVar, zzafn<?> zzafnVar, Type type, zzaew zzaewVar) {
        try {
            Preconditions.checkNotNull(zzaesVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzaesVar.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty(HttpConnection.CONTENT_TYPE_HEADER, "application/json");
            httpURLConnection.setConnectTimeout(OrderStatusCode.ORDER_STATE_CANCEL);
            zzaewVar.zza(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
            try {
                bufferedOutputStream.write(bytes, 0, bytes.length);
                bufferedOutputStream.close();
                zza(httpURLConnection, zzafnVar, type);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            zzafnVar.zza("TIMEOUT");
        } catch (IOException e) {
            e = e;
            zzafnVar.zza(e.getMessage());
        } catch (NullPointerException e2) {
            e = e2;
            zzafnVar.zza(e.getMessage());
        } catch (UnknownHostException unused2) {
            zzafnVar.zza("<<Network Error>>");
        } catch (JSONException e3) {
            e = e3;
            zzafnVar.zza(e.getMessage());
        }
    }
}
