package erdem;

public class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger() {
        super("Sausage & Bacon", 14.53, "white", "Deluxe");
        super.addAddition1("chips", 2.75);
        super.addAddition2("Drink", 1.50);


    }

    public void addAddition1(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }
}
