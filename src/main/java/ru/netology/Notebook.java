package ru.netology;

public class Notebook extends Product implements DiscountedProducts, Service {
    //Interface Segregation Principle - применяем разные интерфейсы вместо одного большого
    //Dependency Inversion Principle - разделив интерфейсы мы не зависим от их общей функциональности,
    // мы можем поменять один интерфейс на другой
    private final String name = "Ноутбук";
    private final int price = 100000;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void markdown() {
        System.out.println("Ноутбук уценен");
    }

    @Override
    public void acceptedForRepair() {
        System.out.println("Ноутбук принят в ремонт");
    }
}