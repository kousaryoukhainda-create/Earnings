package defpackage;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
/* renamed from: fd0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1372fd0 {
    public static final InterfaceC1458gd0 a;

    static {
        InterfaceC1458gd0 c2999wB;
        try {
            c2999wB = new C3279zX((WebViewProviderFactoryBoundaryInterface) AbstractC1281eb.m(WebViewProviderFactoryBoundaryInterface.class, AbstractC1281eb.w()), 10);
        } catch (ClassNotFoundException unused) {
            c2999wB = new C2999wB(6);
        } catch (IllegalAccessException e) {
            e = e;
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
        a = c2999wB;
    }
}
