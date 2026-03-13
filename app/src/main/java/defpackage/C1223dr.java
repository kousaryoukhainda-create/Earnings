package defpackage;

import android.text.Editable;
/* renamed from: dr  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1223dr extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile C1223dr b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        if (cls != null) {
            return new C1155d30(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
