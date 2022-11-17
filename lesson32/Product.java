package lesson32;

import java.util.Comparator;

public class Product {
    private String name;
    private double price;
    private int rank;

    public Product(String name, double price, int rank) {
        this.name = name;
        this.price = price;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return " "+  name +
                " " + price +
                " rank= " + rank +
                '\n';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRank() {
        return rank;
    }



}
