public class Main {
    public static void main(String[] args) {
//         BankAccount account = new BankAccount("123456789",0.00,
//                 "Jon Doe","JonDoe@gmail.com","+48123456789");
// empty const. gets its variables from inheritance (super const.) ^^
        BankAccount account = new BankAccount();
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account balance: " + account.getAccountBalance() + "$");
        System.out.println("Customer name: " + account.getCustomerName());
        System.out.println("Customer E-Mail: " + account.getCustomerEmailAddress());
        System.out.println("Customer telephone: " + account.getCustomerPhoneNumber());
        System.out.println();
        VipCustomer vipCustomer = new VipCustomer();
        System.out.println("Vip customer name: " + vipCustomer.getName());
        System.out.println("Vip customer credit limit: " + vipCustomer.getCreditLimit());
        System.out.println("Vip customer email address: " + vipCustomer.getEmailAddress());
    }
}