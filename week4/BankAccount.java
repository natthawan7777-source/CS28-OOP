package week4;

public class BankAccount {
    // ข้อมูลภายในคลาส (Encapsulation)
    private String accountNo;
    private String ownerName;
    private double balance;
    private int pin;

    // Constructor
    public BankAccount(String accountNo, String ownerName, double balance, int pin) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
        this.pin = pin;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean checkPin(int inputPin) {
        return this.pin == inputPin;
    }

    // เมธอดแสดงข้อมูลบัญชี
    public void showInfo() {
        System.out.println("=== ข้อมูลบัญชี ===");
        System.out.println("เลขที่บัญชี : " + accountNo);
        System.out.println("ชื่อเจ้าของบัญชี : " + ownerName);
        System.out.println("ยอดเงินคงเหลือ : " + balance + " บาท");
    }

    // เมธอดฝากเงิน
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("ฝากเงินสำเร็จ " + amount + " บาท");
        } else {
            System.out.println("จำนวนเงินฝากไม่ถูกต้อง");
        }
    }

    // เมธอดถอนเงิน
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("จำนวนเงินถอนไม่ถูกต้อง");
        } else if (amount > balance) {
            System.out.println("ยอดเงินคงเหลือไม่พอ");
        } else {
            balance -= amount;
            System.out.println("ถอนเงินสำเร็จ " + amount + " บาท");
        }
    }

    // เมธอดโอนเงินไปยังบัญชีอื่น (กำหนดขั้นต่ำมากกว่า 500 บาท)
    public void transfer(BankAccount targetAccount, double amount) {
        if (amount <= 500) {
            System.out.println("จำนวนเงินต้องมากกว่า 500 บาทขึ้นไป");
        } else if (amount > balance) {
            System.out.println("ยอดเงินคงเหลือไม่พอ");
        } else {
            balance -= amount;
            targetAccount.deposit(amount); // เพิ่มเงินให้บัญชีปลายทาง
            System.out.println("โอนเงินสำเร็จ");
        }
    }
}