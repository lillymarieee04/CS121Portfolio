package weekFourteen.projectThree;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private Bank bank = new Bank();

    public void runMenu() {
        while(true){
            displayMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> openAccount();
                case 2 -> accessAccount();
                case 3 -> closeAllAccounts();
                case 4 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Please try again");
            }
        }
    }
    //methods
    private void displayMainMenu() {
        System.out.println("""  
                Main Menu:
                1. Open a New Account
                2. Access an Existing Account
                3. Close All Accounts
                4. Exit
                Enter your choice, please: """);
        //used chatgpt JUST for this formatting - not any help other than this
    }
    //access an account
    public void openAccount() {
        System.out.println("Are you a new customer? (y/n)");
        String response = scanner.nextLine();
        Customer customer = null;
        if (response.equalsIgnoreCase("y")) {
            customer = createNewCustomer();
        } else {
            System.out.println("Enter PIN here");
            int pin = scanner.nextInt();
            scanner.nextLine();
            customer = bank.getCustomerByPin(pin);
            if (customer == null){
                System.out.println("Wrong PIN. Returning to main menu.");
                return; //hi :)
            }
        }
        System.out.println("Enter initial deposit amount: ");
        double initialDeposit = scanner.nextDouble();
        scanner.nextLine();
        Account newAccount = new Account(initialDeposit);
        customer.addAccount(newAccount);
        System.out.println("New Account: " + newAccount);
    }
    //open a new account
    private Customer createNewCustomer() {
        System.out.println("Enter first name, please: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name, please: ");
        String lastName = scanner.nextLine();
        System.out.println("Set your 4-digit PIN");
        int pin = scanner.nextInt();
        scanner.nextLine();
        Customer newCustomer = new Customer(firstName, lastName, pin);
        bank.addCustomer(newCustomer);
        System.out.println("Customer added: " + newCustomer);
        return newCustomer;
    }

    private void accessAccount() {
        System.out.println("Enter PIN, please: ");
        int pin = scanner.nextInt();
        scanner.nextLine();
        Customer customer = bank.getCustomerByPin(pin);
        if (customer == null) {
            System.out.println("Wrong PIN. Returning to main menu.");
            return;
        }

        System.out.println("Your Accounts: ");
        customer.getAccounts().forEach(System.out::println);
        System.out.println("Enter the account number you wish to access: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        Account account = customer.getAccount(accountNumber);
        if (account == null) {
            System.out.println("Wrong account number, returning to main menu.");
            return;  //hi :)
        }
        manageAccount(account);
    }

    private void manageAccount(Account account) {
        while (true) {
            System.out.println("""  
                Account Menu:
                1. Deposit
                2. Withdraw
                3. Check Balance
                4. Exit
                Enter your choice, please: """);
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter deposit amount, please: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    account.deposit(amount);
                }
                case 2 -> {
                    System.out.println("Enter withdrawal amount, please: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    account.withdraw(amount);
                }
                case 3 -> System.out.println("Current Balance: $ " + account.getBalance());
                case 4 -> {
                    System.out.println("Returning to the main menu.");
                    return;
                }
                default -> System.out.println("Wrong selection. Try Again.");
            }
        }
    }

    private void closeAllAccounts() {
        System.out.println("Enter PIN, please: ");
        int pin = scanner.nextInt();
        scanner.nextLine();
        Customer customer = bank.getCustomerByPin(pin);
        if (customer == null) {
            System.out.println("Wrong PIN, returning to main menu.");
            return;
        }
        bank.removeCustomer(customer);
        System.out.println("All accounts under " + customer + "'s name have been closed.");
    }
}





