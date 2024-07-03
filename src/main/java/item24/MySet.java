package item24;

import java.util.AbstractSet;
import java.util.Iterator;

/**
 * 비정적 멤버 중첩 클래스가 유용한 경우
 * 어댑터 패턴에 쓰임
 * @param <E>
 */
public class MySet<E> extends AbstractSet<E> {

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    @Override
    public int size() {
        return 0;
    }

    private class MyIterator implements Iterator<E> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }
}

