package ru.netology;

public class ComputerCase extends Product implements ComputerAccessories, DiscountedProducts {
    private final String name = "Корпус АТХ";
    private final int price = 3500;

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
        System.out.println("Корпус АТХ установлен");
    }

    @Override
    public void markdown() {
        System.out.println("Корпус уценен");
    }
}