package Classes;
/**
 *
 * @author kuerta
 */
public class Admin extends User{

    public Admin(String name, String surname, String email, int id, String phoneNumber, String password) {
        super(name, surname, email, id, phoneNumber, password);
    }

    @Override
    public boolean changePassword(int id, String password) {
         if(id  == this.getID() && (password.equals(this.getPassword()))){
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
}