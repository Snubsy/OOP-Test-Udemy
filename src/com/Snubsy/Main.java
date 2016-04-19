package com.Snubsy;

/**
 * The purpose of the application is to help a fictitious company called Bill's Burgers to manage their process of selling hamburgers.
 * Our application will help Bill to select types of burgers, some of the additional items (additions) to be added to the burgers and pricing.
 * We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
 * The basic hamburger should have the following items:
 * bread roll type, meat and up to 4 additional additions (lettuce, tomato, carrot etc.) that the customer can select to be added to the burger.
 * Each one of these items gets charged an additional price so you need some way to track how many items got added and to calculate the price (for the base burger and all the additions).
 * This burger has a base price and the additions are all separately priced.
 * Create a Hamburger class to deal with all the above.
 * The constructor should only include the roll type, meat, and price.
 * Also create two extra varieties of Hamburgers (classes) to cater for
 * a) Healthy Burger (on a brown rye bread roll), plus two addition items can be added.
 * The healthy burger can have a total of 6 items (Additions) in total.
 * hint: you probably want to process the 2 additional items in this new class, not the base class, since the 2 additions are only appropriate for this new class.
 * b) Deluxe Burger - comes with chips and drinks as additions, but no extra additions are allowed.
 * hint: You have to find a way to automatically add these new additions at the time the deluxe burger object is created, and then prevent other additions being made.
 * All 3 classed should have a method that can be called anytime to show the base price of the hamburger plus all additions, each showing the additions name, price and a grand total for the burger.
 * For the two additional classes this may require you to be looking at the base class for pricing and then adding total onto that.
 */

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic",2.50,"White bread","Sirloin");
        VeggieBurger veggieBurger = new VeggieBurger(3.50);
        DeluxeBurger deluxeBurger = new DeluxeBurger();

        hamburger.addExtra1("Bacon", 1.25);
        hamburger.addExtra2("BBQ Sauce", 0.75);
        hamburger.addExtra3("Onion", 0.50);
        hamburger.addExtra4("Tomato", 0.50);

        veggieBurger.veggExtra1("Avocado", 0.75);
        veggieBurger.veggExtra2("Kale", 0.75);

        System.out.println("Bill's Burgers" + "\n" + "123 S. Street" + "\n" + "Somehwere, CA 90000" + "\n" + "123 456-7890" + "\n");
        System.out.println(""); //Line Break
        System.out.println(hamburger.additionBurger());
        System.out.println(""); //Line break
        System.out.println(veggieBurger.additionVeggie());
        System.out.println(""); //Line break
        System.out.println(deluxeBurger.additionDeluxe());
    }
}