package androidx.fragment.app;
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ n b;

    public /* synthetic */ j(n nVar) {
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.b;
        C2289nz c2289nz = nVar.mViewLifecycleOwner;
        c2289nz.g.b(nVar.mSavedViewRegistryState);
        nVar.mSavedViewRegistryState = null;
    }
}
