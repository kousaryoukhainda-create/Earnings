package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* renamed from: P5  reason: default package */
/* loaded from: classes2.dex */
public class P5 {
    public final L5 b;
    public final int c;
    public byte[] d;

    public P5(L5 l5, int i, byte[] bArr) {
        this.b = l5;
        this.c = i;
        this.d = bArr;
    }

    public static ArrayList b(ArrayList arrayList, L5 l5) {
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((P5) it.next()).a(l5));
        }
        return arrayList2;
    }

    public static P5 e(String str, List list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            P5 p5 = (P5) it.next();
            if (p5.c().equals(str)) {
                return p5;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [js, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [P5, me] */
    public static P5 f(L5 l5, DataInputStream dataInputStream) {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        String p = l5.p(readUnsignedShort);
        char charAt = p.charAt(0);
        if (charAt < 'E') {
            if (p.equals("AnnotationDefault")) {
                return new C2640s3(l5, readUnsignedShort, dataInputStream, 0);
            }
            if (p.equals("BootstrapMethods")) {
                return new C2640s3(l5, readUnsignedShort, dataInputStream, 2);
            }
            if (p.equals("Code")) {
                ?? p5 = new P5(l5, readUnsignedShort, (byte[]) null);
                dataInputStream.readInt();
                p5.f = dataInputStream.readUnsignedShort();
                p5.g = dataInputStream.readUnsignedShort();
                byte[] bArr = new byte[dataInputStream.readInt()];
                p5.d = bArr;
                dataInputStream.readFully(bArr);
                ?? obj = new Object();
                obj.b = l5;
                int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                ArrayList arrayList = new ArrayList(readUnsignedShort2);
                for (int i = 0; i < readUnsignedShort2; i++) {
                    arrayList.add(new C2024ks(dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort()));
                }
                obj.c = arrayList;
                p5.h = obj;
                p5.i = new ArrayList();
                int readUnsignedShort3 = dataInputStream.readUnsignedShort();
                for (int i2 = 0; i2 < readUnsignedShort3; i2++) {
                    p5.i.add(f(l5, dataInputStream));
                }
                return p5;
            } else if (p.equals("ConstantValue")) {
                return new P5(l5, readUnsignedShort, dataInputStream);
            } else {
                if (p.equals("Deprecated")) {
                    return new C2640s3(l5, readUnsignedShort, dataInputStream, 3);
                }
            }
        }
        if (charAt < 'M') {
            if (p.equals("EnclosingMethod")) {
                return new P5(l5, readUnsignedShort, dataInputStream);
            }
            if (p.equals("Exceptions")) {
                return new P5(l5, readUnsignedShort, dataInputStream);
            }
            if (p.equals("InnerClasses")) {
                return new P5(l5, readUnsignedShort, dataInputStream);
            }
            if (p.equals("LineNumberTable")) {
                return new P5(l5, readUnsignedShort, dataInputStream);
            }
            if (p.equals("LocalVariableTable")) {
                return new P5(l5, readUnsignedShort, dataInputStream);
            }
            if (p.equals("LocalVariableTypeTable")) {
                return new P5(l5, readUnsignedShort, dataInputStream);
            }
        }
        if (charAt < 'S') {
            if (p.equals("MethodParameters")) {
                return new C2640s3(l5, readUnsignedShort, dataInputStream, 4);
            }
            if (p.equals("NestHost")) {
                return new C2640s3(l5, readUnsignedShort, dataInputStream, 5);
            }
            if (p.equals("NestMembers")) {
                return new C2640s3(l5, readUnsignedShort, dataInputStream, 6);
            }
            if (!p.equals("RuntimeVisibleAnnotations") && !p.equals("RuntimeInvisibleAnnotations")) {
                if (!p.equals("RuntimeVisibleParameterAnnotations") && !p.equals("RuntimeInvisibleParameterAnnotations")) {
                    if (p.equals("RuntimeVisibleTypeAnnotations") || p.equals("RuntimeInvisibleTypeAnnotations")) {
                        return new C2640s3(l5, readUnsignedShort, dataInputStream, 11);
                    }
                } else {
                    return new C2640s3(l5, readUnsignedShort, dataInputStream, 7);
                }
            } else {
                return new C2640s3(l5, readUnsignedShort, dataInputStream, 1);
            }
        }
        if (charAt >= 'S') {
            if (p.equals("Signature")) {
                return new C2640s3(l5, readUnsignedShort, dataInputStream, 8);
            }
            if (p.equals("SourceFile")) {
                return new C2640s3(l5, readUnsignedShort, dataInputStream, 9);
            }
            if (p.equals("Synthetic")) {
                return new C2640s3(l5, readUnsignedShort, dataInputStream, 10);
            }
            if (p.equals("StackMap")) {
                return new P5(l5, readUnsignedShort, dataInputStream);
            }
            if (p.equals("StackMapTable")) {
                return new P5(l5, readUnsignedShort, dataInputStream);
            }
        }
        return new P5(l5, readUnsignedShort, dataInputStream);
    }

    public static synchronized void g(String str, List list) {
        synchronized (P5.class) {
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                P5 p5 = (P5) it.next();
                if (p5.c().equals(str) && list.remove(p5)) {
                    return;
                }
            }
        }
    }

    public static void i(ArrayList arrayList, DataOutputStream dataOutputStream) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((P5) it.next()).h(dataOutputStream);
        }
    }

    public P5 a(L5 l5) {
        String c = c();
        byte[] bArr = this.d;
        return new P5(l5, l5.j(c), Arrays.copyOf(bArr, bArr.length));
    }

    public final String c() {
        return this.b.p(this.c);
    }

    public int d() {
        return this.d.length + 6;
    }

    public void h(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.c);
        dataOutputStream.writeInt(this.d.length);
        byte[] bArr = this.d;
        if (bArr.length > 0) {
            dataOutputStream.write(bArr);
        }
    }

    public P5(L5 l5, String str, byte[] bArr) {
        this(l5, l5.j(str), bArr);
    }

    public P5(L5 l5, int i, DataInputStream dataInputStream) {
        this.b = l5;
        this.c = i;
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[readInt];
        this.d = bArr;
        if (readInt > 0) {
            dataInputStream.readFully(bArr);
        }
    }
}
