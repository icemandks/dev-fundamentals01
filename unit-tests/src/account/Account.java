package account;

/**
 * Account
 */
public class Account {

    private final int MINIMUM_BALANCE = 100;
    private int currentBalance = 0;

    public int getBalance() {
        return this.currentBalance;
    }

    public void addBalance(int cant) {
        this.currentBalance += cant;
    }

    public void reduceBalance(int cant) {
        if (this.currentBalance - cant >= this.MINIMUM_BALANCE) {
            this.currentBalance -= cant;
        }
        else {
            System.out.println("Not enough balance");
        }
    }

    public static void main() {
        Account c = new Account();
        c.addBalance(500);
        c.reduceBalance(200);
        c.reduceBalance(400);
    }
}