package weekFourteen.projectThree;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private int pin;
    private List<Account> accounts;

    //instance variables + constructor parameters
    public Customer(String firstName, String lastName, int pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.accounts = new ArrayList<>();      //Account list
    }   // hi :)

    //methods
    public void addAccount(Account account) {
        accounts.add(account);         //add an Account to the list
    }

    public void removeAccount(Account account) {
        accounts.remove(account);     //remove an Account from the list (close the account)
    }

    public Account getAccount(int accountNumber) {
        return accounts.stream().filter(acc -> acc.getAccountNumber() == accountNumber).findFirst().orElse(null);
    }     //get a single Account by account number (returns Account or null if not found)

    public List<Account> getAccounts(){
        return accounts;    //get all the Accounts’ info (returns a String)
    } // :)

    public int getPin(){
        return pin;     //returns Customer’s name, pin as a String
    }

    @Override

    public String toString() {
        return firstName + " " + lastName + " (Pin: " + pin + ")";  //any needed getters or setters

    }
}
