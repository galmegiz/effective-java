package item19;

import java.time.Instant;

public class Sub extends Super{

    private final Instant instant;
    Sub(){
        instant = Instant.now();
    }

    @Override
    public void overrideMe() {
        // null이 출력됨
        System.out.println(instant);
    }
}
