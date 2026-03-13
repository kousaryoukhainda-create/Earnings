package io.adjoe.sdk;

import io.adjoe.sdk.PlaytimeException;
/* loaded from: classes2.dex */
public final class g extends PlaytimeException.Errors {
    @Override // io.adjoe.sdk.PlaytimeException.Errors, defpackage.InterfaceC2434pf0
    public final String getMessage() {
        return "getCatalogIntent must be called on the main process";
    }
}
