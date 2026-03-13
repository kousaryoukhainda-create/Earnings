package defpackage;

import android.content.DialogInterface;
import android.net.Uri;
import com.applovin.impl.h4;
import com.applovin.impl.jb;
import com.applovin.impl.te;
/* renamed from: hi0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterface$OnClickListenerC1554hi0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ DialogInterface$OnClickListenerC1554hi0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                h4.f((Uri) this.b, dialogInterface, i);
                return;
            case 1:
                jb.e((Runnable) this.b, dialogInterface, i);
                return;
            default:
                te.a((te) this.b, dialogInterface, i);
                return;
        }
    }
}
