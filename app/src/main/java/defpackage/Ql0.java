package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p002firebaseauthapi.zzair;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.TwitterAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzam;
import com.google.firebase.auth.internal.zzbj;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import com.google.firebase.auth.zzc;
import java.util.ArrayList;
/* renamed from: Ql0  reason: default package */
/* loaded from: classes.dex */
public final class Ql0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ Ql0(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.firebase.auth.internal.zzam, java.lang.Object, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                String str = null;
                String str2 = null;
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                zzaf zzafVar = null;
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readHeader = SafeParcelReader.readHeader(parcel);
                    int fieldId = SafeParcelReader.getFieldId(readHeader);
                    if (fieldId != 1) {
                        if (fieldId != 2) {
                            if (fieldId != 3) {
                                if (fieldId != 4) {
                                    if (fieldId != 5) {
                                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                                    } else {
                                        zzafVar = (zzaf) SafeParcelReader.createParcelable(parcel, readHeader, zzaf.CREATOR);
                                    }
                                } else {
                                    arrayList2 = SafeParcelReader.createTypedList(parcel, readHeader, TotpMultiFactorInfo.CREATOR);
                                }
                            } else {
                                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, PhoneMultiFactorInfo.CREATOR);
                            }
                        } else {
                            str2 = SafeParcelReader.createString(parcel, readHeader);
                        }
                    } else {
                        str = SafeParcelReader.createString(parcel, readHeader);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
                ?? abstractSafeParcelable = new AbstractSafeParcelable();
                abstractSafeParcelable.b = str;
                abstractSafeParcelable.c = str2;
                abstractSafeParcelable.d = arrayList;
                abstractSafeParcelable.f = arrayList2;
                abstractSafeParcelable.g = zzafVar;
                return abstractSafeParcelable;
            case 1:
                int validateObjectHeader2 = SafeParcelReader.validateObjectHeader(parcel);
                String str3 = null;
                String str4 = null;
                String str5 = null;
                long j = 0;
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readHeader2 = SafeParcelReader.readHeader(parcel);
                    int fieldId2 = SafeParcelReader.getFieldId(readHeader2);
                    if (fieldId2 != 1) {
                        if (fieldId2 != 2) {
                            if (fieldId2 != 3) {
                                if (fieldId2 != 4) {
                                    SafeParcelReader.skipUnknownField(parcel, readHeader2);
                                } else {
                                    str5 = SafeParcelReader.createString(parcel, readHeader2);
                                }
                            } else {
                                j = SafeParcelReader.readLong(parcel, readHeader2);
                            }
                        } else {
                            str4 = SafeParcelReader.createString(parcel, readHeader2);
                        }
                    } else {
                        str3 = SafeParcelReader.createString(parcel, readHeader2);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader2);
                return new PhoneMultiFactorInfo(j, str3, str4, str5);
            case 2:
                int validateObjectHeader3 = SafeParcelReader.validateObjectHeader(parcel);
                String str6 = null;
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readHeader3 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(readHeader3) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader3);
                    } else {
                        str6 = SafeParcelReader.createString(parcel, readHeader3);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader3);
                return new PlayGamesAuthCredential(str6);
            case 3:
                int validateObjectHeader4 = SafeParcelReader.validateObjectHeader(parcel);
                String str7 = null;
                String str8 = null;
                zzair zzairVar = null;
                long j2 = 0;
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readHeader4 = SafeParcelReader.readHeader(parcel);
                    int fieldId3 = SafeParcelReader.getFieldId(readHeader4);
                    if (fieldId3 != 1) {
                        if (fieldId3 != 2) {
                            if (fieldId3 != 3) {
                                if (fieldId3 != 4) {
                                    SafeParcelReader.skipUnknownField(parcel, readHeader4);
                                } else {
                                    zzairVar = (zzair) SafeParcelReader.createParcelable(parcel, readHeader4, zzair.CREATOR);
                                }
                            } else {
                                j2 = SafeParcelReader.readLong(parcel, readHeader4);
                            }
                        } else {
                            str8 = SafeParcelReader.createString(parcel, readHeader4);
                        }
                    } else {
                        str7 = SafeParcelReader.createString(parcel, readHeader4);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader4);
                return new TotpMultiFactorInfo(str7, str8, j2, zzairVar);
            case 4:
                int validateObjectHeader5 = SafeParcelReader.validateObjectHeader(parcel);
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readHeader5 = SafeParcelReader.readHeader(parcel);
                    int fieldId4 = SafeParcelReader.getFieldId(readHeader5);
                    if (fieldId4 != 1) {
                        if (fieldId4 != 2) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader5);
                        } else {
                            str10 = SafeParcelReader.createString(parcel, readHeader5);
                        }
                    } else {
                        str9 = SafeParcelReader.createString(parcel, readHeader5);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader5);
                return new TwitterAuthCredential(str9, str10);
            case 5:
                int validateObjectHeader6 = SafeParcelReader.validateObjectHeader(parcel);
                String str11 = null;
                String str12 = null;
                boolean z = false;
                boolean z2 = false;
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readHeader6 = SafeParcelReader.readHeader(parcel);
                    int fieldId5 = SafeParcelReader.getFieldId(readHeader6);
                    if (fieldId5 != 2) {
                        if (fieldId5 != 3) {
                            if (fieldId5 != 4) {
                                if (fieldId5 != 5) {
                                    SafeParcelReader.skipUnknownField(parcel, readHeader6);
                                } else {
                                    z2 = SafeParcelReader.readBoolean(parcel, readHeader6);
                                }
                            } else {
                                z = SafeParcelReader.readBoolean(parcel, readHeader6);
                            }
                        } else {
                            str12 = SafeParcelReader.createString(parcel, readHeader6);
                        }
                    } else {
                        str11 = SafeParcelReader.createString(parcel, readHeader6);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader6);
                return new UserProfileChangeRequest(str11, str12, z, z2);
            case 6:
                int validateObjectHeader7 = SafeParcelReader.validateObjectHeader(parcel);
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                boolean z3 = false;
                boolean z4 = false;
                int i = 0;
                while (parcel.dataPosition() < validateObjectHeader7) {
                    int readHeader7 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(readHeader7)) {
                        case 1:
                            str13 = SafeParcelReader.createString(parcel, readHeader7);
                            break;
                        case 2:
                            str14 = SafeParcelReader.createString(parcel, readHeader7);
                            break;
                        case 3:
                            str15 = SafeParcelReader.createString(parcel, readHeader7);
                            break;
                        case 4:
                            str16 = SafeParcelReader.createString(parcel, readHeader7);
                            break;
                        case 5:
                            z3 = SafeParcelReader.readBoolean(parcel, readHeader7);
                            break;
                        case 6:
                            str17 = SafeParcelReader.createString(parcel, readHeader7);
                            break;
                        case 7:
                            z4 = SafeParcelReader.readBoolean(parcel, readHeader7);
                            break;
                        case 8:
                            str18 = SafeParcelReader.createString(parcel, readHeader7);
                            break;
                        case 9:
                            i = SafeParcelReader.readInt(parcel, readHeader7);
                            break;
                        case 10:
                            str19 = SafeParcelReader.createString(parcel, readHeader7);
                            break;
                        case 11:
                            str20 = SafeParcelReader.createString(parcel, readHeader7);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, readHeader7);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader7);
                return new ActionCodeSettings(str13, str14, str15, str16, z3, str17, z4, str18, i, str19, str20);
            case 7:
                int validateObjectHeader8 = SafeParcelReader.validateObjectHeader(parcel);
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                while (parcel.dataPosition() < validateObjectHeader8) {
                    int readHeader8 = SafeParcelReader.readHeader(parcel);
                    int fieldId6 = SafeParcelReader.getFieldId(readHeader8);
                    if (fieldId6 != 1) {
                        if (fieldId6 != 2) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader8);
                        } else {
                            arrayList4 = SafeParcelReader.createTypedList(parcel, readHeader8, TotpMultiFactorInfo.CREATOR);
                        }
                    } else {
                        arrayList3 = SafeParcelReader.createTypedList(parcel, readHeader8, PhoneMultiFactorInfo.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader8);
                return new zzbj(arrayList3, arrayList4);
            case 8:
                int validateObjectHeader9 = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader9) {
                    int readHeader9 = SafeParcelReader.readHeader(parcel);
                    SafeParcelReader.getFieldId(readHeader9);
                    SafeParcelReader.skipUnknownField(parcel, readHeader9);
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader9);
                return new AbstractSafeParcelable();
            case 9:
                int validateObjectHeader10 = SafeParcelReader.validateObjectHeader(parcel);
                String str21 = null;
                String str22 = null;
                String str23 = null;
                zzait zzaitVar = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                while (parcel.dataPosition() < validateObjectHeader10) {
                    int readHeader10 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(readHeader10)) {
                        case 1:
                            str21 = SafeParcelReader.createString(parcel, readHeader10);
                            break;
                        case 2:
                            str22 = SafeParcelReader.createString(parcel, readHeader10);
                            break;
                        case 3:
                            str23 = SafeParcelReader.createString(parcel, readHeader10);
                            break;
                        case 4:
                            zzaitVar = (zzait) SafeParcelReader.createParcelable(parcel, readHeader10, zzait.CREATOR);
                            break;
                        case 5:
                            str24 = SafeParcelReader.createString(parcel, readHeader10);
                            break;
                        case 6:
                            str25 = SafeParcelReader.createString(parcel, readHeader10);
                            break;
                        case 7:
                            str26 = SafeParcelReader.createString(parcel, readHeader10);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, readHeader10);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader10);
                return new zzc(str21, str22, str23, zzaitVar, str24, str25, str26);
            case 10:
                int validateObjectHeader11 = SafeParcelReader.validateObjectHeader(parcel);
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                boolean z5 = false;
                while (parcel.dataPosition() < validateObjectHeader11) {
                    int readHeader11 = SafeParcelReader.readHeader(parcel);
                    int fieldId7 = SafeParcelReader.getFieldId(readHeader11);
                    if (fieldId7 != 1) {
                        if (fieldId7 != 2) {
                            if (fieldId7 != 3) {
                                if (fieldId7 != 4) {
                                    if (fieldId7 != 5) {
                                        SafeParcelReader.skipUnknownField(parcel, readHeader11);
                                    } else {
                                        z5 = SafeParcelReader.readBoolean(parcel, readHeader11);
                                    }
                                } else {
                                    str30 = SafeParcelReader.createString(parcel, readHeader11);
                                }
                            } else {
                                str29 = SafeParcelReader.createString(parcel, readHeader11);
                            }
                        } else {
                            str28 = SafeParcelReader.createString(parcel, readHeader11);
                        }
                    } else {
                        str27 = SafeParcelReader.createString(parcel, readHeader11);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader11);
                return new EmailAuthCredential(str27, z5, str28, str29, str30);
            case 11:
                int validateObjectHeader12 = SafeParcelReader.validateObjectHeader(parcel);
                String str31 = null;
                while (parcel.dataPosition() < validateObjectHeader12) {
                    int readHeader12 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(readHeader12) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader12);
                    } else {
                        str31 = SafeParcelReader.createString(parcel, readHeader12);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader12);
                return new FacebookAuthCredential(str31);
            case 12:
                int validateObjectHeader13 = SafeParcelReader.validateObjectHeader(parcel);
                String str32 = null;
                String str33 = null;
                boolean z6 = false;
                while (parcel.dataPosition() < validateObjectHeader13) {
                    int readHeader13 = SafeParcelReader.readHeader(parcel);
                    int fieldId8 = SafeParcelReader.getFieldId(readHeader13);
                    if (fieldId8 != 1) {
                        if (fieldId8 != 2) {
                            if (fieldId8 != 3) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader13);
                            } else {
                                z6 = SafeParcelReader.readBoolean(parcel, readHeader13);
                            }
                        } else {
                            str33 = SafeParcelReader.createString(parcel, readHeader13);
                        }
                    } else {
                        str32 = SafeParcelReader.createString(parcel, readHeader13);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader13);
                return new zzx(str32, str33, z6);
            default:
                int validateObjectHeader14 = SafeParcelReader.validateObjectHeader(parcel);
                zzaf zzafVar2 = null;
                zzx zzxVar = null;
                zzc zzcVar = null;
                while (parcel.dataPosition() < validateObjectHeader14) {
                    int readHeader14 = SafeParcelReader.readHeader(parcel);
                    int fieldId9 = SafeParcelReader.getFieldId(readHeader14);
                    if (fieldId9 != 1) {
                        if (fieldId9 != 2) {
                            if (fieldId9 != 3) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader14);
                            } else {
                                zzcVar = (zzc) SafeParcelReader.createParcelable(parcel, readHeader14, zzc.CREATOR);
                            }
                        } else {
                            zzxVar = (zzx) SafeParcelReader.createParcelable(parcel, readHeader14, zzx.CREATOR);
                        }
                    } else {
                        zzafVar2 = (zzaf) SafeParcelReader.createParcelable(parcel, readHeader14, zzaf.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader14);
                return new zzz(zzafVar2, zzxVar, zzcVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new zzam[i];
            case 1:
                return new PhoneMultiFactorInfo[i];
            case 2:
                return new PlayGamesAuthCredential[i];
            case 3:
                return new TotpMultiFactorInfo[i];
            case 4:
                return new TwitterAuthCredential[i];
            case 5:
                return new UserProfileChangeRequest[i];
            case 6:
                return new ActionCodeSettings[i];
            case 7:
                return new zzbj[i];
            case 8:
                return new PhoneAuthProvider$ForceResendingToken[i];
            case 9:
                return new zzc[i];
            case 10:
                return new EmailAuthCredential[i];
            case 11:
                return new FacebookAuthCredential[i];
            case 12:
                return new zzx[i];
            default:
                return new zzz[i];
        }
    }
}
