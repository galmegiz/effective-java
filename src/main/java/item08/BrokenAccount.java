package item08;

import java.math.BigDecimal;

public class BrokenAccount extends Account{
    public BrokenAccount(String accountId) {
        super(accountId);
    }

    @Override
    protected void finalize() throws Throwable {
        this.transfer(BigDecimal.valueOf(100000), "푸틴");
    }

    public static void main(String[] args) {
        Account account = null;
        try {
            account = new BrokenAccount("푸틴");

        } catch (Exception e) {
            System.out.println("처리");
        }

        // BrokenAccount객체가 생성되지 않더라도 gc과정에서 finalize를 호출한다.
        System.gc();
    }
}
