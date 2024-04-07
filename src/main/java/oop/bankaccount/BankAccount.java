package oop.bankaccount;

public interface BankAccount {
    String getIBAN();
    void setIBAN(String IBAN);
    double getBalance();
    void setBalance(double balance);
    double getOperationFee();
    void setOperationFee(double operationFee);
    double getInterestRate();
    void setInterestRate(double interestRate);
    void deposit(double amount);
    double withdraw(double amount);
    double transfer(BankAccount other, double amount);
    void addInterest();
    void applyFee();

    static boolean checkIBAN(String IBAN) {
        if (IBAN == null || IBAN.length() < 8 || IBAN.length() > 34) {
            throw new IllegalArgumentException("IBAN must be between 8 and 34 characters long");
        }
        if (!IBAN.matches("[A-Z]{2}[0-9]{6,32}")) {
            throw new IllegalArgumentException("IBAN must start with 2 uppercase letters followed by 6 to 32 digits");
        }
        return true;
    }
}
