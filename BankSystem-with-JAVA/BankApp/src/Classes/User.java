package Classes;
/**
 *
 * @author kuerta
 */
abstract class User {
    //Data fields
    private String name;
    private String surname;
    private String email;
    private int id;
    private String phoneNumber;
    private String password;
    //************************************************
    //constructor method
    public User(String name, String surname, String email, int id, String phoneNumber, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
    abstract public boolean changePassword(int id , String password);//abstract method for changing password
    abstract public boolean checkPassword(int id, String password);

    @Override
    public String toString() {
        return "Name: " +name + "\nSurname: " + surname +"\nE-mail: "+ email +"\nID: " + id  + "\nPhone Number: "+ phoneNumber; 
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return id;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int id) {
        this.id= id;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}