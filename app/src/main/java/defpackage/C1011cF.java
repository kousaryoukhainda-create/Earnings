package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
/* renamed from: cF  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1011cF {
    public final Context a;
    public final InterfaceC1482gs b;
    public final V8 c;

    public C1011cF(Context context, InterfaceC1482gs interfaceC1482gs, V8 v8) {
        this.a = context;
        this.b = interfaceC1482gs;
        this.c = v8;
    }

    public final void a(C1166d9 c1166d9, int i, boolean z) {
        Long l;
        Context context = this.a;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(c1166d9.a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        EnumC0849aT enumC0849aT = c1166d9.c;
        adler32.update(allocate.putInt(AbstractC1025cT.a(enumC0849aT)).array());
        byte[] bArr = c1166d9.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        AbstractC1424g90.w("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", c1166d9);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase a = ((C1192dY) this.b).a();
        String valueOf = String.valueOf(AbstractC1025cT.a(enumC0849aT));
        String str = c1166d9.a;
        Cursor rawQuery = a.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
        try {
            if (rawQuery.moveToNext()) {
                l = Long.valueOf(rawQuery.getLong(0));
            } else {
                l = 0L;
            }
            rawQuery.close();
            long longValue = l.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            V8 v8 = this.c;
            Long l2 = l;
            builder.setMinimumLatency(v8.a(enumC0849aT, longValue, i));
            Set set = ((W8) v8.b.get(enumC0849aT)).c;
            if (set.contains(RY.b)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(RY.d)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(RY.c)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", AbstractC1025cT.a(enumC0849aT));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {c1166d9, Integer.valueOf(value), Long.valueOf(v8.a(enumC0849aT, longValue, i)), l2, Integer.valueOf(i)};
            String E = AbstractC1424g90.E("JobInfoScheduler");
            if (Log.isLoggable(E, 3)) {
                Log.d(E, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
