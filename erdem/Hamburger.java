package erdem;

public class Hamburger {

    private String meat;
    private double price;
    private String breadRollType;
    private String name;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public void addAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public Hamburger(String meat, double price, String breadRollType, String name) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public double itemizeHamburger() {
        double Hamburgerprice = this.price;
        System.out.printf("%s Hamburger ona a %s roll price is %.02f%n", this.name, this.breadRollType, this.price);
        if (this.addition1Name != null) {
            Hamburgerprice += this.addition1Price;
            System.out.printf("Added %s for an extra %.02f%n", this.addition1Name, this.addition1Price);
        }
        if (this.addition2Name != null) {
            Hamburgerprice += this.addition2Price;
            System.out.printf("Added %s for an extra %.02f%n", this.addition2Name, this.addition2Price);
        }
        if (this.addition3Name != null) {
            Hamburgerprice += this.addition3Price;
            System.out.printf("Added %s for an extra %.02f%n", this.addition3Name, this.addition3Price);
        }
        if (this.addition4Name != null) {
            Hamburgerprice += this.addition4Price;
            System.out.printf("Added %s for an extra %.02f%n", this.addition4Name, this.addition4Price);
        }
        return Hamburgerprice;

    }


}
