package defpackage;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: pA  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2397pA {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i = Ha0.a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.a = parseInt;
                    this.b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(Metadata metadata) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.b;
            if (i < entryArr.length) {
                Metadata.Entry entry = entryArr[i];
                if (entry instanceof CommentFrame) {
                    CommentFrame commentFrame = (CommentFrame) entry;
                    if ("iTunSMPB".equals(commentFrame.d) && a(commentFrame.f)) {
                        return;
                    }
                } else if (entry instanceof InternalFrame) {
                    InternalFrame internalFrame = (InternalFrame) entry;
                    if ("com.apple.iTunes".equals(internalFrame.c) && "iTunSMPB".equals(internalFrame.d) && a(internalFrame.f)) {
                        return;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
