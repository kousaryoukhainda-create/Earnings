package defpackage;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.widget.TextView;
/* renamed from: u4  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2814u4 extends C2728t4 {
    @Override // defpackage.C2728t4, defpackage.C2900v4
    public void a(StaticLayout.Builder builder, TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        textDirectionHeuristic = textView.getTextDirectionHeuristic();
        builder.setTextDirection(textDirectionHeuristic);
    }

    @Override // defpackage.C2900v4
    public boolean b(TextView textView) {
        boolean isHorizontallyScrollable;
        isHorizontallyScrollable = textView.isHorizontallyScrollable();
        return isHorizontallyScrollable;
    }
}
