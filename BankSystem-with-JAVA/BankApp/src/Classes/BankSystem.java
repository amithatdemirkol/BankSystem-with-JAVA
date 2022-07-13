package Classes;

import java.util.ArrayList;
/**
 *
 * @author kuerta
 */
public class BankSystem {
    public static ArrayList<Customer> cust = new ArrayList<>();
    public static ArrayList<Employee> emp = new ArrayList<>();
    
    public static void addUser(User user){
        if(user instanceof Employee){
            emp.add((Employee) user);  
        }else if (user instanceof  Customer) {
            cust.add((Customer) user);  
        }
    }
    
    public static String displayEmployees(){
        String emps = "";
        for(int i = 0 ; i< emp.size() ; i++){
            emps += emp.get(i).toString();
        }
        return emps;
    }
    
    public static String displayCustomers(){
        String custs = "";
        for (int i = 0; i < cust.size(); i++) {
           custs += cust.get(i).toString();
        }
        return custs;
    }
    
    public static int searchCustomer(int id){
        for (int i = 0; i < cust.size(); i++) {
            if (id == cust.get(i).getID()) {
                return i;
            }
        }
        return -1;
    }
    
    public static int searchEmployee(int id){
    for (int i = 0; i < emp.size(); i++) {
        if (id ==emp.get(i).getID()) {
            return i;
        }
    }
    return -1;
    }
    
    public static void deleteCustomer(int id){
        for (int i = 0; i <cust.size() ; i++) {
            if (id == cust.get(i).getID()) {
            cust.remove(cust.get(i));
            }   
        }
    } 
  
    public static void deleteEmployee(int id){
        for (int i = 0; i < emp.size(); i++) {
            if (id ==emp.get(i).getID()) {
            emp.remove(emp.get(i));
            }
        }
    }

    public static Customer findCustomer(int id){
    Customer customer = null;
        for (int i =0;i<cust.size();i++) {
            if (id ==cust.get(i).getID()) {
            customer = cust.get(i);
            }
        }
        return customer;
    }

    public static Employee findEmployee(int id){
    Employee employee = null;
    
        for (int i = 0; i < emp.size(); i++) {
            if(id==emp.get(i).getID()){
            employee = emp.get(i);
            }
        }
    return employee;
    }
}
