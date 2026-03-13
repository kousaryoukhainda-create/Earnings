package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.zzc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
@SafeParcelable.Class(creator = "DefaultFirebaseUserCreator")
/* loaded from: classes.dex */
public class zzaf extends FirebaseUser {
    public static final Parcelable.Creator<zzaf> CREATOR = new LQ(23);
    public zzahn b;
    public zzab c;
    public String d;
    public String f;
    public ArrayList g;
    public ArrayList h;
    public String i;
    public Boolean j;
    public zzah k;
    public boolean l;
    public zzc m;
    public zzbj n;
    public List o;

    public zzaf(C1571hv c1571hv, ArrayList arrayList) {
        Preconditions.checkNotNull(c1571hv);
        c1571hv.a();
        this.d = c1571hv.b;
        this.f = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.i = "2";
        z(arrayList);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void A(ArrayList arrayList) {
        zzbj zzbjVar;
        if (arrayList.isEmpty()) {
            zzbjVar = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
                if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                    arrayList2.add((PhoneMultiFactorInfo) multiFactorInfo);
                } else if (multiFactorInfo instanceof TotpMultiFactorInfo) {
                    arrayList3.add((TotpMultiFactorInfo) multiFactorInfo);
                }
            }
            zzbjVar = new zzbj(arrayList2, arrayList3);
        }
        this.n = zzbjVar;
    }

    @Override // defpackage.InterfaceC2595ra0
    public final String e() {
        return this.c.b;
    }

    @Override // defpackage.InterfaceC2595ra0
    public final String getDisplayName() {
        return this.c.d;
    }

    @Override // defpackage.InterfaceC2595ra0
    public final String getEmail() {
        return this.c.h;
    }

    @Override // defpackage.InterfaceC2595ra0
    public final String getPhoneNumber() {
        return this.c.i;
    }

    @Override // defpackage.InterfaceC2595ra0
    public final Uri getPhotoUrl() {
        return this.c.getPhotoUrl();
    }

    @Override // defpackage.InterfaceC2595ra0
    public final boolean h() {
        return this.c.j;
    }

    @Override // defpackage.InterfaceC2595ra0
    public final String p() {
        return this.c.c;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String w() {
        Map map;
        zzahn zzahnVar = this.b;
        if (zzahnVar == null || zzahnVar.zzc() == null || (map = (Map) AbstractC1932jm0.a(this.b.zzc()).b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.c, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.g, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.h, false);
        SafeParcelWriter.writeString(parcel, 7, this.i, false);
        SafeParcelWriter.writeBooleanObject(parcel, 8, Boolean.valueOf(x()), false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.k, i, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.l);
        SafeParcelWriter.writeParcelable(parcel, 11, this.m, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.n, i, false);
        SafeParcelWriter.writeTypedList(parcel, 13, this.o, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final boolean x() {
        String str;
        Boolean bool = this.j;
        if (bool == null || bool.booleanValue()) {
            zzahn zzahnVar = this.b;
            if (zzahnVar != null) {
                Map map = (Map) AbstractC1932jm0.a(zzahnVar.zzc()).b.get("firebase");
                if (map != null) {
                    str = (String) map.get("sign_in_provider");
                } else {
                    str = null;
                }
            } else {
                str = "";
            }
            boolean z = true;
            if (this.g.size() > 1 || (str != null && str.equals("custom"))) {
                z = false;
            }
            this.j = Boolean.valueOf(z);
        }
        return this.j.booleanValue();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final synchronized zzaf z(ArrayList arrayList) {
        try {
            Preconditions.checkNotNull(arrayList);
            this.g = new ArrayList(arrayList.size());
            this.h = new ArrayList(arrayList.size());
            for (int i = 0; i < arrayList.size(); i++) {
                InterfaceC2595ra0 interfaceC2595ra0 = (InterfaceC2595ra0) arrayList.get(i);
                if (interfaceC2595ra0.p().equals("firebase")) {
                    this.c = (zzab) interfaceC2595ra0;
                } else {
                    this.h.add(interfaceC2595ra0.p());
                }
                this.g.add((zzab) interfaceC2595ra0);
            }
            if (this.c == null) {
                this.c = (zzab) this.g.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }
}
