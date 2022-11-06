public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("BobBurger", "Chicken", 5, "Italian");
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        HealthyBurger healthyBurger = new HealthyBurger("Pork", 15);
        healthyBurger.addHealthyAddition1("lettuce", 5);
        System.out.println(healthyBurger.itemizeHamburger());
    }
}