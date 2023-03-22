public class BankAccount {
    private double balance;
    private String account;
    private String ownerName;
    private Object accountNumber;
    
    // setters
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void setAccountNumber(String account) {
        this.accountNumber = accountNumber;
    }
    
    public void setOwner(String ownerName) {
        this.ownerName = ownerName;
    }
    
     //getters
         public double getBalance() {
        return balance;
    }
    
    public String getNumber() {
        return (String)accountNumber;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
}