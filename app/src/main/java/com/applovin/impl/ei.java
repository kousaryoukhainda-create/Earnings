package com.applovin.impl;

import android.opengl.GLES20;
import com.applovin.impl.ci;
import java.nio.Buffer;
import java.nio.FloatBuffer;
/* loaded from: classes.dex */
final class ei {
    private static final String[] j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};
    private static final String[] k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};
    private static final float[] l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    private static final float[] n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};
    private int a;
    private a b;
    private a c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    /* loaded from: classes.dex */
    public static class a {
        private final int a;
        private final FloatBuffer b;
        private final FloatBuffer c;
        private final int d;

        public a(ci.b bVar) {
            this.a = bVar.a();
            this.b = aa.a(bVar.c);
            this.c = aa.a(bVar.d);
            int i = bVar.b;
            if (i != 1) {
                if (i != 2) {
                    this.d = 4;
                    return;
                } else {
                    this.d = 6;
                    return;
                }
            }
            this.d = 5;
        }
    }

    public void a(int i, float[] fArr, boolean z) {
        float[] fArr2;
        a aVar = z ? this.c : this.b;
        if (aVar == null) {
            return;
        }
        GLES20.glUseProgram(this.d);
        aa.a();
        GLES20.glEnableVertexAttribArray(this.g);
        GLES20.glEnableVertexAttribArray(this.h);
        aa.a();
        int i2 = this.a;
        if (i2 == 1) {
            fArr2 = z ? n : m;
        } else if (i2 == 2) {
            fArr2 = z ? p : o;
        } else {
            fArr2 = l;
        }
        GLES20.glUniformMatrix3fv(this.f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.i, 0);
        aa.a();
        GLES20.glVertexAttribPointer(this.g, 3, 5126, false, 12, (Buffer) aVar.b);
        aa.a();
        GLES20.glVertexAttribPointer(this.h, 2, 5126, false, 8, (Buffer) aVar.c);
        aa.a();
        GLES20.glDrawArrays(aVar.d, 0, aVar.a);
        aa.a();
        GLES20.glDisableVertexAttribArray(this.g);
        GLES20.glDisableVertexAttribArray(this.h);
    }

    public void b(ci ciVar) {
        if (!a(ciVar)) {
            return;
        }
        this.a = ciVar.c;
        a aVar = new a(ciVar.a.a(0));
        this.b = aVar;
        if (!ciVar.d) {
            aVar = new a(ciVar.b.a(0));
        }
        this.c = aVar;
    }

    public void a() {
        int a2 = aa.a(j, k);
        this.d = a2;
        this.e = GLES20.glGetUniformLocation(a2, "uMvpMatrix");
        this.f = GLES20.glGetUniformLocation(this.d, "uTexMatrix");
        this.g = GLES20.glGetAttribLocation(this.d, "aPosition");
        this.h = GLES20.glGetAttribLocation(this.d, "aTexCoords");
        this.i = GLES20.glGetUniformLocation(this.d, "uTexture");
    }

    public static boolean a(ci ciVar) {
        ci.a aVar = ciVar.a;
        ci.a aVar2 = ciVar.b;
        return aVar.a() == 1 && aVar.a(0).a == 0 && aVar2.a() == 1 && aVar2.a(0).a == 0;
    }
}
