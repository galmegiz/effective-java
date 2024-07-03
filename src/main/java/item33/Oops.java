package item33;

import java.util.ArrayList;
import java.util.List;

public class Oops {
    static Favorites2 f = new Favorites2();

    static <T> List<T> favoriteList() {
        TypeRef<List<T>> ref = new TypeRef<>(){};

        List<T> result = f.get(ref);
        // 여기서 나오는 건 List<T>타입이 나온다.
        // 따라서 List<Integer> List<String> 모두 같음
        if (result == null) {
            result = new ArrayList<>();
            f.put(ref, result);
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> ls = favoriteList();
        List<Integer> li = favoriteList();
        li.add(1);

    }
}
