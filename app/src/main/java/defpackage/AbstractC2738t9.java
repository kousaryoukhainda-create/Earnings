package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.app.ActivityOptions;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.view.InputEvent;
import java.util.List;
import java.util.concurrent.Executor;
/* renamed from: t9  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2738t9 {
    public static /* bridge */ /* synthetic */ long A(Topic topic) {
        return topic.getModelVersion();
    }

    public static /* bridge */ /* synthetic */ GetTopicsRequest.Builder B(GetTopicsRequest.Builder builder) {
        return builder.setAdsSdkName("AppLovin");
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return TopicsManager.class;
    }

    public static /* bridge */ /* synthetic */ int b(Topic topic) {
        return topic.getTopicId();
    }

    public static /* bridge */ /* synthetic */ long d(Topic topic) {
        return topic.getTaxonomyVersion();
    }

    public static /* bridge */ /* synthetic */ MeasurementManager f(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* synthetic */ GetTopicsRequest.Builder g() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ GetTopicsRequest.Builder i(GetTopicsRequest.Builder builder, boolean z) {
        return builder.setShouldRecordObservation(z);
    }

    public static /* bridge */ /* synthetic */ GetTopicsRequest j(GetTopicsRequest.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse k(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Topic l(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager n(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ ActivityOptions o(ActivityOptions activityOptions) {
        return activityOptions.setPendingIntentBackgroundActivityStartMode(1);
    }

    public static /* bridge */ /* synthetic */ Class p() {
        return MeasurementManager.class;
    }

    public static /* bridge */ /* synthetic */ List q(GetTopicsResponse getTopicsResponse) {
        return getTopicsResponse.getTopics();
    }

    public static /* bridge */ /* synthetic */ void u(MeasurementManager measurementManager, Uri uri, InputEvent inputEvent, Executor executor, OutcomeReceiver outcomeReceiver) {
        measurementManager.registerSource(uri, inputEvent, executor, outcomeReceiver);
    }

    public static /* bridge */ /* synthetic */ void w(TopicsManager topicsManager, GetTopicsRequest getTopicsRequest, Executor executor, OutcomeReceiver outcomeReceiver) {
        topicsManager.getTopics(getTopicsRequest, executor, outcomeReceiver);
    }
}
