package com.applovin.impl;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class b5 {
    public db a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return p2.a(a5.t, (ArrayList) b1.a(readBundle.getParcelableArrayList("c")));
    }
}
