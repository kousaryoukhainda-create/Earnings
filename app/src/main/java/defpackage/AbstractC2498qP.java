package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: qP  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2498qP implements NU {
    private Object value;

    public AbstractC2498qP(Object obj) {
        this.value = obj;
    }

    public void afterChange(@NotNull WF property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
    }

    public boolean beforeChange(@NotNull WF property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        return true;
    }

    @Override // defpackage.NU
    public Object getValue(Object obj, @NotNull WF property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.value;
    }

    public void setValue(Object obj, @NotNull WF property, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj3 = this.value;
        if (!beforeChange(property, obj3, obj2)) {
            return;
        }
        this.value = obj2;
        afterChange(property, obj3, obj2);
    }

    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
