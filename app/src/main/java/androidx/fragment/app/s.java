package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public abstract class s extends AbstractActivityC0347If implements F1, G1 {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final C0314Gy mFragments = new C0314Gy(new r(this));
    final JG mFragmentLifecycleRegistry = new JG(this);
    boolean mStopped = true;

    public s() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new IY() { // from class: androidx.fragment.app.o
            @Override // defpackage.IY
            public final Bundle a() {
                s sVar = s.this;
                sVar.markFragmentsCreated();
                sVar.mFragmentLifecycleRegistry.e(AG.ON_STOP);
                return new Bundle();
            }
        });
        addOnConfigurationChangedListener(new InterfaceC0608Sh(this) { // from class: androidx.fragment.app.p
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC0608Sh
            public final void accept(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        this.b.mFragments.a();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        this.b.mFragments.a();
                        return;
                }
            }
        });
        addOnNewIntentListener(new InterfaceC0608Sh(this) { // from class: androidx.fragment.app.p
            public final /* synthetic */ s b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC0608Sh
            public final void accept(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        this.b.mFragments.a();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        this.b.mFragments.a();
                        return;
                }
            }
        });
        addOnContextAvailableListener(new YP() { // from class: androidx.fragment.app.q
            @Override // defpackage.YP
            public final void a(AbstractActivityC0347If abstractActivityC0347If) {
                r rVar = s.this.mFragments.a;
                rVar.f.b(rVar, rVar, null);
            }
        });
    }

    public static boolean c(z zVar) {
        boolean z = false;
        for (n nVar : zVar.c.f()) {
            if (nVar != null) {
                if (nVar.getHost() != null) {
                    z |= c(nVar.getChildFragmentManager());
                }
                C2289nz c2289nz = nVar.mViewLifecycleOwner;
                BG bg = BG.f;
                if (c2289nz != null) {
                    c2289nz.b();
                    if (c2289nz.f.c.a(bg)) {
                        nVar.mViewLifecycleOwner.f.g();
                        z = true;
                    }
                }
                if (nVar.mLifecycleRegistry.c.a(bg)) {
                    nVar.mLifecycleRegistry.g();
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.a.f.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!shouldDumpInternalState(strArr)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            WH.a(this).b(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.a.f.v(str, fileDescriptor, printWriter, strArr);
    }

    @NonNull
    public z getSupportFragmentManager() {
        return this.mFragments.a.f;
    }

    @NonNull
    @Deprecated
    public WH getSupportLoaderManager() {
        return WH.a(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (c(getSupportFragmentManager()));
    }

    @Override // defpackage.AbstractActivityC0347If, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(@NonNull n nVar) {
    }

    @Override // defpackage.AbstractActivityC0347If, defpackage.AbstractActivityC0321Hf, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(AG.ON_CREATE);
        C0573Qy c0573Qy = this.mFragments.a.f;
        c0573Qy.G = false;
        c0573Qy.H = false;
        c0573Qy.N.i = false;
        c0573Qy.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.f.l();
        this.mFragmentLifecycleRegistry.e(AG.ON_DESTROY);
    }

    @Override // defpackage.AbstractActivityC0347If, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.a.f.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.f.u(5);
        this.mFragmentLifecycleRegistry.e(AG.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // defpackage.AbstractActivityC0347If, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.f.z(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(AG.ON_RESUME);
        C0573Qy c0573Qy = this.mFragments.a.f;
        c0573Qy.G = false;
        c0573Qy.H = false;
        c0573Qy.N.i = false;
        c0573Qy.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            C0573Qy c0573Qy = this.mFragments.a.f;
            c0573Qy.G = false;
            c0573Qy.H = false;
            c0573Qy.N.i = false;
            c0573Qy.u(4);
        }
        this.mFragments.a.f.z(true);
        this.mFragmentLifecycleRegistry.e(AG.ON_START);
        C0573Qy c0573Qy2 = this.mFragments.a.f;
        c0573Qy2.G = false;
        c0573Qy2.H = false;
        c0573Qy2.N.i = false;
        c0573Qy2.u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        C0573Qy c0573Qy = this.mFragments.a.f;
        c0573Qy.H = true;
        c0573Qy.N.i = true;
        c0573Qy.u(4);
        this.mFragmentLifecycleRegistry.e(AG.ON_STOP);
    }

    public void setEnterSharedElementCallback(AbstractC2551r10 abstractC2551r10) {
        B1.c(this, null);
    }

    public void setExitSharedElementCallback(AbstractC2551r10 abstractC2551r10) {
        B1.d(this, null);
    }

    public void startActivityFromFragment(@NonNull n nVar, @NonNull Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            nVar.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull n nVar, @NonNull IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            nVar.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        B1.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        B1.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        B1.e(this);
    }

    @Override // defpackage.G1
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(@NonNull n nVar, @NonNull Intent intent, int i) {
        startActivityFromFragment(nVar, intent, i, (Bundle) null);
    }
}
