package defpackage;
/* renamed from: bd  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0953bd implements ES {
    public abstract boolean a(char c);

    @Override // defpackage.ES
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
