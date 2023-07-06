package Bai06;
import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long accountNumber;
    private String name;
    private double balance;
    private final double RATE = 0.035;

 
    public Account() {
        this(999999, "chưa xác định", 50000);
    }



    public Account(long accountNumber, String name, double balance) {
    	 this.accountNumber = accountNumber;
         this.name = name;
         this.balance = balance;
		
	}



	public Account(long accNumber, String name) {
        this(accNumber, name, 50000);
    }


    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount, double fee) {
        if (amount > 0 && amount + fee <= balance) {
            balance -= (amount + fee);
            return true;
        }
        return false;
    }

    public void addInterest() {
        balance += balance * RATE;
    }

    public boolean transfer(Account acc2, double amount) {
        if (amount > 0 && this.withdraw(amount, 0)) {
            acc2.deposit(amount);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        Locale locale = new Locale("vi", "vn");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        return "Account Number: " + accountNumber +
                "\nName: " + name +
                "\nBalance: " + formatter.format(balance);
    }
}
