package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
/* renamed from: yV  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3191yV extends AV {
    public final /* synthetic */ Method b;

    public C3191yV(Method method) {
        this.b = method;
    }

    @Override // defpackage.AV
    public final boolean a(AccessibleObject accessibleObject, Object obj) {
        try {
            return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}
