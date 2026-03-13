package defpackage;

import android.content.Context;
import android.util.Log;
/* renamed from: Uh0  reason: default package */
/* loaded from: classes.dex */
public final class Uh0 {
    public final /* synthetic */ int a;
    public final Context b;
    public final String c;
    public U5 d;

    public Uh0(Context context, String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                Log.d("AGC_FlexibleDecrypt", "init");
                this.b = context;
                this.c = str;
                return;
            default:
                Log.d("AGC_FixedDecrypt", "init");
                this.b = context;
                this.c = str;
                return;
        }
    }
}
