package item33;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

public abstract class TypeRef<T> {
    private final Type type;

    protected TypeRef() {
        ParameterizedType superclass = (ParameterizedType) getClass().getGenericSuperclass();
        type = superclass.getActualTypeArguments()[0];
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        TypeRef<?> typeRef = (TypeRef<?>) object;
        return Objects.equals(type, typeRef.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    public Type getType() {
        return this.type;
    }
}
