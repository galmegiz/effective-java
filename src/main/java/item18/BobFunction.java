package item18;

public class BobFunction implements FunctionToCall{
    private final Service service;

    public BobFunction(Service service) {
        this.service = service;
    }

    @Override
    public void call() {
        System.out.println("밥을 먹는다");
    }

    @Override
    public void run() {
        this.service.run(this);
    }
}
