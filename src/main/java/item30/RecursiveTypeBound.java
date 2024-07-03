package item30;

import java.util.Collection;
import java.util.Objects;

// 재귀적 타입 한정을 이용해 상호 비교할 수 있음을 표현
public class RecursiveTypeBound {

    // Comparable 안에 다시 타입 E를 사용, 재귀적 타입한정
    public static <E extends Comparable<E>> E max(Collection<E> collection) {
        if (collection.isEmpty())
            throw new IllegalArgumentException("컬렉션이 비었습니다");

        E result = null;
        for(E e : collection)
            if (result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }

        return result;
    }
}
