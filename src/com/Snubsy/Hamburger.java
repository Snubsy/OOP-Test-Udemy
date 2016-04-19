package com.Snubsy;

/**
 * Created by Snubsy on 4/15/2016.
 */
public class Hamburger {

    private String name;
    private String meat;
    private String breadRoll;
    private String extra1Name;
    private String extra2Name;
    private String extra3Name;
    private String extra4Name;

    private double price;
    private double extra1Price;
    private double extra2Price;
    private double extra3Price;
    private double extra4Price;

    public Hamburger(String name, double price, String breadRoll, String meat) {
        this.name = name;
        this.price = price;
        this.breadRoll = breadRoll;
        this.meat = meat;
    }

    public void addExtra1(String name, double price) {
        this.extra1Name = name;
        this.extra1Price = price;
    }

    public void addExtra2(String name, double price) {
        this.extra2Name = name;
        this.extra2Price = price;
    }

    public void addExtra3(String name, double price) {
        this.extra3Name = name;
        this.extra3Price = price;
    }

    public void addExtra4(String name, double price) {
        this.extra4Name = name;
        this.extra4Price = price;
    }

    public double additionBurger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRoll + " bun " + " price " + this.price);

        if (this.extra1Name != null) {
            hamburgerPrice += this.extra1Price;
            System.out.println("Added " + this.extra1Name + " for an extra " + this.extra1Price);
        }

        if (this.extra2Name != null) {
            hamburgerPrice += this.extra2Price;
            System.out.println("Added " + this.extra2Name + " for an extra " + this.extra2Price);
        }

        if (this.extra3Name != null) {
            hamburgerPrice += this.extra3Price;
            System.out.println("Added " + this.extra3Name + " for an extra " + this.extra3Price);
        }

        if (this.extra4Name != null) {
            hamburgerPrice += this.extra4Price;
            System.out.println("Added " + this.extra4Name + " for an extra " + this.extra4Price);
        }
        return hamburgerPrice;
    }

    public String getName() {
        return name;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public double getPrice() {
        return price;
    }
}

class VeggieBurger extends Hamburger {

    private String veggExtra1Name;
    private String veggExtra2Name;

    private double veggExtra1Price;
    private double veggExtra2Price;

    public VeggieBurger(double price) {
        super("Veggie Burger", price, "Rye Bread", "Veggie Pattie");
    }

    public void veggExtra1 (String name, double price) {
        this.veggExtra1Name = name;
        this.veggExtra1Price = price;
    }

    public void veggExtra2 (String name, double price) {
        this.veggExtra2Name = name;
        this.veggExtra2Price = price;
    }

    public double additionVeggie() {
        double veggiePrice = this.getPrice();
        System.out.println(this.getName() + " on a " + this.getBreadRoll() + " bun " + " price " + this.getPrice());

        if (this.veggExtra1Name != null) {
            veggiePrice += this.veggExtra1Price;
            System.out.println("Added " + this.veggExtra1Name + " for an extra " + this.veggExtra1Price);
        }

        if (this.veggExtra2Name != null) {
            veggiePrice += this.veggExtra2Price;
            System.out.println("Added " + this.veggExtra2Name + " for an extra " + this.veggExtra2Price);
        }
        return veggiePrice;
    }

}

class DeluxeBurger extends Hamburger {

    private String deluxeExtra1Name;
    private String deluxeExtra2Name;

    private double deluxeExtra1Price;
    private double deluxeExtra2Price;

    public DeluxeBurger() {
        super("Deluxe Burger", 5.50, "White", "Beef");
    }

    public void deluxeExtra1 () {
        String name = "Soda";
        double price = 1.50;

        this.deluxeExtra1Name = name;
        this.deluxeExtra1Price = price;
    }

    public void deluxeExtra2 () {
        String name = "Fries";
        double price = 1.25;

        this.deluxeExtra2Name = name;
        this.deluxeExtra2Price = price;
    }

    public double additionDeluxe() {
        deluxeExtra1();
        deluxeExtra2();

        double deluxePrice = this.getPrice();
        System.out.println(this.getName() + " on a " + this.getBreadRoll() + " bun " + " price " + this.getPrice());

        if (this.deluxeExtra1Name != null) {
            deluxePrice += this.deluxeExtra1Price;
            System.out.println("Added " + this.deluxeExtra1Name + " for an extra " + this.deluxeExtra1Price);
        }

        if (this.deluxeExtra2Name != null) {
            deluxePrice += this.deluxeExtra2Price;
            System.out.println("Added " + this.deluxeExtra2Name + " for an extra " + this.deluxeExtra2Price);
        }
        return deluxePrice;
    }
}