package com.fyber.inneractive.sdk.flow.vast;

import java.util.Comparator;
/* loaded from: classes.dex */
public class f implements Comparator<com.fyber.inneractive.sdk.model.vast.c> {
    public int a;
    public int b;

    public f(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public Integer a(com.fyber.inneractive.sdk.model.vast.c cVar) {
        com.fyber.inneractive.sdk.model.vast.h hVar = cVar.a;
        if (hVar == com.fyber.inneractive.sdk.model.vast.h.Html) {
            return 3;
        }
        if (hVar == com.fyber.inneractive.sdk.model.vast.h.Iframe) {
            return 2;
        }
        if (hVar == com.fyber.inneractive.sdk.model.vast.h.Static) {
            return 1;
        }
        return -1;
    }

    @Override // java.util.Comparator
    public int compare(com.fyber.inneractive.sdk.model.vast.c cVar, com.fyber.inneractive.sdk.model.vast.c cVar2) {
        com.fyber.inneractive.sdk.model.vast.c cVar3 = cVar;
        com.fyber.inneractive.sdk.model.vast.c cVar4 = cVar2;
        int i = cVar3.c * cVar3.d;
        int i2 = cVar4.c * cVar4.d;
        int i3 = this.a * this.b;
        int abs = Math.abs(i - i3);
        int abs2 = Math.abs(i2 - i3);
        if (abs >= abs2) {
            if (abs <= abs2) {
                float f = this.a / this.b;
                float abs3 = Math.abs(f - (cVar3.c / cVar3.d));
                float abs4 = Math.abs(f - (cVar4.c / cVar4.d));
                if (abs3 >= abs4) {
                    if (abs3 <= abs4) {
                        int compareTo = a(cVar4).compareTo(a(cVar3));
                        if (compareTo == 0) {
                            return 0;
                        }
                        return compareTo;
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
