package defpackage;

import android.app.Activity;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import java.util.Map;
import org.json.JSONObject;
/* renamed from: ai0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0873ai0 extends AbstractC2777tf0 implements InterfaceC2749tJ, InneractiveFullscreenAdEventsListener {
    public final InterfaceC2320oJ g;
    public final InneractiveFullscreenUnitController h;
    public InterfaceC2835uJ i;

    public AbstractC0873ai0(String str, JSONObject jSONObject, Map map, boolean z, InterfaceC2320oJ interfaceC2320oJ, C0811a00 c0811a00) {
        super(str, jSONObject, map, z, c0811a00);
        this.g = interfaceC2320oJ;
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new InneractiveFullscreenUnitController();
        this.h = inneractiveFullscreenUnitController;
        inneractiveFullscreenUnitController.setEventsListener(this);
    }

    @Override // defpackage.AbstractC2777tf0
    public final void a(C2524qh0 c2524qh0) {
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = this.h;
        if (inneractiveFullscreenUnitController != null && c2524qh0 != null) {
            InneractiveAdSpotManager.get().bindSpot(c2524qh0);
            inneractiveFullscreenUnitController.setAdSpot(c2524qh0);
        }
        InterfaceC2320oJ interfaceC2320oJ = this.g;
        if (interfaceC2320oJ != null) {
            interfaceC2320oJ.onAdLoaded(this);
        }
    }

    @Override // defpackage.AbstractC2777tf0
    public final boolean b() {
        return true;
    }

    public final void e(Activity activity, InterfaceC2835uJ interfaceC2835uJ) {
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = this.h;
        if (inneractiveFullscreenUnitController != null) {
            this.i = interfaceC2835uJ;
            if (this.b.isReady()) {
                inneractiveFullscreenUnitController.show(activity);
                return;
            } else {
                interfaceC2835uJ.onShowError(EnumC2406pJ.c);
                return;
            }
        }
        interfaceC2835uJ.onShowError(EnumC2406pJ.b);
    }

    @Override // defpackage.InterfaceC2749tJ
    public final void load() {
        c(this.h, this.g);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        InterfaceC2835uJ interfaceC2835uJ = this.i;
        if (interfaceC2835uJ != null) {
            interfaceC2835uJ.onClick();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
    public final void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
        InterfaceC2835uJ interfaceC2835uJ = this.i;
        if (interfaceC2835uJ != null) {
            interfaceC2835uJ.onClose();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        InterfaceC2835uJ interfaceC2835uJ = this.i;
        if (interfaceC2835uJ != null) {
            interfaceC2835uJ.onShow();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
    }
}
