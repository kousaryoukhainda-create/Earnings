package io.flutter.plugins.inapppurchase;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.inapppurchase.Messages;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public class Messages {

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes2.dex */
    public @interface CanIgnoreReturnValue {
    }

    /* loaded from: classes2.dex */
    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(@NonNull String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    /* loaded from: classes2.dex */
    public interface InAppPurchaseApi {

        /* renamed from: io.flutter.plugins.inapppurchase.Messages$InAppPurchaseApi$-CC */
        /* loaded from: classes2.dex */
        public abstract /* synthetic */ class CC {
            public static MessageCodec a() {
                return PigeonCodec.INSTANCE;
            }

            public static /* synthetic */ void b(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    arrayList.add(0, inAppPurchaseApi.isReady());
                } catch (Throwable th) {
                    arrayList = Messages.wrapError(th);
                }
                reply.reply(arrayList);
            }

            public static /* synthetic */ void c(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                inAppPurchaseApi.startConnection((Long) arrayList2.get(0), (PlatformBillingChoiceMode) arrayList2.get(1), (PlatformPendingPurchasesParams) arrayList2.get(2), new Result<PlatformBillingResult>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.1
                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void success(PlatformBillingResult platformBillingResult) {
                        arrayList.add(0, platformBillingResult);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void d(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    arrayList.add(0, inAppPurchaseApi.isFeatureSupported((PlatformBillingClientFeature) ((ArrayList) obj).get(0)));
                } catch (Throwable th) {
                    arrayList = Messages.wrapError(th);
                }
                reply.reply(arrayList);
            }

            public static /* synthetic */ void e(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                inAppPurchaseApi.isAlternativeBillingOnlyAvailableAsync(new Result<PlatformBillingResult>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.8
                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void success(PlatformBillingResult platformBillingResult) {
                        arrayList.add(0, platformBillingResult);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void f(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                inAppPurchaseApi.showAlternativeBillingOnlyInformationDialog(new Result<PlatformBillingResult>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.9
                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void success(PlatformBillingResult platformBillingResult) {
                        arrayList.add(0, platformBillingResult);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void g(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                inAppPurchaseApi.createAlternativeBillingOnlyReportingDetailsAsync(new Result<PlatformAlternativeBillingOnlyReportingDetailsResponse>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.10
                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void success(PlatformAlternativeBillingOnlyReportingDetailsResponse platformAlternativeBillingOnlyReportingDetailsResponse) {
                        arrayList.add(0, platformAlternativeBillingOnlyReportingDetailsResponse);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void h(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    inAppPurchaseApi.endConnection();
                    arrayList.add(0, null);
                } catch (Throwable th) {
                    arrayList = Messages.wrapError(th);
                }
                reply.reply(arrayList);
            }

            public static /* synthetic */ void i(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                inAppPurchaseApi.getBillingConfigAsync(new Result<PlatformBillingConfigResponse>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.2
                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void success(PlatformBillingConfigResponse platformBillingConfigResponse) {
                        arrayList.add(0, platformBillingConfigResponse);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void j(InAppPurchaseApi inAppPurchaseApi, Object obj, BasicMessageChannel.Reply reply) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    arrayList.add(0, inAppPurchaseApi.launchBillingFlow((PlatformBillingFlowParams) ((ArrayList) obj).get(0)));
                } catch (Throwable th) {
                    arrayList = Messages.wrapError(th);
                }
                reply.reply(arrayList);
            }

            public static /* synthetic */ void k(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                inAppPurchaseApi.acknowledgePurchase((String) ((ArrayList) obj).get(0), new Result<PlatformBillingResult>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.3
                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void success(PlatformBillingResult platformBillingResult) {
                        arrayList.add(0, platformBillingResult);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void l(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                inAppPurchaseApi.consumeAsync((String) ((ArrayList) obj).get(0), new Result<PlatformBillingResult>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.4
                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void success(PlatformBillingResult platformBillingResult) {
                        arrayList.add(0, platformBillingResult);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void m(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                inAppPurchaseApi.queryPurchasesAsync((PlatformProductType) ((ArrayList) obj).get(0), new Result<PlatformPurchasesResponse>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.5
                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void success(PlatformPurchasesResponse platformPurchasesResponse) {
                        arrayList.add(0, platformPurchasesResponse);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void n(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                inAppPurchaseApi.queryPurchaseHistoryAsync((PlatformProductType) ((ArrayList) obj).get(0), new Result<PlatformPurchaseHistoryResponse>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.6
                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void success(PlatformPurchaseHistoryResponse platformPurchaseHistoryResponse) {
                        arrayList.add(0, platformPurchaseHistoryResponse);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void o(InAppPurchaseApi inAppPurchaseApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                inAppPurchaseApi.queryProductDetailsAsync((List) ((ArrayList) obj).get(0), new Result<PlatformProductDetailsResponse>() { // from class: io.flutter.plugins.inapppurchase.Messages.InAppPurchaseApi.7
                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.inapppurchase.Messages.Result
                    public void success(PlatformProductDetailsResponse platformProductDetailsResponse) {
                        arrayList.add(0, platformProductDetailsResponse);
                        reply.reply(arrayList);
                    }
                });
            }

            public static void p(BinaryMessenger binaryMessenger, InAppPurchaseApi inAppPurchaseApi) {
                q(binaryMessenger, "", inAppPurchaseApi);
            }

            public static void q(BinaryMessenger binaryMessenger, String str, final InAppPurchaseApi inAppPurchaseApi) {
                String concat;
                if (str.isEmpty()) {
                    concat = "";
                } else {
                    concat = ".".concat(str);
                }
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isReady", concat), a());
                if (inAppPurchaseApi != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.InAppPurchaseApi.CC.b(inAppPurchaseApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.InAppPurchaseApi.CC.l(inAppPurchaseApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.InAppPurchaseApi.CC.m(inAppPurchaseApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.InAppPurchaseApi.CC.n(inAppPurchaseApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.InAppPurchaseApi.CC.o(inAppPurchaseApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.InAppPurchaseApi.CC.d(inAppPurchaseApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.InAppPurchaseApi.CC.e(inAppPurchaseApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.InAppPurchaseApi.CC.f(inAppPurchaseApi, obj, reply);
                                    return;
                                case 8:
                                    Messages.InAppPurchaseApi.CC.g(inAppPurchaseApi, obj, reply);
                                    return;
                                case 9:
                                    Messages.InAppPurchaseApi.CC.c(inAppPurchaseApi, obj, reply);
                                    return;
                                case 10:
                                    Messages.InAppPurchaseApi.CC.h(inAppPurchaseApi, obj, reply);
                                    return;
                                case 11:
                                    Messages.InAppPurchaseApi.CC.i(inAppPurchaseApi, obj, reply);
                                    return;
                                case 12:
                                    Messages.InAppPurchaseApi.CC.j(inAppPurchaseApi, obj, reply);
                                    return;
                                default:
                                    Messages.InAppPurchaseApi.CC.k(inAppPurchaseApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.startConnection", concat), a());
                if (inAppPurchaseApi != null) {
                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.InAppPurchaseApi.CC.b(inAppPurchaseApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.InAppPurchaseApi.CC.l(inAppPurchaseApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.InAppPurchaseApi.CC.m(inAppPurchaseApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.InAppPurchaseApi.CC.n(inAppPurchaseApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.InAppPurchaseApi.CC.o(inAppPurchaseApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.InAppPurchaseApi.CC.d(inAppPurchaseApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.InAppPurchaseApi.CC.e(inAppPurchaseApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.InAppPurchaseApi.CC.f(inAppPurchaseApi, obj, reply);
                                    return;
                                case 8:
                                    Messages.InAppPurchaseApi.CC.g(inAppPurchaseApi, obj, reply);
                                    return;
                                case 9:
                                    Messages.InAppPurchaseApi.CC.c(inAppPurchaseApi, obj, reply);
                                    return;
                                case 10:
                                    Messages.InAppPurchaseApi.CC.h(inAppPurchaseApi, obj, reply);
                                    return;
                                case 11:
                                    Messages.InAppPurchaseApi.CC.i(inAppPurchaseApi, obj, reply);
                                    return;
                                case 12:
                                    Messages.InAppPurchaseApi.CC.j(inAppPurchaseApi, obj, reply);
                                    return;
                                default:
                                    Messages.InAppPurchaseApi.CC.k(inAppPurchaseApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.endConnection", concat), a());
                if (inAppPurchaseApi != null) {
                    basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.InAppPurchaseApi.CC.b(inAppPurchaseApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.InAppPurchaseApi.CC.l(inAppPurchaseApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.InAppPurchaseApi.CC.m(inAppPurchaseApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.InAppPurchaseApi.CC.n(inAppPurchaseApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.InAppPurchaseApi.CC.o(inAppPurchaseApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.InAppPurchaseApi.CC.d(inAppPurchaseApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.InAppPurchaseApi.CC.e(inAppPurchaseApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.InAppPurchaseApi.CC.f(inAppPurchaseApi, obj, reply);
                                    return;
                                case 8:
                                    Messages.InAppPurchaseApi.CC.g(inAppPurchaseApi, obj, reply);
                                    return;
                                case 9:
                                    Messages.InAppPurchaseApi.CC.c(inAppPurchaseApi, obj, reply);
                                    return;
                                case 10:
                                    Messages.InAppPurchaseApi.CC.h(inAppPurchaseApi, obj, reply);
                                    return;
                                case 11:
                                    Messages.InAppPurchaseApi.CC.i(inAppPurchaseApi, obj, reply);
                                    return;
                                case 12:
                                    Messages.InAppPurchaseApi.CC.j(inAppPurchaseApi, obj, reply);
                                    return;
                                default:
                                    Messages.InAppPurchaseApi.CC.k(inAppPurchaseApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel3.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.getBillingConfigAsync", concat), a());
                if (inAppPurchaseApi != null) {
                    basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.InAppPurchaseApi.CC.b(inAppPurchaseApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.InAppPurchaseApi.CC.l(inAppPurchaseApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.InAppPurchaseApi.CC.m(inAppPurchaseApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.InAppPurchaseApi.CC.n(inAppPurchaseApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.InAppPurchaseApi.CC.o(inAppPurchaseApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.InAppPurchaseApi.CC.d(inAppPurchaseApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.InAppPurchaseApi.CC.e(inAppPurchaseApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.InAppPurchaseApi.CC.f(inAppPurchaseApi, obj, reply);
                                    return;
                                case 8:
                                    Messages.InAppPurchaseApi.CC.g(inAppPurchaseApi, obj, reply);
                                    return;
                                case 9:
                                    Messages.InAppPurchaseApi.CC.c(inAppPurchaseApi, obj, reply);
                                    return;
                                case 10:
                                    Messages.InAppPurchaseApi.CC.h(inAppPurchaseApi, obj, reply);
                                    return;
                                case 11:
                                    Messages.InAppPurchaseApi.CC.i(inAppPurchaseApi, obj, reply);
                                    return;
                                case 12:
                                    Messages.InAppPurchaseApi.CC.j(inAppPurchaseApi, obj, reply);
                                    return;
                                default:
                                    Messages.InAppPurchaseApi.CC.k(inAppPurchaseApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel4.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.launchBillingFlow", concat), a());
                if (inAppPurchaseApi != null) {
                    basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.InAppPurchaseApi.CC.b(inAppPurchaseApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.InAppPurchaseApi.CC.l(inAppPurchaseApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.InAppPurchaseApi.CC.m(inAppPurchaseApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.InAppPurchaseApi.CC.n(inAppPurchaseApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.InAppPurchaseApi.CC.o(inAppPurchaseApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.InAppPurchaseApi.CC.d(inAppPurchaseApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.InAppPurchaseApi.CC.e(inAppPurchaseApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.InAppPurchaseApi.CC.f(inAppPurchaseApi, obj, reply);
                                    return;
                                case 8:
                                    Messages.InAppPurchaseApi.CC.g(inAppPurchaseApi, obj, reply);
                                    return;
                                case 9:
                                    Messages.InAppPurchaseApi.CC.c(inAppPurchaseApi, obj, reply);
                                    return;
                                case 10:
                                    Messages.InAppPurchaseApi.CC.h(inAppPurchaseApi, obj, reply);
                                    return;
                                case 11:
                                    Messages.InAppPurchaseApi.CC.i(inAppPurchaseApi, obj, reply);
                                    return;
                                case 12:
                                    Messages.InAppPurchaseApi.CC.j(inAppPurchaseApi, obj, reply);
                                    return;
                                default:
                                    Messages.InAppPurchaseApi.CC.k(inAppPurchaseApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel5.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.acknowledgePurchase", concat), a());
                if (inAppPurchaseApi != null) {
                    basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.InAppPurchaseApi.CC.b(inAppPurchaseApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.InAppPurchaseApi.CC.l(inAppPurchaseApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.InAppPurchaseApi.CC.m(inAppPurchaseApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.InAppPurchaseApi.CC.n(inAppPurchaseApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.InAppPurchaseApi.CC.o(inAppPurchaseApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.InAppPurchaseApi.CC.d(inAppPurchaseApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.InAppPurchaseApi.CC.e(inAppPurchaseApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.InAppPurchaseApi.CC.f(inAppPurchaseApi, obj, reply);
                                    return;
                                case 8:
                                    Messages.InAppPurchaseApi.CC.g(inAppPurchaseApi, obj, reply);
                                    return;
                                case 9:
                                    Messages.InAppPurchaseApi.CC.c(inAppPurchaseApi, obj, reply);
                                    return;
                                case 10:
                                    Messages.InAppPurchaseApi.CC.h(inAppPurchaseApi, obj, reply);
                                    return;
                                case 11:
                                    Messages.InAppPurchaseApi.CC.i(inAppPurchaseApi, obj, reply);
                                    return;
                                case 12:
                                    Messages.InAppPurchaseApi.CC.j(inAppPurchaseApi, obj, reply);
                                    return;
                                default:
                                    Messages.InAppPurchaseApi.CC.k(inAppPurchaseApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel6.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.consumeAsync", concat), a());
                if (inAppPurchaseApi != null) {
                    basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.InAppPurchaseApi.CC.b(inAppPurchaseApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.InAppPurchaseApi.CC.l(inAppPurchaseApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.InAppPurchaseApi.CC.m(inAppPurchaseApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.InAppPurchaseApi.CC.n(inAppPurchaseApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.InAppPurchaseApi.CC.o(inAppPurchaseApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.InAppPurchaseApi.CC.d(inAppPurchaseApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.InAppPurchaseApi.CC.e(inAppPurchaseApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.InAppPurchaseApi.CC.f(inAppPurchaseApi, obj, reply);
                                    return;
                                case 8:
                                    Messages.InAppPurchaseApi.CC.g(inAppPurchaseApi, obj, reply);
                                    return;
                                case 9:
                                    Messages.InAppPurchaseApi.CC.c(inAppPurchaseApi, obj, reply);
                                    return;
                                case 10:
                                    Messages.InAppPurchaseApi.CC.h(inAppPurchaseApi, obj, reply);
                                    return;
                                case 11:
                                    Messages.InAppPurchaseApi.CC.i(inAppPurchaseApi, obj, reply);
                                    return;
                                case 12:
                                    Messages.InAppPurchaseApi.CC.j(inAppPurchaseApi, obj, reply);
                                    return;
                                default:
                                    Messages.InAppPurchaseApi.CC.k(inAppPurchaseApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel7.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryPurchasesAsync", concat), a());
                if (inAppPurchaseApi != null) {
                    basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.InAppPurchaseApi.CC.b(inAppPurchaseApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.InAppPurchaseApi.CC.l(inAppPurchaseApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.InAppPurchaseApi.CC.m(inAppPurchaseApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.InAppPurchaseApi.CC.n(inAppPurchaseApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.InAppPurchaseApi.CC.o(inAppPurchaseApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.InAppPurchaseApi.CC.d(inAppPurchaseApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.InAppPurchaseApi.CC.e(inAppPurchaseApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.InAppPurchaseApi.CC.f(inAppPurchaseApi, obj, reply);
                                    return;
                                case 8:
                                    Messages.InAppPurchaseApi.CC.g(inAppPurchaseApi, obj, reply);
                                    return;
                                case 9:
                                    Messages.InAppPurchaseApi.CC.c(inAppPurchaseApi, obj, reply);
                                    return;
                                case 10:
                                    Messages.InAppPurchaseApi.CC.h(inAppPurchaseApi, obj, reply);
                                    return;
                                case 11:
                                    Messages.InAppPurchaseApi.CC.i(inAppPurchaseApi, obj, reply);
                                    return;
                                case 12:
                                    Messages.InAppPurchaseApi.CC.j(inAppPurchaseApi, obj, reply);
                                    return;
                                default:
                                    Messages.InAppPurchaseApi.CC.k(inAppPurchaseApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel8.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryPurchaseHistoryAsync", concat), a());
                if (inAppPurchaseApi != null) {
                    basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.InAppPurchaseApi.CC.b(inAppPurchaseApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.InAppPurchaseApi.CC.l(inAppPurchaseApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.InAppPurchaseApi.CC.m(inAppPurchaseApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.InAppPurchaseApi.CC.n(inAppPurchaseApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.InAppPurchaseApi.CC.o(inAppPurchaseApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.InAppPurchaseApi.CC.d(inAppPurchaseApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.InAppPurchaseApi.CC.e(inAppPurchaseApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.InAppPurchaseApi.CC.f(inAppPurchaseApi, obj, reply);
                                    return;
                                case 8:
                                    Messages.InAppPurchaseApi.CC.g(inAppPurchaseApi, obj, reply);
                                    return;
                                case 9:
                                    Messages.InAppPurchaseApi.CC.c(inAppPurchaseApi, obj, reply);
                                    return;
                                case 10:
                                    Messages.InAppPurchaseApi.CC.h(inAppPurchaseApi, obj, reply);
                                    return;
                                case 11:
                                    Messages.InAppPurchaseApi.CC.i(inAppPurchaseApi, obj, reply);
                                    return;
                                case 12:
                                    Messages.InAppPurchaseApi.CC.j(inAppPurchaseApi, obj, reply);
                                    return;
                                default:
                                    Messages.InAppPurchaseApi.CC.k(inAppPurchaseApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel9.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryProductDetailsAsync", concat), a());
                if (inAppPurchaseApi != null) {
                    basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.InAppPurchaseApi.CC.b(inAppPurchaseApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.InAppPurchaseApi.CC.l(inAppPurchaseApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.InAppPurchaseApi.CC.m(inAppPurchaseApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.InAppPurchaseApi.CC.n(inAppPurchaseApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.InAppPurchaseApi.CC.o(inAppPurchaseApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.InAppPurchaseApi.CC.d(inAppPurchaseApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.InAppPurchaseApi.CC.e(inAppPurchaseApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.InAppPurchaseApi.CC.f(inAppPurchaseApi, obj, reply);
                                    return;
                                case 8:
                                    Messages.InAppPurchaseApi.CC.g(inAppPurchaseApi, obj, reply);
                                    return;
                                case 9:
                                    Messages.InAppPurchaseApi.CC.c(inAppPurchaseApi, obj, reply);
                                    return;
                                case 10:
                                    Messages.InAppPurchaseApi.CC.h(inAppPurchaseApi, obj, reply);
                                    return;
                                case 11:
                                    Messages.InAppPurchaseApi.CC.i(inAppPurchaseApi, obj, reply);
                                    return;
                                case 12:
                                    Messages.InAppPurchaseApi.CC.j(inAppPurchaseApi, obj, reply);
                                    return;
                                default:
                                    Messages.InAppPurchaseApi.CC.k(inAppPurchaseApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel10.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isFeatureSupported", concat), a());
                if (inAppPurchaseApi != null) {
                    basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.InAppPurchaseApi.CC.b(inAppPurchaseApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.InAppPurchaseApi.CC.l(inAppPurchaseApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.InAppPurchaseApi.CC.m(inAppPurchaseApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.InAppPurchaseApi.CC.n(inAppPurchaseApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.InAppPurchaseApi.CC.o(inAppPurchaseApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.InAppPurchaseApi.CC.d(inAppPurchaseApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.InAppPurchaseApi.CC.e(inAppPurchaseApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.InAppPurchaseApi.CC.f(inAppPurchaseApi, obj, reply);
                                    return;
                                case 8:
                                    Messages.InAppPurchaseApi.CC.g(inAppPurchaseApi, obj, reply);
                                    return;
                                case 9:
                                    Messages.InAppPurchaseApi.CC.c(inAppPurchaseApi, obj, reply);
                                    return;
                                case 10:
                                    Messages.InAppPurchaseApi.CC.h(inAppPurchaseApi, obj, reply);
                                    return;
                                case 11:
                                    Messages.InAppPurchaseApi.CC.i(inAppPurchaseApi, obj, reply);
                                    return;
                                case 12:
                                    Messages.InAppPurchaseApi.CC.j(inAppPurchaseApi, obj, reply);
                                    return;
                                default:
                                    Messages.InAppPurchaseApi.CC.k(inAppPurchaseApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel11.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isAlternativeBillingOnlyAvailableAsync", concat), a());
                if (inAppPurchaseApi != null) {
                    basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.InAppPurchaseApi.CC.b(inAppPurchaseApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.InAppPurchaseApi.CC.l(inAppPurchaseApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.InAppPurchaseApi.CC.m(inAppPurchaseApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.InAppPurchaseApi.CC.n(inAppPurchaseApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.InAppPurchaseApi.CC.o(inAppPurchaseApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.InAppPurchaseApi.CC.d(inAppPurchaseApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.InAppPurchaseApi.CC.e(inAppPurchaseApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.InAppPurchaseApi.CC.f(inAppPurchaseApi, obj, reply);
                                    return;
                                case 8:
                                    Messages.InAppPurchaseApi.CC.g(inAppPurchaseApi, obj, reply);
                                    return;
                                case 9:
                                    Messages.InAppPurchaseApi.CC.c(inAppPurchaseApi, obj, reply);
                                    return;
                                case 10:
                                    Messages.InAppPurchaseApi.CC.h(inAppPurchaseApi, obj, reply);
                                    return;
                                case 11:
                                    Messages.InAppPurchaseApi.CC.i(inAppPurchaseApi, obj, reply);
                                    return;
                                case 12:
                                    Messages.InAppPurchaseApi.CC.j(inAppPurchaseApi, obj, reply);
                                    return;
                                default:
                                    Messages.InAppPurchaseApi.CC.k(inAppPurchaseApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel12.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.showAlternativeBillingOnlyInformationDialog", concat), a());
                if (inAppPurchaseApi != null) {
                    basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.InAppPurchaseApi.CC.b(inAppPurchaseApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.InAppPurchaseApi.CC.l(inAppPurchaseApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.InAppPurchaseApi.CC.m(inAppPurchaseApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.InAppPurchaseApi.CC.n(inAppPurchaseApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.InAppPurchaseApi.CC.o(inAppPurchaseApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.InAppPurchaseApi.CC.d(inAppPurchaseApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.InAppPurchaseApi.CC.e(inAppPurchaseApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.InAppPurchaseApi.CC.f(inAppPurchaseApi, obj, reply);
                                    return;
                                case 8:
                                    Messages.InAppPurchaseApi.CC.g(inAppPurchaseApi, obj, reply);
                                    return;
                                case 9:
                                    Messages.InAppPurchaseApi.CC.c(inAppPurchaseApi, obj, reply);
                                    return;
                                case 10:
                                    Messages.InAppPurchaseApi.CC.h(inAppPurchaseApi, obj, reply);
                                    return;
                                case 11:
                                    Messages.InAppPurchaseApi.CC.i(inAppPurchaseApi, obj, reply);
                                    return;
                                case 12:
                                    Messages.InAppPurchaseApi.CC.j(inAppPurchaseApi, obj, reply);
                                    return;
                                default:
                                    Messages.InAppPurchaseApi.CC.k(inAppPurchaseApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel13.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.createAlternativeBillingOnlyReportingDetailsAsync", concat), a());
                if (inAppPurchaseApi != null) {
                    basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: sM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.InAppPurchaseApi.CC.b(inAppPurchaseApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.InAppPurchaseApi.CC.l(inAppPurchaseApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.InAppPurchaseApi.CC.m(inAppPurchaseApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.InAppPurchaseApi.CC.n(inAppPurchaseApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.InAppPurchaseApi.CC.o(inAppPurchaseApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.InAppPurchaseApi.CC.d(inAppPurchaseApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.InAppPurchaseApi.CC.e(inAppPurchaseApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.InAppPurchaseApi.CC.f(inAppPurchaseApi, obj, reply);
                                    return;
                                case 8:
                                    Messages.InAppPurchaseApi.CC.g(inAppPurchaseApi, obj, reply);
                                    return;
                                case 9:
                                    Messages.InAppPurchaseApi.CC.c(inAppPurchaseApi, obj, reply);
                                    return;
                                case 10:
                                    Messages.InAppPurchaseApi.CC.h(inAppPurchaseApi, obj, reply);
                                    return;
                                case 11:
                                    Messages.InAppPurchaseApi.CC.i(inAppPurchaseApi, obj, reply);
                                    return;
                                case 12:
                                    Messages.InAppPurchaseApi.CC.j(inAppPurchaseApi, obj, reply);
                                    return;
                                default:
                                    Messages.InAppPurchaseApi.CC.k(inAppPurchaseApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel14.setMessageHandler(null);
                }
            }
        }

        void acknowledgePurchase(@NonNull String str, @NonNull Result<PlatformBillingResult> result);

        void consumeAsync(@NonNull String str, @NonNull Result<PlatformBillingResult> result);

        void createAlternativeBillingOnlyReportingDetailsAsync(@NonNull Result<PlatformAlternativeBillingOnlyReportingDetailsResponse> result);

        void endConnection();

        void getBillingConfigAsync(@NonNull Result<PlatformBillingConfigResponse> result);

        void isAlternativeBillingOnlyAvailableAsync(@NonNull Result<PlatformBillingResult> result);

        @NonNull
        Boolean isFeatureSupported(@NonNull PlatformBillingClientFeature platformBillingClientFeature);

        @NonNull
        Boolean isReady();

        @NonNull
        PlatformBillingResult launchBillingFlow(@NonNull PlatformBillingFlowParams platformBillingFlowParams);

        void queryProductDetailsAsync(@NonNull List<PlatformQueryProduct> list, @NonNull Result<PlatformProductDetailsResponse> result);

        void queryPurchaseHistoryAsync(@NonNull PlatformProductType platformProductType, @NonNull Result<PlatformPurchaseHistoryResponse> result);

        void queryPurchasesAsync(@NonNull PlatformProductType platformProductType, @NonNull Result<PlatformPurchasesResponse> result);

        void showAlternativeBillingOnlyInformationDialog(@NonNull Result<PlatformBillingResult> result);

        void startConnection(@NonNull Long l, @NonNull PlatformBillingChoiceMode platformBillingChoiceMode, @NonNull PlatformPendingPurchasesParams platformPendingPurchasesParams, @NonNull Result<PlatformBillingResult> result);
    }

    /* loaded from: classes2.dex */
    public static class InAppPurchaseCallbackApi {
        @NonNull
        private final BinaryMessenger binaryMessenger;
        private final String messageChannelSuffix;

        public InAppPurchaseCallbackApi(@NonNull BinaryMessenger binaryMessenger) {
            this(binaryMessenger, "");
        }

        @NonNull
        public static MessageCodec<Object> getCodec() {
            return PigeonCodec.INSTANCE;
        }

        public static /* synthetic */ void lambda$onBillingServiceDisconnected$0(VoidResult voidResult, String str, Object obj) {
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.size() > 1) {
                    voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
                    return;
                } else {
                    voidResult.success();
                    return;
                }
            }
            voidResult.error(Messages.createConnectionError(str));
        }

        public static /* synthetic */ void lambda$onPurchasesUpdated$1(VoidResult voidResult, String str, Object obj) {
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.size() > 1) {
                    voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
                    return;
                } else {
                    voidResult.success();
                    return;
                }
            }
            voidResult.error(Messages.createConnectionError(str));
        }

        public static /* synthetic */ void lambda$userSelectedalternativeBilling$2(VoidResult voidResult, String str, Object obj) {
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.size() > 1) {
                    voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
                    return;
                } else {
                    voidResult.success();
                    return;
                }
            }
            voidResult.error(Messages.createConnectionError(str));
        }

        public void onBillingServiceDisconnected(@NonNull Long l, @NonNull VoidResult voidResult) {
            String str = "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onBillingServiceDisconnected" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(new ArrayList(Collections.singletonList(l)), new C2752tM(voidResult, str, 0));
        }

        public void onPurchasesUpdated(@NonNull PlatformPurchasesResponse platformPurchasesResponse, @NonNull VoidResult voidResult) {
            String str = "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onPurchasesUpdated" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(new ArrayList(Collections.singletonList(platformPurchasesResponse)), new C2752tM(voidResult, str, 1));
        }

        public void userSelectedalternativeBilling(@NonNull PlatformUserChoiceDetails platformUserChoiceDetails, @NonNull VoidResult voidResult) {
            String str = "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.userSelectedalternativeBilling" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str, getCodec()).send(new ArrayList(Collections.singletonList(platformUserChoiceDetails)), new C2752tM(voidResult, str, 2));
        }

        public InAppPurchaseCallbackApi(@NonNull BinaryMessenger binaryMessenger, @NonNull String str) {
            this.binaryMessenger = binaryMessenger;
            this.messageChannelSuffix = str.isEmpty() ? "" : ".".concat(str);
        }
    }

    /* loaded from: classes2.dex */
    public interface NullableResult<T> {
        void error(@NonNull Throwable th);

        void success(T t);
    }

    /* loaded from: classes2.dex */
    public static class PigeonCodec extends StandardMessageCodec {
        public static final PigeonCodec INSTANCE = new PigeonCodec();

        private PigeonCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, @NonNull ByteBuffer byteBuffer) {
            switch (b) {
                case -127:
                    Object readValue = readValue(byteBuffer);
                    if (readValue == null) {
                        return null;
                    }
                    return PlatformBillingResponse.values()[((Long) readValue).intValue()];
                case -126:
                    Object readValue2 = readValue(byteBuffer);
                    if (readValue2 == null) {
                        return null;
                    }
                    return PlatformReplacementMode.values()[((Long) readValue2).intValue()];
                case -125:
                    Object readValue3 = readValue(byteBuffer);
                    if (readValue3 == null) {
                        return null;
                    }
                    return PlatformProductType.values()[((Long) readValue3).intValue()];
                case -124:
                    Object readValue4 = readValue(byteBuffer);
                    if (readValue4 == null) {
                        return null;
                    }
                    return PlatformBillingChoiceMode.values()[((Long) readValue4).intValue()];
                case -123:
                    Object readValue5 = readValue(byteBuffer);
                    if (readValue5 == null) {
                        return null;
                    }
                    return PlatformBillingClientFeature.values()[((Long) readValue5).intValue()];
                case -122:
                    Object readValue6 = readValue(byteBuffer);
                    if (readValue6 == null) {
                        return null;
                    }
                    return PlatformPurchaseState.values()[((Long) readValue6).intValue()];
                case -121:
                    Object readValue7 = readValue(byteBuffer);
                    if (readValue7 == null) {
                        return null;
                    }
                    return PlatformRecurrenceMode.values()[((Long) readValue7).intValue()];
                case -120:
                    return PlatformQueryProduct.fromList((ArrayList) readValue(byteBuffer));
                case -119:
                    return PlatformAccountIdentifiers.fromList((ArrayList) readValue(byteBuffer));
                case -118:
                    return PlatformBillingResult.fromList((ArrayList) readValue(byteBuffer));
                case -117:
                    return PlatformOneTimePurchaseOfferDetails.fromList((ArrayList) readValue(byteBuffer));
                case -116:
                    return PlatformProductDetails.fromList((ArrayList) readValue(byteBuffer));
                case -115:
                    return PlatformProductDetailsResponse.fromList((ArrayList) readValue(byteBuffer));
                case -114:
                    return PlatformAlternativeBillingOnlyReportingDetailsResponse.fromList((ArrayList) readValue(byteBuffer));
                case -113:
                    return PlatformBillingConfigResponse.fromList((ArrayList) readValue(byteBuffer));
                case -112:
                    return PlatformBillingFlowParams.fromList((ArrayList) readValue(byteBuffer));
                case -111:
                    return PlatformPricingPhase.fromList((ArrayList) readValue(byteBuffer));
                case -110:
                    return PlatformPurchase.fromList((ArrayList) readValue(byteBuffer));
                case -109:
                    return PlatformPendingPurchaseUpdate.fromList((ArrayList) readValue(byteBuffer));
                case -108:
                    return PlatformPurchaseHistoryRecord.fromList((ArrayList) readValue(byteBuffer));
                case -107:
                    return PlatformPurchaseHistoryResponse.fromList((ArrayList) readValue(byteBuffer));
                case -106:
                    return PlatformPurchasesResponse.fromList((ArrayList) readValue(byteBuffer));
                case -105:
                    return PlatformSubscriptionOfferDetails.fromList((ArrayList) readValue(byteBuffer));
                case -104:
                    return PlatformUserChoiceDetails.fromList((ArrayList) readValue(byteBuffer));
                case -103:
                    return PlatformUserChoiceProduct.fromList((ArrayList) readValue(byteBuffer));
                case -102:
                    return PlatformInstallmentPlanDetails.fromList((ArrayList) readValue(byteBuffer));
                case -101:
                    return PlatformPendingPurchasesParams.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Integer num = null;
            if (obj instanceof PlatformBillingResponse) {
                byteArrayOutputStream.write(129);
                if (obj != null) {
                    num = Integer.valueOf(((PlatformBillingResponse) obj).index);
                }
                writeValue(byteArrayOutputStream, num);
            } else if (obj instanceof PlatformReplacementMode) {
                byteArrayOutputStream.write(130);
                if (obj != null) {
                    num = Integer.valueOf(((PlatformReplacementMode) obj).index);
                }
                writeValue(byteArrayOutputStream, num);
            } else if (obj instanceof PlatformProductType) {
                byteArrayOutputStream.write(131);
                if (obj != null) {
                    num = Integer.valueOf(((PlatformProductType) obj).index);
                }
                writeValue(byteArrayOutputStream, num);
            } else if (obj instanceof PlatformBillingChoiceMode) {
                byteArrayOutputStream.write(132);
                if (obj != null) {
                    num = Integer.valueOf(((PlatformBillingChoiceMode) obj).index);
                }
                writeValue(byteArrayOutputStream, num);
            } else if (obj instanceof PlatformBillingClientFeature) {
                byteArrayOutputStream.write(133);
                if (obj != null) {
                    num = Integer.valueOf(((PlatformBillingClientFeature) obj).index);
                }
                writeValue(byteArrayOutputStream, num);
            } else if (obj instanceof PlatformPurchaseState) {
                byteArrayOutputStream.write(134);
                if (obj != null) {
                    num = Integer.valueOf(((PlatformPurchaseState) obj).index);
                }
                writeValue(byteArrayOutputStream, num);
            } else if (obj instanceof PlatformRecurrenceMode) {
                byteArrayOutputStream.write(135);
                if (obj != null) {
                    num = Integer.valueOf(((PlatformRecurrenceMode) obj).index);
                }
                writeValue(byteArrayOutputStream, num);
            } else if (obj instanceof PlatformQueryProduct) {
                byteArrayOutputStream.write(136);
                writeValue(byteArrayOutputStream, ((PlatformQueryProduct) obj).toList());
            } else if (obj instanceof PlatformAccountIdentifiers) {
                byteArrayOutputStream.write(137);
                writeValue(byteArrayOutputStream, ((PlatformAccountIdentifiers) obj).toList());
            } else if (obj instanceof PlatformBillingResult) {
                byteArrayOutputStream.write(138);
                writeValue(byteArrayOutputStream, ((PlatformBillingResult) obj).toList());
            } else if (obj instanceof PlatformOneTimePurchaseOfferDetails) {
                byteArrayOutputStream.write(139);
                writeValue(byteArrayOutputStream, ((PlatformOneTimePurchaseOfferDetails) obj).toList());
            } else if (obj instanceof PlatformProductDetails) {
                byteArrayOutputStream.write(140);
                writeValue(byteArrayOutputStream, ((PlatformProductDetails) obj).toList());
            } else if (obj instanceof PlatformProductDetailsResponse) {
                byteArrayOutputStream.write(141);
                writeValue(byteArrayOutputStream, ((PlatformProductDetailsResponse) obj).toList());
            } else if (obj instanceof PlatformAlternativeBillingOnlyReportingDetailsResponse) {
                byteArrayOutputStream.write(142);
                writeValue(byteArrayOutputStream, ((PlatformAlternativeBillingOnlyReportingDetailsResponse) obj).toList());
            } else if (obj instanceof PlatformBillingConfigResponse) {
                byteArrayOutputStream.write(143);
                writeValue(byteArrayOutputStream, ((PlatformBillingConfigResponse) obj).toList());
            } else if (obj instanceof PlatformBillingFlowParams) {
                byteArrayOutputStream.write(144);
                writeValue(byteArrayOutputStream, ((PlatformBillingFlowParams) obj).toList());
            } else if (obj instanceof PlatformPricingPhase) {
                byteArrayOutputStream.write(145);
                writeValue(byteArrayOutputStream, ((PlatformPricingPhase) obj).toList());
            } else if (obj instanceof PlatformPurchase) {
                byteArrayOutputStream.write(146);
                writeValue(byteArrayOutputStream, ((PlatformPurchase) obj).toList());
            } else if (obj instanceof PlatformPendingPurchaseUpdate) {
                byteArrayOutputStream.write(147);
                writeValue(byteArrayOutputStream, ((PlatformPendingPurchaseUpdate) obj).toList());
            } else if (obj instanceof PlatformPurchaseHistoryRecord) {
                byteArrayOutputStream.write(148);
                writeValue(byteArrayOutputStream, ((PlatformPurchaseHistoryRecord) obj).toList());
            } else if (obj instanceof PlatformPurchaseHistoryResponse) {
                byteArrayOutputStream.write(149);
                writeValue(byteArrayOutputStream, ((PlatformPurchaseHistoryResponse) obj).toList());
            } else if (obj instanceof PlatformPurchasesResponse) {
                byteArrayOutputStream.write(150);
                writeValue(byteArrayOutputStream, ((PlatformPurchasesResponse) obj).toList());
            } else if (obj instanceof PlatformSubscriptionOfferDetails) {
                byteArrayOutputStream.write(151);
                writeValue(byteArrayOutputStream, ((PlatformSubscriptionOfferDetails) obj).toList());
            } else if (obj instanceof PlatformUserChoiceDetails) {
                byteArrayOutputStream.write(ModuleDescriptor.MODULE_VERSION);
                writeValue(byteArrayOutputStream, ((PlatformUserChoiceDetails) obj).toList());
            } else if (obj instanceof PlatformUserChoiceProduct) {
                byteArrayOutputStream.write(153);
                writeValue(byteArrayOutputStream, ((PlatformUserChoiceProduct) obj).toList());
            } else if (obj instanceof PlatformInstallmentPlanDetails) {
                byteArrayOutputStream.write(154);
                writeValue(byteArrayOutputStream, ((PlatformInstallmentPlanDetails) obj).toList());
            } else if (obj instanceof PlatformPendingPurchasesParams) {
                byteArrayOutputStream.write(155);
                writeValue(byteArrayOutputStream, ((PlatformPendingPurchasesParams) obj).toList());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformAccountIdentifiers {
        private String obfuscatedAccountId;
        private String obfuscatedProfileId;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String obfuscatedAccountId;
            private String obfuscatedProfileId;

            @NonNull
            public PlatformAccountIdentifiers build() {
                PlatformAccountIdentifiers platformAccountIdentifiers = new PlatformAccountIdentifiers();
                platformAccountIdentifiers.setObfuscatedAccountId(this.obfuscatedAccountId);
                platformAccountIdentifiers.setObfuscatedProfileId(this.obfuscatedProfileId);
                return platformAccountIdentifiers;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setObfuscatedAccountId(String str) {
                this.obfuscatedAccountId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setObfuscatedProfileId(String str) {
                this.obfuscatedProfileId = str;
                return this;
            }
        }

        @NonNull
        public static PlatformAccountIdentifiers fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformAccountIdentifiers platformAccountIdentifiers = new PlatformAccountIdentifiers();
            platformAccountIdentifiers.setObfuscatedAccountId((String) arrayList.get(0));
            platformAccountIdentifiers.setObfuscatedProfileId((String) arrayList.get(1));
            return platformAccountIdentifiers;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformAccountIdentifiers.class != obj.getClass()) {
                return false;
            }
            PlatformAccountIdentifiers platformAccountIdentifiers = (PlatformAccountIdentifiers) obj;
            if (Objects.equals(this.obfuscatedAccountId, platformAccountIdentifiers.obfuscatedAccountId) && Objects.equals(this.obfuscatedProfileId, platformAccountIdentifiers.obfuscatedProfileId)) {
                return true;
            }
            return false;
        }

        public String getObfuscatedAccountId() {
            return this.obfuscatedAccountId;
        }

        public String getObfuscatedProfileId() {
            return this.obfuscatedProfileId;
        }

        public int hashCode() {
            return Objects.hash(this.obfuscatedAccountId, this.obfuscatedProfileId);
        }

        public void setObfuscatedAccountId(String str) {
            this.obfuscatedAccountId = str;
        }

        public void setObfuscatedProfileId(String str) {
            this.obfuscatedProfileId = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.obfuscatedAccountId);
            arrayList.add(this.obfuscatedProfileId);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformAlternativeBillingOnlyReportingDetailsResponse {
        @NonNull
        private PlatformBillingResult billingResult;
        @NonNull
        private String externalTransactionToken;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private PlatformBillingResult billingResult;
            private String externalTransactionToken;

            @NonNull
            public PlatformAlternativeBillingOnlyReportingDetailsResponse build() {
                PlatformAlternativeBillingOnlyReportingDetailsResponse platformAlternativeBillingOnlyReportingDetailsResponse = new PlatformAlternativeBillingOnlyReportingDetailsResponse();
                platformAlternativeBillingOnlyReportingDetailsResponse.setBillingResult(this.billingResult);
                platformAlternativeBillingOnlyReportingDetailsResponse.setExternalTransactionToken(this.externalTransactionToken);
                return platformAlternativeBillingOnlyReportingDetailsResponse;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setBillingResult(@NonNull PlatformBillingResult platformBillingResult) {
                this.billingResult = platformBillingResult;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setExternalTransactionToken(@NonNull String str) {
                this.externalTransactionToken = str;
                return this;
            }
        }

        @NonNull
        public static PlatformAlternativeBillingOnlyReportingDetailsResponse fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformAlternativeBillingOnlyReportingDetailsResponse platformAlternativeBillingOnlyReportingDetailsResponse = new PlatformAlternativeBillingOnlyReportingDetailsResponse();
            platformAlternativeBillingOnlyReportingDetailsResponse.setBillingResult((PlatformBillingResult) arrayList.get(0));
            platformAlternativeBillingOnlyReportingDetailsResponse.setExternalTransactionToken((String) arrayList.get(1));
            return platformAlternativeBillingOnlyReportingDetailsResponse;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformAlternativeBillingOnlyReportingDetailsResponse.class != obj.getClass()) {
                return false;
            }
            PlatformAlternativeBillingOnlyReportingDetailsResponse platformAlternativeBillingOnlyReportingDetailsResponse = (PlatformAlternativeBillingOnlyReportingDetailsResponse) obj;
            if (this.billingResult.equals(platformAlternativeBillingOnlyReportingDetailsResponse.billingResult) && this.externalTransactionToken.equals(platformAlternativeBillingOnlyReportingDetailsResponse.externalTransactionToken)) {
                return true;
            }
            return false;
        }

        @NonNull
        public PlatformBillingResult getBillingResult() {
            return this.billingResult;
        }

        @NonNull
        public String getExternalTransactionToken() {
            return this.externalTransactionToken;
        }

        public int hashCode() {
            return Objects.hash(this.billingResult, this.externalTransactionToken);
        }

        public void setBillingResult(@NonNull PlatformBillingResult platformBillingResult) {
            if (platformBillingResult != null) {
                this.billingResult = platformBillingResult;
                return;
            }
            throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
        }

        public void setExternalTransactionToken(@NonNull String str) {
            if (str != null) {
                this.externalTransactionToken = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"externalTransactionToken\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.billingResult);
            arrayList.add(this.externalTransactionToken);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public enum PlatformBillingChoiceMode {
        PLAY_BILLING_ONLY(0),
        ALTERNATIVE_BILLING_ONLY(1),
        USER_CHOICE_BILLING(2);
        
        final int index;

        PlatformBillingChoiceMode(int i) {
            this.index = i;
        }
    }

    /* loaded from: classes2.dex */
    public enum PlatformBillingClientFeature {
        ALTERNATIVE_BILLING_ONLY(0),
        BILLING_CONFIG(1),
        EXTERNAL_OFFER(2),
        IN_APP_MESSAGING(3),
        PRICE_CHANGE_CONFIRMATION(4),
        PRODUCT_DETAILS(5),
        SUBSCRIPTIONS(6),
        SUBSCRIPTIONS_UPDATE(7);
        
        final int index;

        PlatformBillingClientFeature(int i) {
            this.index = i;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformBillingConfigResponse {
        @NonNull
        private PlatformBillingResult billingResult;
        @NonNull
        private String countryCode;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private PlatformBillingResult billingResult;
            private String countryCode;

            @NonNull
            public PlatformBillingConfigResponse build() {
                PlatformBillingConfigResponse platformBillingConfigResponse = new PlatformBillingConfigResponse();
                platformBillingConfigResponse.setBillingResult(this.billingResult);
                platformBillingConfigResponse.setCountryCode(this.countryCode);
                return platformBillingConfigResponse;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setBillingResult(@NonNull PlatformBillingResult platformBillingResult) {
                this.billingResult = platformBillingResult;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setCountryCode(@NonNull String str) {
                this.countryCode = str;
                return this;
            }
        }

        @NonNull
        public static PlatformBillingConfigResponse fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformBillingConfigResponse platformBillingConfigResponse = new PlatformBillingConfigResponse();
            platformBillingConfigResponse.setBillingResult((PlatformBillingResult) arrayList.get(0));
            platformBillingConfigResponse.setCountryCode((String) arrayList.get(1));
            return platformBillingConfigResponse;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformBillingConfigResponse.class != obj.getClass()) {
                return false;
            }
            PlatformBillingConfigResponse platformBillingConfigResponse = (PlatformBillingConfigResponse) obj;
            if (this.billingResult.equals(platformBillingConfigResponse.billingResult) && this.countryCode.equals(platformBillingConfigResponse.countryCode)) {
                return true;
            }
            return false;
        }

        @NonNull
        public PlatformBillingResult getBillingResult() {
            return this.billingResult;
        }

        @NonNull
        public String getCountryCode() {
            return this.countryCode;
        }

        public int hashCode() {
            return Objects.hash(this.billingResult, this.countryCode);
        }

        public void setBillingResult(@NonNull PlatformBillingResult platformBillingResult) {
            if (platformBillingResult != null) {
                this.billingResult = platformBillingResult;
                return;
            }
            throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
        }

        public void setCountryCode(@NonNull String str) {
            if (str != null) {
                this.countryCode = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"countryCode\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.billingResult);
            arrayList.add(this.countryCode);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformBillingFlowParams {
        private String accountId;
        private String obfuscatedProfileId;
        private String offerToken;
        private String oldProduct;
        @NonNull
        private String product;
        private String purchaseToken;
        @NonNull
        private PlatformReplacementMode replacementMode;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String accountId;
            private String obfuscatedProfileId;
            private String offerToken;
            private String oldProduct;
            private String product;
            private String purchaseToken;
            private PlatformReplacementMode replacementMode;

            @NonNull
            public PlatformBillingFlowParams build() {
                PlatformBillingFlowParams platformBillingFlowParams = new PlatformBillingFlowParams();
                platformBillingFlowParams.setProduct(this.product);
                platformBillingFlowParams.setReplacementMode(this.replacementMode);
                platformBillingFlowParams.setOfferToken(this.offerToken);
                platformBillingFlowParams.setAccountId(this.accountId);
                platformBillingFlowParams.setObfuscatedProfileId(this.obfuscatedProfileId);
                platformBillingFlowParams.setOldProduct(this.oldProduct);
                platformBillingFlowParams.setPurchaseToken(this.purchaseToken);
                return platformBillingFlowParams;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAccountId(String str) {
                this.accountId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setObfuscatedProfileId(String str) {
                this.obfuscatedProfileId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setOfferToken(String str) {
                this.offerToken = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setOldProduct(String str) {
                this.oldProduct = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProduct(@NonNull String str) {
                this.product = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPurchaseToken(String str) {
                this.purchaseToken = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setReplacementMode(@NonNull PlatformReplacementMode platformReplacementMode) {
                this.replacementMode = platformReplacementMode;
                return this;
            }
        }

        @NonNull
        public static PlatformBillingFlowParams fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformBillingFlowParams platformBillingFlowParams = new PlatformBillingFlowParams();
            platformBillingFlowParams.setProduct((String) arrayList.get(0));
            platformBillingFlowParams.setReplacementMode((PlatformReplacementMode) arrayList.get(1));
            platformBillingFlowParams.setOfferToken((String) arrayList.get(2));
            platformBillingFlowParams.setAccountId((String) arrayList.get(3));
            platformBillingFlowParams.setObfuscatedProfileId((String) arrayList.get(4));
            platformBillingFlowParams.setOldProduct((String) arrayList.get(5));
            platformBillingFlowParams.setPurchaseToken((String) arrayList.get(6));
            return platformBillingFlowParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformBillingFlowParams.class != obj.getClass()) {
                return false;
            }
            PlatformBillingFlowParams platformBillingFlowParams = (PlatformBillingFlowParams) obj;
            if (this.product.equals(platformBillingFlowParams.product) && this.replacementMode.equals(platformBillingFlowParams.replacementMode) && Objects.equals(this.offerToken, platformBillingFlowParams.offerToken) && Objects.equals(this.accountId, platformBillingFlowParams.accountId) && Objects.equals(this.obfuscatedProfileId, platformBillingFlowParams.obfuscatedProfileId) && Objects.equals(this.oldProduct, platformBillingFlowParams.oldProduct) && Objects.equals(this.purchaseToken, platformBillingFlowParams.purchaseToken)) {
                return true;
            }
            return false;
        }

        public String getAccountId() {
            return this.accountId;
        }

        public String getObfuscatedProfileId() {
            return this.obfuscatedProfileId;
        }

        public String getOfferToken() {
            return this.offerToken;
        }

        public String getOldProduct() {
            return this.oldProduct;
        }

        @NonNull
        public String getProduct() {
            return this.product;
        }

        public String getPurchaseToken() {
            return this.purchaseToken;
        }

        @NonNull
        public PlatformReplacementMode getReplacementMode() {
            return this.replacementMode;
        }

        public int hashCode() {
            return Objects.hash(this.product, this.replacementMode, this.offerToken, this.accountId, this.obfuscatedProfileId, this.oldProduct, this.purchaseToken);
        }

        public void setAccountId(String str) {
            this.accountId = str;
        }

        public void setObfuscatedProfileId(String str) {
            this.obfuscatedProfileId = str;
        }

        public void setOfferToken(String str) {
            this.offerToken = str;
        }

        public void setOldProduct(String str) {
            this.oldProduct = str;
        }

        public void setProduct(@NonNull String str) {
            if (str != null) {
                this.product = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"product\" is null.");
        }

        public void setPurchaseToken(String str) {
            this.purchaseToken = str;
        }

        public void setReplacementMode(@NonNull PlatformReplacementMode platformReplacementMode) {
            if (platformReplacementMode != null) {
                this.replacementMode = platformReplacementMode;
                return;
            }
            throw new IllegalStateException("Nonnull field \"replacementMode\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(7);
            arrayList.add(this.product);
            arrayList.add(this.replacementMode);
            arrayList.add(this.offerToken);
            arrayList.add(this.accountId);
            arrayList.add(this.obfuscatedProfileId);
            arrayList.add(this.oldProduct);
            arrayList.add(this.purchaseToken);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public enum PlatformBillingResponse {
        SERVICE_TIMEOUT(0),
        FEATURE_NOT_SUPPORTED(1),
        SERVICE_DISCONNECTED(2),
        OK(3),
        USER_CANCELED(4),
        SERVICE_UNAVAILABLE(5),
        BILLING_UNAVAILABLE(6),
        ITEM_UNAVAILABLE(7),
        DEVELOPER_ERROR(8),
        ERROR(9),
        ITEM_ALREADY_OWNED(10),
        ITEM_NOT_OWNED(11),
        NETWORK_ERROR(12);
        
        final int index;

        PlatformBillingResponse(int i) {
            this.index = i;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformBillingResult {
        @NonNull
        private String debugMessage;
        @NonNull
        private PlatformBillingResponse responseCode;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String debugMessage;
            private PlatformBillingResponse responseCode;

            @NonNull
            public PlatformBillingResult build() {
                PlatformBillingResult platformBillingResult = new PlatformBillingResult();
                platformBillingResult.setResponseCode(this.responseCode);
                platformBillingResult.setDebugMessage(this.debugMessage);
                return platformBillingResult;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setDebugMessage(@NonNull String str) {
                this.debugMessage = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setResponseCode(@NonNull PlatformBillingResponse platformBillingResponse) {
                this.responseCode = platformBillingResponse;
                return this;
            }
        }

        @NonNull
        public static PlatformBillingResult fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformBillingResult platformBillingResult = new PlatformBillingResult();
            platformBillingResult.setResponseCode((PlatformBillingResponse) arrayList.get(0));
            platformBillingResult.setDebugMessage((String) arrayList.get(1));
            return platformBillingResult;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformBillingResult.class != obj.getClass()) {
                return false;
            }
            PlatformBillingResult platformBillingResult = (PlatformBillingResult) obj;
            if (this.responseCode.equals(platformBillingResult.responseCode) && this.debugMessage.equals(platformBillingResult.debugMessage)) {
                return true;
            }
            return false;
        }

        @NonNull
        public String getDebugMessage() {
            return this.debugMessage;
        }

        @NonNull
        public PlatformBillingResponse getResponseCode() {
            return this.responseCode;
        }

        public int hashCode() {
            return Objects.hash(this.responseCode, this.debugMessage);
        }

        public void setDebugMessage(@NonNull String str) {
            if (str != null) {
                this.debugMessage = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"debugMessage\" is null.");
        }

        public void setResponseCode(@NonNull PlatformBillingResponse platformBillingResponse) {
            if (platformBillingResponse != null) {
                this.responseCode = platformBillingResponse;
                return;
            }
            throw new IllegalStateException("Nonnull field \"responseCode\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.responseCode);
            arrayList.add(this.debugMessage);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformInstallmentPlanDetails {
        @NonNull
        private Long commitmentPaymentsCount;
        @NonNull
        private Long subsequentCommitmentPaymentsCount;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Long commitmentPaymentsCount;
            private Long subsequentCommitmentPaymentsCount;

            @NonNull
            public PlatformInstallmentPlanDetails build() {
                PlatformInstallmentPlanDetails platformInstallmentPlanDetails = new PlatformInstallmentPlanDetails();
                platformInstallmentPlanDetails.setCommitmentPaymentsCount(this.commitmentPaymentsCount);
                platformInstallmentPlanDetails.setSubsequentCommitmentPaymentsCount(this.subsequentCommitmentPaymentsCount);
                return platformInstallmentPlanDetails;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setCommitmentPaymentsCount(@NonNull Long l) {
                this.commitmentPaymentsCount = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSubsequentCommitmentPaymentsCount(@NonNull Long l) {
                this.subsequentCommitmentPaymentsCount = l;
                return this;
            }
        }

        @NonNull
        public static PlatformInstallmentPlanDetails fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformInstallmentPlanDetails platformInstallmentPlanDetails = new PlatformInstallmentPlanDetails();
            platformInstallmentPlanDetails.setCommitmentPaymentsCount((Long) arrayList.get(0));
            platformInstallmentPlanDetails.setSubsequentCommitmentPaymentsCount((Long) arrayList.get(1));
            return platformInstallmentPlanDetails;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformInstallmentPlanDetails.class != obj.getClass()) {
                return false;
            }
            PlatformInstallmentPlanDetails platformInstallmentPlanDetails = (PlatformInstallmentPlanDetails) obj;
            if (this.commitmentPaymentsCount.equals(platformInstallmentPlanDetails.commitmentPaymentsCount) && this.subsequentCommitmentPaymentsCount.equals(platformInstallmentPlanDetails.subsequentCommitmentPaymentsCount)) {
                return true;
            }
            return false;
        }

        @NonNull
        public Long getCommitmentPaymentsCount() {
            return this.commitmentPaymentsCount;
        }

        @NonNull
        public Long getSubsequentCommitmentPaymentsCount() {
            return this.subsequentCommitmentPaymentsCount;
        }

        public int hashCode() {
            return Objects.hash(this.commitmentPaymentsCount, this.subsequentCommitmentPaymentsCount);
        }

        public void setCommitmentPaymentsCount(@NonNull Long l) {
            if (l != null) {
                this.commitmentPaymentsCount = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"commitmentPaymentsCount\" is null.");
        }

        public void setSubsequentCommitmentPaymentsCount(@NonNull Long l) {
            if (l != null) {
                this.subsequentCommitmentPaymentsCount = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"subsequentCommitmentPaymentsCount\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.commitmentPaymentsCount);
            arrayList.add(this.subsequentCommitmentPaymentsCount);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformOneTimePurchaseOfferDetails {
        @NonNull
        private String formattedPrice;
        @NonNull
        private Long priceAmountMicros;
        @NonNull
        private String priceCurrencyCode;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String formattedPrice;
            private Long priceAmountMicros;
            private String priceCurrencyCode;

            @NonNull
            public PlatformOneTimePurchaseOfferDetails build() {
                PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails = new PlatformOneTimePurchaseOfferDetails();
                platformOneTimePurchaseOfferDetails.setPriceAmountMicros(this.priceAmountMicros);
                platformOneTimePurchaseOfferDetails.setFormattedPrice(this.formattedPrice);
                platformOneTimePurchaseOfferDetails.setPriceCurrencyCode(this.priceCurrencyCode);
                return platformOneTimePurchaseOfferDetails;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setFormattedPrice(@NonNull String str) {
                this.formattedPrice = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPriceAmountMicros(@NonNull Long l) {
                this.priceAmountMicros = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPriceCurrencyCode(@NonNull String str) {
                this.priceCurrencyCode = str;
                return this;
            }
        }

        @NonNull
        public static PlatformOneTimePurchaseOfferDetails fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails = new PlatformOneTimePurchaseOfferDetails();
            platformOneTimePurchaseOfferDetails.setPriceAmountMicros((Long) arrayList.get(0));
            platformOneTimePurchaseOfferDetails.setFormattedPrice((String) arrayList.get(1));
            platformOneTimePurchaseOfferDetails.setPriceCurrencyCode((String) arrayList.get(2));
            return platformOneTimePurchaseOfferDetails;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformOneTimePurchaseOfferDetails.class != obj.getClass()) {
                return false;
            }
            PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails = (PlatformOneTimePurchaseOfferDetails) obj;
            if (this.priceAmountMicros.equals(platformOneTimePurchaseOfferDetails.priceAmountMicros) && this.formattedPrice.equals(platformOneTimePurchaseOfferDetails.formattedPrice) && this.priceCurrencyCode.equals(platformOneTimePurchaseOfferDetails.priceCurrencyCode)) {
                return true;
            }
            return false;
        }

        @NonNull
        public String getFormattedPrice() {
            return this.formattedPrice;
        }

        @NonNull
        public Long getPriceAmountMicros() {
            return this.priceAmountMicros;
        }

        @NonNull
        public String getPriceCurrencyCode() {
            return this.priceCurrencyCode;
        }

        public int hashCode() {
            return Objects.hash(this.priceAmountMicros, this.formattedPrice, this.priceCurrencyCode);
        }

        public void setFormattedPrice(@NonNull String str) {
            if (str != null) {
                this.formattedPrice = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"formattedPrice\" is null.");
        }

        public void setPriceAmountMicros(@NonNull Long l) {
            if (l != null) {
                this.priceAmountMicros = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"priceAmountMicros\" is null.");
        }

        public void setPriceCurrencyCode(@NonNull String str) {
            if (str != null) {
                this.priceCurrencyCode = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"priceCurrencyCode\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.priceAmountMicros);
            arrayList.add(this.formattedPrice);
            arrayList.add(this.priceCurrencyCode);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformPendingPurchaseUpdate {
        @NonNull
        private List<String> products;
        @NonNull
        private String purchaseToken;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private List<String> products;
            private String purchaseToken;

            @NonNull
            public PlatformPendingPurchaseUpdate build() {
                PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate = new PlatformPendingPurchaseUpdate();
                platformPendingPurchaseUpdate.setProducts(this.products);
                platformPendingPurchaseUpdate.setPurchaseToken(this.purchaseToken);
                return platformPendingPurchaseUpdate;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProducts(@NonNull List<String> list) {
                this.products = list;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPurchaseToken(@NonNull String str) {
                this.purchaseToken = str;
                return this;
            }
        }

        @NonNull
        public static PlatformPendingPurchaseUpdate fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate = new PlatformPendingPurchaseUpdate();
            platformPendingPurchaseUpdate.setProducts((List) arrayList.get(0));
            platformPendingPurchaseUpdate.setPurchaseToken((String) arrayList.get(1));
            return platformPendingPurchaseUpdate;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformPendingPurchaseUpdate.class != obj.getClass()) {
                return false;
            }
            PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate = (PlatformPendingPurchaseUpdate) obj;
            if (this.products.equals(platformPendingPurchaseUpdate.products) && this.purchaseToken.equals(platformPendingPurchaseUpdate.purchaseToken)) {
                return true;
            }
            return false;
        }

        @NonNull
        public List<String> getProducts() {
            return this.products;
        }

        @NonNull
        public String getPurchaseToken() {
            return this.purchaseToken;
        }

        public int hashCode() {
            return Objects.hash(this.products, this.purchaseToken);
        }

        public void setProducts(@NonNull List<String> list) {
            if (list != null) {
                this.products = list;
                return;
            }
            throw new IllegalStateException("Nonnull field \"products\" is null.");
        }

        public void setPurchaseToken(@NonNull String str) {
            if (str != null) {
                this.purchaseToken = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.products);
            arrayList.add(this.purchaseToken);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformPendingPurchasesParams {
        @NonNull
        private Boolean enablePrepaidPlans;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Boolean enablePrepaidPlans;

            @NonNull
            public PlatformPendingPurchasesParams build() {
                PlatformPendingPurchasesParams platformPendingPurchasesParams = new PlatformPendingPurchasesParams();
                platformPendingPurchasesParams.setEnablePrepaidPlans(this.enablePrepaidPlans);
                return platformPendingPurchasesParams;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setEnablePrepaidPlans(@NonNull Boolean bool) {
                this.enablePrepaidPlans = bool;
                return this;
            }
        }

        @NonNull
        public static PlatformPendingPurchasesParams fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformPendingPurchasesParams platformPendingPurchasesParams = new PlatformPendingPurchasesParams();
            platformPendingPurchasesParams.setEnablePrepaidPlans((Boolean) arrayList.get(0));
            return platformPendingPurchasesParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformPendingPurchasesParams.class == obj.getClass()) {
                return this.enablePrepaidPlans.equals(((PlatformPendingPurchasesParams) obj).enablePrepaidPlans);
            }
            return false;
        }

        @NonNull
        public Boolean getEnablePrepaidPlans() {
            return this.enablePrepaidPlans;
        }

        public int hashCode() {
            return Objects.hash(this.enablePrepaidPlans);
        }

        public void setEnablePrepaidPlans(@NonNull Boolean bool) {
            if (bool != null) {
                this.enablePrepaidPlans = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enablePrepaidPlans\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.enablePrepaidPlans);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformPricingPhase {
        @NonNull
        private Long billingCycleCount;
        @NonNull
        private String billingPeriod;
        @NonNull
        private String formattedPrice;
        @NonNull
        private Long priceAmountMicros;
        @NonNull
        private String priceCurrencyCode;
        @NonNull
        private PlatformRecurrenceMode recurrenceMode;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Long billingCycleCount;
            private String billingPeriod;
            private String formattedPrice;
            private Long priceAmountMicros;
            private String priceCurrencyCode;
            private PlatformRecurrenceMode recurrenceMode;

            @NonNull
            public PlatformPricingPhase build() {
                PlatformPricingPhase platformPricingPhase = new PlatformPricingPhase();
                platformPricingPhase.setBillingCycleCount(this.billingCycleCount);
                platformPricingPhase.setRecurrenceMode(this.recurrenceMode);
                platformPricingPhase.setPriceAmountMicros(this.priceAmountMicros);
                platformPricingPhase.setBillingPeriod(this.billingPeriod);
                platformPricingPhase.setFormattedPrice(this.formattedPrice);
                platformPricingPhase.setPriceCurrencyCode(this.priceCurrencyCode);
                return platformPricingPhase;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setBillingCycleCount(@NonNull Long l) {
                this.billingCycleCount = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setBillingPeriod(@NonNull String str) {
                this.billingPeriod = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setFormattedPrice(@NonNull String str) {
                this.formattedPrice = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPriceAmountMicros(@NonNull Long l) {
                this.priceAmountMicros = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPriceCurrencyCode(@NonNull String str) {
                this.priceCurrencyCode = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setRecurrenceMode(@NonNull PlatformRecurrenceMode platformRecurrenceMode) {
                this.recurrenceMode = platformRecurrenceMode;
                return this;
            }
        }

        @NonNull
        public static PlatformPricingPhase fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformPricingPhase platformPricingPhase = new PlatformPricingPhase();
            platformPricingPhase.setBillingCycleCount((Long) arrayList.get(0));
            platformPricingPhase.setRecurrenceMode((PlatformRecurrenceMode) arrayList.get(1));
            platformPricingPhase.setPriceAmountMicros((Long) arrayList.get(2));
            platformPricingPhase.setBillingPeriod((String) arrayList.get(3));
            platformPricingPhase.setFormattedPrice((String) arrayList.get(4));
            platformPricingPhase.setPriceCurrencyCode((String) arrayList.get(5));
            return platformPricingPhase;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformPricingPhase.class != obj.getClass()) {
                return false;
            }
            PlatformPricingPhase platformPricingPhase = (PlatformPricingPhase) obj;
            if (this.billingCycleCount.equals(platformPricingPhase.billingCycleCount) && this.recurrenceMode.equals(platformPricingPhase.recurrenceMode) && this.priceAmountMicros.equals(platformPricingPhase.priceAmountMicros) && this.billingPeriod.equals(platformPricingPhase.billingPeriod) && this.formattedPrice.equals(platformPricingPhase.formattedPrice) && this.priceCurrencyCode.equals(platformPricingPhase.priceCurrencyCode)) {
                return true;
            }
            return false;
        }

        @NonNull
        public Long getBillingCycleCount() {
            return this.billingCycleCount;
        }

        @NonNull
        public String getBillingPeriod() {
            return this.billingPeriod;
        }

        @NonNull
        public String getFormattedPrice() {
            return this.formattedPrice;
        }

        @NonNull
        public Long getPriceAmountMicros() {
            return this.priceAmountMicros;
        }

        @NonNull
        public String getPriceCurrencyCode() {
            return this.priceCurrencyCode;
        }

        @NonNull
        public PlatformRecurrenceMode getRecurrenceMode() {
            return this.recurrenceMode;
        }

        public int hashCode() {
            return Objects.hash(this.billingCycleCount, this.recurrenceMode, this.priceAmountMicros, this.billingPeriod, this.formattedPrice, this.priceCurrencyCode);
        }

        public void setBillingCycleCount(@NonNull Long l) {
            if (l != null) {
                this.billingCycleCount = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"billingCycleCount\" is null.");
        }

        public void setBillingPeriod(@NonNull String str) {
            if (str != null) {
                this.billingPeriod = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"billingPeriod\" is null.");
        }

        public void setFormattedPrice(@NonNull String str) {
            if (str != null) {
                this.formattedPrice = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"formattedPrice\" is null.");
        }

        public void setPriceAmountMicros(@NonNull Long l) {
            if (l != null) {
                this.priceAmountMicros = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"priceAmountMicros\" is null.");
        }

        public void setPriceCurrencyCode(@NonNull String str) {
            if (str != null) {
                this.priceCurrencyCode = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"priceCurrencyCode\" is null.");
        }

        public void setRecurrenceMode(@NonNull PlatformRecurrenceMode platformRecurrenceMode) {
            if (platformRecurrenceMode != null) {
                this.recurrenceMode = platformRecurrenceMode;
                return;
            }
            throw new IllegalStateException("Nonnull field \"recurrenceMode\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.billingCycleCount);
            arrayList.add(this.recurrenceMode);
            arrayList.add(this.priceAmountMicros);
            arrayList.add(this.billingPeriod);
            arrayList.add(this.formattedPrice);
            arrayList.add(this.priceCurrencyCode);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformProductDetails {
        @NonNull
        private String description;
        @NonNull
        private String name;
        private PlatformOneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        @NonNull
        private String productId;
        @NonNull
        private PlatformProductType productType;
        private List<PlatformSubscriptionOfferDetails> subscriptionOfferDetails;
        @NonNull
        private String title;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String description;
            private String name;
            private PlatformOneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
            private String productId;
            private PlatformProductType productType;
            private List<PlatformSubscriptionOfferDetails> subscriptionOfferDetails;
            private String title;

            @NonNull
            public PlatformProductDetails build() {
                PlatformProductDetails platformProductDetails = new PlatformProductDetails();
                platformProductDetails.setDescription(this.description);
                platformProductDetails.setName(this.name);
                platformProductDetails.setProductId(this.productId);
                platformProductDetails.setProductType(this.productType);
                platformProductDetails.setTitle(this.title);
                platformProductDetails.setOneTimePurchaseOfferDetails(this.oneTimePurchaseOfferDetails);
                platformProductDetails.setSubscriptionOfferDetails(this.subscriptionOfferDetails);
                return platformProductDetails;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setDescription(@NonNull String str) {
                this.description = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setName(@NonNull String str) {
                this.name = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setOneTimePurchaseOfferDetails(PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails) {
                this.oneTimePurchaseOfferDetails = platformOneTimePurchaseOfferDetails;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProductId(@NonNull String str) {
                this.productId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProductType(@NonNull PlatformProductType platformProductType) {
                this.productType = platformProductType;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSubscriptionOfferDetails(List<PlatformSubscriptionOfferDetails> list) {
                this.subscriptionOfferDetails = list;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setTitle(@NonNull String str) {
                this.title = str;
                return this;
            }
        }

        @NonNull
        public static PlatformProductDetails fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformProductDetails platformProductDetails = new PlatformProductDetails();
            platformProductDetails.setDescription((String) arrayList.get(0));
            platformProductDetails.setName((String) arrayList.get(1));
            platformProductDetails.setProductId((String) arrayList.get(2));
            platformProductDetails.setProductType((PlatformProductType) arrayList.get(3));
            platformProductDetails.setTitle((String) arrayList.get(4));
            platformProductDetails.setOneTimePurchaseOfferDetails((PlatformOneTimePurchaseOfferDetails) arrayList.get(5));
            platformProductDetails.setSubscriptionOfferDetails((List) arrayList.get(6));
            return platformProductDetails;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformProductDetails.class != obj.getClass()) {
                return false;
            }
            PlatformProductDetails platformProductDetails = (PlatformProductDetails) obj;
            if (this.description.equals(platformProductDetails.description) && this.name.equals(platformProductDetails.name) && this.productId.equals(platformProductDetails.productId) && this.productType.equals(platformProductDetails.productType) && this.title.equals(platformProductDetails.title) && Objects.equals(this.oneTimePurchaseOfferDetails, platformProductDetails.oneTimePurchaseOfferDetails) && Objects.equals(this.subscriptionOfferDetails, platformProductDetails.subscriptionOfferDetails)) {
                return true;
            }
            return false;
        }

        @NonNull
        public String getDescription() {
            return this.description;
        }

        @NonNull
        public String getName() {
            return this.name;
        }

        public PlatformOneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
            return this.oneTimePurchaseOfferDetails;
        }

        @NonNull
        public String getProductId() {
            return this.productId;
        }

        @NonNull
        public PlatformProductType getProductType() {
            return this.productType;
        }

        public List<PlatformSubscriptionOfferDetails> getSubscriptionOfferDetails() {
            return this.subscriptionOfferDetails;
        }

        @NonNull
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Objects.hash(this.description, this.name, this.productId, this.productType, this.title, this.oneTimePurchaseOfferDetails, this.subscriptionOfferDetails);
        }

        public void setDescription(@NonNull String str) {
            if (str != null) {
                this.description = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"description\" is null.");
        }

        public void setName(@NonNull String str) {
            if (str != null) {
                this.name = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }

        public void setOneTimePurchaseOfferDetails(PlatformOneTimePurchaseOfferDetails platformOneTimePurchaseOfferDetails) {
            this.oneTimePurchaseOfferDetails = platformOneTimePurchaseOfferDetails;
        }

        public void setProductId(@NonNull String str) {
            if (str != null) {
                this.productId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"productId\" is null.");
        }

        public void setProductType(@NonNull PlatformProductType platformProductType) {
            if (platformProductType != null) {
                this.productType = platformProductType;
                return;
            }
            throw new IllegalStateException("Nonnull field \"productType\" is null.");
        }

        public void setSubscriptionOfferDetails(List<PlatformSubscriptionOfferDetails> list) {
            this.subscriptionOfferDetails = list;
        }

        public void setTitle(@NonNull String str) {
            if (str != null) {
                this.title = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"title\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(7);
            arrayList.add(this.description);
            arrayList.add(this.name);
            arrayList.add(this.productId);
            arrayList.add(this.productType);
            arrayList.add(this.title);
            arrayList.add(this.oneTimePurchaseOfferDetails);
            arrayList.add(this.subscriptionOfferDetails);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformProductDetailsResponse {
        @NonNull
        private PlatformBillingResult billingResult;
        @NonNull
        private List<PlatformProductDetails> productDetails;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private PlatformBillingResult billingResult;
            private List<PlatformProductDetails> productDetails;

            @NonNull
            public PlatformProductDetailsResponse build() {
                PlatformProductDetailsResponse platformProductDetailsResponse = new PlatformProductDetailsResponse();
                platformProductDetailsResponse.setBillingResult(this.billingResult);
                platformProductDetailsResponse.setProductDetails(this.productDetails);
                return platformProductDetailsResponse;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setBillingResult(@NonNull PlatformBillingResult platformBillingResult) {
                this.billingResult = platformBillingResult;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProductDetails(@NonNull List<PlatformProductDetails> list) {
                this.productDetails = list;
                return this;
            }
        }

        @NonNull
        public static PlatformProductDetailsResponse fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformProductDetailsResponse platformProductDetailsResponse = new PlatformProductDetailsResponse();
            platformProductDetailsResponse.setBillingResult((PlatformBillingResult) arrayList.get(0));
            platformProductDetailsResponse.setProductDetails((List) arrayList.get(1));
            return platformProductDetailsResponse;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformProductDetailsResponse.class != obj.getClass()) {
                return false;
            }
            PlatformProductDetailsResponse platformProductDetailsResponse = (PlatformProductDetailsResponse) obj;
            if (this.billingResult.equals(platformProductDetailsResponse.billingResult) && this.productDetails.equals(platformProductDetailsResponse.productDetails)) {
                return true;
            }
            return false;
        }

        @NonNull
        public PlatformBillingResult getBillingResult() {
            return this.billingResult;
        }

        @NonNull
        public List<PlatformProductDetails> getProductDetails() {
            return this.productDetails;
        }

        public int hashCode() {
            return Objects.hash(this.billingResult, this.productDetails);
        }

        public void setBillingResult(@NonNull PlatformBillingResult platformBillingResult) {
            if (platformBillingResult != null) {
                this.billingResult = platformBillingResult;
                return;
            }
            throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
        }

        public void setProductDetails(@NonNull List<PlatformProductDetails> list) {
            if (list != null) {
                this.productDetails = list;
                return;
            }
            throw new IllegalStateException("Nonnull field \"productDetails\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.billingResult);
            arrayList.add(this.productDetails);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public enum PlatformProductType {
        INAPP(0),
        SUBS(1);
        
        final int index;

        PlatformProductType(int i) {
            this.index = i;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformPurchase {
        private PlatformAccountIdentifiers accountIdentifiers;
        @NonNull
        private String developerPayload;
        @NonNull
        private Boolean isAcknowledged;
        @NonNull
        private Boolean isAutoRenewing;
        private String orderId;
        @NonNull
        private String originalJson;
        @NonNull
        private String packageName;
        private PlatformPendingPurchaseUpdate pendingPurchaseUpdate;
        @NonNull
        private List<String> products;
        @NonNull
        private PlatformPurchaseState purchaseState;
        @NonNull
        private Long purchaseTime;
        @NonNull
        private String purchaseToken;
        @NonNull
        private Long quantity;
        @NonNull
        private String signature;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private PlatformAccountIdentifiers accountIdentifiers;
            private String developerPayload;
            private Boolean isAcknowledged;
            private Boolean isAutoRenewing;
            private String orderId;
            private String originalJson;
            private String packageName;
            private PlatformPendingPurchaseUpdate pendingPurchaseUpdate;
            private List<String> products;
            private PlatformPurchaseState purchaseState;
            private Long purchaseTime;
            private String purchaseToken;
            private Long quantity;
            private String signature;

            @NonNull
            public PlatformPurchase build() {
                PlatformPurchase platformPurchase = new PlatformPurchase();
                platformPurchase.setOrderId(this.orderId);
                platformPurchase.setPackageName(this.packageName);
                platformPurchase.setPurchaseTime(this.purchaseTime);
                platformPurchase.setPurchaseToken(this.purchaseToken);
                platformPurchase.setSignature(this.signature);
                platformPurchase.setProducts(this.products);
                platformPurchase.setIsAutoRenewing(this.isAutoRenewing);
                platformPurchase.setOriginalJson(this.originalJson);
                platformPurchase.setDeveloperPayload(this.developerPayload);
                platformPurchase.setIsAcknowledged(this.isAcknowledged);
                platformPurchase.setQuantity(this.quantity);
                platformPurchase.setPurchaseState(this.purchaseState);
                platformPurchase.setAccountIdentifiers(this.accountIdentifiers);
                platformPurchase.setPendingPurchaseUpdate(this.pendingPurchaseUpdate);
                return platformPurchase;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAccountIdentifiers(PlatformAccountIdentifiers platformAccountIdentifiers) {
                this.accountIdentifiers = platformAccountIdentifiers;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setDeveloperPayload(@NonNull String str) {
                this.developerPayload = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setIsAcknowledged(@NonNull Boolean bool) {
                this.isAcknowledged = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setIsAutoRenewing(@NonNull Boolean bool) {
                this.isAutoRenewing = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setOrderId(String str) {
                this.orderId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setOriginalJson(@NonNull String str) {
                this.originalJson = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPackageName(@NonNull String str) {
                this.packageName = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPendingPurchaseUpdate(PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate) {
                this.pendingPurchaseUpdate = platformPendingPurchaseUpdate;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProducts(@NonNull List<String> list) {
                this.products = list;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPurchaseState(@NonNull PlatformPurchaseState platformPurchaseState) {
                this.purchaseState = platformPurchaseState;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPurchaseTime(@NonNull Long l) {
                this.purchaseTime = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPurchaseToken(@NonNull String str) {
                this.purchaseToken = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setQuantity(@NonNull Long l) {
                this.quantity = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSignature(@NonNull String str) {
                this.signature = str;
                return this;
            }
        }

        @NonNull
        public static PlatformPurchase fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformPurchase platformPurchase = new PlatformPurchase();
            platformPurchase.setOrderId((String) arrayList.get(0));
            platformPurchase.setPackageName((String) arrayList.get(1));
            platformPurchase.setPurchaseTime((Long) arrayList.get(2));
            platformPurchase.setPurchaseToken((String) arrayList.get(3));
            platformPurchase.setSignature((String) arrayList.get(4));
            platformPurchase.setProducts((List) arrayList.get(5));
            platformPurchase.setIsAutoRenewing((Boolean) arrayList.get(6));
            platformPurchase.setOriginalJson((String) arrayList.get(7));
            platformPurchase.setDeveloperPayload((String) arrayList.get(8));
            platformPurchase.setIsAcknowledged((Boolean) arrayList.get(9));
            platformPurchase.setQuantity((Long) arrayList.get(10));
            platformPurchase.setPurchaseState((PlatformPurchaseState) arrayList.get(11));
            platformPurchase.setAccountIdentifiers((PlatformAccountIdentifiers) arrayList.get(12));
            platformPurchase.setPendingPurchaseUpdate((PlatformPendingPurchaseUpdate) arrayList.get(13));
            return platformPurchase;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformPurchase.class != obj.getClass()) {
                return false;
            }
            PlatformPurchase platformPurchase = (PlatformPurchase) obj;
            if (Objects.equals(this.orderId, platformPurchase.orderId) && this.packageName.equals(platformPurchase.packageName) && this.purchaseTime.equals(platformPurchase.purchaseTime) && this.purchaseToken.equals(platformPurchase.purchaseToken) && this.signature.equals(platformPurchase.signature) && this.products.equals(platformPurchase.products) && this.isAutoRenewing.equals(platformPurchase.isAutoRenewing) && this.originalJson.equals(platformPurchase.originalJson) && this.developerPayload.equals(platformPurchase.developerPayload) && this.isAcknowledged.equals(platformPurchase.isAcknowledged) && this.quantity.equals(platformPurchase.quantity) && this.purchaseState.equals(platformPurchase.purchaseState) && Objects.equals(this.accountIdentifiers, platformPurchase.accountIdentifiers) && Objects.equals(this.pendingPurchaseUpdate, platformPurchase.pendingPurchaseUpdate)) {
                return true;
            }
            return false;
        }

        public PlatformAccountIdentifiers getAccountIdentifiers() {
            return this.accountIdentifiers;
        }

        @NonNull
        public String getDeveloperPayload() {
            return this.developerPayload;
        }

        @NonNull
        public Boolean getIsAcknowledged() {
            return this.isAcknowledged;
        }

        @NonNull
        public Boolean getIsAutoRenewing() {
            return this.isAutoRenewing;
        }

        public String getOrderId() {
            return this.orderId;
        }

        @NonNull
        public String getOriginalJson() {
            return this.originalJson;
        }

        @NonNull
        public String getPackageName() {
            return this.packageName;
        }

        public PlatformPendingPurchaseUpdate getPendingPurchaseUpdate() {
            return this.pendingPurchaseUpdate;
        }

        @NonNull
        public List<String> getProducts() {
            return this.products;
        }

        @NonNull
        public PlatformPurchaseState getPurchaseState() {
            return this.purchaseState;
        }

        @NonNull
        public Long getPurchaseTime() {
            return this.purchaseTime;
        }

        @NonNull
        public String getPurchaseToken() {
            return this.purchaseToken;
        }

        @NonNull
        public Long getQuantity() {
            return this.quantity;
        }

        @NonNull
        public String getSignature() {
            return this.signature;
        }

        public int hashCode() {
            return Objects.hash(this.orderId, this.packageName, this.purchaseTime, this.purchaseToken, this.signature, this.products, this.isAutoRenewing, this.originalJson, this.developerPayload, this.isAcknowledged, this.quantity, this.purchaseState, this.accountIdentifiers, this.pendingPurchaseUpdate);
        }

        public void setAccountIdentifiers(PlatformAccountIdentifiers platformAccountIdentifiers) {
            this.accountIdentifiers = platformAccountIdentifiers;
        }

        public void setDeveloperPayload(@NonNull String str) {
            if (str != null) {
                this.developerPayload = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"developerPayload\" is null.");
        }

        public void setIsAcknowledged(@NonNull Boolean bool) {
            if (bool != null) {
                this.isAcknowledged = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"isAcknowledged\" is null.");
        }

        public void setIsAutoRenewing(@NonNull Boolean bool) {
            if (bool != null) {
                this.isAutoRenewing = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"isAutoRenewing\" is null.");
        }

        public void setOrderId(String str) {
            this.orderId = str;
        }

        public void setOriginalJson(@NonNull String str) {
            if (str != null) {
                this.originalJson = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"originalJson\" is null.");
        }

        public void setPackageName(@NonNull String str) {
            if (str != null) {
                this.packageName = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"packageName\" is null.");
        }

        public void setPendingPurchaseUpdate(PlatformPendingPurchaseUpdate platformPendingPurchaseUpdate) {
            this.pendingPurchaseUpdate = platformPendingPurchaseUpdate;
        }

        public void setProducts(@NonNull List<String> list) {
            if (list != null) {
                this.products = list;
                return;
            }
            throw new IllegalStateException("Nonnull field \"products\" is null.");
        }

        public void setPurchaseState(@NonNull PlatformPurchaseState platformPurchaseState) {
            if (platformPurchaseState != null) {
                this.purchaseState = platformPurchaseState;
                return;
            }
            throw new IllegalStateException("Nonnull field \"purchaseState\" is null.");
        }

        public void setPurchaseTime(@NonNull Long l) {
            if (l != null) {
                this.purchaseTime = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"purchaseTime\" is null.");
        }

        public void setPurchaseToken(@NonNull String str) {
            if (str != null) {
                this.purchaseToken = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
        }

        public void setQuantity(@NonNull Long l) {
            if (l != null) {
                this.quantity = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"quantity\" is null.");
        }

        public void setSignature(@NonNull String str) {
            if (str != null) {
                this.signature = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"signature\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(14);
            arrayList.add(this.orderId);
            arrayList.add(this.packageName);
            arrayList.add(this.purchaseTime);
            arrayList.add(this.purchaseToken);
            arrayList.add(this.signature);
            arrayList.add(this.products);
            arrayList.add(this.isAutoRenewing);
            arrayList.add(this.originalJson);
            arrayList.add(this.developerPayload);
            arrayList.add(this.isAcknowledged);
            arrayList.add(this.quantity);
            arrayList.add(this.purchaseState);
            arrayList.add(this.accountIdentifiers);
            arrayList.add(this.pendingPurchaseUpdate);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformPurchaseHistoryRecord {
        private String developerPayload;
        @NonNull
        private String originalJson;
        @NonNull
        private List<String> products;
        @NonNull
        private Long purchaseTime;
        @NonNull
        private String purchaseToken;
        @NonNull
        private Long quantity;
        @NonNull
        private String signature;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String developerPayload;
            private String originalJson;
            private List<String> products;
            private Long purchaseTime;
            private String purchaseToken;
            private Long quantity;
            private String signature;

            @NonNull
            public PlatformPurchaseHistoryRecord build() {
                PlatformPurchaseHistoryRecord platformPurchaseHistoryRecord = new PlatformPurchaseHistoryRecord();
                platformPurchaseHistoryRecord.setQuantity(this.quantity);
                platformPurchaseHistoryRecord.setPurchaseTime(this.purchaseTime);
                platformPurchaseHistoryRecord.setDeveloperPayload(this.developerPayload);
                platformPurchaseHistoryRecord.setOriginalJson(this.originalJson);
                platformPurchaseHistoryRecord.setPurchaseToken(this.purchaseToken);
                platformPurchaseHistoryRecord.setSignature(this.signature);
                platformPurchaseHistoryRecord.setProducts(this.products);
                return platformPurchaseHistoryRecord;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setDeveloperPayload(String str) {
                this.developerPayload = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setOriginalJson(@NonNull String str) {
                this.originalJson = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProducts(@NonNull List<String> list) {
                this.products = list;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPurchaseTime(@NonNull Long l) {
                this.purchaseTime = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPurchaseToken(@NonNull String str) {
                this.purchaseToken = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setQuantity(@NonNull Long l) {
                this.quantity = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSignature(@NonNull String str) {
                this.signature = str;
                return this;
            }
        }

        @NonNull
        public static PlatformPurchaseHistoryRecord fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformPurchaseHistoryRecord platformPurchaseHistoryRecord = new PlatformPurchaseHistoryRecord();
            platformPurchaseHistoryRecord.setQuantity((Long) arrayList.get(0));
            platformPurchaseHistoryRecord.setPurchaseTime((Long) arrayList.get(1));
            platformPurchaseHistoryRecord.setDeveloperPayload((String) arrayList.get(2));
            platformPurchaseHistoryRecord.setOriginalJson((String) arrayList.get(3));
            platformPurchaseHistoryRecord.setPurchaseToken((String) arrayList.get(4));
            platformPurchaseHistoryRecord.setSignature((String) arrayList.get(5));
            platformPurchaseHistoryRecord.setProducts((List) arrayList.get(6));
            return platformPurchaseHistoryRecord;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformPurchaseHistoryRecord.class != obj.getClass()) {
                return false;
            }
            PlatformPurchaseHistoryRecord platformPurchaseHistoryRecord = (PlatformPurchaseHistoryRecord) obj;
            if (this.quantity.equals(platformPurchaseHistoryRecord.quantity) && this.purchaseTime.equals(platformPurchaseHistoryRecord.purchaseTime) && Objects.equals(this.developerPayload, platformPurchaseHistoryRecord.developerPayload) && this.originalJson.equals(platformPurchaseHistoryRecord.originalJson) && this.purchaseToken.equals(platformPurchaseHistoryRecord.purchaseToken) && this.signature.equals(platformPurchaseHistoryRecord.signature) && this.products.equals(platformPurchaseHistoryRecord.products)) {
                return true;
            }
            return false;
        }

        public String getDeveloperPayload() {
            return this.developerPayload;
        }

        @NonNull
        public String getOriginalJson() {
            return this.originalJson;
        }

        @NonNull
        public List<String> getProducts() {
            return this.products;
        }

        @NonNull
        public Long getPurchaseTime() {
            return this.purchaseTime;
        }

        @NonNull
        public String getPurchaseToken() {
            return this.purchaseToken;
        }

        @NonNull
        public Long getQuantity() {
            return this.quantity;
        }

        @NonNull
        public String getSignature() {
            return this.signature;
        }

        public int hashCode() {
            return Objects.hash(this.quantity, this.purchaseTime, this.developerPayload, this.originalJson, this.purchaseToken, this.signature, this.products);
        }

        public void setDeveloperPayload(String str) {
            this.developerPayload = str;
        }

        public void setOriginalJson(@NonNull String str) {
            if (str != null) {
                this.originalJson = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"originalJson\" is null.");
        }

        public void setProducts(@NonNull List<String> list) {
            if (list != null) {
                this.products = list;
                return;
            }
            throw new IllegalStateException("Nonnull field \"products\" is null.");
        }

        public void setPurchaseTime(@NonNull Long l) {
            if (l != null) {
                this.purchaseTime = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"purchaseTime\" is null.");
        }

        public void setPurchaseToken(@NonNull String str) {
            if (str != null) {
                this.purchaseToken = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
        }

        public void setQuantity(@NonNull Long l) {
            if (l != null) {
                this.quantity = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"quantity\" is null.");
        }

        public void setSignature(@NonNull String str) {
            if (str != null) {
                this.signature = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"signature\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(7);
            arrayList.add(this.quantity);
            arrayList.add(this.purchaseTime);
            arrayList.add(this.developerPayload);
            arrayList.add(this.originalJson);
            arrayList.add(this.purchaseToken);
            arrayList.add(this.signature);
            arrayList.add(this.products);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformPurchaseHistoryResponse {
        @NonNull
        private PlatformBillingResult billingResult;
        @NonNull
        private List<PlatformPurchaseHistoryRecord> purchases;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private PlatformBillingResult billingResult;
            private List<PlatformPurchaseHistoryRecord> purchases;

            @NonNull
            public PlatformPurchaseHistoryResponse build() {
                PlatformPurchaseHistoryResponse platformPurchaseHistoryResponse = new PlatformPurchaseHistoryResponse();
                platformPurchaseHistoryResponse.setBillingResult(this.billingResult);
                platformPurchaseHistoryResponse.setPurchases(this.purchases);
                return platformPurchaseHistoryResponse;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setBillingResult(@NonNull PlatformBillingResult platformBillingResult) {
                this.billingResult = platformBillingResult;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPurchases(@NonNull List<PlatformPurchaseHistoryRecord> list) {
                this.purchases = list;
                return this;
            }
        }

        @NonNull
        public static PlatformPurchaseHistoryResponse fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformPurchaseHistoryResponse platformPurchaseHistoryResponse = new PlatformPurchaseHistoryResponse();
            platformPurchaseHistoryResponse.setBillingResult((PlatformBillingResult) arrayList.get(0));
            platformPurchaseHistoryResponse.setPurchases((List) arrayList.get(1));
            return platformPurchaseHistoryResponse;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformPurchaseHistoryResponse.class != obj.getClass()) {
                return false;
            }
            PlatformPurchaseHistoryResponse platformPurchaseHistoryResponse = (PlatformPurchaseHistoryResponse) obj;
            if (this.billingResult.equals(platformPurchaseHistoryResponse.billingResult) && this.purchases.equals(platformPurchaseHistoryResponse.purchases)) {
                return true;
            }
            return false;
        }

        @NonNull
        public PlatformBillingResult getBillingResult() {
            return this.billingResult;
        }

        @NonNull
        public List<PlatformPurchaseHistoryRecord> getPurchases() {
            return this.purchases;
        }

        public int hashCode() {
            return Objects.hash(this.billingResult, this.purchases);
        }

        public void setBillingResult(@NonNull PlatformBillingResult platformBillingResult) {
            if (platformBillingResult != null) {
                this.billingResult = platformBillingResult;
                return;
            }
            throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
        }

        public void setPurchases(@NonNull List<PlatformPurchaseHistoryRecord> list) {
            if (list != null) {
                this.purchases = list;
                return;
            }
            throw new IllegalStateException("Nonnull field \"purchases\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.billingResult);
            arrayList.add(this.purchases);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public enum PlatformPurchaseState {
        UNSPECIFIED(0),
        PURCHASED(1),
        PENDING(2);
        
        final int index;

        PlatformPurchaseState(int i) {
            this.index = i;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformPurchasesResponse {
        @NonNull
        private PlatformBillingResult billingResult;
        @NonNull
        private List<PlatformPurchase> purchases;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private PlatformBillingResult billingResult;
            private List<PlatformPurchase> purchases;

            @NonNull
            public PlatformPurchasesResponse build() {
                PlatformPurchasesResponse platformPurchasesResponse = new PlatformPurchasesResponse();
                platformPurchasesResponse.setBillingResult(this.billingResult);
                platformPurchasesResponse.setPurchases(this.purchases);
                return platformPurchasesResponse;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setBillingResult(@NonNull PlatformBillingResult platformBillingResult) {
                this.billingResult = platformBillingResult;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPurchases(@NonNull List<PlatformPurchase> list) {
                this.purchases = list;
                return this;
            }
        }

        @NonNull
        public static PlatformPurchasesResponse fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformPurchasesResponse platformPurchasesResponse = new PlatformPurchasesResponse();
            platformPurchasesResponse.setBillingResult((PlatformBillingResult) arrayList.get(0));
            platformPurchasesResponse.setPurchases((List) arrayList.get(1));
            return platformPurchasesResponse;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformPurchasesResponse.class != obj.getClass()) {
                return false;
            }
            PlatformPurchasesResponse platformPurchasesResponse = (PlatformPurchasesResponse) obj;
            if (this.billingResult.equals(platformPurchasesResponse.billingResult) && this.purchases.equals(platformPurchasesResponse.purchases)) {
                return true;
            }
            return false;
        }

        @NonNull
        public PlatformBillingResult getBillingResult() {
            return this.billingResult;
        }

        @NonNull
        public List<PlatformPurchase> getPurchases() {
            return this.purchases;
        }

        public int hashCode() {
            return Objects.hash(this.billingResult, this.purchases);
        }

        public void setBillingResult(@NonNull PlatformBillingResult platformBillingResult) {
            if (platformBillingResult != null) {
                this.billingResult = platformBillingResult;
                return;
            }
            throw new IllegalStateException("Nonnull field \"billingResult\" is null.");
        }

        public void setPurchases(@NonNull List<PlatformPurchase> list) {
            if (list != null) {
                this.purchases = list;
                return;
            }
            throw new IllegalStateException("Nonnull field \"purchases\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.billingResult);
            arrayList.add(this.purchases);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformQueryProduct {
        @NonNull
        private String productId;
        @NonNull
        private PlatformProductType productType;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String productId;
            private PlatformProductType productType;

            @NonNull
            public PlatformQueryProduct build() {
                PlatformQueryProduct platformQueryProduct = new PlatformQueryProduct();
                platformQueryProduct.setProductId(this.productId);
                platformQueryProduct.setProductType(this.productType);
                return platformQueryProduct;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProductId(@NonNull String str) {
                this.productId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProductType(@NonNull PlatformProductType platformProductType) {
                this.productType = platformProductType;
                return this;
            }
        }

        @NonNull
        public static PlatformQueryProduct fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformQueryProduct platformQueryProduct = new PlatformQueryProduct();
            platformQueryProduct.setProductId((String) arrayList.get(0));
            platformQueryProduct.setProductType((PlatformProductType) arrayList.get(1));
            return platformQueryProduct;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformQueryProduct.class != obj.getClass()) {
                return false;
            }
            PlatformQueryProduct platformQueryProduct = (PlatformQueryProduct) obj;
            if (this.productId.equals(platformQueryProduct.productId) && this.productType.equals(platformQueryProduct.productType)) {
                return true;
            }
            return false;
        }

        @NonNull
        public String getProductId() {
            return this.productId;
        }

        @NonNull
        public PlatformProductType getProductType() {
            return this.productType;
        }

        public int hashCode() {
            return Objects.hash(this.productId, this.productType);
        }

        public void setProductId(@NonNull String str) {
            if (str != null) {
                this.productId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"productId\" is null.");
        }

        public void setProductType(@NonNull PlatformProductType platformProductType) {
            if (platformProductType != null) {
                this.productType = platformProductType;
                return;
            }
            throw new IllegalStateException("Nonnull field \"productType\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.productId);
            arrayList.add(this.productType);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public enum PlatformRecurrenceMode {
        FINITE_RECURRING(0),
        INFINITE_RECURRING(1),
        NON_RECURRING(2);
        
        final int index;

        PlatformRecurrenceMode(int i) {
            this.index = i;
        }
    }

    /* loaded from: classes2.dex */
    public enum PlatformReplacementMode {
        UNKNOWN_REPLACEMENT_MODE(0),
        WITH_TIME_PRORATION(1),
        CHARGE_PRORATED_PRICE(2),
        WITHOUT_PRORATION(3),
        DEFERRED(4),
        CHARGE_FULL_PRICE(5);
        
        final int index;

        PlatformReplacementMode(int i) {
            this.index = i;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformSubscriptionOfferDetails {
        @NonNull
        private String basePlanId;
        private PlatformInstallmentPlanDetails installmentPlanDetails;
        private String offerId;
        @NonNull
        private List<String> offerTags;
        @NonNull
        private String offerToken;
        @NonNull
        private List<PlatformPricingPhase> pricingPhases;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String basePlanId;
            private PlatformInstallmentPlanDetails installmentPlanDetails;
            private String offerId;
            private List<String> offerTags;
            private String offerToken;
            private List<PlatformPricingPhase> pricingPhases;

            @NonNull
            public PlatformSubscriptionOfferDetails build() {
                PlatformSubscriptionOfferDetails platformSubscriptionOfferDetails = new PlatformSubscriptionOfferDetails();
                platformSubscriptionOfferDetails.setBasePlanId(this.basePlanId);
                platformSubscriptionOfferDetails.setOfferId(this.offerId);
                platformSubscriptionOfferDetails.setOfferToken(this.offerToken);
                platformSubscriptionOfferDetails.setOfferTags(this.offerTags);
                platformSubscriptionOfferDetails.setPricingPhases(this.pricingPhases);
                platformSubscriptionOfferDetails.setInstallmentPlanDetails(this.installmentPlanDetails);
                return platformSubscriptionOfferDetails;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setBasePlanId(@NonNull String str) {
                this.basePlanId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setInstallmentPlanDetails(PlatformInstallmentPlanDetails platformInstallmentPlanDetails) {
                this.installmentPlanDetails = platformInstallmentPlanDetails;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setOfferId(String str) {
                this.offerId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setOfferTags(@NonNull List<String> list) {
                this.offerTags = list;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setOfferToken(@NonNull String str) {
                this.offerToken = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPricingPhases(@NonNull List<PlatformPricingPhase> list) {
                this.pricingPhases = list;
                return this;
            }
        }

        @NonNull
        public static PlatformSubscriptionOfferDetails fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformSubscriptionOfferDetails platformSubscriptionOfferDetails = new PlatformSubscriptionOfferDetails();
            platformSubscriptionOfferDetails.setBasePlanId((String) arrayList.get(0));
            platformSubscriptionOfferDetails.setOfferId((String) arrayList.get(1));
            platformSubscriptionOfferDetails.setOfferToken((String) arrayList.get(2));
            platformSubscriptionOfferDetails.setOfferTags((List) arrayList.get(3));
            platformSubscriptionOfferDetails.setPricingPhases((List) arrayList.get(4));
            platformSubscriptionOfferDetails.setInstallmentPlanDetails((PlatformInstallmentPlanDetails) arrayList.get(5));
            return platformSubscriptionOfferDetails;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformSubscriptionOfferDetails.class != obj.getClass()) {
                return false;
            }
            PlatformSubscriptionOfferDetails platformSubscriptionOfferDetails = (PlatformSubscriptionOfferDetails) obj;
            if (this.basePlanId.equals(platformSubscriptionOfferDetails.basePlanId) && Objects.equals(this.offerId, platformSubscriptionOfferDetails.offerId) && this.offerToken.equals(platformSubscriptionOfferDetails.offerToken) && this.offerTags.equals(platformSubscriptionOfferDetails.offerTags) && this.pricingPhases.equals(platformSubscriptionOfferDetails.pricingPhases) && Objects.equals(this.installmentPlanDetails, platformSubscriptionOfferDetails.installmentPlanDetails)) {
                return true;
            }
            return false;
        }

        @NonNull
        public String getBasePlanId() {
            return this.basePlanId;
        }

        public PlatformInstallmentPlanDetails getInstallmentPlanDetails() {
            return this.installmentPlanDetails;
        }

        public String getOfferId() {
            return this.offerId;
        }

        @NonNull
        public List<String> getOfferTags() {
            return this.offerTags;
        }

        @NonNull
        public String getOfferToken() {
            return this.offerToken;
        }

        @NonNull
        public List<PlatformPricingPhase> getPricingPhases() {
            return this.pricingPhases;
        }

        public int hashCode() {
            return Objects.hash(this.basePlanId, this.offerId, this.offerToken, this.offerTags, this.pricingPhases, this.installmentPlanDetails);
        }

        public void setBasePlanId(@NonNull String str) {
            if (str != null) {
                this.basePlanId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"basePlanId\" is null.");
        }

        public void setInstallmentPlanDetails(PlatformInstallmentPlanDetails platformInstallmentPlanDetails) {
            this.installmentPlanDetails = platformInstallmentPlanDetails;
        }

        public void setOfferId(String str) {
            this.offerId = str;
        }

        public void setOfferTags(@NonNull List<String> list) {
            if (list != null) {
                this.offerTags = list;
                return;
            }
            throw new IllegalStateException("Nonnull field \"offerTags\" is null.");
        }

        public void setOfferToken(@NonNull String str) {
            if (str != null) {
                this.offerToken = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"offerToken\" is null.");
        }

        public void setPricingPhases(@NonNull List<PlatformPricingPhase> list) {
            if (list != null) {
                this.pricingPhases = list;
                return;
            }
            throw new IllegalStateException("Nonnull field \"pricingPhases\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.basePlanId);
            arrayList.add(this.offerId);
            arrayList.add(this.offerToken);
            arrayList.add(this.offerTags);
            arrayList.add(this.pricingPhases);
            arrayList.add(this.installmentPlanDetails);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformUserChoiceDetails {
        @NonNull
        private String externalTransactionToken;
        private String originalExternalTransactionId;
        @NonNull
        private List<PlatformUserChoiceProduct> products;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String externalTransactionToken;
            private String originalExternalTransactionId;
            private List<PlatformUserChoiceProduct> products;

            @NonNull
            public PlatformUserChoiceDetails build() {
                PlatformUserChoiceDetails platformUserChoiceDetails = new PlatformUserChoiceDetails();
                platformUserChoiceDetails.setOriginalExternalTransactionId(this.originalExternalTransactionId);
                platformUserChoiceDetails.setExternalTransactionToken(this.externalTransactionToken);
                platformUserChoiceDetails.setProducts(this.products);
                return platformUserChoiceDetails;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setExternalTransactionToken(@NonNull String str) {
                this.externalTransactionToken = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setOriginalExternalTransactionId(String str) {
                this.originalExternalTransactionId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProducts(@NonNull List<PlatformUserChoiceProduct> list) {
                this.products = list;
                return this;
            }
        }

        @NonNull
        public static PlatformUserChoiceDetails fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformUserChoiceDetails platformUserChoiceDetails = new PlatformUserChoiceDetails();
            platformUserChoiceDetails.setOriginalExternalTransactionId((String) arrayList.get(0));
            platformUserChoiceDetails.setExternalTransactionToken((String) arrayList.get(1));
            platformUserChoiceDetails.setProducts((List) arrayList.get(2));
            return platformUserChoiceDetails;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformUserChoiceDetails.class != obj.getClass()) {
                return false;
            }
            PlatformUserChoiceDetails platformUserChoiceDetails = (PlatformUserChoiceDetails) obj;
            if (Objects.equals(this.originalExternalTransactionId, platformUserChoiceDetails.originalExternalTransactionId) && this.externalTransactionToken.equals(platformUserChoiceDetails.externalTransactionToken) && this.products.equals(platformUserChoiceDetails.products)) {
                return true;
            }
            return false;
        }

        @NonNull
        public String getExternalTransactionToken() {
            return this.externalTransactionToken;
        }

        public String getOriginalExternalTransactionId() {
            return this.originalExternalTransactionId;
        }

        @NonNull
        public List<PlatformUserChoiceProduct> getProducts() {
            return this.products;
        }

        public int hashCode() {
            return Objects.hash(this.originalExternalTransactionId, this.externalTransactionToken, this.products);
        }

        public void setExternalTransactionToken(@NonNull String str) {
            if (str != null) {
                this.externalTransactionToken = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"externalTransactionToken\" is null.");
        }

        public void setOriginalExternalTransactionId(String str) {
            this.originalExternalTransactionId = str;
        }

        public void setProducts(@NonNull List<PlatformUserChoiceProduct> list) {
            if (list != null) {
                this.products = list;
                return;
            }
            throw new IllegalStateException("Nonnull field \"products\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.originalExternalTransactionId);
            arrayList.add(this.externalTransactionToken);
            arrayList.add(this.products);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformUserChoiceProduct {
        @NonNull
        private String id;
        private String offerToken;
        @NonNull
        private PlatformProductType type;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String id;
            private String offerToken;
            private PlatformProductType type;

            @NonNull
            public PlatformUserChoiceProduct build() {
                PlatformUserChoiceProduct platformUserChoiceProduct = new PlatformUserChoiceProduct();
                platformUserChoiceProduct.setId(this.id);
                platformUserChoiceProduct.setOfferToken(this.offerToken);
                platformUserChoiceProduct.setType(this.type);
                return platformUserChoiceProduct;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setId(@NonNull String str) {
                this.id = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setOfferToken(String str) {
                this.offerToken = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setType(@NonNull PlatformProductType platformProductType) {
                this.type = platformProductType;
                return this;
            }
        }

        @NonNull
        public static PlatformUserChoiceProduct fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformUserChoiceProduct platformUserChoiceProduct = new PlatformUserChoiceProduct();
            platformUserChoiceProduct.setId((String) arrayList.get(0));
            platformUserChoiceProduct.setOfferToken((String) arrayList.get(1));
            platformUserChoiceProduct.setType((PlatformProductType) arrayList.get(2));
            return platformUserChoiceProduct;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformUserChoiceProduct.class != obj.getClass()) {
                return false;
            }
            PlatformUserChoiceProduct platformUserChoiceProduct = (PlatformUserChoiceProduct) obj;
            if (this.id.equals(platformUserChoiceProduct.id) && Objects.equals(this.offerToken, platformUserChoiceProduct.offerToken) && this.type.equals(platformUserChoiceProduct.type)) {
                return true;
            }
            return false;
        }

        @NonNull
        public String getId() {
            return this.id;
        }

        public String getOfferToken() {
            return this.offerToken;
        }

        @NonNull
        public PlatformProductType getType() {
            return this.type;
        }

        public int hashCode() {
            return Objects.hash(this.id, this.offerToken, this.type);
        }

        public void setId(@NonNull String str) {
            if (str != null) {
                this.id = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"id\" is null.");
        }

        public void setOfferToken(String str) {
            this.offerToken = str;
        }

        public void setType(@NonNull PlatformProductType platformProductType) {
            if (platformProductType != null) {
                this.type = platformProductType;
                return;
            }
            throw new IllegalStateException("Nonnull field \"type\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.id);
            arrayList.add(this.offerToken);
            arrayList.add(this.type);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public interface Result<T> {
        void error(@NonNull Throwable th);

        void success(@NonNull T t);
    }

    /* loaded from: classes2.dex */
    public interface VoidResult {
        void error(@NonNull Throwable th);

        void success();
    }

    @NonNull
    public static FlutterError createConnectionError(@NonNull String str) {
        return new FlutterError("channel-error", AbstractC2437ph.h("Unable to establish connection on channel: ", str, "."), "");
    }

    @NonNull
    public static ArrayList<Object> wrapError(@NonNull Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
