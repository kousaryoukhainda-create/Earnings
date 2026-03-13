package com.fyber.fairbid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.WindowManager;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public abstract class um extends WebViewClient {
    public final WeakReference<Activity> a;

    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            if (um.this.a() != null) {
                um.this.a().finish();
            }
        }
    }

    public um(Activity activity) {
        this.a = new WeakReference<>(activity);
    }

    public final Activity a() {
        return this.a.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0130, code lost:
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.fairbid.um.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    public final void a(String str) {
        String a2 = nk.a(com.fyber.b.b);
        String a3 = nk.a(com.fyber.b.c);
        AlertDialog.Builder builder = new AlertDialog.Builder(a());
        builder.setTitle(a2);
        builder.setMessage(str);
        builder.setNegativeButton(a3, new a());
        AlertDialog create = builder.create();
        create.setOwnerActivity(a());
        try {
            create.show();
        } catch (WindowManager.BadTokenException e) {
            C2053lA.c(e, "WebClient", "Couldn't show error dialog. Not displayed error message is: " + str);
        }
    }
}
