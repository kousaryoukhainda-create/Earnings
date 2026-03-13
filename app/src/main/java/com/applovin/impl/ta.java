package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class ta extends dk {
    private static final Pattern c = Pattern.compile("(.+?)='(.*?)';", 32);
    private final CharsetDecoder a = Charsets.UTF_8.newDecoder();
    private final CharsetDecoder b = Charsets.ISO_8859_1.newDecoder();

    @Override // com.applovin.impl.dk
    public af a(df dfVar, ByteBuffer byteBuffer) {
        String a = a(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (a == null) {
            return new af(new va(bArr, null, null));
        }
        Matcher matcher = c.matcher(a);
        String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String lowerCase = Ascii.toLowerCase(group);
                lowerCase.getClass();
                if (lowerCase.equals("streamurl")) {
                    str2 = group2;
                } else if (lowerCase.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new af(new va(bArr, str, str2));
    }

    private String a(ByteBuffer byteBuffer) {
        try {
            return this.a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.b.decode(byteBuffer).toString();
                this.b.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.a.reset();
            byteBuffer.rewind();
        }
    }
}
