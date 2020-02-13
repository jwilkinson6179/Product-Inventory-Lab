package models;

public class Candy
{

    // Should some of these be final without setters?
    private Integer id;
    private String name;
    private String brand;
    private Integer sku;
    private Double weightInOunces;
    private Integer qty;
    private Double price;

    public Candy() {

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getSku() {
        return sku;
    }

    public Double getWeightInOunces() {
        return weightInOunces;
    }

    public Integer getQty() {
        return qty;
    }

    public Double getPrice() {
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