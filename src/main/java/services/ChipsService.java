package services;
import models.Chips;
import java.util.ArrayList;

public class ChipsService {

    private static int nextId = 1;

    private ArrayList<Chips> inventory = new ArrayList<>();

    public Chips create(String name, String brand, Integer sku, Double ounces, Integer qty, Double price) {

        // (2)
        Chips createdChips = new Chips(nextId++, name, brand, sku, ounces, qty, price);

        // (3)
        inventory.add(createdChips);

        // (4)
        return createdChips;
    }

    //read
    public Chips findSneaker(int id)
    {
        // should take an int and return an object with that id, if exists

        return null;
    }

    //read all
    public Chips[] findAll()
    {
        // should return a basic array copy of the ArrayList

        return null;
    }

    //delete
    public boolean delete(int id)
    {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false

        return false;
    }
}