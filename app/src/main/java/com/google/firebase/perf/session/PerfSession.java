package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new LQ(2);
    public final String b;
    public final Timer c;
    public boolean d;

    public PerfSession(String str, C2999wB c2999wB) {
        this.d = false;
        this.b = str;
        this.c = new Timer();
    }

    public static C1270eR[] d(List list) {
        if (list.isEmpty()) {
            return null;
        }
        C1270eR[] c1270eRArr = new C1270eR[list.size()];
        C1270eR c = ((PerfSession) list.get(0)).c();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            C1270eR c2 = ((PerfSession) list.get(i)).c();
            if (!z && ((PerfSession) list.get(i)).d) {
                c1270eRArr[0] = c2;
                c1270eRArr[i] = c;
                z = true;
            } else {
                c1270eRArr[i] = c2;
            }
        }
        if (!z) {
            c1270eRArr[0] = c;
        }
        return c1270eRArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (defpackage.C0218Dg.v(r5) != false) goto L15;
     */
    /* JADX WARN: Type inference failed for: r4v8, types: [bh, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.firebase.perf.session.PerfSession e(java.lang.String r9) {
        /*
            java.lang.String r0 = "-"
            java.lang.String r1 = ""
            java.lang.String r9 = r9.replace(r0, r1)
            com.google.firebase.perf.session.PerfSession r0 = new com.google.firebase.perf.session.PerfSession
            wB r1 = new wB
            r2 = 19
            r1.<init>(r2)
            r0.<init>(r9, r1)
            Dg r9 = defpackage.C0218Dg.e()
            boolean r1 = r9.u()
            if (r1 == 0) goto Ld0
            double r1 = java.lang.Math.random()
            java.lang.Class<bh> r3 = defpackage.C0961bh.class
            monitor-enter(r3)
            bh r4 = defpackage.C0961bh.z     // Catch: java.lang.Throwable -> L31
            if (r4 != 0) goto L34
            bh r4 = new bh     // Catch: java.lang.Throwable -> L31
            r4.<init>()     // Catch: java.lang.Throwable -> L31
            defpackage.C0961bh.z = r4     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            r9 = move-exception
            goto Lce
        L34:
            bh r4 = defpackage.C0961bh.z     // Catch: java.lang.Throwable -> L31
            monitor-exit(r3)
            sQ r3 = r9.k(r4)
            boolean r5 = r3.b()
            if (r5 == 0) goto L56
            java.lang.Object r3 = r3.a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r5 = r3.doubleValue()
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 / r7
            boolean r3 = defpackage.C0218Dg.v(r5)
            if (r3 == 0) goto L56
            goto Lc8
        L56:
            com.google.firebase.perf.config.RemoteConfigManager r3 = r9.a
            java.lang.String r5 = "fpr_vc_session_sampling_rate"
            sQ r3 = r3.getDouble(r5)
            boolean r5 = r3.b()
            if (r5 == 0) goto L90
            java.lang.Object r5 = r3.a()
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            boolean r5 = defpackage.C0218Dg.v(r5)
            if (r5 == 0) goto L90
            ip r9 = r9.c
            java.lang.String r4 = "com.google.firebase.perf.SessionSamplingRate"
            java.lang.Object r5 = r3.a()
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            r9.e(r4, r5)
            java.lang.Object r9 = r3.a()
            java.lang.Double r9 = (java.lang.Double) r9
            double r5 = r9.doubleValue()
            goto Lc8
        L90:
            sQ r3 = r9.b(r4)
            boolean r4 = r3.b()
            if (r4 == 0) goto Lb5
            java.lang.Object r4 = r3.a()
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            boolean r4 = defpackage.C0218Dg.v(r4)
            if (r4 == 0) goto Lb5
            java.lang.Object r9 = r3.a()
            java.lang.Double r9 = (java.lang.Double) r9
            double r5 = r9.doubleValue()
            goto Lc8
        Lb5:
            com.google.firebase.perf.config.RemoteConfigManager r9 = r9.a
            boolean r9 = r9.isLastFetchFailed()
            if (r9 == 0) goto Lc3
            r5 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            goto Lc8
        Lc3:
            r5 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
        Lc8:
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 >= 0) goto Ld0
            r9 = 1
            goto Ld1
        Lce:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
            throw r9
        Ld0:
            r9 = 0
        Ld1:
            r0.d = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.session.PerfSession.e(java.lang.String):com.google.firebase.perf.session.PerfSession");
    }

    public final C1270eR c() {
        C1185dR y = C1270eR.y();
        y.k();
        C1270eR.u((C1270eR) y.c, this.b);
        if (this.d) {
            y.k();
            C1270eR.v((C1270eR) y.c);
        }
        return (C1270eR) y.i();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, Yg] */
    public final boolean f() {
        C0763Yg c0763Yg;
        long j;
        long minutes = TimeUnit.MICROSECONDS.toMinutes(this.c.c());
        C0218Dg e = C0218Dg.e();
        e.getClass();
        synchronized (C0763Yg.class) {
            try {
                if (C0763Yg.z == null) {
                    C0763Yg.z = new Object();
                }
                c0763Yg = C0763Yg.z;
            } catch (Throwable th) {
                throw th;
            }
        }
        C2670sQ l = e.l(c0763Yg);
        if (l.b() && ((Long) l.a()).longValue() > 0) {
            j = ((Long) l.a()).longValue();
        } else {
            C2670sQ c2670sQ = e.a.getLong("fpr_session_max_duration_min");
            if (c2670sQ.b() && ((Long) c2670sQ.a()).longValue() > 0) {
                e.c.d(((Long) c2670sQ.a()).longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                j = ((Long) c2670sQ.a()).longValue();
            } else {
                C2670sQ c = e.c(c0763Yg);
                if (c.b() && ((Long) c.a()).longValue() > 0) {
                    j = ((Long) c.a()).longValue();
                } else {
                    j = 240;
                }
            }
        }
        if (minutes > j) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.c, 0);
    }

    public PerfSession(Parcel parcel) {
        this.d = false;
        this.b = parcel.readString();
        this.d = parcel.readByte() != 0;
        this.c = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
