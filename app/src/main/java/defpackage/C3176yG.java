package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: yG  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3176yG {
    public static AG a(BG state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int ordinal = state.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    return null;
                }
                return AG.ON_PAUSE;
            }
            return AG.ON_STOP;
        }
        return AG.ON_DESTROY;
    }

    public static AG b(BG state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int ordinal = state.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return null;
                }
                return AG.ON_RESUME;
            }
            return AG.ON_START;
        }
        return AG.ON_CREATE;
    }
}
