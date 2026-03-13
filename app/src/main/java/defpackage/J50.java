package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* renamed from: J50  reason: default package */
/* loaded from: classes.dex */
public final class J50 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public J50(String str, HashMap hashMap, HashSet hashSet, HashSet hashSet2) {
        Set unmodifiableSet;
        this.a = str;
        this.b = Collections.unmodifiableMap(hashMap);
        this.c = Collections.unmodifiableSet(hashSet);
        if (hashSet2 == null) {
            unmodifiableSet = null;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(hashSet2);
        }
        this.d = unmodifiableSet;
    }

    public static J50 a(C3148xz c3148xz, String str) {
        boolean z;
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        boolean z2;
        Cursor k = c3148xz.k("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (k.getColumnCount() > 0) {
                int columnIndex = k.getColumnIndex("name");
                int columnIndex2 = k.getColumnIndex("type");
                int columnIndex3 = k.getColumnIndex("notnull");
                int columnIndex4 = k.getColumnIndex("pk");
                int columnIndex5 = k.getColumnIndex("dflt_value");
                while (k.moveToNext()) {
                    String string = k.getString(columnIndex);
                    String string2 = k.getString(columnIndex2);
                    if (k.getInt(columnIndex3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hashMap.put(string, new F50(k.getInt(columnIndex4), string, string2, k.getString(columnIndex5), z2, 2));
                }
            }
            k.close();
            HashSet hashSet = new HashSet();
            k = c3148xz.k("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = k.getColumnIndex("id");
                int columnIndex7 = k.getColumnIndex("seq");
                int columnIndex8 = k.getColumnIndex("table");
                int columnIndex9 = k.getColumnIndex("on_delete");
                int columnIndex10 = k.getColumnIndex("on_update");
                ArrayList b = b(k);
                int count = k.getCount();
                int i4 = 0;
                while (i4 < count) {
                    k.moveToPosition(i4);
                    if (k.getInt(columnIndex7) != 0) {
                        i = columnIndex6;
                        i2 = columnIndex7;
                        arrayList = b;
                        i3 = count;
                    } else {
                        int i5 = k.getInt(columnIndex6);
                        i = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        i2 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = b.iterator();
                        while (it.hasNext()) {
                            ArrayList arrayList4 = b;
                            H50 h50 = (H50) it.next();
                            int i6 = count;
                            if (h50.b == i5) {
                                arrayList2.add(h50.d);
                                arrayList3.add(h50.f);
                            }
                            b = arrayList4;
                            count = i6;
                        }
                        arrayList = b;
                        i3 = count;
                        hashSet.add(new G50(k.getString(columnIndex8), k.getString(columnIndex9), arrayList2, k.getString(columnIndex10), arrayList3));
                    }
                    i4++;
                    columnIndex6 = i;
                    columnIndex7 = i2;
                    b = arrayList;
                    count = i3;
                }
                k.close();
                k = c3148xz.k("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = k.getColumnIndex("name");
                    int columnIndex12 = k.getColumnIndex("origin");
                    int columnIndex13 = k.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        HashSet hashSet3 = new HashSet();
                        while (k.moveToNext()) {
                            if ("c".equals(k.getString(columnIndex12))) {
                                String string3 = k.getString(columnIndex11);
                                if (k.getInt(columnIndex13) == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                I50 c = c(c3148xz, string3, z);
                                if (c != null) {
                                    hashSet3.add(c);
                                }
                            }
                        }
                        k.close();
                        hashSet2 = hashSet3;
                        return new J50(str, hashMap, hashSet, hashSet2);
                    }
                    return new J50(str, hashMap, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new H50(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public static I50 c(C3148xz c3148xz, String str, boolean z) {
        Cursor k = c3148xz.k("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = k.getColumnIndex("seqno");
            int columnIndex2 = k.getColumnIndex("cid");
            int columnIndex3 = k.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (k.moveToNext()) {
                    if (k.getInt(columnIndex2) >= 0) {
                        int i = k.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i), k.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                I50 i50 = new I50(str, arrayList, z);
                k.close();
                return i50;
            }
            k.close();
            return null;
        } catch (Throwable th) {
            k.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || J50.class != obj.getClass()) {
            return false;
        }
        J50 j50 = (J50) obj;
        String str = j50.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map = j50.b;
        Map map2 = this.b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set2 = j50.c;
        Set set3 = this.c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.d;
        if (set4 == null || (set = j50.d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Map map = this.b;
        if (map != null) {
            i2 = map.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Set set = this.c;
        if (set != null) {
            i3 = set.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
