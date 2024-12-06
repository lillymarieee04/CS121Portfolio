package weekFourteen.projectThree;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();      //This class should include a list of all Customers
    }

    //methods
    public void addCustomer(Customer customer) {
        customers.add(customer);        //add a Customer to the list
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);     //remove a Customer from the list
    }

    public Customer getCustomerByPin(int pin) {
        return customers.stream().filter(cust -> cust.getPin() == pin).findFirst().orElse(null);
    }                           //get a particular Customer by PIN (returns a Customer or null if PIN not found)

    public List<Customer> getCustomers() {
        return customers;       //get all Customer info (returns a String)
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Bank Customers: \n");
        for (Customer cust : customers) {
            sb.append(cust).append("\n");
        }
        return sb.toString();
    }
}
