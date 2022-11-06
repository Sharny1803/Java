public class VipCustomer {
    private String emailAddress;
    private String name;
    private double creditLimit;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipCustomer() {
        this("Name",1000000,"emailAddress");
    }

    public VipCustomer(double creditLimit) {
        this("Name",creditLimit,"emailAddress");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
}
