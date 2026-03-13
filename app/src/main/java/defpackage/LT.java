package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: LT  reason: default package */
/* loaded from: classes2.dex */
public abstract class LT extends AbstractC0524Pb implements WF {
    private final boolean syntheticJavaProperty;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LT(java.lang.Object r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r8 = this;
            r0 = 1
            r13 = r13 & r0
            r1 = 0
            if (r13 != r0) goto L7
            r7 = 1
            goto L8
        L7:
            r7 = 0
        L8:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r8.syntheticJavaProperty = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LT.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override // defpackage.AbstractC0524Pb
    public NF compute() {
        if (this.syntheticJavaProperty) {
            return this;
        }
        return super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LT) {
            LT lt = (LT) obj;
            if (getOwner().equals(lt.getOwner()) && getName().equals(lt.getName()) && getSignature().equals(lt.getSignature()) && Intrinsics.a(getBoundReceiver(), lt.getBoundReceiver())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof WF)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    public int hashCode() {
        int hashCode = getName().hashCode();
        return getSignature().hashCode() + ((hashCode + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.WF
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // defpackage.WF
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        NF compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // defpackage.AbstractC0524Pb
    public WF getReflected() {
        if (!this.syntheticJavaProperty) {
            NF compute = compute();
            if (compute != this) {
                return (WF) compute;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }
}
