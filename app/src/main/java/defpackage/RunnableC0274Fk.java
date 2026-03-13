package defpackage;

import android.net.Uri;
import android.os.Bundle;
/* renamed from: Fk  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0274Fk implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ BinderC0352Ik g;

    public RunnableC0274Fk(BinderC0352Ik binderC0352Ik, int i, Uri uri, boolean z, Bundle bundle) {
        this.g = binderC0352Ik;
        this.b = i;
        this.c = uri;
        this.d = z;
        this.f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.c.onRelationshipValidationResult(this.b, this.c, this.d, this.f);
    }
}
