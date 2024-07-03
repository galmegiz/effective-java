package item28;

import java.util.List;

public class SafeVarargsExample {
    static void notSafe(List<String>... stringLists) {
        Object[] array = stringLists;
        List<Integer> tmpList = List.of(42);
        array[0] = tmpList;
        String s = stringLists[0].get(0); // 오류 발생, 힙 오염
    }

    @SafeVarargs // values에 assign을 하지 않는 경우에만
    static <T> void safe(T... values) {
        for (T value : values) {
            System.out.println(values);
        }
    }
    public static void main(String[] args) {

    }
}
