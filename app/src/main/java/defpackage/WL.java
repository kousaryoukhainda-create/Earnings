package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
/* renamed from: WL  reason: default package */
/* loaded from: classes.dex */
public final class WL extends AbstractC2366oq {
    public final int o;
    public final int p;
    public PL q;
    public QL r;

    public WL(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.o = 21;
            this.p = 22;
            return;
        }
        this.o = 22;
        this.p = 21;
    }

    @Override // defpackage.AbstractC2366oq, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        GL gl;
        int i;
        QL ql;
        int pointToPosition;
        int i2;
        if (this.q != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                gl = (GL) headerViewListAdapter.getWrappedAdapter();
            } else {
                gl = (GL) adapter;
                i = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < gl.getCount()) {
                ql = gl.getItem(i2);
            } else {
                ql = null;
            }
            QL ql2 = this.r;
            if (ql2 != ql) {
                IL il = gl.b;
                if (ql2 != null) {
                    this.q.b(il, ql2);
                }
                this.r = ql;
                if (ql != null) {
                    this.q.f(il, ql);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        GL gl;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.o) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView != null && i == this.p) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                gl = (GL) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                gl = (GL) adapter;
            }
            gl.b.c(false);
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    public void setHoverListener(PL pl) {
        this.q = pl;
    }

    @Override // defpackage.AbstractC2366oq, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
