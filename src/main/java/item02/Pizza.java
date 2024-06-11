package item02;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        // 하위 타입에서 확장이 제한된다. 따라서 self를 이용해 T를 반환함으로써 하위 프로젝트에서 타입캐스팅을 불필요하게 만들었다.

        public Builder<T> addToppingVer2(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return this;
        }

        abstract  Pizza build();


        protected abstract T self();
    }

    Pizza(Builder<?> builder) { toppings = builder.toppings.clone();}

}
