package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: fA  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1339fA extends AbstractC0524Pb implements InterfaceC1253eA, QF {
    private final int arity;
    private final int flags;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC1339fA(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r8 = this;
            r0 = 1
            r14 = r14 & r0
            r1 = 0
            if (r14 != r0) goto L7
            r7 = 1
            goto L8
        L7:
            r7 = 0
        L8:
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r8.arity = r9
            r8.flags = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1339fA.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override // defpackage.AbstractC0524Pb
    public NF computeReflected() {
        AbstractC3019wV.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1339fA) {
            AbstractC1339fA abstractC1339fA = (AbstractC1339fA) obj;
            if (getName().equals(abstractC1339fA.getName()) && getSignature().equals(abstractC1339fA.getSignature()) && this.flags == abstractC1339fA.flags && this.arity == abstractC1339fA.arity && Intrinsics.a(getBoundReceiver(), abstractC1339fA.getBoundReceiver()) && Intrinsics.a(getOwner(), abstractC1339fA.getOwner())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof QF)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    @Override // defpackage.InterfaceC1253eA
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return getSignature().hashCode() + ((getName().hashCode() + hashCode) * 31);
    }

    @Override // defpackage.QF
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.QF
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.QF
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.QF
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.AbstractC0524Pb, defpackage.NF
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        NF compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // defpackage.AbstractC0524Pb
    public QF getReflected() {
        NF compute = compute();
        if (compute != this) {
            return (QF) compute;
        }
        throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
