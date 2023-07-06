package Bai06;

public class Main {
    public static void main(String[] args) {
        // Tạo 3 đối tượng Account
        Account acc1 = new Account(72354, "lan anh", 102.56);
        Account acc2 = new Account(69713, "nhi nhi", 40.00);
        Account acc3 = new Account(93757, "hu huyen", 759.32);

        // Gửi thêm số tiền vào tài khoản
        acc1.deposit(25.85);
        acc2.deposit(500.00);

        // Rút tiền từ tài khoản
        acc2.withdraw(430.75, 1.50);

        // Tính tiền lãi
        acc3.addInterest();

        // Xuất thông tin tài khoản
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());

        // Chuyển tiền từ acc2 sang acc1
        acc2.transfer(acc1, 100.00);

        // Xuất thông tin sau khi chuyển tiền
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
    }
}
