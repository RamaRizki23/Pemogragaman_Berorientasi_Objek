package Pertemuan14.Tugas2;

// SavingsAccount.java
public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    // ERROR: Cannot override the final method from BankAccount
    /*
    @Override
    public void displayAccountInfo() {
        System.out.println("Override attempt"); 
    }
    */

    // Solusi: Tambah method baru khusus subclass
    public void displaySavingsInfo() {
        super.displayAccountInfo(); // panggil versi induk
        System.out.println("This is a savings account.");
    }
}

