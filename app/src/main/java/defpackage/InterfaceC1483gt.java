package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: gt  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC1483gt {
    boolean deserialize() default true;

    boolean serialize() default true;
}
