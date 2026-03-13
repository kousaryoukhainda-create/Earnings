package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.ykapps.earnings.R;
/* renamed from: b4  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0909b4 extends EditText implements InterfaceC1355fQ, O60 {
    public final C1262eJ b;
    public final C2213n4 c;
    public final C0750Xt d;
    public final C1960k60 f;
    public final C0750Xt g;
    public C0818a4 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v5, types: [k60, java.lang.Object] */
    public AbstractC0909b4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        L60.a(context);
        AbstractC2390p60.a(this, getContext());
        C1262eJ c1262eJ = new C1262eJ(this);
        this.b = c1262eJ;
        c1262eJ.D(attributeSet, R.attr.editTextStyle);
        C2213n4 c2213n4 = new C2213n4(this);
        this.c = c2213n4;
        c2213n4.d(attributeSet, R.attr.editTextStyle);
        c2213n4.b();
        C0750Xt c0750Xt = new C0750Xt(6, (char) 0);
        c0750Xt.c = this;
        this.d = c0750Xt;
        this.f = new Object();
        C0750Xt c0750Xt2 = new C0750Xt(this, 5);
        this.g = c0750Xt2;
        c0750Xt2.m(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener l = c0750Xt2.l(keyListener);
            if (l != keyListener) {
                super.setKeyListener(l);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @NonNull
    private C0818a4 getSuperCaller() {
        if (this.h == null) {
            this.h = new C0818a4(this);
        }
        return this.h;
    }

    @Override // defpackage.InterfaceC1355fQ
    public final C1295ei a(C1295ei c1295ei) {
        return this.f.a(this, c1295ei);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1262eJ c1262eJ = this.b;
        if (c1262eJ != null) {
            c1262eJ.a();
        }
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            c2213n4.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return Wh0.m0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1262eJ c1262eJ = this.b;
        if (c1262eJ != null) {
            return c1262eJ.A();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1262eJ c1262eJ = this.b;
        if (c1262eJ != null) {
            return c1262eJ.B();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        M60 m60 = this.c.h;
        if (m60 != null) {
            return (ColorStateList) m60.c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        M60 m60 = this.c.h;
        if (m60 != null) {
            return (PorterDuff.Mode) m60.d;
        }
        return null;
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        C0750Xt c0750Xt;
        if (Build.VERSION.SDK_INT < 28 && (c0750Xt = this.d) != null) {
            TextClassifier textClassifier = (TextClassifier) c0750Xt.d;
            if (textClassifier == null) {
                return AbstractC1499h4.a((TextView) c0750Xt.c);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r1 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (r1 != null) goto L15;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r6) {
        /*
            r5 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r6)
            n4 r1 = r5.c
            r1.getClass()
            defpackage.C2213n4.f(r6, r0, r5)
            defpackage.AbstractC2618rm.E(r6, r0, r5)
            if (r0 == 0) goto L60
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L60
            java.lang.String[] r2 = defpackage.Sb0.d(r5)
            if (r2 == 0) goto L60
            defpackage.AbstractC1281eb.N(r6, r2)
            zx r2 = new zx
            r3 = 9
            r2.<init>(r5, r3)
            r3 = 25
            if (r1 < r3) goto L32
            LD r1 = new LD
            r1.<init>(r0, r2)
        L30:
            r0 = r1
            goto L60
        L32:
            java.lang.String[] r4 = defpackage.AbstractC1281eb.c
            if (r1 < r3) goto L3e
            java.lang.String[] r1 = defpackage.AbstractC0565Qq.s(r6)
            if (r1 == 0) goto L56
        L3c:
            r4 = r1
            goto L56
        L3e:
            android.os.Bundle r1 = r6.extras
            if (r1 != 0) goto L43
            goto L56
        L43:
            java.lang.String r3 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String[] r1 = r1.getStringArray(r3)
            if (r1 != 0) goto L53
            android.os.Bundle r1 = r6.extras
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String[] r1 = r1.getStringArray(r3)
        L53:
            if (r1 == 0) goto L56
            goto L3c
        L56:
            int r1 = r4.length
            if (r1 != 0) goto L5a
            goto L60
        L5a:
            MD r1 = new MD
            r1.<init>(r0, r2)
            goto L30
        L60:
            Xt r1 = r5.g
            fr r6 = r1.n(r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0909b4.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && Sb0.d(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = AbstractC1413g4.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        InterfaceC0963bi interfaceC0963bi;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31 && Sb0.d(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i3 >= 31) {
                    interfaceC0963bi = new VA(primaryClip, 1);
                } else {
                    C1048ci c1048ci = new C1048ci();
                    c1048ci.c = primaryClip;
                    c1048ci.d = 1;
                    interfaceC0963bi = c1048ci;
                }
                if (i == 16908322) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                interfaceC0963bi.d(i2);
                Sb0.h(this, interfaceC0963bi.build());
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1262eJ c1262eJ = this.b;
        if (c1262eJ != null) {
            c1262eJ.J();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1262eJ c1262eJ = this.b;
        if (c1262eJ != null) {
            c1262eJ.K(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            c2213n4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            c2213n4.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(Wh0.q0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.g.u(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.g.l(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1262eJ c1262eJ = this.b;
        if (c1262eJ != null) {
            c1262eJ.T(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1262eJ c1262eJ = this.b;
        if (c1262eJ != null) {
            c1262eJ.U(mode);
        }
    }

    @Override // defpackage.O60
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2213n4 c2213n4 = this.c;
        c2213n4.j(colorStateList);
        c2213n4.b();
    }

    @Override // defpackage.O60
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2213n4 c2213n4 = this.c;
        c2213n4.k(mode);
        c2213n4.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2213n4 c2213n4 = this.c;
        if (c2213n4 != null) {
            c2213n4.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0750Xt c0750Xt;
        if (Build.VERSION.SDK_INT < 28 && (c0750Xt = this.d) != null) {
            c0750Xt.d = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
