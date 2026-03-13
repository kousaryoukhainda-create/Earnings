package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Qe  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0553Qe extends C0527Pe {
    public static List A(Iterable iterable) {
        Object next;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return C(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return C0320He.a(next);
            }
            return C2968vr.b;
        }
        return C0346Ie.d(D(iterable));
    }

    public static long[] B(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList C(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List D(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return C((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        y(iterable, arrayList);
        return arrayList;
    }

    public static Set E(Collection collection) {
        Object next;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        boolean z = collection instanceof Collection;
        C3312zr c3312zr = C3312zr.b;
        if (z) {
            Collection collection2 = collection;
            int size = collection2.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(C2062lJ.a(collection2.size()));
                    y(collection, linkedHashSet);
                    return linkedHashSet;
                }
                if (collection instanceof List) {
                    next = ((List) collection).get(0);
                } else {
                    next = collection2.iterator().next();
                }
                return R00.a(next);
            }
            return c3312zr;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        y(collection, linkedHashSet2);
        Intrinsics.checkNotNullParameter(linkedHashSet2, "<this>");
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return linkedHashSet2;
            }
            return R00.a(linkedHashSet2.iterator().next());
        }
        return c3312zr;
    }

    public static boolean h(Iterable iterable, Object obj) {
        int i;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            i = ((List) iterable).indexOf(obj);
        } else {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (i2 >= 0) {
                        if (Intrinsics.a(obj, next)) {
                            i = i2;
                            break;
                        }
                        i2++;
                    } else {
                        C0346Ie.e();
                        throw null;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    public static List i(int i, List list) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return A(list);
            }
            if (list instanceof Collection) {
                int size = list.size() - i;
                if (size <= 0) {
                    return C2968vr.b;
                }
                if (size == 1) {
                    return C0320He.a(q(list));
                }
                arrayList = new ArrayList(size);
                if (list instanceof List) {
                    if (list instanceof RandomAccess) {
                        int size2 = list.size();
                        while (i < size2) {
                            arrayList.add(list.get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = list.listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i2 = 0;
            for (Object obj : list) {
                if (i2 >= i) {
                    arrayList.add(obj);
                } else {
                    i2++;
                }
            }
            return C0346Ie.d(arrayList);
        }
        throw new IllegalArgumentException(AbstractC2437ph.c(i, "Requested element count ", " is less than zero.").toString());
    }

    public static ArrayList j(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : collection) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object k(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        if (collection instanceof List) {
            return l((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object l(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object m(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void n(Iterable iterable, StringBuilder buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1 function1) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C2987w40.a(buffer, obj, function1);
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
    }

    public static String p(Iterable iterable, String str, String str2, String str3, Function1 function1, int i) {
        String prefix;
        String postfix;
        if ((i & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        if ((i & 2) != 0) {
            prefix = "";
        } else {
            prefix = str2;
        }
        if ((i & 4) != 0) {
            postfix = "";
        } else {
            postfix = str3;
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb = new StringBuilder();
        n(iterable, sb, separator, prefix, postfix, -1, "...", function1);
        return sb.toString();
    }

    public static Object q(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        if (collection instanceof List) {
            return r((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object r(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(C0346Ie.b(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static ArrayList s(Iterable elements, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            Collection collection2 = (Collection) elements;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C0475Ne.g(elements, arrayList2);
        return arrayList2;
    }

    public static ArrayList t(Collection collection, Object obj) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List u(List list, Comparator comparator) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (list instanceof Collection) {
            if (list.size() <= 1) {
                return A(list);
            }
            Object[] array = list.toArray(new Object[0]);
            Intrinsics.checkNotNullParameter(array, "<this>");
            Intrinsics.checkNotNullParameter(comparator, "comparator");
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            return C2043l5.b(array);
        }
        List D = D(list);
        Intrinsics.checkNotNullParameter(D, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (((ArrayList) D).size() > 1) {
            Collections.sort(D, comparator);
        }
        return D;
    }

    public static List v(int i, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return C2968vr.b;
            }
            if (list instanceof Collection) {
                if (i >= list.size()) {
                    return A(list);
                }
                if (i == 1) {
                    return C0320He.a(k(list));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (Object obj : list) {
                arrayList.add(obj);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return C0346Ie.d(arrayList);
        }
        throw new IllegalArgumentException(AbstractC2437ph.c(i, "Requested element count ", " is less than zero.").toString());
    }

    public static List w(int i, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return C2968vr.b;
            }
            int size = list.size();
            if (i >= size) {
                return A(list);
            }
            if (i == 1) {
                return C0320He.a(r(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(AbstractC2437ph.c(i, "Requested element count ", " is less than zero.").toString());
    }

    public static byte[] x(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void y(Iterable iterable, AbstractCollection destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : iterable) {
            destination.add(obj);
        }
    }

    public static int[] z(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }
}
