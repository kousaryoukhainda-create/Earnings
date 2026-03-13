package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C0884b(0);
    public final int[] b;
    public final ArrayList c;
    public final int[] d;
    public final int[] f;
    public final int g;
    public final String h;
    public final int i;
    public final int j;
    public final CharSequence k;
    public final int l;
    public final CharSequence m;
    public final ArrayList n;
    public final ArrayList o;
    public final boolean p;

    public BackStackRecordState(C0883a c0883a) {
        int size = c0883a.a.size();
        this.b = new int[size * 6];
        if (c0883a.g) {
            this.c = new ArrayList(size);
            this.d = new int[size];
            this.f = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C0781Yy c0781Yy = (C0781Yy) c0883a.a.get(i2);
                int i3 = i + 1;
                this.b[i] = c0781Yy.a;
                ArrayList arrayList = this.c;
                n nVar = c0781Yy.b;
                arrayList.add(nVar != null ? nVar.mWho : null);
                int[] iArr = this.b;
                iArr[i3] = c0781Yy.c ? 1 : 0;
                iArr[i + 2] = c0781Yy.d;
                iArr[i + 3] = c0781Yy.e;
                int i4 = i + 5;
                iArr[i + 4] = c0781Yy.f;
                i += 6;
                iArr[i4] = c0781Yy.g;
                this.d[i2] = c0781Yy.h.ordinal();
                this.f[i2] = c0781Yy.i.ordinal();
            }
            this.g = c0883a.f;
            this.h = c0883a.h;
            this.i = c0883a.r;
            this.j = c0883a.i;
            this.k = c0883a.j;
            this.l = c0883a.k;
            this.m = c0883a.l;
            this.n = c0883a.m;
            this.o = c0883a.n;
            this.p = c0883a.o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.b);
        parcel.writeStringList(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeIntArray(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeInt(this.l);
        TextUtils.writeToParcel(this.m, parcel, 0);
        parcel.writeStringList(this.n);
        parcel.writeStringList(this.o);
        parcel.writeInt(this.p ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.b = parcel.createIntArray();
        this.c = parcel.createStringArrayList();
        this.d = parcel.createIntArray();
        this.f = parcel.createIntArray();
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.k = (CharSequence) creator.createFromParcel(parcel);
        this.l = parcel.readInt();
        this.m = (CharSequence) creator.createFromParcel(parcel);
        this.n = parcel.createStringArrayList();
        this.o = parcel.createStringArrayList();
        this.p = parcel.readInt() != 0;
    }
}
