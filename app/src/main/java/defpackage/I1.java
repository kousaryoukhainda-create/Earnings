package defpackage;

import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.exoplayer.hls.HlsTrackMetadataEntry;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTable;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.metadata.icy.IcyInfo;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.BinaryFrame;
import androidx.media3.extractor.metadata.id3.ChapterFrame;
import androidx.media3.extractor.metadata.id3.ChapterTocFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.GeobFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.perf.metrics.Counter;
/* renamed from: I1  reason: default package */
/* loaded from: classes.dex */
public final class I1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ I1(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.firebase.dynamiclinks.internal.DynamicLinkData, java.lang.Object, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable] */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createFromParcel(final android.os.Parcel r15) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I1.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ActivityResult[i];
            case 1:
                return new ApicFrame[i];
            case 2:
                return new AppInfoTable[i];
            case 3:
                return new BinaryFrame[i];
            case 4:
                return new ChapterFrame[i];
            case 5:
                return new ChapterTocFrame[i];
            case 6:
                return new CommentFrame[i];
            case 7:
                return new Counter[i];
            case 8:
                return new DateValidatorPointForward[i];
            case 9:
                return new DrmInitData[i];
            case 10:
                return new DynamicLinkData[i];
            case 11:
                return new EventMessage[i];
            case 12:
                return new GeobFrame[i];
            case 13:
                return new HlsTrackMetadataEntry[i];
            case 14:
                return new IcyHeaders[i];
            case 15:
                return new IcyInfo[i];
            case 16:
                return new IntentSenderRequest[i];
            case 17:
                return new InternalFrame[i];
            case 18:
                return new MdtaMetadataEntry[i];
            case 19:
                return new MediaBrowserCompat$MediaItem[i];
            case 20:
                return new MediaDescriptionCompat[i];
            case 21:
                return new MediaMetadataCompat[i];
            case 22:
                return new MediaSessionCompat$QueueItem[i];
            case 23:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 24:
                return new MediaSessionCompat$Token[i];
            case 25:
                return new Metadata[i];
            case 26:
                return new MlltFrame[i];
            case 27:
                return new MotionPhotoMetadata[i];
            case 28:
                return new Mp4LocationData[i];
            default:
                return new Mp4TimestampData[i];
        }
    }
}
