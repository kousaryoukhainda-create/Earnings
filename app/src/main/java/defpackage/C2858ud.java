package defpackage;

import android.widget.CompoundButton;
import com.google.android.material.chip.ChipGroup;
/* renamed from: ud  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2858ud implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ChipGroup a;

    public C2858ud(ChipGroup chipGroup) {
        this.a = chipGroup;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ChipGroup chipGroup = this.a;
        if (chipGroup.n) {
            return;
        }
        if (chipGroup.getCheckedChipIds().isEmpty() && chipGroup.j) {
            chipGroup.c(compoundButton.getId(), true);
            chipGroup.m = compoundButton.getId();
            return;
        }
        int id = compoundButton.getId();
        if (z) {
            int i = chipGroup.m;
            if (i != -1 && i != id && chipGroup.i) {
                chipGroup.c(i, false);
            }
            chipGroup.setCheckedId(id);
        } else if (chipGroup.m == id) {
            chipGroup.setCheckedId(-1);
        }
    }
}
