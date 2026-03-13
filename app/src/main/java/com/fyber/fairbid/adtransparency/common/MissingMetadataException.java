package com.fyber.fairbid.adtransparency.common;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class MissingMetadataException extends Exception {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final MissingMetadataException b = new MissingMetadataException(MissingMetadataReason.MISSING_PLUGIN);
    @NotNull
    public static final MissingMetadataException c = new MissingMetadataException(MissingMetadataReason.FAILED_TO_INJECT);
    @NotNull
    public static final MissingMetadataException d = new MissingMetadataException(MissingMetadataReason.AD_NOT_INTERCEPTED);
    @NotNull
    public static final MissingMetadataException e = new MissingMetadataException(MissingMetadataReason.TIMEOUT);
    @NotNull
    public static final MissingMetadataException f = new MissingMetadataException(MissingMetadataReason.PARSING_ERROR);
    @NotNull
    public static final MissingMetadataException g = new MissingMetadataException(MissingMetadataReason.UNKNOWN);
    @NotNull
    public final MissingMetadataReason a;

    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        public Companion() {
        }

        public final MissingMetadataException forReason(MissingMetadataReason missingMetadataReason) {
            Object obj;
            Iterator it = S00.c(getMissingPluginException(), getFailedToInjectException(), getAdNotInterceptedException(), getMetadataReadTimeoutException(), getMetadataParsingException(), getUnknownException()).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((MissingMetadataException) obj).getReason() == missingMetadataReason) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (MissingMetadataException) obj;
        }

        @NotNull
        public final MissingMetadataException getAdNotInterceptedException() {
            return MissingMetadataException.d;
        }

        @NotNull
        public final MissingMetadataException getFailedToInjectException() {
            return MissingMetadataException.c;
        }

        @NotNull
        public final MissingMetadataException getMetadataParsingException() {
            return MissingMetadataException.f;
        }

        @NotNull
        public final MissingMetadataException getMetadataReadTimeoutException() {
            return MissingMetadataException.e;
        }

        @NotNull
        public final MissingMetadataException getMissingPluginException() {
            return MissingMetadataException.b;
        }

        @NotNull
        public final MissingMetadataException getUnknownException() {
            return MissingMetadataException.g;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    /* loaded from: classes.dex */
    public enum MissingMetadataReason {
        MISSING_PLUGIN,
        FAILED_TO_INJECT,
        AD_NOT_INTERCEPTED,
        TIMEOUT,
        PARSING_ERROR,
        UNKNOWN;

        MissingMetadataReason() {
        }
    }

    public MissingMetadataException(MissingMetadataReason missingMetadataReason) {
        this.a = missingMetadataReason;
    }

    @NotNull
    public final MissingMetadataReason getReason() {
        return this.a;
    }
}
