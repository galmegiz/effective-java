package item31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Chooser<T>{
    private final List<T> choiceList;
    private final Random rnd = new Random();

    // producer 이므로 extends
    public Chooser(Collection<? extends T> choices) {
        choiceList = new ArrayList<>(choices);
    }

    public T choose() { return choiceList.get(rnd.nextInt(choiceList.size()));}


    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        Chooser<Integer> chooser = new Chooser(intList);
    }

}

