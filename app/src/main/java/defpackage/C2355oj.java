package defpackage;

import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: oj  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2355oj {
    public final C0206Cu a;

    public C2355oj(C0206Cu userMetadata) {
        Intrinsics.checkNotNullParameter(userMetadata, "userMetadata");
        this.a = userMetadata;
    }

    public final void a(U8 rolloutsState) {
        String str;
        Intrinsics.checkNotNullParameter(rolloutsState, "rolloutsState");
        C0206Cu c0206Cu = this.a;
        HashSet hashSet = rolloutsState.a;
        Intrinsics.checkNotNullExpressionValue(hashSet, "rolloutsState.rolloutAssignments");
        ArrayList arrayList = new ArrayList(C0372Je.f(hashSet));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            S8 s8 = (S8) ((UW) it.next());
            String str2 = s8.b;
            String str3 = s8.d;
            String str4 = s8.e;
            String str5 = s8.c;
            long j = s8.f;
            Oc0 oc0 = VW.a;
            if (str4.length() > 256) {
                str = str4.substring(0, UserVerificationMethods.USER_VERIFY_HANDPRINT);
            } else {
                str = str4;
            }
            arrayList.add(new T8(str2, str3, str, str5, j));
        }
        synchronized (((C0731Xa) c0206Cu.h)) {
            try {
                if (((C0731Xa) c0206Cu.h).w(arrayList)) {
                    ((ExecutorC0688Vj) ((C3244z4) c0206Cu.d).d).a(new RunnableC0776Yt(24, c0206Cu, ((C0731Xa) c0206Cu.h).q()));
                }
            } finally {
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}
