package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
/* renamed from: ND  reason: default package */
/* loaded from: classes.dex */
public final class ND implements OD {
    public final InputContentInfo b;

    public ND(Object obj) {
        this.b = (InputContentInfo) obj;
    }

    @Override // defpackage.OD
    public final Uri d() {
        return this.b.getContentUri();
    }

    @Override // defpackage.OD
    public final void e() {
        this.b.requestPermission();
    }

    @Override // defpackage.OD
    public final Uri f() {
        return this.b.getLinkUri();
    }

    @Override // defpackage.OD
    public final Object g() {
        return this.b;
    }

    @Override // defpackage.OD
    public final ClipDescription getDescription() {
        return this.b.getDescription();
    }

    public ND(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.b = new InputContentInfo(uri, clipDescription, uri2);
    }
}
