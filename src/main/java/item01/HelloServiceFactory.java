package item01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {
    public static void main(String[] args) {
        // 클래스패스 내의 모든 HelloService의 구현체를 가쳐옴
        ServiceLoader<HelloService> serviceLoader = ServiceLoader.load(HelloService.class);
        System.out.println("load started");
        Optional<HelloService> firstService = serviceLoader.findFirst();
        System.out.println("load started 2");
        firstService.ifPresent(helloService -> System.out.println("helloService.hello() = " + helloService.hello()));

        OrderStatus[] values = OrderStatus.values();

        Character c1 = new Character('h', "white", FontFactory.getFont("nanum:12"));

        List<Integer> numbers = Arrays.asList(1, 10, 4, 2, 4, 5);
        Comparator<Integer> desc = (o1, o2) -> o2 - o1;
        numbers.sort(desc);

        numbers.sort(desc.reversed());
        EnumSet.allOf(OrderStatus.class);
    }
}
