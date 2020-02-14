package services;

import models.Candy;
import models.Chips;

import java.util.ArrayList;

public class CandyService {
    private static Integer nextId = 0;

    private ArrayList<Candy> inventory = new ArrayList<>();

    public Candy create(String name, String brand, Integer sku, Double weightInOunces, Integer qty, Double price)
    {
        Candy createdCandy = new Candy(++nextId, name, brand, sku, weightInOunces, qty, price);
        inventory.add(createdCandy);

        return createdCandy;
    }

    //read
    public Candy findCandy(int id)
    {
        // should take an int and return an object with that id, if exists
        for(int i = 0; i < inventory.size(); i++)
        {
            if(inventory.get(i).getId().equals(id))
            {
                return (inventory.get(i));
            }
        }

        return null;
    }

    //read all
    public Candy[] findAll()
    {
        Candy[] output = new Candy[inventory.size()];

        for(int i = 0; i < inventory.size(); i++)
        {
            output[i] = inventory.get(i);
        }

        return output;
    }

    //delete
    public boolean delete(int id)
    {
        if(findCandy(id) != null)
        {
            inventory.remove(findCandy(id));
        }

        return false;
    }
}
