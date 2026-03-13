package j$.time;
/* loaded from: classes4.dex */
public class TimeConversions {
    public static java.time.Duration convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return java.time.Duration.ofSeconds(duration.q(), duration.p());
    }

    public static Duration convert(java.time.Duration duration) {
        if (duration == null) {
            return null;
        }
        return Duration.y(duration.getSeconds(), duration.getNano());
    }
}
