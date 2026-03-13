package com.fyber.fairbid.http.responses;

import com.fyber.fairbid.internal.Logger;
import com.fyber.fairbid.za;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata
/* loaded from: classes.dex */
public interface JsonObjectResponseHandler extends ResponseHandler<JSONObject> {
    @NotNull
    public static final Companion Companion = Companion.a;

    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
    }

    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static JSONObject process(@NotNull JsonObjectResponseHandler jsonObjectResponseHandler, int i, String str, @NotNull InputStream inputStream) throws JSONException, IOException {
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            try {
                return new JSONObject(za.a(inputStream));
            } catch (IOException e) {
                Logger.error("JsonObjectResponseHandler - Cannot convert input to Json - " + e.getMessage());
                throw e;
            } catch (JSONException e2) {
                Logger.error("JsonObjectResponseHandler - Cannot convert input to Json - " + e2.getMessage());
                throw e2;
            }
        }
    }

    @Override // com.fyber.fairbid.http.responses.ResponseHandler
    JSONObject process(int i, String str, @NotNull InputStream inputStream) throws JSONException, IOException;
}
