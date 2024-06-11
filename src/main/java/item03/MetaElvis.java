package item03;

public class MetaElvis<T> {
    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();
    private MetaElvis() {}
    // generic singleton  factor
    // 원하는 타입으로 변환
    public static <T> MetaElvis<T> getInstance() { return (MetaElvis<T>) INSTANCE; }

    public void say(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        MetaElvis<String> elvis1 = MetaElvis.getInstance();
        MetaElvis<Integer> elvis2 = MetaElvis.getInstance();
        System.out.println(elvis2.equals(elvis1));
    }
}
