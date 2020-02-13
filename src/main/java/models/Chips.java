package models;

public class Chips {
    private Integer id;
    private String name;
    private String brand;
    private Integer sku;
    private Double weightInOunces;
    private Integer Qty;
    private Double price;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public Double getWeightInOunces() {
        return weightInOunces;
    }

    public void setWeightInOunces(Double weightByOunce) {
        this.weightInOunces = weightByOunce;
    }

    public Integer getQty() {
        return Qty;
    }

    public void setQty(Integer qty) {
        Qty = qty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
