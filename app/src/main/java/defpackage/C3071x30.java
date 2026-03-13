package defpackage;

import android.util.Base64;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: x30  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3071x30 extends AbstractC2899v30 {
    public boolean e;
    public UUID f;
    public byte[] g;

    @Override // defpackage.AbstractC2899v30
    public final Object b() {
        UUID uuid = this.f;
        byte[] j = Wh0.j(uuid, null, this.g);
        byte[] bArr = this.g;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i += 2) {
            sb.append((char) bArr[i]);
        }
        String sb2 = sb.toString();
        byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
        byte b = decode[0];
        decode[0] = decode[3];
        decode[3] = b;
        byte b2 = decode[1];
        decode[1] = decode[2];
        decode[2] = b2;
        byte b3 = decode[4];
        decode[4] = decode[5];
        decode[5] = b3;
        byte b4 = decode[6];
        decode[6] = decode[7];
        decode[7] = b4;
        return new C2641s30(uuid, j, new G70[]{new G70(true, null, 8, decode, 0, 0, null)});
    }

    @Override // defpackage.AbstractC2899v30
    public final boolean d(String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // defpackage.AbstractC2899v30
    public final void f(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.e = false;
        }
    }

    @Override // defpackage.AbstractC2899v30
    public final void j(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.e = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f = UUID.fromString(attributeValue);
        }
    }

    @Override // defpackage.AbstractC2899v30
    public final void k(XmlPullParser xmlPullParser) {
        if (this.e) {
            this.g = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
