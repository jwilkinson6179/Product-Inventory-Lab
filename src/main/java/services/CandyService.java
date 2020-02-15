package services;

import models.Candy;

import java.util.ArrayList;

public class CandyService {
    private static Integer nextId = 0;

    private ArrayList<Candy> inventory = new ArrayList<>();

    public Candy create(String name, String brand, Integer sku, Double weightInOunces, Integer qty, Double price) {
        Candy createdCandy = new Candy(++nextId, name, brand, sku, weightInOunces, qty, price);
        inventory.add(createdCandy);

        return createdCandy;
    }

    public Candy find(int id) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getId().equals(id)) {
                return (inventory.get(i));
            }
        }

        return null;
    }

    public Candy[] findAll() {
        Candy[] output = new Candy[inventory.size()];

        for (int i = 0; i < inventory.size(); i++) {
            output[i] = inventory.get(i);
        }

        return output;
    }

    public boolean delete(int id) {
        if (find(id) != null) {
            inventory.remove(find(id));
        }

        return false;
    }
}