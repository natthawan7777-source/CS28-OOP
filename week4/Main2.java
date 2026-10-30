package week4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // สร้างบัญชีผู้ใช้ และบัญชีปลายทางจำลองสำหรับทดสอบการโอน
        BankAccount myAccount = new BankAccount("54321", "Pangii", 2000.0, 12345);
        BankAccount targetAccount = new BankAccount("11223", "ruesan", 500.0, 00000);

        BankSystem bankSystem = new BankSystem(myAccount);

        System.out.print("กรุณากรอก PIN: ");
        int inputPin = sc.nextInt();

        if (bankSystem.checkAccount(inputPin)) {
            String menu;
            do {
                System.out.println("\n=== ระบบจัดการบัญชีธนาคาร ===");
                System.out.println("A. แสดงข้อมูลบัญชี");
                System.out.println("B. ฝากเงิน");
                System.out.println("C. ถอนเงิน");
                System.out.println("D. ตรวจสอบยอดเงินคงเหลือ");
                System.out.println("E. โอนเงินไปยังบัญชีอื่น");
                System.out.println("Q. ออกจากโปรแกรม");
                System.out.print("เลือกเมนู: ");

                menu = sc.next().toUpperCase(); // แปลงเป็นตัวพิมพ์ใหญ่เพื่อรองรับทั้ง a และ A

                switch (menu) {
                    case "A":
                        bankSystem.showInformation();
                        break;
                    case "B":
                        System.out.print("ระบุจำนวนเงินที่ต้องการฝาก: ");
                        double depositAmount = sc.nextDouble();
                        bankSystem.depositMoney(depositAmount);
                        break;
                    case "C":
                        System.out.print("ระบุจำนวนเงินที่ต้องการถอน: ");
                        double withdrawAmount = sc.nextDouble();
                        bankSystem.withdrawMoney(withdrawAmount);
                        break;
                    case "D":
                        bankSystem.checkBalance();
                        break;
                    case "E":
                        System.out.print("ระบุหมายเลขบัญชีปลายทาง: ");
                        String targetNo = sc.next();
                        System.out.print("ระบุจำนวนเงินที่ต้องการโอน: ");
                        double transferAmount = sc.nextDouble();

                        // ตรวจสอบหมายเลขบัญชีปลายทาง
                        if (targetNo.equals(targetAccount.getAccountNo())) {
                            bankSystem.transferMoney(targetAccount, transferAmount);
                        } else {
                            System.out.println("ไม่พบหมายเลขบัญชีปลายทาง");
                        }
                        break;
                    case "Q":
                        System.out.println("ออกจากโปรแกรมเรียบร้อยแล้ว");
                        break;
                    default:
                        System.out.println("เลือกเมนูไม่ถูกต้อง");
                        break;
                }
            } while (!menu.equals("Q"));
        } else {
            System.out.println("รหัส PIN ไม่ถูกต้อง");
        }

        sc.close();
    }
}