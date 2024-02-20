package ru.netology;

public class MemoryDDR5 extends Product implements ComputerAccessories {
    //Single Responsibility Principle - класс MemoryDDR5 описывает только оперативную память DDR5, а не все комплектующие
    private final String name = "Оперативная память DDR5";
    private final int price = 1800;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void assembling() {
        System.out.println("Оперативная память DDR5 установлена");
    }
}