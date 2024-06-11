package item01;

public class HelloServiceImpl implements HelloService{
    private String var;

    public HelloServiceImpl() {
        System.out.println("created");
    }

    public HelloServiceImpl(String var) {
        this.var = var;
    }

    @Override
    public String hello() {
        return "hello impl1";
    }
}
