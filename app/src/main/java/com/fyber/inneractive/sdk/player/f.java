package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.player.controller.g;
import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
public class f implements g.f {
    public final com.fyber.inneractive.sdk.measurement.d a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.fyber.inneractive.sdk.player.enums.b.values().length];
            a = iArr;
            try {
                iArr[com.fyber.inneractive.sdk.player.enums.b.Prepared.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Buffering.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Playing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Paused.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Completed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public f(com.fyber.inneractive.sdk.measurement.d dVar) {
        this.a = dVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void a(Exception exc) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void e(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void g() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g.f
    public void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("MeasurementHelper onPlayerStateChanged=%s mBuffering=%s mPrepared=%s", bVar, String.valueOf(this.b), String.valueOf(this.d));
        if (this.a != null) {
            int i = a.a[bVar.ordinal()];
            if (i == 1) {
                this.d = true;
            } else if (i == 2) {
                if (this.d) {
                    com.fyber.inneractive.sdk.measurement.d dVar = this.a;
                    if (dVar.c != null) {
                        IAlog.a("%s bufferStart", "OMVideo");
                        try {
                            dVar.c.bufferStart();
                        } catch (Throwable th) {
                            dVar.a(th);
                        }
                    }
                    this.b = true;
                }
            } else if (i != 3) {
                if (i == 4) {
                    com.fyber.inneractive.sdk.measurement.d dVar2 = this.a;
                    if (dVar2.c != null) {
                        IAlog.a("%s pause", "OMVideo");
                        try {
                            dVar2.c.pause();
                        } catch (Throwable th2) {
                            dVar2.a(th2);
                        }
                    }
                    this.c = true;
                } else if (i != 5) {
                } else {
                    com.fyber.inneractive.sdk.measurement.d dVar3 = this.a;
                    if (dVar3.c != null) {
                        IAlog.a("%s complete", "OMVideo");
                        try {
                            dVar3.c.complete();
                        } catch (Throwable th3) {
                            dVar3.a(th3);
                        }
                    }
                }
            } else if (this.b) {
                this.b = false;
                com.fyber.inneractive.sdk.measurement.d dVar4 = this.a;
                if (dVar4.c != null) {
                    IAlog.a("%s bufferEnd", "OMVideo");
                    try {
                        dVar4.c.bufferFinish();
                    } catch (Throwable th4) {
                        dVar4.a(th4);
                    }
                }
            } else if (this.c) {
                com.fyber.inneractive.sdk.measurement.d dVar5 = this.a;
                if (dVar5.c != null) {
                    IAlog.a("%s resume", "OMVideo");
                    try {
                        dVar5.c.resume();
                    } catch (Throwable th5) {
                        dVar5.a(th5);
                    }
                }
                this.c = false;
            }
        }
    }
}
