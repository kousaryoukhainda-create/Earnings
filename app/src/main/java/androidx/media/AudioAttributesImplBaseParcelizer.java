package androidx.media;
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC1626ib0 abstractC1626ib0) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = abstractC1626ib0.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = abstractC1626ib0.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = abstractC1626ib0.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = abstractC1626ib0.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC1626ib0 abstractC1626ib0) {
        abstractC1626ib0.getClass();
        abstractC1626ib0.j(audioAttributesImplBase.a, 1);
        abstractC1626ib0.j(audioAttributesImplBase.b, 2);
        abstractC1626ib0.j(audioAttributesImplBase.c, 3);
        abstractC1626ib0.j(audioAttributesImplBase.d, 4);
    }
}
