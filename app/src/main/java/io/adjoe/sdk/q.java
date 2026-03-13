package io.adjoe.sdk;

import io.adjoe.sdk.PlaytimeNotInitializedException;
/* loaded from: classes2.dex */
public final class q extends PlaytimeNotInitializedException.Errors {
    @Override // io.adjoe.sdk.PlaytimeNotInitializedException.Errors, defpackage.InterfaceC2434pf0
    public final String getMessage() {
        return "SDK is not initialized";
    }
}
