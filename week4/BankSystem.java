package week4;

public class BankSystem {
    private BankAccount account;

    public BankSystem(BankAccount account) {
        this.account = account;
    }

    public void showInformation() {
        account.showInfo();
    }

    public void depositMoney(double amount) {
        account.deposit(amount);
    }

    public void withdrawMoney(double amount) {
        account.withdraw(amount);
    }

    public void checkBalance() {
        System.out.println("ยอดเงินคงเหลือ: " + account.getBalance() + " บาท");
    }

    // เรียกใช้เมธอดโอนเงิน
    public void transferMoney(BankAccount targetAccount, double amount) {
        account.transfer(targetAccount, amount);
    }

    public boolean checkAccount(int pin) {
        return account.checkPin(pin);
    }
}