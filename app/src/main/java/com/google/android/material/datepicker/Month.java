package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
/* loaded from: classes3.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new Object();
    public final Calendar b;
    public final int c;
    public final int d;
    public final int f;
    public final int g;
    public final long h;
    public String i;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a = AbstractC3197ya0.a(calendar);
        this.b = a;
        this.c = a.get(2);
        this.d = a.get(1);
        this.f = a.getMaximum(7);
        this.g = a.getActualMaximum(5);
        this.h = a.getTimeInMillis();
    }

    public static Month b(int i, int i2) {
        Calendar c = AbstractC3197ya0.c(null);
        c.set(1, i);
        c.set(2, i2);
        return new Month(c);
    }

    public static Month c(long j) {
        Calendar c = AbstractC3197ya0.c(null);
        c.setTimeInMillis(j);
        return new Month(c);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(Month month) {
        return this.b.compareTo(month.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        Calendar calendar = this.b;
        int firstDayOfWeek = calendar.get(7) - calendar.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            return firstDayOfWeek + this.f;
        }
        return firstDayOfWeek;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.c == month.c && this.d == month.d) {
            return true;
        }
        return false;
    }

    public final String f(Context context) {
        if (this.i == null) {
            long timeInMillis = this.b.getTimeInMillis();
            this.i = DateUtils.formatDateTime(context, timeInMillis - TimeZone.getDefault().getOffset(timeInMillis), 36);
        }
        return this.i;
    }

    public final int g(Month month) {
        if (this.b instanceof GregorianCalendar) {
            return (month.c - this.c) + ((month.d - this.d) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d);
        parcel.writeInt(this.c);
    }
}
