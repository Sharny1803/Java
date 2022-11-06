import java.text.DecimalFormat;

public class BankAccount {
    DecimalFormat f = new DecimalFormat("##.00");
    private String accountNumber;
    private double accountBalance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return Double.parseDouble(f.format(accountBalance));

    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public void accountDeposit(double depositAmount) {
        if (depositAmount > 0) {
            accountBalance += depositAmount;
            System.out.println("You have deposited: " + depositAmount + "$");
        } else {
            System.out.println("Invalid value.");
        }
    }

    public void accountWithdraw(double withdrawAmount) {
        if (accountBalance < withdrawAmount) {
            System.out.println("You don't have enough funds to withdraw.");
        } else if (withdrawAmount > 0) {
            accountBalance -= withdrawAmount;
            System.out.println("You have withdrew: " + withdrawAmount + "$");
        } else {
            System.out.println("Invalid value.");
        }
    }

    //initialization in SUPER CONSTRUCTOR
    public BankAccount(String accountNumber, double accountBalance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        //SUPER
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
        System.out.println("Full constructor");
    }
    //initialization in CHILD CONSTRUCTOR is inherited from SUPER CONSTRUCTOR
    public BankAccount() {
        //CHILD
        this("123456789",0.00,"Default name", "Default address", "Default phone");
        System.out.println("Empty constructor");
    }
    public BankAccount(String customerName,String customerEmailAddress, String customerPhoneNumber) {
        this("123456789",0.00,customerName,customerEmailAddress,customerPhoneNumber);
        System.out.println("Half empty constructor");
    }
}
