package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;
/* renamed from: XW  reason: default package */
/* loaded from: classes.dex */
public final class XW {
    public final String a;
    public final Context b;
    public ArrayList c;
    public Executor d;
    public Executor e;
    public InterfaceC1244e50 f;
    public boolean g;
    public boolean h = true;
    public boolean i;
    public final C0144Ak j;
    public HashSet k;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, Ak] */
    public XW(Context context, String str) {
        this.b = context;
        this.a = str;
        ?? obj = new Object();
        obj.a = new HashMap();
        this.j = obj;
    }

    public final void a(TM... tmArr) {
        if (this.k == null) {
            this.k = new HashSet();
        }
        for (TM tm : tmArr) {
            this.k.add(Integer.valueOf(tm.a));
            this.k.add(Integer.valueOf(tm.b));
        }
        C0144Ak c0144Ak = this.j;
        c0144Ak.getClass();
        for (TM tm2 : tmArr) {
            int i = tm2.a;
            HashMap hashMap = c0144Ak.a;
            TreeMap treeMap = (TreeMap) hashMap.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap();
                hashMap.put(Integer.valueOf(i), treeMap);
            }
            int i2 = tm2.b;
            TM tm3 = (TM) treeMap.get(Integer.valueOf(i2));
            if (tm3 != null) {
                Log.w("ROOM", "Overriding migration " + tm3 + " with " + tm2);
            }
            treeMap.put(Integer.valueOf(i2), tm2);
        }
    }
}
