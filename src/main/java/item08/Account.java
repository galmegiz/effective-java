package item08;

import java.math.BigDecimal;

public class Account {
    private String accountId;

    public Account(String accountId) {
        this.accountId = accountId;

        if (accountId.equals("푸틴")) {
            throw new IllegalArgumentException("");
        }
    }

    public void transfer(BigDecimal amount, String to) {
        System.out.println("transfer");
    }
}
