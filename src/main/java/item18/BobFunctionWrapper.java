package item18;

public class BobFunctionWrapper implements FunctionToCall{
    private final BobFunction bobFunction;

    public BobFunctionWrapper(BobFunction bobFunction) {
        this.bobFunction = bobFunction;
    }

    @Override
    public void call() {
        this.bobFunction.call();
        System.out.println("add tihngs;");
    }

    @Override
    public void run() {
        this.bobFunction.run();
    }
}
