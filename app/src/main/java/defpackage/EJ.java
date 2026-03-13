package defpackage;

import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: EJ  reason: default package */
/* loaded from: classes2.dex */
public final class EJ {
    public final Matcher a;
    public final String b;
    public final DJ c;
    public CJ d;

    public EJ(Matcher matcher, String input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.a = matcher;
        this.b = input;
        this.c = new DJ(this);
    }
}
