package com.fyber.fairbid.user;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class UserInfoKotlinWrapper {
    @NotNull
    public static final UserInfoKotlinWrapper INSTANCE = new UserInfoKotlinWrapper();

    public static final void setIsChild(boolean z) {
        UserInfo userInfo;
        UserInfo userInfo2 = UserInfo.i;
        synchronized (UserInfo.class) {
            userInfo = UserInfo.i;
        }
        userInfo.h = z;
    }
}
