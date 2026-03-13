package defpackage;
/* renamed from: J70  reason: default package */
/* loaded from: classes.dex */
public final class J70 {
    public static final J70 d = new J70(new I70[0]);
    public final int a;
    public final FV b;
    public int c;

    static {
        Ha0.H(0);
    }

    public J70(I70... i70Arr) {
        this.b = AbstractC2571rD.t(i70Arr);
        this.a = i70Arr.length;
        int i = 0;
        while (true) {
            FV fv = this.b;
            if (i < fv.size()) {
                int i2 = i + 1;
                for (int i3 = i2; i3 < fv.size(); i3++) {
                    if (((I70) fv.get(i)).equals(fv.get(i3))) {
                        Wh0.z("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    public final I70 a(int i) {
        return (I70) this.b.get(i);
    }

    public final int b(I70 i70) {
        int indexOf = this.b.indexOf(i70);
        if (indexOf < 0) {
            return -1;
        }
        return indexOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J70.class != obj.getClass()) {
            return false;
        }
        J70 j70 = (J70) obj;
        if (this.a == j70.a && this.b.equals(j70.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }
}
