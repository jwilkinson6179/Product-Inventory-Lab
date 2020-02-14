package services;

import models.Candy;

import java.util.ArrayList;

public class CandyService {
    private static Integer nextId = 1;

    private ArrayList<Candy> inventory = new ArrayList<>();

    public Candy create(String name, String brand, Integer sku, Double weightInOunces, Integer qty, Double price) {
        Candy createdCandy = new Candy(nextId++, name, brand, sku, weightInOunces, qty, price);

        inventory.add(createdCandy);

        return createdCandy;
    }
}
