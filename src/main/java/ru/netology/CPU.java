package ru.netology;

public class CPU extends Product implements ComputerAccessories {
    //Open Closed Principle - имплементируя интерфейс ComputerAccessories мы добавляем классу функциональности, не изменяя его код
    private final String name = "Процессор";
    private final int price = 20000;

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
        System.out.println("Процессор установлен");
    }
}