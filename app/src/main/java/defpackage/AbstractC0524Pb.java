package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
/* renamed from: Pb  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0524Pb implements NF, Serializable {
    public static final Object NO_RECEIVER = C0498Ob.b;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient NF reflected;
    private final String signature;

    public AbstractC0524Pb(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.NF
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.NF
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public NF compute() {
        NF nf = this.reflected;
        if (nf == null) {
            NF computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return nf;
    }

    public abstract NF computeReflected();

    @Override // defpackage.MF
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.NF
    public String getName() {
        return this.name;
    }

    public PF getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            AbstractC3019wV.a.getClass();
            return new DQ(cls);
        }
        return AbstractC3019wV.a(cls);
    }

    @Override // defpackage.NF
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract NF getReflected();

    @Override // defpackage.NF
    public XF getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.NF
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.NF
    public YF getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.NF
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.NF
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.NF
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.NF
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
