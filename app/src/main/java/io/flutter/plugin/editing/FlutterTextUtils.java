package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class FlutterTextUtils {
    public static final int CANCEL_TAG = 917631;
    public static final int CARRIAGE_RETURN = 13;
    public static final int COMBINING_ENCLOSING_KEYCAP = 8419;
    public static final int LINE_FEED = 10;
    public static final int ZERO_WIDTH_JOINER = 8205;
    private final FlutterJNI flutterJNI;

    public FlutterTextUtils(FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    public int getOffsetAfter(CharSequence charSequence, int i) {
        int charCount;
        int charCount2;
        int charCount3;
        int length = charSequence.length();
        int i2 = length - 1;
        if (i >= i2) {
            return length;
        }
        int codePointAt = Character.codePointAt(charSequence, i);
        int charCount4 = Character.charCount(codePointAt);
        int i3 = i + charCount4;
        int i4 = 0;
        if (i3 == 0) {
            return 0;
        }
        if (codePointAt == 10) {
            if (Character.codePointAt(charSequence, i3) == 13) {
                charCount4++;
            }
            return i + charCount4;
        } else if (isRegionalIndicatorSymbol(codePointAt)) {
            if (i3 < i2 && isRegionalIndicatorSymbol(Character.codePointAt(charSequence, i3))) {
                int i5 = i;
                while (i5 > 0 && isRegionalIndicatorSymbol(Character.codePointBefore(charSequence, i))) {
                    i5 -= Character.charCount(Character.codePointBefore(charSequence, i));
                    i4++;
                }
                if (i4 % 2 == 0) {
                    charCount4 += 2;
                }
                return i + charCount4;
            }
            return i3;
        } else {
            if (isKeycapBase(codePointAt)) {
                charCount4 += Character.charCount(codePointAt);
            }
            if (codePointAt == 8419) {
                int codePointBefore = Character.codePointBefore(charSequence, i3);
                int charCount5 = Character.charCount(codePointBefore) + i3;
                if (charCount5 < length && isVariationSelector(codePointBefore)) {
                    int codePointAt2 = Character.codePointAt(charSequence, charCount5);
                    if (isKeycapBase(codePointAt2)) {
                        charCount3 = Character.charCount(codePointAt2) + Character.charCount(codePointBefore);
                        charCount4 += charCount3;
                    }
                    return i + charCount4;
                }
                if (isKeycapBase(codePointBefore)) {
                    charCount3 = Character.charCount(codePointBefore);
                    charCount4 += charCount3;
                }
                return i + charCount4;
            }
            if (isEmoji(codePointAt)) {
                boolean z = false;
                int i6 = 0;
                do {
                    if (z) {
                        charCount4 = Character.charCount(codePointAt) + i6 + 1 + charCount4;
                        z = false;
                    }
                    if (isEmojiModifier(codePointAt)) {
                        break;
                    }
                    if (i3 < length) {
                        codePointAt = Character.codePointAt(charSequence, i3);
                        int charCount6 = Character.charCount(codePointAt) + i3;
                        if (codePointAt == 8419) {
                            int codePointBefore2 = Character.codePointBefore(charSequence, charCount6);
                            int charCount7 = Character.charCount(codePointBefore2) + charCount6;
                            if (charCount7 < length && isVariationSelector(codePointBefore2)) {
                                int codePointAt3 = Character.codePointAt(charSequence, charCount7);
                                if (isKeycapBase(codePointAt3)) {
                                    charCount = Character.charCount(codePointAt3) + Character.charCount(codePointBefore2);
                                    charCount4 += charCount;
                                }
                                return i + charCount4;
                            }
                            if (isKeycapBase(codePointBefore2)) {
                                charCount = Character.charCount(codePointBefore2);
                                charCount4 += charCount;
                            }
                            return i + charCount4;
                        }
                        if (isEmojiModifier(codePointAt)) {
                            charCount2 = Character.charCount(codePointAt);
                        } else if (isVariationSelector(codePointAt)) {
                            charCount2 = Character.charCount(codePointAt);
                        } else if (codePointAt == 8205) {
                            codePointAt = Character.codePointAt(charSequence, charCount6);
                            i3 = Character.charCount(codePointAt) + charCount6;
                            if (i3 < length && isVariationSelector(codePointAt)) {
                                codePointAt = Character.codePointAt(charSequence, i3);
                                int charCount8 = Character.charCount(codePointAt);
                                i3 = Character.charCount(codePointAt) + i3;
                                i6 = charCount8;
                                z = true;
                                if (i3 < length || !z) {
                                    break;
                                    break;
                                }
                            } else {
                                z = true;
                            }
                        } else {
                            i3 = charCount6;
                        }
                        charCount4 += charCount2;
                        break;
                    }
                    i6 = 0;
                    if (i3 < length) {
                        break;
                    }
                } while (isEmoji(codePointAt));
            }
            return i + charCount4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0154 A[EDGE_INSN: B:103:0x0154->B:96:0x0154 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getOffsetBefore(java.lang.CharSequence r9, int r10) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.FlutterTextUtils.getOffsetBefore(java.lang.CharSequence, int):int");
    }

    public boolean isEmoji(int i) {
        return this.flutterJNI.isCodePointEmoji(i);
    }

    public boolean isEmojiModifier(int i) {
        return this.flutterJNI.isCodePointEmojiModifier(i);
    }

    public boolean isEmojiModifierBase(int i) {
        return this.flutterJNI.isCodePointEmojiModifierBase(i);
    }

    public boolean isKeycapBase(int i) {
        return (48 <= i && i <= 57) || i == 35 || i == 42;
    }

    public boolean isRegionalIndicatorSymbol(int i) {
        return this.flutterJNI.isCodePointRegionalIndicator(i);
    }

    public boolean isTagSpecChar(int i) {
        return 917536 <= i && i <= 917630;
    }

    public boolean isVariationSelector(int i) {
        return this.flutterJNI.isCodePointVariantSelector(i);
    }
}
