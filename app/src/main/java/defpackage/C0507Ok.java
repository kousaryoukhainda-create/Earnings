package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
/* renamed from: Ok  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0507Ok {
    public final Intent a;
    public final Bundle b;

    public C0507Ok(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    public final void a(Context context, Uri uri) {
        Intent intent = this.a;
        intent.setData(uri);
        AbstractC2525qi.startActivity(context, intent, this.b);
    }
}
