package defpackage;
/* renamed from: t3  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2726t3 extends AbstractC2121m1 {
    public final /* synthetic */ int b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2726t3(L5 l5, int i) {
        super(l5);
        this.b = i;
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return ((C2554r3) this.c).toString();
            default:
                StringBuilder sb = new StringBuilder("{");
                if (((AbstractC2121m1[]) this.c) != null) {
                    int i = 0;
                    while (true) {
                        AbstractC2121m1[] abstractC2121m1Arr = (AbstractC2121m1[]) this.c;
                        if (i < abstractC2121m1Arr.length) {
                            sb.append(abstractC2121m1Arr[i].toString());
                            i++;
                            if (i < ((AbstractC2121m1[]) this.c).length) {
                                sb.append(", ");
                            }
                        }
                    }
                }
                sb.append('}');
                return sb.toString();
        }
    }
}
