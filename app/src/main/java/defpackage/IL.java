package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: IL  reason: default package */
/* loaded from: classes.dex */
public class IL implements Menu {
    public static final int[] v = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public WC e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence l;
    public View m;
    public QL t;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public final ArrayList r = new ArrayList();
    public final CopyOnWriteArrayList s = new CopyOnWriteArrayList();
    public boolean u = false;

    public IL(Context context) {
        boolean z;
        boolean z2 = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = Wb0.a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = Ub0.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        this.d = z2;
    }

    public final QL a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0 && i5 < 6) {
            int i6 = (v[i5] << 16) | (65535 & i3);
            QL ql = new QL(this, i, i2, i3, i6, charSequence);
            ArrayList arrayList = this.f;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((QL) arrayList.get(size)).d <= i6) {
                        i4 = size + 1;
                        break;
                    }
                    size--;
                } else {
                    i4 = 0;
                    break;
                }
            }
            arrayList.add(i4, ql);
            o(true);
            return ql;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        int i6;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            if (i8 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i8];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            QL a = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a.setIcon(resolveInfo.loadIcon(packageManager));
            a.g = intent3;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = a;
            }
        }
        return i5;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(ZL zl, Context context) {
        this.s.add(new WeakReference(zl));
        zl.j(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.q) {
            return;
        }
        this.q = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.s;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            ZL zl = (ZL) weakReference.get();
            if (zl == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zl.a(this, z);
            }
        }
        this.q = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        QL ql = this.t;
        if (ql != null) {
            d(ql);
        }
        this.f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(QL ql) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.s;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.t == ql) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                ZL zl = (ZL) weakReference.get();
                if (zl == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = zl.e(ql);
                    if (z) {
                        break;
                    }
                }
            }
            r();
            if (z) {
                this.t = null;
            }
        }
        return z;
    }

    public boolean e(IL il, MenuItem menuItem) {
        InterfaceC3152y1 interfaceC3152y1;
        WC wc = this.e;
        if (wc != null && (interfaceC3152y1 = ((ActionMenuView) wc.c).A) != null && ((Toolbar) ((C0942bV) interfaceC3152y1).c).I.a(menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(QL ql) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.s;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            ZL zl = (ZL) weakReference.get();
            if (zl == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = zl.g(ql);
                if (z) {
                    break;
                }
            }
        }
        r();
        if (z) {
            this.t = ql;
        }
        return z;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            QL ql = (QL) arrayList.get(i2);
            if (ql.a == i) {
                return ql;
            }
            if (ql.hasSubMenu() && (findItem = ql.o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final QL g(int i, KeyEvent keyEvent) {
        char c;
        ArrayList arrayList = this.r;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (QL) arrayList.get(0);
        }
        boolean m = m();
        for (int i2 = 0; i2 < size; i2++) {
            QL ql = (QL) arrayList.get(i2);
            if (m) {
                c = ql.j;
            } else {
                c = ql.h;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (m && c == '\b' && i == 67))) {
                return ql;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean m = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i != 67) {
            return;
        }
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            QL ql = (QL) arrayList2.get(i3);
            if (ql.hasSubMenu()) {
                ql.o.h(arrayList, i, keyEvent);
            }
            if (m) {
                c = ql.j;
            } else {
                c = ql.h;
            }
            if (m) {
                i2 = ql.k;
            } else {
                i2 = ql.i;
            }
            if ((modifiers & 69647) == (i2 & 69647) && c != 0) {
                char[] cArr = keyData.meta;
                if (c != cArr[0] && c != cArr[2]) {
                    if (m && c == '\b') {
                        if (i != 67) {
                        }
                    }
                }
                if (ql.isEnabled()) {
                    arrayList.add(ql);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((QL) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k = k();
        if (!this.k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.s;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            ZL zl = (ZL) weakReference.get();
            if (zl == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z |= zl.c();
            }
        }
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = this.j;
        if (z) {
            arrayList.clear();
            arrayList2.clear();
            int size = k.size();
            for (int i = 0; i < size; i++) {
                QL ql = (QL) k.get(i);
                if (ql.d()) {
                    arrayList.add(ql);
                } else {
                    arrayList2.add(ql);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(k());
        }
        this.k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (g(i, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public final ArrayList k() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            QL ql = (QL) arrayList2.get(i);
            if (ql.isVisible()) {
                arrayList.add(ql);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean l() {
        return this.u;
    }

    public boolean m() {
        return this.c;
    }

    public boolean n() {
        return this.d;
    }

    public final void o(boolean z) {
        if (!this.n) {
            if (z) {
                this.h = true;
                this.k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.s;
            if (!copyOnWriteArrayList.isEmpty()) {
                s();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    ZL zl = (ZL) weakReference.get();
                    if (zl == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        zl.h();
                    }
                }
                r();
                return;
            }
            return;
        }
        this.o = true;
        if (z) {
            this.p = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MenuItem r6, defpackage.RL r7, int r8) {
        /*
            r5 = this;
            QL r6 = (defpackage.QL) r6
            r0 = 0
            if (r6 == 0) goto Lab
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto Ld
            goto Lab
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r6.p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r6)
            if (r1 == 0) goto L1a
        L18:
            r1 = 1
            goto L36
        L1a:
            IL r1 = r6.n
            boolean r3 = r1.e(r1, r6)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r6.g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            r1 = 0
        L36:
            boolean r3 = r6.c()
            if (r3 == 0) goto L47
            boolean r6 = r6.expandActionView()
            r1 = r1 | r6
            if (r1 == 0) goto Laa
            r5.c(r2)
            goto Laa
        L47:
            boolean r3 = r6.hasSubMenu()
            if (r3 != 0) goto L55
            r6 = r8 & 1
            if (r6 != 0) goto Laa
            r5.c(r2)
            goto Laa
        L55:
            r8 = r8 & 4
            if (r8 != 0) goto L5c
            r5.c(r0)
        L5c:
            boolean r8 = r6.hasSubMenu()
            if (r8 != 0) goto L70
            F40 r8 = new F40
            android.content.Context r3 = r5.a
            r8.<init>(r3, r5, r6)
            r6.o = r8
            java.lang.CharSequence r3 = r6.e
            r8.setHeaderTitle(r3)
        L70:
            F40 r6 = r6.o
            java.util.concurrent.CopyOnWriteArrayList r8 = r5.s
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L7b
            goto La4
        L7b:
            if (r7 == 0) goto L81
            boolean r0 = r7.b(r6)
        L81:
            java.util.Iterator r7 = r8.iterator()
        L85:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto La4
            java.lang.Object r3 = r7.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            ZL r4 = (defpackage.ZL) r4
            if (r4 != 0) goto L9d
            r8.remove(r3)
            goto L85
        L9d:
            if (r0 != 0) goto L85
            boolean r0 = r4.b(r6)
            goto L85
        La4:
            r1 = r1 | r0
            if (r1 != 0) goto Laa
            r5.c(r2)
        Laa:
            return r1
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.IL.p(android.view.MenuItem, RL, int):boolean");
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return p(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        QL g = g(i, keyEvent);
        if (g != null) {
            z = p(g, null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            c(true);
        }
        return z;
    }

    public final void q(int i, CharSequence charSequence, int i2, View view) {
        if (view != null) {
            this.m = view;
            this.l = null;
        } else {
            if (i > 0) {
                this.l = this.b.getText(i);
            } else if (charSequence != null) {
                this.l = charSequence;
            }
            if (i2 > 0) {
                AbstractC2525qi.getDrawable(this.a, i2);
            }
        }
        o(false);
    }

    public final void r() {
        this.n = false;
        if (this.o) {
            this.o = false;
            o(this.p);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                if (((QL) arrayList.get(i3)).b == i) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((QL) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (((QL) arrayList.get(i2)).a == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f;
            if (i2 < arrayList2.size()) {
                arrayList2.remove(i2);
                o(true);
            }
        }
    }

    public final void s() {
        if (!this.n) {
            this.n = true;
            this.o = false;
            this.p = false;
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int i2;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            QL ql = (QL) arrayList.get(i3);
            if (ql.b == i) {
                int i4 = ql.x & (-5);
                if (z2) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                ql.x = i4 | i2;
                ql.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.u = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            QL ql = (QL) arrayList.get(i2);
            if (ql.b == i) {
                ql.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        int i2;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            QL ql = (QL) arrayList.get(i3);
            if (ql.b == i) {
                int i4 = ql.x;
                int i5 = i4 & (-9);
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                int i6 = i5 | i2;
                ql.x = i6;
                if (i4 != i6) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        QL a = a(i, i2, i3, charSequence);
        F40 f40 = new F40(this.a, this, a);
        a.o = f40;
        f40.setHeaderTitle(a.e);
        return f40;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }

    public IL j() {
        return this;
    }
}
