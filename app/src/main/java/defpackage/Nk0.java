package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Nk0  reason: default package */
/* loaded from: classes2.dex */
public final class Nk0 extends SQLiteOpenHelper {
    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS AppActivityLog (package_name VARCHAR(255), start BIGINT, stop BIGINT, is_partner_app INTEGER, is_sending INTEGER DEFAULT 0, transaction_id VARCHAR(36), updated_at BIGINT DEFAULT 0, CONSTRAINT app_activity_log_primary_key PRIMARY KEY (package_name, start))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS PartnerApp (package_name VARCHAR(255) PRIMARY KEY, install_clicked BIGINT, installed INTEGER, hide_engagement_notif INTEGER DEFAULT 0 NOT NULL, click_uuid VARCHAR(255), view_uuid VARCHAR(255), creative_set_uuid VARCHAR(255), targeting_group_uuid VARCHAR(255), click_url VARCHAR(255), view_url VARCHAR(255), campaign_uuid VARCHAR(255), usage BIGINT DEFAULT 0, last_reward_time BIGINT DEFAULT 0,app_name VARCHAR(255),installed_at BIGINT,campaign_type VARCHAR(255), post_install_reward_coins INTEGER DEFAULT 0 NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS RewardLevel (level INTEGER, package_name VARCHAR(255), seconds BIGINT, value BIGINT, currency VARCHAR(255), CONSTRAINT reward_level_primary_key PRIMARY KEY (level, package_name), FOREIGN KEY (package_name) REFERENCES PartnerApp)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS AppList (package_name VARCHAR(255) PRIMARY KEY, installed_at BIGINT, flags INTEGER, seconds_sum BIGINT)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS PartnerAppIcon (package_name VARCHAR(255) PRIMARY KEY, image_data BLOB )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS AppLaunchActivity (package_name VARCHAR(255) NOT NULL,activity_name VARCHAR(512) NOT NULL,PRIMARY KEY (package_name, activity_name))");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        a(db);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db, int i, int i2) {
        Intrinsics.checkNotNullParameter(db, "db");
        try {
            db.execSQL("DROP TABLE IF EXISTS AppActivityLog");
            db.execSQL("DROP TABLE IF EXISTS PartnerApp");
            db.execSQL("DROP TABLE IF EXISTS RewardLevel");
            db.execSQL("DROP TABLE IF EXISTS UsageStatsHistory");
            db.execSQL("DROP TABLE IF EXISTS AppList");
            db.execSQL("DROP TABLE IF EXISTS PartnerAppIcon");
            db.execSQL("DROP TABLE IF EXISTS AppLaunchActivity");
            a(db);
            AbstractC1930jl0.h("PlayTimeDbHelper", "Successfully Downgraded DB from " + i + " to " + i2);
        } catch (Exception e) {
            AbstractC1930jl0.e("Pokemon", e);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase db, int i, int i2) {
        Intrinsics.checkNotNullParameter(db, "db");
        if (i < 2) {
            db.execSQL("DROP TABLE IF EXISTS RewardLevel");
            db.execSQL("CREATE TABLE IF NOT EXISTS RewardLevel (level INTEGER, package_name VARCHAR(255), seconds BIGINT, value BIGINT, currency VARCHAR(255), CONSTRAINT reward_level_primary_key PRIMARY KEY (level, package_name), FOREIGN KEY (package_name) REFERENCES AppActivityLog)");
        }
        if (i < 3) {
            db.execSQL("ALTER TABLE PartnerApp ADD COLUMN ad_format VARCHAR(255) DEFAULT 'offerwall'");
        }
        if (i < 4) {
            db.execSQL("DROP TABLE IF EXISTS RewardLevel");
            db.execSQL("CREATE TABLE IF NOT EXISTS RewardLevel (level INTEGER, package_name VARCHAR(255), seconds BIGINT, value BIGINT, currency VARCHAR(255), ad_format VARCHAR(100), CONSTRAINT reward_level_primary_key PRIMARY KEY (level, package_name, ad_format), FOREIGN KEY (package_name) REFERENCES AppActivityLog)");
        }
        if (i < 5) {
            db.execSQL("ALTER TABLE PartnerApp ADD COLUMN creative_set_uuid VARCHAR(255)");
            db.execSQL("ALTER TABLE PartnerApp ADD COLUMN targeting_group_uuid VARCHAR(255)");
            db.execSQL("ALTER TABLE PartnerApp ADD COLUMN click_url VARCHAR(255)");
            db.execSQL("ALTER TABLE PartnerApp ADD COLUMN view_url VARCHAR(255)");
            db.execSQL("ALTER TABLE PartnerApp ADD COLUMN campaign_uuid VARCHAR(255)");
        }
        if (i < 6) {
            db.execSQL("ALTER TABLE AppActivityLog ADD COLUMN is_sending INTEGER DEFAULT 0");
        }
        if (i < 7) {
            if (db.inTransaction()) {
                AbstractC1930jl0.k("PlayTimeDbHelper", "migrateSchema called with pending transaction");
            } else {
                String c = AbstractC2437ph.c(i, "_RewardLevel_", "_old");
                String str = "_RewardLevel_" + i + "_old";
                AbstractC1930jl0.j("PlayTimeDbHelper", "migrating table RewardLevel with columns *");
                AbstractC1930jl0.j("PlayTimeDbHelper", AbstractC0957bf.a("using migration table ", str));
                AbstractC1930jl0.j("PlayTimeDbHelper", "disabling FK constraints");
                db.setForeignKeyConstraintsEnabled(false);
                try {
                    try {
                        AbstractC1930jl0.j("PlayTimeDbHelper", "starting transaction");
                        db.beginTransaction();
                        AbstractC1930jl0.j("PlayTimeDbHelper", "backing up old table");
                        db.execSQL("CREATE TABLE " + c + " AS SELECT * FROM RewardLevel");
                        AbstractC1930jl0.j("PlayTimeDbHelper", "creating migration table with new schema");
                        db.execSQL("CREATE TABLE " + str + " (level INTEGER, package_name VARCHAR(255), seconds BIGINT, value BIGINT, currency VARCHAR(255), ad_format VARCHAR(100), CONSTRAINT reward_level_primary_key PRIMARY KEY (level, package_name, ad_format), FOREIGN KEY (package_name) REFERENCES PartnerApp)");
                        AbstractC1930jl0.j("PlayTimeDbHelper", "inserting data into migration table");
                        db.execSQL("INSERT INTO " + str + " SELECT * FROM RewardLevel;");
                        AbstractC1930jl0.j("PlayTimeDbHelper", "dropping old table");
                        db.execSQL("DROP TABLE RewardLevel");
                        AbstractC1930jl0.j("PlayTimeDbHelper", "renaming migration table");
                        db.execSQL("ALTER TABLE " + str + " RENAME TO RewardLevel;");
                        db.setTransactionSuccessful();
                    } catch (SQLException e) {
                        AbstractC1930jl0.g("PlayTimeDbHelper", "migration failed: " + e, e);
                    }
                    AbstractC1930jl0.j("PlayTimeDbHelper", "ending transaction");
                    db.endTransaction();
                    db.setForeignKeyConstraintsEnabled(true);
                    AbstractC1930jl0.j("PlayTimeDbHelper", "enabled FK constraints");
                } catch (Throwable th) {
                    AbstractC1930jl0.j("PlayTimeDbHelper", "ending transaction");
                    db.endTransaction();
                    db.setForeignKeyConstraintsEnabled(true);
                    AbstractC1930jl0.j("PlayTimeDbHelper", "enabled FK constraints");
                    throw th;
                }
            }
        }
        if (i < 8) {
            db.delete("RewardLevel", "ad_format != 'offerwall'", new String[0]);
            db.delete("PartnerApp", "ad_format != 'offerwall'", new String[0]);
        }
        if (i < 9) {
            db.execSQL("ALTER TABLE PartnerApp ADD COLUMN app_name VARCHAR(255)");
            db.execSQL("ALTER TABLE PartnerApp ADD COLUMN installed_at BIGINT");
        }
        if (i < 10) {
            db.execSQL("DROP TABLE RewardLevel");
            db.execSQL("CREATE TABLE IF NOT EXISTS RewardLevel (level INTEGER, package_name VARCHAR(255), seconds BIGINT, value BIGINT, currency VARCHAR(255), CONSTRAINT reward_level_primary_key PRIMARY KEY (level, package_name), FOREIGN KEY (package_name) REFERENCES PartnerApp)");
        }
        if (i < 11) {
            try {
                db.execSQL("ALTER TABLE PartnerApp ADD COLUMN app_name VARCHAR(255)");
                db.execSQL("ALTER TABLE PartnerApp ADD COLUMN installed_at BIGINT");
            } catch (SQLiteException e2) {
                String message = e2.getMessage();
                Intrinsics.b(message);
                if (!D40.o(message, "duplicate column name: app_name")) {
                    throw e2;
                }
            }
        }
        if (i < 14) {
            db.execSQL("CREATE TABLE IF NOT EXISTS PartnerAppIcon (package_name VARCHAR(255) PRIMARY KEY, image_data BLOB )");
        }
        if (i < 15) {
            db.execSQL("DROP TABLE IF EXISTS UsageStatsHistory");
            db.execSQL("CREATE TABLE IF NOT EXISTS AppList (package_name VARCHAR(255) PRIMARY KEY, installed_at BIGINT, flags INTEGER, seconds_sum BIGINT)");
        }
        if (i < 16) {
            db.execSQL("CREATE TABLE IF NOT EXISTS PartnerAppIcon (package_name VARCHAR(255) PRIMARY KEY, image_data BLOB )");
            db.execSQL("DROP TABLE IF EXISTS UsageStatsHistory");
            db.execSQL("CREATE TABLE IF NOT EXISTS AppList (package_name VARCHAR(255) PRIMARY KEY, installed_at BIGINT, flags INTEGER, seconds_sum BIGINT)");
        }
        if (i < 17) {
            db.execSQL("CREATE TABLE IF NOT EXISTS AppLaunchActivity (package_name VARCHAR(255) NOT NULL,activity_name VARCHAR(512) NOT NULL,PRIMARY KEY (package_name, activity_name))");
        }
        if (i < 18) {
            db.execSQL("ALTER TABLE AppActivityLog ADD COLUMN transaction_id VARCHAR(36)");
            db.execSQL("ALTER TABLE AppActivityLog ADD COLUMN updated_at BIGINT DEFAULT 0");
            db.execSQL("ALTER TABLE PartnerApp ADD COLUMN post_install_reward_coins INTEGER DEFAULT 0 NOT NULL");
        }
        if (i < 19) {
            db.execSQL("DROP TABLE IF EXISTS AppActivityLog");
            db.execSQL("CREATE TABLE IF NOT EXISTS AppActivityLog (package_name VARCHAR(255), start BIGINT, stop BIGINT, is_partner_app INTEGER, is_sending INTEGER DEFAULT 0, transaction_id VARCHAR(36), updated_at BIGINT DEFAULT 0, CONSTRAINT app_activity_log_primary_key PRIMARY KEY (package_name, start))");
            db.execSQL("CREATE TABLE IF NOT EXISTS AppLaunchActivity (package_name VARCHAR(255) NOT NULL,activity_name VARCHAR(512) NOT NULL,PRIMARY KEY (package_name, activity_name))");
        }
        if (i < 20) {
            try {
                db.execSQL("ALTER TABLE PartnerApp ADD COLUMN post_install_reward_coins INTEGER DEFAULT 0 NOT NULL");
            } catch (Exception unused) {
                AbstractC1930jl0.k("PlayTimeDbHelper", "Column already exists");
            }
        }
        if (i < 21) {
            db.execSQL("ALTER TABLE PartnerApp ADD COLUMN hide_engagement_notif INTEGER DEFAULT 0 NOT NULL");
        }
        if (i < 22) {
            db.execSQL("ALTER TABLE PartnerApp ADD COLUMN campaign_type VARCHAR(255)");
        }
    }
}
