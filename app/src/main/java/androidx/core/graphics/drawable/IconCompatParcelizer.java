package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC1626ib0 abstractC1626ib0) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = abstractC1626ib0.f(iconCompat.a, 1);
        byte[] bArr = iconCompat.c;
        if (abstractC1626ib0.e(2)) {
            Parcel parcel = ((C1910jb0) abstractC1626ib0).e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = abstractC1626ib0.g(iconCompat.d, 3);
        iconCompat.e = abstractC1626ib0.f(iconCompat.e, 4);
        iconCompat.f = abstractC1626ib0.f(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) abstractC1626ib0.g(iconCompat.g, 6);
        String str = iconCompat.i;
        if (abstractC1626ib0.e(7)) {
            str = ((C1910jb0) abstractC1626ib0).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (abstractC1626ib0.e(8)) {
            str2 = ((C1910jb0) abstractC1626ib0).e.readString();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    break;
                } else {
                    byte[] bArr3 = iconCompat.c;
                    iconCompat.b = bArr3;
                    iconCompat.a = 3;
                    iconCompat.e = 0;
                    iconCompat.f = bArr3.length;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str3;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.b = iconCompat.c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC1626ib0 abstractC1626ib0) {
        abstractC1626ib0.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            abstractC1626ib0.j(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            abstractC1626ib0.i(2);
            int length = bArr.length;
            Parcel parcel = ((C1910jb0) abstractC1626ib0).e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC1626ib0.k(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            abstractC1626ib0.j(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            abstractC1626ib0.j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            abstractC1626ib0.k(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC1626ib0.i(7);
            ((C1910jb0) abstractC1626ib0).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            abstractC1626ib0.i(8);
            ((C1910jb0) abstractC1626ib0).e.writeString(str2);
        }
    }
}
