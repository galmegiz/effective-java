package item08;

import java.lang.reflect.Field;

public class LambdaExample {
    private int value = 10;

    // 람다의 경우에도 외부의 참조변수를 가질 수 있다.
    private Runnable instanceLambda = () -> {
        System.out.println(value);
    };

    public static void main(String[] args) {
        LambdaExample example = new LambdaExample();
        Field[] declaredFields = example.instanceLambda.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("field type : " + declaredField.getType());
            System.out.println("field name : " + declaredField.getName());
        }
    }
}
