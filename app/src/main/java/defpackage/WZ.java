package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: WZ  reason: default package */
/* loaded from: classes.dex */
public @interface WZ {
    String[] alternate() default {};

    String value();
}
