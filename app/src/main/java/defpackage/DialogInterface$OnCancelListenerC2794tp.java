package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.i;
/* renamed from: tp  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterface$OnCancelListenerC2794tp implements DialogInterface.OnCancelListener {
    public final /* synthetic */ i b;

    public DialogInterface$OnCancelListenerC2794tp(i iVar) {
        this.b = iVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        i iVar = this.b;
        dialog = iVar.mDialog;
        if (dialog != null) {
            dialog2 = iVar.mDialog;
            iVar.onCancel(dialog2);
        }
    }
}
