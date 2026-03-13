package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
/* renamed from: p90  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2396p90 extends ReplacementSpan {
    public final C2310o90 b;
    public TextPaint e;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    public short c = -1;
    public float d = 1.0f;

    public C2396p90(C2310o90 c2310o90) {
        Wh0.q(c2310o90, "rasterizer cannot be null");
        this.b = c2310o90;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = paint;
        TextPaint textPaint2 = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint3 = this.e;
                    if (textPaint3 == null) {
                        textPaint3 = new TextPaint();
                        this.e = textPaint3;
                    }
                    textPaint2 = textPaint3;
                    textPaint2.set(textPaint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint2);
                    }
                }
            }
            if (textPaint instanceof TextPaint) {
                textPaint2 = (TextPaint) textPaint;
            }
        } else if (textPaint instanceof TextPaint) {
            textPaint2 = (TextPaint) textPaint;
        }
        if (textPaint2 != null && textPaint2.bgColor != 0) {
            int color = textPaint2.getColor();
            Paint.Style style = textPaint2.getStyle();
            textPaint2.setColor(textPaint2.bgColor);
            textPaint2.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.c, i5, textPaint2);
            textPaint2.setStyle(style);
            textPaint2.setColor(color);
        }
        C0773Yq.a().getClass();
        float f2 = i4;
        if (textPaint2 != null) {
            textPaint = textPaint2;
        }
        C2310o90 c2310o90 = this.b;
        C0811a00 c0811a00 = c2310o90.b;
        Typeface typeface = textPaint.getTypeface();
        textPaint.setTypeface((Typeface) c0811a00.f);
        canvas.drawText((char[]) c0811a00.c, c2310o90.a * 2, 2, f, f2, textPaint);
        textPaint.setTypeface(typeface);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C2310o90 c2310o90 = this.b;
        HM c = c2310o90.c();
        int a = c.a(14);
        short s2 = 0;
        if (a != 0) {
            s = ((ByteBuffer) c.d).getShort(a + c.a);
        } else {
            s = 0;
        }
        this.d = abs / s;
        HM c2 = c2310o90.c();
        int a2 = c2.a(14);
        if (a2 != 0) {
            ((ByteBuffer) c2.d).getShort(a2 + c2.a);
        }
        HM c3 = c2310o90.c();
        int a3 = c3.a(12);
        if (a3 != 0) {
            s2 = ((ByteBuffer) c3.d).getShort(a3 + c3.a);
        }
        short s3 = (short) (s2 * this.d);
        this.c = s3;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }
}
