package androidx.media;

import android.media.AudioAttributes;
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC1626ib0 abstractC1626ib0) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) abstractC1626ib0.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = abstractC1626ib0.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC1626ib0 abstractC1626ib0) {
        abstractC1626ib0.getClass();
        abstractC1626ib0.k(audioAttributesImplApi26.a, 1);
        abstractC1626ib0.j(audioAttributesImplApi26.b, 2);
    }
}
