package defpackage;

import java.util.List;
import java.util.Map;
/* renamed from: NF  reason: default package */
/* loaded from: classes2.dex */
public interface NF extends MF {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    XF getReturnType();

    List getTypeParameters();

    YF getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
