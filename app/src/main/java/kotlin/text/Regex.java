package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes2.dex */
public final class Regex implements Serializable {
    public final Pattern b;

    public Regex(@NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Pattern nativePattern = Pattern.compile(pattern);
        Intrinsics.checkNotNullExpressionValue(nativePattern, "compile(...)");
        Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.b = nativePattern;
    }

    public final EJ a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.b.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (!matcher.matches()) {
            return null;
        }
        return new EJ(matcher, input);
    }

    public final boolean b(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.b.matcher(input).matches();
    }

    public final List c(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        int i = 0;
        d.D(0);
        Matcher matcher = this.b.matcher(input);
        if (!matcher.find()) {
            return C0320He.a(input.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(input.subSequence(i, matcher.start()).toString());
            i = matcher.end();
        } while (matcher.find());
        arrayList.add(input.subSequence(i, input.length()).toString());
        return arrayList;
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String replaceAll = this.b.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.b.toString();
        Intrinsics.checkNotNullExpressionValue(pattern, "toString(...)");
        return pattern;
    }
}
