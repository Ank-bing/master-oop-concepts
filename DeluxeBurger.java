package enterprise.ankur;

public class DeluxeBurger extends Hamburger{


    public DeluxeBurger() {
        super("Deluxe", "sausage & bacon", 14.54, "white");
        super.addHamburgerAddition1("chips",6.7);
        super.addHamburgerAddition2("coke",7.8);

    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("cant add any items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("cant add any items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("cant add any items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("cant add any items to deluxe burger");
    }
}
