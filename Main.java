package enterprise.ankur;

public class Main {

    public static void main(String[] args) {
    Hamburger hamburger = new Hamburger("Basic","minssed",3,"white");
    double price = hamburger.itemizeHamburger();
    hamburger.addHamburgerAddition1("tomato",5.6);
    hamburger.addHamburgerAddition2("cheese",6.8);
    hamburger.addHamburgerAddition3("lettuce",7.8);
    hamburger.addHamburgerAddition4("olive",3.0);
    System.out.println("Total burger price is " + hamburger.itemizeHamburger());
    Healthyburger healthyburger = new Healthyburger("bacon",4.8);
    healthyburger.addHealthAddition1("egg",4.8);
    healthyburger.addHealthAddition2("egg whites",2.6);
    System.out.println("total healthy burger price is "+ healthyburger.itemizeHamburger());
    DeluxeBurger deluxeBurger = new DeluxeBurger();
    hamburger.addHamburgerAddition1("chip",3.4);
        deluxeBurger.itemizeHamburger();
    }
}
