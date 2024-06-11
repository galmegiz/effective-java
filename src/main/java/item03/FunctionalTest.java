package item03;

import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalTest {

    public static void main(String[] args) {
        Function<Integer, Person> secondConst = Person::new;
        Supplier<Person> defaultConst = Person::new;
    }

    static class Person {
        public Person() {}
        public Person(int a){}
    }
}

