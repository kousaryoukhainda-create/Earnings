package defpackage;

import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
/* renamed from: hR  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1528hR {
    /* JADX WARN: Type inference failed for: r5v0, types: [iR, java.lang.Object] */
    public static C1614iR a(Person person) {
        IconCompat iconCompat;
        CharSequence name = person.getName();
        if (person.getIcon() != null) {
            iconCompat = IconCompat.b(person.getIcon());
        } else {
            iconCompat = null;
        }
        String uri = person.getUri();
        String key = person.getKey();
        boolean isBot = person.isBot();
        boolean isImportant = person.isImportant();
        ?? obj = new Object();
        obj.a = name;
        obj.b = iconCompat;
        obj.c = uri;
        obj.d = key;
        obj.e = isBot;
        obj.f = isImportant;
        return obj;
    }

    public static Person b(C1614iR c1614iR) {
        Person.Builder name = new Person.Builder().setName(c1614iR.a);
        Icon icon = null;
        IconCompat iconCompat = c1614iR.b;
        if (iconCompat != null) {
            icon = iconCompat.l(null);
        }
        return name.setIcon(icon).setUri(c1614iR.c).setKey(c1614iR.d).setBot(c1614iR.e).setImportant(c1614iR.f).build();
    }
}
