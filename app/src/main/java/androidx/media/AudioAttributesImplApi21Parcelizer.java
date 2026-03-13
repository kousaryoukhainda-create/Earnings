package androidx.media;

import android.media.AudioAttributes;
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC1626ib0 abstractC1626ib0) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) abstractC1626ib0.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = abstractC1626ib0.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC1626ib0 abstractC1626ib0) {
        abstractC1626ib0.getClass();
        abstractC1626ib0.k(audioAttributesImplApi21.a, 1);
        abstractC1626ib0.j(audioAttributesImplApi21.b, 2);
    }
}
