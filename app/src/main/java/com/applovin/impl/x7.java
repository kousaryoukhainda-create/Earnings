package com.applovin.impl;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public final class x7 {
    private final ByteArrayOutputStream a;
    private final DataOutputStream b;

    public x7() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public byte[] a(v7 v7Var) {
        this.a.reset();
        try {
            a(this.b, v7Var.a);
            String str = v7Var.b;
            if (str == null) {
                str = "";
            }
            a(this.b, str);
            this.b.writeLong(v7Var.c);
            this.b.writeLong(v7Var.d);
            this.b.write(v7Var.f);
            this.b.flush();
            return this.a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void a(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}
