package defpackage;

import java.io.IOException;
/* renamed from: Al  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C0145Al extends IOException {
    public static final /* synthetic */ int c = 0;
    public final int b;

    public C0145Al(int i) {
        this.b = i;
    }

    public C0145Al(int i, Exception exc) {
        super(exc);
        this.b = i;
    }

    public C0145Al(String str, int i) {
        super(str);
        this.b = i;
    }

    public C0145Al(int i, String str, Exception exc) {
        super(str, exc);
        this.b = i;
    }
}
