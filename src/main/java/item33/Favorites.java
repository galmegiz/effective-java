package item33;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 타입 안전 이종 컨테이너
public class Favorites {
    private Map<Class<?>, Object> map = new HashMap<>();

    public <T> void put(Class<T> clazz, T value) {
        this.map.put(clazz, value);
    }

    public <T> T get(Class<T> clazz) {
        return clazz.cast(this.map.get(clazz));
    }

    public static void main(String[] args) {
        Favorites favorites = new Favorites();

        // 기본적으로는 불가능
        // favorites.put(List<Integer>.class, List.of(1, 2, 3));
    }
}
