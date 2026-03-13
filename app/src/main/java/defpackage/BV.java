package defpackage;
/* renamed from: BV  reason: default package */
/* loaded from: classes2.dex */
public final class BV {
    public static String a(InterfaceC1253eA interfaceC1253eA) {
        String obj = interfaceC1253eA.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }
}
