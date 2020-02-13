package models;

public class Candy
{

    // Should some of these be final without setters?
    private int id;
    private String name;
    private String brand;
    private int sku;
    private double weightInOunces;
    private int qty;
    private double price;

    public Candy() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getSku() {
        return sku;
    }

    public double getWeightInOunces() {
        return weightInOunces;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public void setWeightInOunces(double weightInOunces) {
        this.weightInOunces = weightInOunces;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}