package item33;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Favorites2 {
    private final Map<TypeRef<?>, Object> favorites = new HashMap<>();

    public <T> void put(TypeRef<T> typeRef, T thing) {
        favorites.put(typeRef, thing);
    }

    public <T> T get(TypeRef<T> typeRef) {
        return (T) favorites.get(typeRef);
    }

    public static void main(String[] args) {
        Favorites2 f = new Favorites2();

        f.put(new TypeRef<List<String>>() {}, List.of("a", "b", "c"));
    }
}
