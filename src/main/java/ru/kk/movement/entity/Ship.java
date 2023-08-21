package ru.kk.movement.entity;

public class Ship implements Moving {
    @Override
    public void move() {
        starttheengine();
        System.out.println("Я корабль, я отважно разрезаю волны");
    }
    public void starttheengine() {
        System.out.println("Я корабль, я включаю двигатели");
    }
}
