package defpackage;

import java.util.Map;
/* renamed from: Cn  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0199Cn implements ES {
    public final /* synthetic */ int b;

    @Override // defpackage.ES
    public final boolean apply(Object obj) {
        switch (this.b) {
            case 0:
                if (((Map.Entry) obj).getKey() != null) {
                    return true;
                }
                return false;
            default:
                if (((String) obj) != null) {
                    return true;
                }
                return false;
        }
    }
}
