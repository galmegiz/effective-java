package item33;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GenericTypeInfer {

    static class Super<T>{
        T value;
    }

    static class Sub extends Super<String> {
    }


    public static void main(String[] args) {
        // sub에서는 Generic의 타입을 파악할 수 있다.
        Sub sub = new Sub();
        Type type = sub.getClass().getGenericSuperclass();
        ParameterizedType pType = (ParameterizedType) type;
        System.out.println(pType.getActualTypeArguments()[0]);

    }
}
