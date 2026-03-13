package com.fyber.inneractive.sdk.protobuf;
/* loaded from: classes.dex */
public final class i1 {
    public static String a(i iVar) {
        StringBuilder sb = new StringBuilder(iVar.size());
        for (int i = 0; i < iVar.size(); i++) {
            byte c = iVar.c(i);
            if (c != 34) {
                if (c != 39) {
                    if (c != 92) {
                        switch (c) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (c >= 32 && c <= 126) {
                                    sb.append((char) c);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((c >>> 6) & 3) + 48));
                                    sb.append((char) (((c >>> 3) & 7) + 48));
                                    sb.append((char) ((c & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}
