package item27;

import java.util.ArrayList;
import java.util.List;

public class ItegerToString {
    public static void main(String[] args) {

        // 공변
        // reify(실체화) -> 배열은 런타임 시점에 실체화가 된다.
        Object[] anything = new String[10];
        // 배열이기 때문에 가능함
        anything[0] = 1;

        // 불공변
        // List<Object>와 상하 관계가 없음
        // 런타임 시점에 <String> 정보가 사라진다
        List<String> names = new ArrayList<>();
    }
}
