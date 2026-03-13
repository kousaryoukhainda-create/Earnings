package com.fyber.fairbid;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.Observable;
import java.util.Observer;
/* loaded from: classes.dex */
public final class n8 extends ci<m8> {
    public final Observer g;

    public n8(m8 m8Var) {
        super(m8Var);
        this.g = new A0(this, 0);
    }

    public /* synthetic */ void b(View view) {
        ((m8) this.a).b();
    }

    @Override // com.fyber.fairbid.ci
    public final void a(@NonNull m8 m8Var) {
        m8 m8Var2 = m8Var;
        if (m8Var2.c) {
            this.e.setVisibility(4);
            this.f.setVisibility(0);
        } else {
            this.e.setVisibility(0);
            this.f.setVisibility(4);
        }
        if (m8Var2.d) {
            ci.a(this.d, true);
            ci.a(this.c, false);
            return;
        }
        ci.a(this.d, false);
        ci.a(this.c, true);
    }

    public /* synthetic */ void c(View view) {
        ((m8) this.a).d();
    }

    @Override // com.fyber.fairbid.ci
    public final void b() {
        ((m8) this.a).deleteObserver(this.g);
    }

    public void a(Observable observable, Object obj) {
        if (this.b != null) {
            m8 m8Var = (m8) observable;
            if (m8Var.c) {
                this.e.setVisibility(4);
                this.f.setVisibility(0);
            } else {
                this.e.setVisibility(0);
                this.f.setVisibility(4);
            }
            if (m8Var.d) {
                ci.a(this.d, true);
                ci.a(this.c, false);
                return;
            }
            ci.a(this.d, false);
            ci.a(this.c, true);
        }
    }

    @Override // com.fyber.fairbid.ci
    public final void a() {
        ((m8) this.a).addObserver(this.g);
        this.c.setOnClickListener(new View.OnClickListener(this) { // from class: com.fyber.fairbid.B0
            public final /* synthetic */ n8 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.c.b(view);
                        return;
                    default:
                        this.c.c(view);
                        return;
                }
            }
        });
        this.d.setOnClickListener(new View.OnClickListener(this) { // from class: com.fyber.fairbid.B0
            public final /* synthetic */ n8 c;

            {
                this.c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.c.b(view);
                        return;
                    default:
                        this.c.c(view);
                        return;
                }
            }
        });
    }
}
