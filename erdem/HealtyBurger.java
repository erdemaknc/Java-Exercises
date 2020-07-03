package erdem;

public class HealtyBurger extends Hamburger {
    private String healtyExtra1Name;
    private double healtyExtra1Price;

    private String healtyExtra2Name;
    private double healtyExtra2Price;


    public HealtyBurger(String meat, double price) {
        super(meat, price, "Brown rye", "Healty");
    }

    public void addHealthAddition1(String name, double price) {
        this.healtyExtra1Name = name;
        this.healtyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healtyExtra2Name = name;
        this.healtyExtra2Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healtyExtra1Name != null) {
            hamburgerPrice += this.healtyExtra1Price;
            System.out.printf("Added %s for an extra %.02f%n", this.healtyExtra1Name, this.healtyExtra1Price);
        }
        if (this.healtyExtra2Name != null) {
            hamburgerPrice += this.healtyExtra2Price;
            System.out.printf("Added %s for an extra %.02f%n", this.healtyExtra2Name, this.healtyExtra2Price);
        }
        return hamburgerPrice;
    }
}