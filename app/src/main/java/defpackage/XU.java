package defpackage;
/* renamed from: XU  reason: default package */
/* loaded from: classes.dex */
public abstract class XU {
    public abstract void onChanged();

    public void onItemRangeChanged(int i, int i2) {
    }

    public abstract void onItemRangeInserted(int i, int i2);

    public abstract void onItemRangeMoved(int i, int i2, int i3);

    public abstract void onItemRangeRemoved(int i, int i2);

    public void onItemRangeChanged(int i, int i2, Object obj) {
        onItemRangeChanged(i, i2);
    }
}
