package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collection;
/* renamed from: Xk0  reason: default package */
/* loaded from: classes2.dex */
public final class Xk0 extends AbstractC1431gG implements InterfaceC0263Ez {
    public final /* synthetic */ int h;
    public final /* synthetic */ VA i;
    public final /* synthetic */ Collection j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Xk0(VA va, Collection collection, int i) {
        super(0);
        this.h = i;
        this.i = va;
        this.j = collection;
    }

    @Override // defpackage.InterfaceC0263Ez
    public final Object invoke() {
        switch (this.h) {
            case 0:
                SQLiteDatabase writableDatabase = this.i.K().getWritableDatabase();
                writableDatabase.beginTransaction();
                for (C2785tj0 c2785tj0 : this.j) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("package_name", c2785tj0.b);
                    contentValues.put("installed_at", Long.valueOf(c2785tj0.c));
                    contentValues.put("flags", Integer.valueOf(c2785tj0.d));
                    contentValues.put("seconds_sum", Long.valueOf(c2785tj0.f));
                    if (writableDatabase.insertWithOnConflict("AppList", null, contentValues, 4) == -1) {
                        writableDatabase.update("AppList", contentValues, "package_name = ?", new String[]{c2785tj0.b});
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return B90.a;
            default:
                SQLiteDatabase writableDatabase2 = this.i.K().getWritableDatabase();
                writableDatabase2.beginTransaction();
                for (C2004kf0 c2004kf0 : this.j) {
                    ContentValues contentValues2 = new ContentValues(14);
                    contentValues2.put("package_name", c2004kf0.b);
                    contentValues2.put("install_clicked", Long.valueOf(c2004kf0.f));
                    contentValues2.put("installed", Boolean.valueOf(c2004kf0.g));
                    contentValues2.put("click_uuid", c2004kf0.h);
                    contentValues2.put("view_uuid", c2004kf0.i);
                    contentValues2.put("creative_set_uuid", c2004kf0.j);
                    contentValues2.put("targeting_group_uuid", c2004kf0.k);
                    contentValues2.put("click_url", c2004kf0.l);
                    contentValues2.put("view_url", c2004kf0.m);
                    contentValues2.put("campaign_uuid", c2004kf0.n);
                    contentValues2.put("usage", Long.valueOf(c2004kf0.o));
                    contentValues2.put("last_reward_time", Long.valueOf(c2004kf0.p));
                    contentValues2.put("app_name", c2004kf0.c);
                    contentValues2.put("installed_at", Long.valueOf(c2004kf0.q));
                    contentValues2.put("post_install_reward_coins", Integer.valueOf(c2004kf0.r));
                    contentValues2.put("hide_engagement_notif", Boolean.valueOf(c2004kf0.s));
                    contentValues2.put("campaign_type", c2004kf0.d);
                    if (writableDatabase2.insertWithOnConflict("PartnerApp", null, contentValues2, 4) == -1) {
                        writableDatabase2.update("PartnerApp", contentValues2, "package_name = ?", new String[]{c2004kf0.b});
                    }
                }
                writableDatabase2.setTransactionSuccessful();
                writableDatabase2.endTransaction();
                return B90.a;
        }
    }
}
