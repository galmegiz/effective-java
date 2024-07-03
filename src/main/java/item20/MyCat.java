package item20;

public class MyCat extends AbstractCat implements Flyable {
    private FlyableCat cat = new FlyableCat();
    @Override
    protected String sound() {
        return "야옹";
    }

    @Override
    protected String name() {
        return "고양이";
    }

    @Override
    public void fly() {
        cat.fly();
    }

    public static class FlyableCat extends AbstractFlyable{
        @Override
        public void fly() {
            super.fly();
        }
    }
}
