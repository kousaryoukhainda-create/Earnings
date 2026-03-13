package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.da;
/* loaded from: classes.dex */
public class k extends View {
    private final da a;
    private boolean b;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onFailure();
    }

    public k(da daVar, Context context) {
        super(context);
        this.a = daVar;
        setClickable(false);
        setFocusable(false);
    }

    public boolean a() {
        return this.b;
    }

    public void b() {
        a(null);
    }

    public String getIdentifier() {
        return this.a.b();
    }

    public void a(a aVar) {
        if (this.b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable a2 = this.a.a();
        if (a2 == null) {
            if (aVar != null) {
                aVar.onFailure();
                return;
            }
            return;
        }
        setBackground(a2);
        this.b = true;
        if (aVar != null) {
            aVar.a();
        }
    }
}
