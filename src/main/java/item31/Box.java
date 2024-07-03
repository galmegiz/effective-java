package item31;

public class Box<T extends Comparable<T>> implements Comparable<Box<T>>{
    @Override
    public int compareTo(Box<T> o) {
        return 0;
    }
}
