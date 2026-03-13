package com.huawei.hms.hatool;

import java.util.Calendar;
import java.util.UUID;
/* loaded from: classes2.dex */
public class p0 {
    private long a = 1800000;
    private volatile boolean b = false;
    private a c = null;

    /* loaded from: classes2.dex */
    public class a {
        String a = UUID.randomUUID().toString().replace("-", "");
        boolean b = true;
        private long c;

        public a(long j) {
            this.a += "_" + j;
            this.c = j;
            p0.this.b = false;
        }

        private void b(long j) {
            v.c("hmsSdk", "getNewSession() session is flush!");
            String uuid = UUID.randomUUID().toString();
            this.a = uuid;
            this.a = uuid.replace("-", "");
            this.a += "_" + j;
            this.c = j;
            this.b = true;
        }

        public void a(long j) {
            if (p0.this.b) {
                p0.this.b = false;
                b(j);
            } else if (b(this.c, j) || a(this.c, j)) {
                b(j);
            } else {
                this.c = j;
                this.b = false;
            }
        }

        private boolean a(long j, long j2) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j2);
            return (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) ? false : true;
        }

        private boolean b(long j, long j2) {
            return j2 - j >= p0.this.a;
        }
    }

    public String a() {
        a aVar = this.c;
        if (aVar == null) {
            v.f("hmsSdk", "getSessionName(): session not prepared. onEvent() must be called first.");
            return "";
        }
        return aVar.a;
    }

    public void a(long j) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(j);
            return;
        }
        v.c("hmsSdk", "Session is first flush");
        this.c = new a(j);
    }

    public boolean b() {
        a aVar = this.c;
        if (aVar == null) {
            v.f("hmsSdk", "isFirstEvent(): session not prepared. onEvent() must be called first.");
            return false;
        }
        return aVar.b;
    }
}
