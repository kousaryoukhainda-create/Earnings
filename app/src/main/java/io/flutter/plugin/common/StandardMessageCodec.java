package io.flutter.plugin.common;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class StandardMessageCodec implements MessageCodec<Object> {
    private static final byte BIGINT = 5;
    private static final byte BYTE_ARRAY = 8;
    private static final byte DOUBLE = 6;
    private static final byte DOUBLE_ARRAY = 11;
    private static final byte FALSE = 2;
    private static final byte FLOAT_ARRAY = 14;
    public static final StandardMessageCodec INSTANCE = new StandardMessageCodec();
    private static final byte INT = 3;
    private static final byte INT_ARRAY = 9;
    private static final byte LIST = 12;
    private static final boolean LITTLE_ENDIAN;
    private static final byte LONG = 4;
    private static final byte LONG_ARRAY = 10;
    private static final byte MAP = 13;
    private static final byte NULL = 0;
    private static final byte STRING = 7;
    private static final String TAG = "StandardMessageCodec#";
    private static final byte TRUE = 1;
    private static final Charset UTF8;

    /* loaded from: classes2.dex */
    public static final class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] buffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    static {
        boolean z;
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        LITTLE_ENDIAN = z;
        UTF8 = Charset.forName("UTF8");
    }

    public static final void readAlignment(@NonNull ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position() % i;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i) - position);
        }
    }

    @NonNull
    public static final byte[] readBytes(@NonNull ByteBuffer byteBuffer) {
        byte[] bArr = new byte[readSize(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static final int readSize(@NonNull ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int i = byteBuffer.get() & 255;
            if (i < 254) {
                return i;
            }
            if (i == 254) {
                return byteBuffer.getChar();
            }
            return byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public static final void writeAlignment(@NonNull ByteArrayOutputStream byteArrayOutputStream, int i) {
        int size = byteArrayOutputStream.size() % i;
        if (size != 0) {
            for (int i2 = 0; i2 < i - size; i2++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    public static final void writeBytes(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull byte[] bArr) {
        writeSize(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    public static final void writeChar(@NonNull ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (LITTLE_ENDIAN) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
            return;
        }
        byteArrayOutputStream.write(i >>> 8);
        byteArrayOutputStream.write(i);
    }

    public static final void writeDouble(@NonNull ByteArrayOutputStream byteArrayOutputStream, double d) {
        writeLong(byteArrayOutputStream, Double.doubleToLongBits(d));
    }

    public static final void writeFloat(@NonNull ByteArrayOutputStream byteArrayOutputStream, float f) {
        writeInt(byteArrayOutputStream, Float.floatToIntBits(f));
    }

    public static final void writeInt(@NonNull ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (LITTLE_ENDIAN) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
            byteArrayOutputStream.write(i >>> 16);
            byteArrayOutputStream.write(i >>> 24);
            return;
        }
        byteArrayOutputStream.write(i >>> 24);
        byteArrayOutputStream.write(i >>> 16);
        byteArrayOutputStream.write(i >>> 8);
        byteArrayOutputStream.write(i);
    }

    public static final void writeLong(@NonNull ByteArrayOutputStream byteArrayOutputStream, long j) {
        if (LITTLE_ENDIAN) {
            byteArrayOutputStream.write((byte) j);
            byteArrayOutputStream.write((byte) (j >>> 8));
            byteArrayOutputStream.write((byte) (j >>> 16));
            byteArrayOutputStream.write((byte) (j >>> 24));
            byteArrayOutputStream.write((byte) (j >>> 32));
            byteArrayOutputStream.write((byte) (j >>> 40));
            byteArrayOutputStream.write((byte) (j >>> 48));
            byteArrayOutputStream.write((byte) (j >>> 56));
            return;
        }
        byteArrayOutputStream.write((byte) (j >>> 56));
        byteArrayOutputStream.write((byte) (j >>> 48));
        byteArrayOutputStream.write((byte) (j >>> 40));
        byteArrayOutputStream.write((byte) (j >>> 32));
        byteArrayOutputStream.write((byte) (j >>> 24));
        byteArrayOutputStream.write((byte) (j >>> 16));
        byteArrayOutputStream.write((byte) (j >>> 8));
        byteArrayOutputStream.write((byte) j);
    }

    public static final void writeSize(@NonNull ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (i < 254) {
            byteArrayOutputStream.write(i);
        } else if (i <= 65535) {
            byteArrayOutputStream.write(254);
            writeChar(byteArrayOutputStream, i);
        } else {
            byteArrayOutputStream.write(255);
            writeInt(byteArrayOutputStream, i);
        }
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public Object decodeMessage(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object readValue = readValue(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return readValue;
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public ByteBuffer encodeMessage(Object obj) {
        if (obj == null) {
            return null;
        }
        ExposedByteArrayOutputStream exposedByteArrayOutputStream = new ExposedByteArrayOutputStream();
        writeValue(exposedByteArrayOutputStream, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
        allocateDirect.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
        return allocateDirect;
    }

    public final Object readValue(@NonNull ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return readValueOfType(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.HashMap] */
    public Object readValueOfType(byte b, @NonNull ByteBuffer byteBuffer) {
        ?? arrayList;
        int i = 0;
        switch (b) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                return new BigInteger(new String(readBytes(byteBuffer), UTF8), 16);
            case 6:
                readAlignment(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                return new String(readBytes(byteBuffer), UTF8);
            case 8:
                return readBytes(byteBuffer);
            case 9:
                int readSize = readSize(byteBuffer);
                int[] iArr = new int[readSize];
                readAlignment(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position((readSize * 4) + byteBuffer.position());
                return iArr;
            case 10:
                int readSize2 = readSize(byteBuffer);
                long[] jArr = new long[readSize2];
                readAlignment(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position((readSize2 * 8) + byteBuffer.position());
                return jArr;
            case 11:
                int readSize3 = readSize(byteBuffer);
                double[] dArr = new double[readSize3];
                readAlignment(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position((readSize3 * 8) + byteBuffer.position());
                return dArr;
            case 12:
                int readSize4 = readSize(byteBuffer);
                arrayList = new ArrayList(readSize4);
                while (i < readSize4) {
                    arrayList.add(readValue(byteBuffer));
                    i++;
                }
                break;
            case 13:
                int readSize5 = readSize(byteBuffer);
                arrayList = new HashMap();
                while (i < readSize5) {
                    arrayList.put(readValue(byteBuffer), readValue(byteBuffer));
                    i++;
                }
                break;
            case 14:
                int readSize6 = readSize(byteBuffer);
                float[] fArr = new float[readSize6];
                readAlignment(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position((readSize6 * 4) + byteBuffer.position());
                return fArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
        return arrayList;
    }

    public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i;
        int i2 = 0;
        if (obj != null && !obj.equals(null)) {
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    i = 1;
                } else {
                    i = 2;
                }
                byteArrayOutputStream.write(i);
                return;
            } else if (obj instanceof Number) {
                if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
                    if (obj instanceof Long) {
                        byteArrayOutputStream.write(4);
                        writeLong(byteArrayOutputStream, ((Long) obj).longValue());
                        return;
                    } else if (!(obj instanceof Float) && !(obj instanceof Double)) {
                        if (obj instanceof BigInteger) {
                            byteArrayOutputStream.write(5);
                            writeBytes(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(UTF8));
                            return;
                        }
                        throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                    } else {
                        byteArrayOutputStream.write(6);
                        writeAlignment(byteArrayOutputStream, 8);
                        writeDouble(byteArrayOutputStream, ((Number) obj).doubleValue());
                        return;
                    }
                }
                byteArrayOutputStream.write(3);
                writeInt(byteArrayOutputStream, ((Number) obj).intValue());
                return;
            } else if (obj instanceof CharSequence) {
                byteArrayOutputStream.write(7);
                writeBytes(byteArrayOutputStream, obj.toString().getBytes(UTF8));
                return;
            } else if (obj instanceof byte[]) {
                byteArrayOutputStream.write(8);
                writeBytes(byteArrayOutputStream, (byte[]) obj);
                return;
            } else if (obj instanceof int[]) {
                byteArrayOutputStream.write(9);
                int[] iArr = (int[]) obj;
                writeSize(byteArrayOutputStream, iArr.length);
                writeAlignment(byteArrayOutputStream, 4);
                int length = iArr.length;
                while (i2 < length) {
                    writeInt(byteArrayOutputStream, iArr[i2]);
                    i2++;
                }
                return;
            } else if (obj instanceof long[]) {
                byteArrayOutputStream.write(10);
                long[] jArr = (long[]) obj;
                writeSize(byteArrayOutputStream, jArr.length);
                writeAlignment(byteArrayOutputStream, 8);
                int length2 = jArr.length;
                while (i2 < length2) {
                    writeLong(byteArrayOutputStream, jArr[i2]);
                    i2++;
                }
                return;
            } else if (obj instanceof double[]) {
                byteArrayOutputStream.write(11);
                double[] dArr = (double[]) obj;
                writeSize(byteArrayOutputStream, dArr.length);
                writeAlignment(byteArrayOutputStream, 8);
                int length3 = dArr.length;
                while (i2 < length3) {
                    writeDouble(byteArrayOutputStream, dArr[i2]);
                    i2++;
                }
                return;
            } else if (obj instanceof List) {
                byteArrayOutputStream.write(12);
                List<Object> list = (List) obj;
                writeSize(byteArrayOutputStream, list.size());
                for (Object obj2 : list) {
                    writeValue(byteArrayOutputStream, obj2);
                }
                return;
            } else if (obj instanceof Map) {
                byteArrayOutputStream.write(13);
                Map map = (Map) obj;
                writeSize(byteArrayOutputStream, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    writeValue(byteArrayOutputStream, entry.getKey());
                    writeValue(byteArrayOutputStream, entry.getValue());
                }
                return;
            } else if (obj instanceof float[]) {
                byteArrayOutputStream.write(14);
                float[] fArr = (float[]) obj;
                writeSize(byteArrayOutputStream, fArr.length);
                writeAlignment(byteArrayOutputStream, 4);
                int length4 = fArr.length;
                while (i2 < length4) {
                    writeFloat(byteArrayOutputStream, fArr[i2]);
                    i2++;
                }
                return;
            } else {
                throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
            }
        }
        byteArrayOutputStream.write(0);
    }
}
