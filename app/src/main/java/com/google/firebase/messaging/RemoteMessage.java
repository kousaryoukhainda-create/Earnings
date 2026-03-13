package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;
@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new LQ(8);
    public final Bundle b;
    public C1243e5 c;
    public VV d;

    public RemoteMessage(Bundle bundle) {
        this.b = bundle;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [e5, Z10] */
    public final Map getData() {
        if (this.c == null) {
            ?? z10 = new Z10();
            Bundle bundle = this.b;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        z10.put(str, str2);
                    }
                }
            }
            this.c = z10;
        }
        return this.c;
    }

    public final String getMessageId() {
        Bundle bundle = this.b;
        String string = bundle.getString("google.message_id");
        if (string == null) {
            return bundle.getString("message_id");
        }
        return string;
    }

    public final VV w() {
        if (this.d == null) {
            Bundle bundle = this.b;
            if (Oc0.N(bundle)) {
                this.d = new VV(new Oc0(bundle));
            }
        }
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
