package com.google.android.recaptcha.internal;

import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzic implements zzih {
    private static final boolean zzb(int i) {
        try {
            new Socket("localhost", i).close();
            return true;
        } catch (ConnectException unused) {
            return false;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final Object zza(@NotNull Object... objArr) {
        ArrayList<Number> arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (true != (obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num != null) {
                arrayList.add(Integer.valueOf(num.intValue()));
            } else {
                throw new zzce(4, 5, null);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Number number : arrayList) {
            int intValue = number.intValue();
            if (zzb(intValue)) {
                arrayList2.add(Integer.valueOf(intValue));
            }
        }
        return arrayList2;
    }
}
