package com.google.android.gms.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
/* loaded from: classes3.dex */
public class StandardExceptionParser implements ExceptionParser {
    private final TreeSet zza = new TreeSet();

    public StandardExceptionParser(@NonNull Context context, @NonNull Collection<String> collection) {
        setIncludedPackages(context, collection);
    }

    public StackTraceElement getBestStackTraceElement(@NonNull Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null && (r0 = stackTrace.length) != 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                Iterator it = this.zza.iterator();
                while (it.hasNext()) {
                    if (className.startsWith((String) it.next())) {
                        return stackTraceElement;
                    }
                }
            }
            return stackTrace[0];
        }
        return null;
    }

    @NonNull
    public Throwable getCause(@NonNull Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    @Override // com.google.android.gms.analytics.ExceptionParser
    @NonNull
    public String getDescription(String str, @NonNull Throwable th) {
        return getDescription(getCause(th), getBestStackTraceElement(getCause(th)), str);
    }

    public void setIncludedPackages(@NonNull Context context, @NonNull Collection<String> collection) {
        this.zza.clear();
        HashSet hashSet = new HashSet();
        if (collection != null) {
            hashSet.addAll(collection);
        }
        if (context != null) {
            hashSet.add(context.getApplicationContext().getPackageName());
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = this.zza.iterator();
            boolean z = true;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                if (!str.startsWith(str2)) {
                    if (str2.startsWith(str)) {
                        this.zza.remove(str2);
                    }
                } else {
                    z = false;
                }
            }
            if (z) {
                this.zza.add(str);
            }
        }
    }

    @NonNull
    public String getDescription(@NonNull Throwable th, StackTraceElement stackTraceElement, String str) {
        int length;
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getSimpleName());
        if (stackTraceElement != null) {
            String[] split = stackTraceElement.getClassName().split("\\.");
            String str2 = (split == null || (length = split.length) <= 0) ? "unknown" : split[length - 1];
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            StringBuilder q = BK.q(" (@", str2, ":", methodName, ":");
            q.append(lineNumber);
            q.append(")");
            sb.append(q.toString());
        }
        if (str != null) {
            sb.append(" {" + str + "}");
        }
        return sb.toString();
    }
}
