package io.adjoe.sdk;

import io.adjoe.sdk.PlaytimeException;
/* loaded from: classes2.dex */
public final class h extends PlaytimeException.Errors {
    @Override // io.adjoe.sdk.PlaytimeException.Errors, defpackage.InterfaceC2434pf0
    public final String getMessage() {
        return "init() method should only run on the main process. Please check documentation on adding processName to Adjoe.Options.";
    }
}
