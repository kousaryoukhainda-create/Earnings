package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class tl {
    private final JSONObject a;
    private final Object b = new Object();

    public tl(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public Object a(InterfaceC1006cA interfaceC1006cA) {
        Object apply;
        synchronized (this.b) {
            apply = interfaceC1006cA.apply(this);
        }
        return apply;
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.b) {
            stringList = JsonUtils.getStringList(this.a, str, list);
        }
        return stringList;
    }

    public void c(String str) {
        synchronized (this.b) {
            this.a.remove(str);
        }
    }

    public String toString() {
        String jSONObject;
        synchronized (this.b) {
            jSONObject = this.a.toString();
        }
        return jSONObject;
    }

    public void a(InterfaceC0608Sh interfaceC0608Sh) {
        synchronized (this.b) {
            interfaceC0608Sh.accept(this);
        }
    }

    public Object b(String str) {
        Object opt;
        synchronized (this.b) {
            opt = this.a.opt(str);
        }
        return opt;
    }

    public void b(String str, int i) {
        synchronized (this.b) {
            JsonUtils.putInt(this.a, str, i);
        }
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.b) {
            bool2 = JsonUtils.getBoolean(this.a, str, bool);
        }
        return bool2;
    }

    public double a(String str, double d) {
        double d2;
        synchronized (this.b) {
            d2 = JsonUtils.getDouble(this.a, str, d);
        }
        return d2;
    }

    public void b(String str, long j) {
        synchronized (this.b) {
            JsonUtils.putLong(this.a, str, j);
        }
    }

    public float a(String str, float f) {
        float f2;
        synchronized (this.b) {
            f2 = JsonUtils.getFloat(this.a, str, f);
        }
        return f2;
    }

    public void b(String str, String str2) {
        synchronized (this.b) {
            JsonUtils.putString(this.a, str, str2);
        }
    }

    public int a(String str, int i) {
        int i2;
        synchronized (this.b) {
            i2 = JsonUtils.getInt(this.a, str, i);
        }
        return i2;
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.b) {
            integerList = JsonUtils.getIntegerList(this.a, str, list);
        }
        return integerList;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.b) {
            jSONArray2 = JsonUtils.getJSONArray(this.a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.b) {
            jSONObject2 = JsonUtils.getJSONObject(this.a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(String str, long j) {
        long j2;
        synchronized (this.b) {
            j2 = JsonUtils.getLong(this.a, str, j);
        }
        return j2;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.b) {
            string = JsonUtils.getString(this.a, str, str2);
        }
        return string;
    }

    public boolean a(String str) {
        boolean has;
        synchronized (this.b) {
            has = this.a.has(str);
        }
        return has;
    }

    public void a(String str, boolean z) {
        synchronized (this.b) {
            JsonUtils.putBoolean(this.a, str, z);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.b) {
            JsonUtils.putObject(this.a, str, obj);
        }
    }

    public JSONObject a() {
        JSONObject deepCopy;
        synchronized (this.b) {
            deepCopy = JsonUtils.deepCopy(this.a);
        }
        return deepCopy;
    }
}
