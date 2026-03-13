package com.fyber.fairbid;

import androidx.annotation.NonNull;
import com.fyber.fairbid.internal.Logger;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class w6 extends a2<JSONArray> {
    public final int b;

    public w6(int i) {
        this.b = i;
    }

    @Override // com.fyber.fairbid.a2
    public final boolean a(int i, JSONArray jSONArray) {
        Logger.debug("EventValidationLogger - Event " + this.b + " reported successfully - Status code: " + i);
        return true;
    }

    @Override // com.fyber.fairbid.http.responses.ResponseHandler
    public final Object process(int i, String str, @NonNull InputStream inputStream) throws Exception {
        if (i == 400) {
            String a = za.a(inputStream);
            if (!a.equals("")) {
                return new JSONArray(a);
            }
        }
        return null;
    }

    @Override // com.fyber.fairbid.a2
    public final void a(int i, JSONArray jSONArray, String str) {
        JSONArray jSONArray2 = jSONArray;
        StringBuilder i2 = AbstractC0324Hi.i(i, "EventValidationLogger - Error (status code: ", ") while sending event ");
        i2.append(this.b);
        i2.append(":\nError message: ");
        i2.append(str);
        String sb = i2.toString();
        if (jSONArray2 != null) {
            try {
                sb = sb + "\nError feedback from server:\n" + jSONArray2.toString(2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        Logger.error(sb);
    }
}
