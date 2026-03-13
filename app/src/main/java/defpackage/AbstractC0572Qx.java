package defpackage;

import com.dexterous.flutterlocalnotifications.models.IconSource;
import com.dexterous.flutterlocalnotifications.models.NotificationStyle;
import com.dexterous.flutterlocalnotifications.models.RepeatInterval;
/* renamed from: Qx  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0572Qx {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[NotificationStyle.values().length];
        c = iArr;
        try {
            iArr[NotificationStyle.BigPicture.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            c[NotificationStyle.BigText.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            c[NotificationStyle.Inbox.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            c[NotificationStyle.Messaging.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            c[NotificationStyle.Media.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[IconSource.values().length];
        b = iArr2;
        try {
            iArr2[IconSource.DrawableResource.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            b[IconSource.BitmapFilePath.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            b[IconSource.ContentUri.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            b[IconSource.FlutterBitmapAsset.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            b[IconSource.ByteArray.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        int[] iArr3 = new int[RepeatInterval.values().length];
        a = iArr3;
        try {
            iArr3[RepeatInterval.EveryMinute.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            a[RepeatInterval.Hourly.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            a[RepeatInterval.Daily.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            a[RepeatInterval.Weekly.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
    }
}
