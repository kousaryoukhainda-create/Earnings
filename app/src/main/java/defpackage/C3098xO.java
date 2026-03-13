package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: xO  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3098xO {
    public final IconCompat a;
    public final CharSequence b;
    public final PendingIntent c;
    public boolean d;
    public final Bundle e;
    public ArrayList f;
    public boolean g;
    public boolean h;

    public C3098xO(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        this.d = true;
        this.g = true;
        this.a = iconCompat;
        this.b = EO.c(charSequence);
        this.c = pendingIntent;
        this.e = bundle;
        this.f = null;
        this.d = true;
        this.g = true;
        this.h = false;
    }

    public final C3184yO a() {
        UV[] uvArr;
        CharSequence[] charSequenceArr;
        if (!this.h || this.c != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = this.f;
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    UV uv = (UV) it.next();
                    if (!uv.c && (((charSequenceArr = uv.b) == null || charSequenceArr.length == 0) && !uv.e.isEmpty())) {
                        arrayList.add(uv);
                    } else {
                        arrayList2.add(uv);
                    }
                }
            }
            UV[] uvArr2 = null;
            if (arrayList.isEmpty()) {
                uvArr = null;
            } else {
                uvArr = (UV[]) arrayList.toArray(new UV[arrayList.size()]);
            }
            if (!arrayList2.isEmpty()) {
                uvArr2 = (UV[]) arrayList2.toArray(new UV[arrayList2.size()]);
            }
            return new C3184yO(this.a, this.b, this.c, this.e, uvArr2, uvArr, this.d, this.g, this.h);
        }
        throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
    }
}
