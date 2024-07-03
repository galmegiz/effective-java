package item31;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class WildcardExample<E> {
    private E[] elements;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public WildcardExample() {
        elements = (E[]) new Object[100];
    }

    public void push(E e) {
        elements[size++] = e;
    }

    public E pop() {
        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    // 생산자(producer) 매개변수에 와일드카드 타입 적용
    public void pushAll(Iterable<? extends E> src) {
        // 생산자 -> src
        // 생산자에서 생산한 elemet에 대해 타입 캐스팅을 하고 이를 나의 제네릭 타입에 넣음
        // 따라서 src는 E타입으로 타입캐스팅이 가능한 E의 하위타입이어야 함
        for (E e : src) {
            push(e);
        }
        Random random = new Random();
    }

    public boolean isEmpty() {
        return false;
    }

    // 소비자(Consumer)
    public void popAll(Collection<? super E> dst) {
        // 내 제네릭 클래스에서 데이터를 얻은 후 이를 E타입으로 타입캐스팅해서 소비자(dst)에 넣어 줘야 함
        // 따라서 내 element를 받을 수 있는 상위 클래스이어야 함
        while(!isEmpty())
            dst.add(pop());
    }

    public static void main(String[] args) {
        WildcardExample<Number> numbers = new WildcardExample<>();

    }
}
