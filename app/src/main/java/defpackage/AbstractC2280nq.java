package defpackage;

import android.widget.AbsListView;
import java.lang.reflect.Field;
/* renamed from: nq  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2280nq {
    public static final Field a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        a = field;
    }
}
