package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.os.ResultReceiver;
import androidx.media3.common.StreamKey;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.flac.VorbisComment;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.metadata.id3.UrlLinkFrame;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
import androidx.media3.extractor.metadata.scte35.PrivateCommand;
import androidx.media3.extractor.metadata.scte35.SpliceInsertCommand;
import androidx.media3.extractor.metadata.scte35.SpliceNullCommand;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand;
import androidx.media3.extractor.metadata.scte35.TimeSignalCommand;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzab;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzah;
import com.google.firebase.auth.internal.zzam;
import com.google.firebase.auth.internal.zzbj;
import com.google.firebase.auth.zzal;
import com.google.firebase.auth.zzc;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import java.util.ArrayList;
/* renamed from: LQ  reason: default package */
/* loaded from: classes.dex */
public final class LQ implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ LQ(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.google.firebase.auth.internal.zzaf, java.lang.Object, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, android.support.v4.os.ResultReceiver] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [JC, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z = false;
        Bundle bundle = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        zzahn zzahnVar = null;
        KC kc = null;
        switch (this.a) {
            case 0:
                return new ParcelImpl(parcel);
            case 1:
                ?? obj = new Object();
                obj.b = parcel.readInt();
                obj.d = parcel.readInt();
                obj.f = parcel.readInt();
                obj.g = parcel.readInt();
                obj.c = parcel.readInt();
                return obj;
            case 2:
                return new PerfSession(parcel);
            case 3:
                return new PictureFrame(parcel);
            case 4:
                return new PlaybackStateCompat(parcel);
            case 5:
                return new PrivFrame(parcel);
            case 6:
                return new PrivateCommand(parcel);
            case 7:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 8:
                int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readHeader = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(readHeader) != 2) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                    } else {
                        bundle = SafeParcelReader.createBundle(parcel, readHeader);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
                return new RemoteMessage(bundle);
            case 9:
                ?? obj2 = new Object();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i = KW.c;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(KC.V7);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof KC)) {
                        kc = (KC) queryLocalInterface;
                    } else {
                        ?? obj3 = new Object();
                        obj3.b = readStrongBinder;
                        kc = obj3;
                    }
                }
                obj2.b = kc;
                return obj2;
            case 10:
                return new SmtaMetadataEntry(parcel);
            case 11:
                return new SpliceInsertCommand(parcel);
            case 12:
                return new Object();
            case 13:
                return new SpliceScheduleCommand(parcel);
            case 14:
                return new StreamKey(parcel);
            case 15:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new TextInformationFrame(readString, readString2, AbstractC2571rD.t(createStringArray));
            case 16:
                return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
            case 17:
                return new Timer(parcel.readLong(), parcel.readLong());
            case 18:
                return new Trace(parcel, false);
            case 19:
                return new UrlLinkFrame(parcel);
            case 20:
                return new VorbisComment(parcel);
            case 21:
                return new VorbisComment(parcel);
            case 22:
                int validateObjectHeader2 = SafeParcelReader.validateObjectHeader(parcel);
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                boolean z2 = false;
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readHeader2 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(readHeader2)) {
                        case 1:
                            str4 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case 2:
                            str5 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case 3:
                            str8 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case 4:
                            str7 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case 5:
                            str6 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case 6:
                            str9 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        case 7:
                            z2 = SafeParcelReader.readBoolean(parcel, readHeader2);
                            break;
                        case 8:
                            str10 = SafeParcelReader.createString(parcel, readHeader2);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, readHeader2);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader2);
                return new zzab(str4, str5, str6, str7, str8, str9, z2, str10);
            case 23:
                int validateObjectHeader3 = SafeParcelReader.validateObjectHeader(parcel);
                zzab zzabVar = null;
                String str11 = null;
                String str12 = null;
                ArrayList arrayList = null;
                ArrayList<String> arrayList2 = null;
                String str13 = null;
                Boolean bool = null;
                zzah zzahVar = null;
                zzc zzcVar = null;
                zzbj zzbjVar = null;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readHeader3 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(readHeader3)) {
                        case 1:
                            zzahnVar = (zzahn) SafeParcelReader.createParcelable(parcel, readHeader3, zzahn.CREATOR);
                            break;
                        case 2:
                            zzabVar = (zzab) SafeParcelReader.createParcelable(parcel, readHeader3, zzab.CREATOR);
                            break;
                        case 3:
                            str11 = SafeParcelReader.createString(parcel, readHeader3);
                            break;
                        case 4:
                            str12 = SafeParcelReader.createString(parcel, readHeader3);
                            break;
                        case 5:
                            arrayList = SafeParcelReader.createTypedList(parcel, readHeader3, zzab.CREATOR);
                            break;
                        case 6:
                            arrayList2 = SafeParcelReader.createStringList(parcel, readHeader3);
                            break;
                        case 7:
                            str13 = SafeParcelReader.createString(parcel, readHeader3);
                            break;
                        case 8:
                            bool = SafeParcelReader.readBooleanObject(parcel, readHeader3);
                            break;
                        case 9:
                            zzahVar = (zzah) SafeParcelReader.createParcelable(parcel, readHeader3, zzah.CREATOR);
                            break;
                        case 10:
                            z = SafeParcelReader.readBoolean(parcel, readHeader3);
                            break;
                        case 11:
                            zzcVar = (zzc) SafeParcelReader.createParcelable(parcel, readHeader3, zzc.CREATOR);
                            break;
                        case 12:
                            zzbjVar = (zzbj) SafeParcelReader.createParcelable(parcel, readHeader3, zzbj.CREATOR);
                            break;
                        case 13:
                            arrayList3 = SafeParcelReader.createTypedList(parcel, readHeader3, zzal.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, readHeader3);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader3);
                ?? abstractSafeParcelable = new AbstractSafeParcelable();
                abstractSafeParcelable.b = zzahnVar;
                abstractSafeParcelable.c = zzabVar;
                abstractSafeParcelable.d = str11;
                abstractSafeParcelable.f = str12;
                abstractSafeParcelable.g = arrayList;
                abstractSafeParcelable.h = arrayList2;
                abstractSafeParcelable.i = str13;
                abstractSafeParcelable.j = bool;
                abstractSafeParcelable.k = zzahVar;
                abstractSafeParcelable.l = z;
                abstractSafeParcelable.m = zzcVar;
                abstractSafeParcelable.n = zzbjVar;
                abstractSafeParcelable.o = arrayList3;
                return abstractSafeParcelable;
            case 24:
                int validateObjectHeader4 = SafeParcelReader.validateObjectHeader(parcel);
                long j = 0;
                long j2 = 0;
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readHeader4 = SafeParcelReader.readHeader(parcel);
                    int fieldId = SafeParcelReader.getFieldId(readHeader4);
                    if (fieldId != 1) {
                        if (fieldId != 2) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader4);
                        } else {
                            j2 = SafeParcelReader.readLong(parcel, readHeader4);
                        }
                    } else {
                        j = SafeParcelReader.readLong(parcel, readHeader4);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader4);
                return new zzah(j, j2);
            case 25:
                int validateObjectHeader5 = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readHeader5 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(readHeader5) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, readHeader5);
                    } else {
                        str3 = SafeParcelReader.createString(parcel, readHeader5);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader5);
                return new GithubAuthCredential(str3);
            case 26:
                int validateObjectHeader6 = SafeParcelReader.validateObjectHeader(parcel);
                String str14 = null;
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readHeader6 = SafeParcelReader.readHeader(parcel);
                    int fieldId2 = SafeParcelReader.getFieldId(readHeader6);
                    if (fieldId2 != 1) {
                        if (fieldId2 != 2) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader6);
                        } else {
                            str14 = SafeParcelReader.createString(parcel, readHeader6);
                        }
                    } else {
                        str2 = SafeParcelReader.createString(parcel, readHeader6);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader6);
                return new GoogleAuthCredential(str2, str14);
            case 27:
                int validateObjectHeader7 = SafeParcelReader.validateObjectHeader(parcel);
                String str15 = null;
                String str16 = null;
                while (parcel.dataPosition() < validateObjectHeader7) {
                    int readHeader7 = SafeParcelReader.readHeader(parcel);
                    int fieldId3 = SafeParcelReader.getFieldId(readHeader7);
                    if (fieldId3 != 1) {
                        if (fieldId3 != 2) {
                            if (fieldId3 != 3) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader7);
                            } else {
                                str16 = SafeParcelReader.createString(parcel, readHeader7);
                            }
                        } else {
                            str15 = SafeParcelReader.createString(parcel, readHeader7);
                        }
                    } else {
                        str = SafeParcelReader.createString(parcel, readHeader7);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader7);
                return new zzal(str, str15, str16);
            case 28:
                int validateObjectHeader8 = SafeParcelReader.validateObjectHeader(parcel);
                ArrayList arrayList4 = null;
                zzam zzamVar = null;
                String str17 = null;
                zzc zzcVar2 = null;
                zzaf zzafVar = null;
                ArrayList arrayList5 = null;
                while (parcel.dataPosition() < validateObjectHeader8) {
                    int readHeader8 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(readHeader8)) {
                        case 1:
                            arrayList4 = SafeParcelReader.createTypedList(parcel, readHeader8, PhoneMultiFactorInfo.CREATOR);
                            break;
                        case 2:
                            zzamVar = (zzam) SafeParcelReader.createParcelable(parcel, readHeader8, zzam.CREATOR);
                            break;
                        case 3:
                            str17 = SafeParcelReader.createString(parcel, readHeader8);
                            break;
                        case 4:
                            zzcVar2 = (zzc) SafeParcelReader.createParcelable(parcel, readHeader8, zzc.CREATOR);
                            break;
                        case 5:
                            zzafVar = (zzaf) SafeParcelReader.createParcelable(parcel, readHeader8, zzaf.CREATOR);
                            break;
                        case 6:
                            arrayList5 = SafeParcelReader.createTypedList(parcel, readHeader8, TotpMultiFactorInfo.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, readHeader8);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader8);
                return new com.google.firebase.auth.internal.zzal(arrayList4, zzamVar, str17, zzcVar2, zzafVar, arrayList5);
            default:
                int validateObjectHeader9 = SafeParcelReader.validateObjectHeader(parcel);
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                boolean z3 = false;
                while (parcel.dataPosition() < validateObjectHeader9) {
                    int readHeader9 = SafeParcelReader.readHeader(parcel);
                    int fieldId4 = SafeParcelReader.getFieldId(readHeader9);
                    if (fieldId4 != 1) {
                        if (fieldId4 != 2) {
                            if (fieldId4 != 4) {
                                if (fieldId4 != 5) {
                                    if (fieldId4 != 6) {
                                        SafeParcelReader.skipUnknownField(parcel, readHeader9);
                                    } else {
                                        str21 = SafeParcelReader.createString(parcel, readHeader9);
                                    }
                                } else {
                                    z3 = SafeParcelReader.readBoolean(parcel, readHeader9);
                                }
                            } else {
                                str20 = SafeParcelReader.createString(parcel, readHeader9);
                            }
                        } else {
                            str19 = SafeParcelReader.createString(parcel, readHeader9);
                        }
                    } else {
                        str18 = SafeParcelReader.createString(parcel, readHeader9);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader9);
                return new PhoneAuthCredential(str18, z3, str19, str20, str21);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ParcelImpl[i];
            case 1:
                return new ParcelableVolumeInfo[i];
            case 2:
                return new PerfSession[i];
            case 3:
                return new PictureFrame[i];
            case 4:
                return new PlaybackStateCompat[i];
            case 5:
                return new PrivFrame[i];
            case 6:
                return new PrivateCommand[i];
            case 7:
                return new RatingCompat[i];
            case 8:
                return new RemoteMessage[i];
            case 9:
                return new ResultReceiver[i];
            case 10:
                return new SmtaMetadataEntry[i];
            case 11:
                return new SpliceInsertCommand[i];
            case 12:
                return new SpliceNullCommand[i];
            case 13:
                return new SpliceScheduleCommand[i];
            case 14:
                return new StreamKey[i];
            case 15:
                return new TextInformationFrame[i];
            case 16:
                return new TimeSignalCommand[i];
            case 17:
                return new Timer[i];
            case 18:
                return new Trace[i];
            case 19:
                return new UrlLinkFrame[i];
            case 20:
                return new androidx.media3.extractor.metadata.vorbis.VorbisComment[i];
            case 21:
                return new VorbisComment[i];
            case 22:
                return new zzab[i];
            case 23:
                return new zzaf[i];
            case 24:
                return new zzah[i];
            case 25:
                return new GithubAuthCredential[i];
            case 26:
                return new GoogleAuthCredential[i];
            case 27:
                return new zzal[i];
            case 28:
                return new com.google.firebase.auth.internal.zzal[i];
            default:
                return new PhoneAuthCredential[i];
        }
    }
}
