package item30;

import java.util.function.UnaryOperator;


// 제네릭 싱글턴 팩터리 패턴
public class GenericSingletonFactory {
    private static UnaryOperator<Object> IDENTIY_FN = (t) -> t;

    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identityFunction() {
        return (UnaryOperator<T>) IDENTIY_FN;
    }

    public static void main(String[] args) {
        String[] strings = {"삼베"};
        UnaryOperator<String> sameString = identityFunction();
        for (String s : strings) {
            System.out.println(sameString.apply(s));
        }
    }
}
