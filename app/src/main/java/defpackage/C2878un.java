package defpackage;

import android.content.Context;
/* renamed from: un  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2878un implements YT {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    public /* synthetic */ C2878un(Context context, String str, int i) {
        this.a = i;
        this.b = context;
        this.c = str;
    }

    @Override // defpackage.YT
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3257zB(this.b, this.c);
            default:
                return this.b.getSharedPreferences(this.c, 0);
        }
    }
}
