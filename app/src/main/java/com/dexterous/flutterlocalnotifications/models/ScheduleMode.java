package com.dexterous.flutterlocalnotifications.models;

import androidx.annotation.Keep;
@Keep
/* loaded from: classes.dex */
public enum ScheduleMode {
    alarmClock,
    exact,
    exactAllowWhileIdle,
    inexact,
    inexactAllowWhileIdle;

    public boolean useAlarmClock() {
        if (this == alarmClock) {
            return true;
        }
        return false;
    }

    public boolean useAllowWhileIdle() {
        if (this != exactAllowWhileIdle && this != inexactAllowWhileIdle) {
            return false;
        }
        return true;
    }

    public boolean useExactAlarm() {
        if (this != exact && this != exactAllowWhileIdle) {
            return false;
        }
        return true;
    }
}
