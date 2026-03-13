package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.SparseBooleanArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzlk;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zzc;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: ab  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0858ab implements InterfaceC2073lU {
    public static C0858ab d;
    public boolean b;
    public Object c;

    public /* synthetic */ C0858ab(Object obj, boolean z) {
        this.b = z;
        this.c = obj;
    }

    public static void f(C2467q2 c2467q2) {
        String message = c2467q2.getMessage();
        if (message != null && message.contains("already initializing")) {
            return;
        }
        AbstractC1930jl0.i(Kj0.b, "Error while initializing Adjoe protection library", c2467q2);
        Intrinsics.checkNotNullParameter("protection-init", "category");
        C2521qg c2521qg = new C2521qg("protection-init");
        c2521qg.e = "Error Callback on Protection Init";
        c2521qg.f = c2467q2;
        c2521qg.e();
    }

    public static zzc g(Intent intent) {
        Preconditions.checkNotNull(intent);
        return zzc.z(((zzait) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzait.CREATOR)).zzc(true));
    }

    public static void i(Context context) {
        C0858ab c0858ab = d;
        c0858ab.b = false;
        if (((BroadcastReceiver) c0858ab.c) != null) {
            C1261eI h = C1261eI.h(context);
            BroadcastReceiver broadcastReceiver = (BroadcastReceiver) d.c;
            synchronized (((HashMap) h.d)) {
                try {
                    ArrayList arrayList = (ArrayList) ((HashMap) h.d).remove(broadcastReceiver);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            C1176dI c1176dI = (C1176dI) arrayList.get(size);
                            c1176dI.d = true;
                            for (int i = 0; i < c1176dI.a.countActions(); i++) {
                                String action = c1176dI.a.getAction(i);
                                ArrayList arrayList2 = (ArrayList) ((HashMap) h.f).get(action);
                                if (arrayList2 != null) {
                                    for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                        C1176dI c1176dI2 = (C1176dI) arrayList2.get(size2);
                                        if (c1176dI2.b == broadcastReceiver) {
                                            c1176dI2.d = true;
                                            arrayList2.remove(size2);
                                        }
                                    }
                                    if (arrayList2.size() <= 0) {
                                        ((HashMap) h.f).remove(action);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                }
            }
        }
        d.c = null;
    }

    public void a(int i) {
        B10.u(!this.b);
        ((SparseBooleanArray) this.c).append(i, true);
    }

    public C0545Pw b() {
        B10.u(!this.b);
        this.b = true;
        return new C0545Pw((SparseBooleanArray) this.c);
    }

    @Override // defpackage.InterfaceC2073lU
    public void c(C1987kU c1987kU, int i) {
        boolean z = this.b;
        StringBuilder sb = (StringBuilder) this.c;
        if (z) {
            this.b = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public boolean d() {
        return this.b;
    }

    public boolean e(CharSequence charSequence, int i) {
        if (charSequence != null && i >= 0 && charSequence.length() - i >= 0) {
            if (((C2999wB) this.c) == null) {
                return d();
            }
            char c = 2;
            for (int i2 = 0; i2 < i && c == 2; i2++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                C0858ab c0858ab = W50.a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                c = 2;
                                break;
                        }
                    }
                    c = 0;
                }
                c = 1;
            }
            if (c == 0) {
                return true;
            }
            if (c != 1) {
                return d();
            }
            return false;
        }
        throw new IllegalArgumentException();
    }

    public void h(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.c = broadcastReceiver;
        C1261eI h = C1261eI.h(activity);
        IntentFilter intentFilter = new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        synchronized (((HashMap) h.d)) {
            try {
                C1176dI c1176dI = new C1176dI(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) ((HashMap) h.d).get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    ((HashMap) h.d).put(broadcastReceiver, arrayList);
                }
                arrayList.add(c1176dI);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) ((HashMap) h.f).get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        ((HashMap) h.f).put(action, arrayList2);
                    }
                    arrayList2.add(c1176dI);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(zzlk zzlkVar) {
        if (this.b) {
            zze.zzl("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((C1261eI) this.c).q(new C2994w8(zzlkVar, EnumC0849aT.b, null), new C2394p80(0));
        } catch (Throwable unused) {
            zze.zzl("BillingLogger", "logging failed.");
        }
    }

    public boolean k(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (!this.b) {
            h(activity, new C1304em0(this, activity, taskCompletionSource, firebaseAuth, firebaseUser));
            this.b = true;
            return true;
        }
        return false;
    }

    public C0858ab() {
        this.c = new SparseBooleanArray();
    }

    public C0858ab(C2999wB c2999wB, boolean z) {
        this.c = c2999wB;
        this.b = z;
    }
}
