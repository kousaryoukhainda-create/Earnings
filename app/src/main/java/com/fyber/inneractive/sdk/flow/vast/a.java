package com.fyber.inneractive.sdk.flow.vast;

import android.view.View;
import java.util.Comparator;
/* loaded from: classes.dex */
public class a {
    public int d;
    public String e;
    public boolean a = false;
    public View b = null;
    public boolean c = false;
    public EnumC0070a f = EnumC0070a.HIGH;

    /* renamed from: com.fyber.inneractive.sdk.flow.vast.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0070a {
        HIGH,
        LOW
    }

    /* loaded from: classes.dex */
    public static class b implements Comparator<a> {
        @Override // java.util.Comparator
        public int compare(a aVar, a aVar2) {
            return aVar.f.ordinal() - aVar2.f.ordinal();
        }
    }

    public void a(View view) {
        this.b = view;
    }

    public void a() {
        this.b = null;
        this.a = false;
    }
}
