package Classes;
/**
 *
 * @author kuerta
 */
public class Account{
    private int AccountNum;
    private double balance;
    private String AccountType;
    private double previousBalance;
    
    public Account(int AccountNum, String AccountType){
        this.AccountNum = AccountNum;
        this.AccountType = AccountType;
        this.balance = 0;
        this.previousBalance = 0;
    }

    @Override
    public String toString() {
        return "\nAccount Num: " + getAccountNum() + "\nBalance:"+balance + "\naccount Type:"+AccountType+"\n***********************************************************\n";
    }

    /**
     * @return the AccountNum
     */
    
    public int getAccountNum() {
        return AccountNum;
    }

    /**
     * @param AccountNum the AccountNum to set
     */
    public void setAccountNum(int AccountNum) {
        this.AccountNum = AccountNum;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the AccountType
     */
    public String getAccountType() {
        return AccountType;
    }

    /**
     * @param AccountType the AccountType to set
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * @return the previousBalance
     */
    public double getPreviousBalance() {
        return previousBalance;
    }

    /**
     * @param previousBalance the previousBalance to set
     */
    public void setPreviousBalance(double previousBalance) {
        this.previousBalance = previousBalance;
    }
}