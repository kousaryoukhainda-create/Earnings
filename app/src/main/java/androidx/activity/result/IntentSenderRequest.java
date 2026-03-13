package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new I1(16);
    public final IntentSender b;
    public final Intent c;
    public final int d;
    public final int f;

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.b = intentSender;
        this.c = intent;
        this.d = i;
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.b, i);
        dest.writeParcelable(this.c, i);
        dest.writeInt(this.d);
        dest.writeInt(this.f);
    }
}
