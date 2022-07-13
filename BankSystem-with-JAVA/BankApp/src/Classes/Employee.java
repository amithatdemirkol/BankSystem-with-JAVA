package Classes;
/**
 *
 * @author kuerta
 */
public class Employee extends User implements ITransactions{
    private double salary;
    private String title;
    private Account acc = new Account(0, "");

    public Employee(String name, String surname, String email, int id, String phoneNumber, String password, double salary, String title,int accountNum, String accountType) {
        super(name, surname, email, id, phoneNumber, password);
        this.salary = salary;
        this.title = title;
        Account acc = new Account(accountNum, accountType);
        acc.setBalance(salary);
        
    }

    @Override
   public boolean changePassword(int id, String password) {
       if(id  == this.getID() && password == this.getPassword()){
           return true;
       }else{
           return false;
       }
    }

    @Override
    public void deposit(double amount) {
        getAcc().setPreviousBalance(acc.getBalance());
        getAcc().setBalance(acc.getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        getAcc().setPreviousBalance(acc.getBalance());
        getAcc().setBalance(acc.getBalance() - amount);
    }

    @Override
    public boolean sendMoney(int id, int amount) {
        if (BankSystem.searchEmployee(id) != -1) {
            BankSystem.emp.get(BankSystem.searchEmployee(id)).deposit(amount);
            withdraw(amount);
            return true;
        }else if (BankSystem.searchCustomer(id) != -1) {
            BankSystem.cust.get(BankSystem.searchCustomer(id)).deposit(amount);
            withdraw(amount);
            return true;
        }else{
            return false;
        }
    }
        
    @Override
    public boolean checkPassword(int id, String password){
        if((id == this.getID()) && (password.equals(this.getPassword()))){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nSalary:"+salary+acc.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @return the acc
     */
    public Account getAcc() {
        return acc;
    }



  
    
}

  
