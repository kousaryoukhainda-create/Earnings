package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: K9  reason: default package */
/* loaded from: classes2.dex */
public abstract class K9 implements InterfaceC2868ui, InterfaceC0687Vi, Serializable {
    private final InterfaceC2868ui completion;

    public K9(InterfaceC2868ui interfaceC2868ui) {
        this.completion = interfaceC2868ui;
    }

    @NotNull
    public InterfaceC2868ui create(@NotNull InterfaceC2868ui completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.InterfaceC0687Vi
    public InterfaceC0687Vi getCallerFrame() {
        InterfaceC2868ui interfaceC2868ui = this.completion;
        if (interfaceC2868ui instanceof InterfaceC0687Vi) {
            return (InterfaceC0687Vi) interfaceC2868ui;
        }
        return null;
    }

    public final InterfaceC2868ui getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i2;
        Intrinsics.checkNotNullParameter(this, "<this>");
        InterfaceC2533qm interfaceC2533qm = (InterfaceC2533qm) getClass().getAnnotation(InterfaceC2533qm.class);
        String str2 = null;
        if (interfaceC2533qm == null) {
            return null;
        }
        int v = interfaceC2533qm.v();
        if (v <= 1) {
            int i3 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(this);
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                i = i2 - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                i3 = interfaceC2533qm.l()[i];
            }
            Intrinsics.checkNotNullParameter(this, "continuation");
            C3244z4 c3244z4 = AbstractC1281eb.e;
            C3244z4 c3244z42 = AbstractC1281eb.d;
            if (c3244z4 == null) {
                try {
                    C3244z4 c3244z43 = new C3244z4(23, Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    AbstractC1281eb.e = c3244z43;
                    c3244z4 = c3244z43;
                } catch (Exception unused2) {
                    AbstractC1281eb.e = c3244z42;
                    c3244z4 = c3244z42;
                }
            }
            if (c3244z4 != c3244z42 && (method = (Method) c3244z4.c) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c3244z4.d) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = (Method) c3244z4.f;
                if (method3 != null) {
                    obj = method3.invoke(invoke2, null);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str2 = obj;
                }
            }
            if (str2 == null) {
                str = interfaceC2533qm.c();
            } else {
                str = str2 + '/' + interfaceC2533qm.c();
            }
            return new StackTraceElement(str, interfaceC2533qm.m(), interfaceC2533qm.f(), i3);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // defpackage.InterfaceC2868ui
    public final void resumeWith(@NotNull Object obj) {
        InterfaceC2868ui frame = this;
        while (true) {
            Intrinsics.checkNotNullParameter(frame, "frame");
            K9 k9 = (K9) frame;
            InterfaceC2868ui interfaceC2868ui = k9.completion;
            Intrinsics.b(interfaceC2868ui);
            try {
                obj = k9.invokeSuspend(obj);
                if (obj == EnumC0661Ui.b) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC1522hL.k(th);
            }
            k9.releaseIntercepted();
            if (interfaceC2868ui instanceof K9) {
                frame = interfaceC2868ui;
            } else {
                interfaceC2868ui.resumeWith(obj);
                return;
            }
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @NotNull
    public InterfaceC2868ui create(Object obj, @NotNull InterfaceC2868ui completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
