package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.view.InputEvent;
import java.util.concurrent.Executor;
/* renamed from: Zj0  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class Zj0 {
    public static /* bridge */ /* synthetic */ void d(MeasurementManager measurementManager, Uri uri, Executor executor, OutcomeReceiver outcomeReceiver) {
        measurementManager.registerSource(uri, (InputEvent) null, executor, outcomeReceiver);
    }

    public static /* bridge */ /* synthetic */ void g(MeasurementManager measurementManager, Uri uri, Executor executor, OutcomeReceiver outcomeReceiver) {
        measurementManager.registerTrigger(uri, executor, outcomeReceiver);
    }
}
