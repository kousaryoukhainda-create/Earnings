package defpackage;

import java.util.Collections;
import java.util.List;
/* renamed from: XB  reason: default package */
/* loaded from: classes.dex */
public abstract class XB implements InterfaceC0621Su {
    public final String a;
    public final List b;
    public final boolean c;

    public XB(String str, List list, boolean z) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}
