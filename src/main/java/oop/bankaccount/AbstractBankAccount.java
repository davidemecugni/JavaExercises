package oop.bankaccount;

public abstract class AbstractBankAccount implements BankAccount {
    protected String IBAN;
    protected double balance;
    protected double operationFee;
    protected double interestRate;

    public AbstractBankAccount(String IBAN, double balance, double operationFee, double interestRate) {
        if(BankAccount.checkIBAN(IBAN)){
            setIBAN(IBAN);
            this.balance = balance;
            setOperationFee(operationFee);
            this.interestRate = interestRate;
        }
    }

    @Override
    public String getIBAN() {
        return IBAN;
    }

    @Override
    public void setIBAN(String IBAN) {
        BankAccount.checkIBAN(IBAN);
        this.IBAN = IBAN;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getOperationFee() {
        return operationFee;
    }

    @Override
    public void setOperationFee(double operationFee) {
        if(operationFee < 0.0){
            throw new IllegalArgumentException("Invalid negative fee");
        }
        this.operationFee = operationFee;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return amount;
    }

    public double transfer(BankAccount other, double amount) {
        double withdrawn = withdraw(amount);
        other.deposit(withdrawn);
        return withdrawn;
    }

    public void addInterest(){
        balance += balance * interestRate;
    }
    public void applyFee(){
        balance -= operationFee;
    }

}
