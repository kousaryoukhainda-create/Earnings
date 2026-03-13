package com.huawei.agconnect.core.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class AGConnectInitializeProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Log.i("AGConnectProvider", "AGConnectInitializeProvider#onCreate");
        Context context = getContext();
        Log.i("AGConnectInstance", "AGConnectInstance#initialize");
        ArrayList arrayList = Zf0.b;
        synchronized (Zf0.class) {
            Log.w("AGC_Instance", "agc sdk initialize");
            if (Zf0.c.size() > 0) {
                Log.w("AGC_Instance", "Repeated invoking initialize");
            } else {
                Zf0.c(context, C2607rg0.e(context));
            }
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
