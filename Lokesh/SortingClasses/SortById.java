package Sir.Lokesh.SortingClasses;

import java.util.Comparator;

public class SortById implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Amazon a1=(Amazon) o1;
        Amazon a2=(Amazon) o2;
        return a1.id-a2.id;
    }
}
