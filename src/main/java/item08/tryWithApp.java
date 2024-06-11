package item08;

public class tryWithApp {
    public static void main(String[] args) {
        try (AutoClosableIsGood good = new AutoClosableIsGood()) {

        } catch (Exception e) {
            System.out.println("end");
        }
    }
}
