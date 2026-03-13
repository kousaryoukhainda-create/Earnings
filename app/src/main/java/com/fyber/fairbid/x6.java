package com.fyber.fairbid;

import com.fyber.fairbid.mediation.NetworkResult;
import com.fyber.fairbid.mediation.request.MediationRequest;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public interface x6 {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum f uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes.dex */
    public static final class a {
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final /* synthetic */ a[] l;
        public final boolean a;
        @NotNull
        public final a[] b;

        static {
            a aVar = new a("EXPIRED", 0, false, new a[0]);
            c = aVar;
            a aVar2 = new a("CONSUMED", 1, false, new a[0]);
            d = aVar2;
            a aVar3 = new a("NOT_LOADED", 2, false, new a[0]);
            e = aVar3;
            a aVar4 = new a("LOADED", 3, true, aVar, aVar2);
            f = aVar4;
            a aVar5 = new a("LOADING", 4, true, aVar4, aVar3, aVar);
            g = aVar5;
            a aVar6 = new a("NO_FILL", 5, false, new a[0]);
            h = aVar6;
            a aVar7 = new a("FILL", 6, true, aVar5, aVar);
            i = aVar7;
            a aVar8 = new a("REQUESTING", 7, false, aVar6, aVar7);
            j = aVar8;
            a aVar9 = new a("INITIALIZED", 8, false, aVar8);
            k = aVar9;
            l = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
        }

        public a(String str, int i2, boolean z, a... aVarArr) {
            this.a = z;
            this.b = aVarArr;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) l.clone();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(@NotNull a aVar, @NotNull a aVar2);
    }

    NetworkResult a(@NotNull MediationRequest mediationRequest, @NotNull Function1 function1);

    MediationRequest a();

    void a(@NotNull b bVar);

    c3 b();

    void c();

    @NotNull
    a d();

    Double e();
}
