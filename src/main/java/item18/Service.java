package item18;

public class Service {
    public void run(FunctionToCall functionToCall) {
        System.out.println("wowowo");
        functionToCall.call();
    }

    public static void main(String[] args) {
        Service service = new Service();
        BobFunction bobfunction = new BobFunction(service);
        bobfunction.run();

        BobFunctionWrapper wrapper = new BobFunctionWrapper(bobfunction);
        wrapper.run(); // wrapper 호출되지 않음
    }
}
