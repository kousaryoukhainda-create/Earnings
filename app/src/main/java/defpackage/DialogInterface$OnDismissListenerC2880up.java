package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.i;
/* renamed from: up  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterface$OnDismissListenerC2880up implements DialogInterface.OnDismissListener {
    public final /* synthetic */ i b;

    public DialogInterface$OnDismissListenerC2880up(i iVar) {
        this.b = iVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        i iVar = this.b;
        dialog = iVar.mDialog;
        if (dialog != null) {
            dialog2 = iVar.mDialog;
            iVar.onDismiss(dialog2);
        }
    }
}
