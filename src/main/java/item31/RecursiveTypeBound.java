package item31;

import java.util.ArrayList;
import java.util.List;

public class RecursiveTypeBound {
    public static <E extends Comparable<? super E>> E max(List<? extends E> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }

        E result = null;
        for (E e : list) {
            if (result == null || e.compareTo(result) > 0) {
                result = e;
            }
        }

        return result;
    }

    public static <E extends Comparable<E>> E max2(List<E> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }

        E result = null;
        for (E e : list) {
            if (result == null || e.compareTo(result) > 0) {
                result = e;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        List<IntegerBox> lists = new ArrayList<>();
        lists.add(new IntegerBox());
        List<Box> lists2 = new ArrayList<>();
        max(lists2);
        max(lists);
        // max2(lists); // lists는 comparable를 직접 구현하지 않았기 때문에 max2를 사용할 수 없다

    }
}
