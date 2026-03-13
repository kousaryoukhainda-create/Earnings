package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.ykapps.earnings.R;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0933bM, AbsListView.SelectionBoundsAdjuster {
    public QL b;
    public ImageView c;
    public RadioButton d;
    public TextView f;
    public CheckBox g;
    public TextView h;
    public ImageView i;
    public ImageView j;
    public LinearLayout k;
    public final Drawable l;
    public final int m;
    public final Context n;
    public boolean o;
    public final Drawable p;
    public final boolean q;
    public LayoutInflater r;
    public boolean s;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        YZ E = YZ.E(getContext(), attributeSet, AbstractC3104xU.o, R.attr.listMenuViewStyle);
        this.l = E.A(5);
        TypedArray typedArray = (TypedArray) E.c;
        this.m = typedArray.getResourceId(1, -1);
        this.o = typedArray.getBoolean(7, false);
        this.n = context;
        this.p = E.A(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.q = obtainStyledAttributes.hasValue(0);
        E.H();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.r == null) {
            this.r = LayoutInflater.from(getContext());
        }
        return this.r;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.i;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.j;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.j.getLayoutParams();
            rect.top = this.j.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (r0 == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    @Override // defpackage.InterfaceC0933bM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.QL r11) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.b(QL):void");
    }

    @Override // defpackage.InterfaceC0933bM
    public QL getItemData() {
        return this.b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.l);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f = textView;
        int i = this.m;
        if (i != -1) {
            textView.setTextAppearance(this.n, i);
        }
        this.h = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.i = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.p);
        }
        this.j = (ImageView) findViewById(R.id.group_divider);
        this.k = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.c != null && this.o) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.d == null && this.g == null) {
            return;
        }
        if ((this.b.x & 4) != 0) {
            if (this.d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.d = radioButton;
                LinearLayout linearLayout = this.k;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.d;
            view = this.g;
        } else {
            if (this.g == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.g = checkBox;
                LinearLayout linearLayout2 = this.k;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.g;
            view = this.d;
        }
        if (z) {
            compoundButton.setChecked(this.b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.g;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.d;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.b.x & 4) != 0) {
            if (this.d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.d = radioButton;
                LinearLayout linearLayout = this.k;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.d;
        } else {
            if (this.g == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.g = checkBox;
                LinearLayout linearLayout2 = this.k;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.g;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.s = z;
        this.o = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.j;
        if (imageView != null) {
            if (!this.q && z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        this.b.n.getClass();
        boolean z = this.s;
        if (!z && !this.o) {
            return;
        }
        ImageView imageView = this.c;
        if (imageView == null && drawable == null && !this.o) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.c = imageView2;
            LinearLayout linearLayout = this.k;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.o) {
            this.c.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.c;
        if (!z) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.c.getVisibility() != 0) {
            this.c.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f.setText(charSequence);
            if (this.f.getVisibility() != 0) {
                this.f.setVisibility(0);
            }
        } else if (this.f.getVisibility() != 8) {
            this.f.setVisibility(8);
        }
    }
}
