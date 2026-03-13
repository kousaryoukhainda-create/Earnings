package androidx.media;
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC1626ib0 abstractC1626ib0) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC1996kb0 interfaceC1996kb0 = audioAttributesCompat.a;
        if (abstractC1626ib0.e(1)) {
            interfaceC1996kb0 = abstractC1626ib0.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) interfaceC1996kb0;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC1626ib0 abstractC1626ib0) {
        abstractC1626ib0.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        abstractC1626ib0.i(1);
        abstractC1626ib0.l(audioAttributesImpl);
    }
}
