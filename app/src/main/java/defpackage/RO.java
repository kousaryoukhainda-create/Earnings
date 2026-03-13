package defpackage;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
/* renamed from: RO  reason: default package */
/* loaded from: classes.dex */
public final class RO {
    public final CharSequence a;
    public final long b;
    public final C1614iR c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public RO(CharSequence charSequence, long j, C1614iR c1614iR) {
        this.a = charSequence;
        this.b = j;
        this.c = c1614iR;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            RO ro = (RO) arrayList.get(i);
            ro.getClass();
            Bundle bundle = new Bundle();
            CharSequence charSequence = ro.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong(CrashHianalyticsData.TIME, ro.b);
            C1614iR c1614iR = ro.c;
            if (c1614iR != null) {
                bundle.putCharSequence("sender", c1614iR.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", QO.a(AbstractC1528hR.b(c1614iR)));
                } else {
                    bundle.putBundle("person", c1614iR.b());
                }
            }
            String str = ro.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = ro.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = ro.d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
        r0.add(r12);
     */
    /* JADX WARN: Type inference failed for: r8v2, types: [iR, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList b(android.os.Parcelable[] r14) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r14.length
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L8:
            int r3 = r14.length
            if (r2 >= r3) goto Lba
            r3 = r14[r2]
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto Lb6
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r4 = "extras"
            java.lang.String r5 = "uri"
            java.lang.String r6 = "type"
            java.lang.String r7 = "sender"
            java.lang.String r8 = "sender_person"
            java.lang.String r9 = "person"
            java.lang.String r10 = "time"
            java.lang.String r11 = "text"
            r12 = 0
            boolean r13 = r3.containsKey(r11)     // Catch: java.lang.ClassCastException -> L77
            if (r13 == 0) goto Lb1
            boolean r13 = r3.containsKey(r10)     // Catch: java.lang.ClassCastException -> L77
            if (r13 != 0) goto L32
            goto Lb1
        L32:
            boolean r13 = r3.containsKey(r9)     // Catch: java.lang.ClassCastException -> L77
            if (r13 == 0) goto L41
            android.os.Bundle r7 = r3.getBundle(r9)     // Catch: java.lang.ClassCastException -> L77
            iR r7 = defpackage.C1614iR.a(r7)     // Catch: java.lang.ClassCastException -> L77
            goto L7a
        L41:
            boolean r9 = r3.containsKey(r8)     // Catch: java.lang.ClassCastException -> L77
            if (r9 == 0) goto L5a
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.ClassCastException -> L77
            r13 = 28
            if (r9 < r13) goto L5a
            android.os.Parcelable r7 = r3.getParcelable(r8)     // Catch: java.lang.ClassCastException -> L77
            android.app.Person r7 = defpackage.B0.c(r7)     // Catch: java.lang.ClassCastException -> L77
            iR r7 = defpackage.AbstractC1528hR.a(r7)     // Catch: java.lang.ClassCastException -> L77
            goto L7a
        L5a:
            boolean r8 = r3.containsKey(r7)     // Catch: java.lang.ClassCastException -> L77
            if (r8 == 0) goto L79
            java.lang.CharSequence r7 = r3.getCharSequence(r7)     // Catch: java.lang.ClassCastException -> L77
            iR r8 = new iR     // Catch: java.lang.ClassCastException -> L77
            r8.<init>()     // Catch: java.lang.ClassCastException -> L77
            r8.a = r7     // Catch: java.lang.ClassCastException -> L77
            r8.b = r12     // Catch: java.lang.ClassCastException -> L77
            r8.c = r12     // Catch: java.lang.ClassCastException -> L77
            r8.d = r12     // Catch: java.lang.ClassCastException -> L77
            r8.e = r1     // Catch: java.lang.ClassCastException -> L77
            r8.f = r1     // Catch: java.lang.ClassCastException -> L77
            r7 = r8
            goto L7a
        L77:
            goto Lb1
        L79:
            r7 = r12
        L7a:
            RO r8 = new RO     // Catch: java.lang.ClassCastException -> L77
            java.lang.CharSequence r9 = r3.getCharSequence(r11)     // Catch: java.lang.ClassCastException -> L77
            long r10 = r3.getLong(r10)     // Catch: java.lang.ClassCastException -> L77
            r8.<init>(r9, r10, r7)     // Catch: java.lang.ClassCastException -> L77
            boolean r7 = r3.containsKey(r6)     // Catch: java.lang.ClassCastException -> L77
            if (r7 == 0) goto La1
            boolean r7 = r3.containsKey(r5)     // Catch: java.lang.ClassCastException -> L77
            if (r7 == 0) goto La1
            java.lang.String r6 = r3.getString(r6)     // Catch: java.lang.ClassCastException -> L77
            android.os.Parcelable r5 = r3.getParcelable(r5)     // Catch: java.lang.ClassCastException -> L77
            android.net.Uri r5 = (android.net.Uri) r5     // Catch: java.lang.ClassCastException -> L77
            r8.e = r6     // Catch: java.lang.ClassCastException -> L77
            r8.f = r5     // Catch: java.lang.ClassCastException -> L77
        La1:
            boolean r5 = r3.containsKey(r4)     // Catch: java.lang.ClassCastException -> L77
            if (r5 == 0) goto Lb0
            android.os.Bundle r5 = r8.d     // Catch: java.lang.ClassCastException -> L77
            android.os.Bundle r3 = r3.getBundle(r4)     // Catch: java.lang.ClassCastException -> L77
            r5.putAll(r3)     // Catch: java.lang.ClassCastException -> L77
        Lb0:
            r12 = r8
        Lb1:
            if (r12 == 0) goto Lb6
            r0.add(r12)
        Lb6:
            int r2 = r2 + 1
            goto L8
        Lba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RO.b(android.os.Parcelable[]):java.util.ArrayList");
    }

    public final Notification.MessagingStyle.Message c() {
        Notification.MessagingStyle.Message a;
        int i = Build.VERSION.SDK_INT;
        CharSequence charSequence = null;
        Person person = null;
        long j = this.b;
        CharSequence charSequence2 = this.a;
        C1614iR c1614iR = this.c;
        if (i >= 28) {
            if (c1614iR != null) {
                person = AbstractC1528hR.b(c1614iR);
            }
            a = QO.b(charSequence2, j, person);
        } else {
            if (c1614iR != null) {
                charSequence = c1614iR.a;
            }
            a = PO.a(charSequence2, j, charSequence);
        }
        String str = this.e;
        if (str != null) {
            PO.b(a, str, this.f);
        }
        return a;
    }
}
