package defpackage;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;
/* renamed from: t4  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C2728t4 extends C2900v4 {
    @Override // defpackage.C2900v4
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C2986w4.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
