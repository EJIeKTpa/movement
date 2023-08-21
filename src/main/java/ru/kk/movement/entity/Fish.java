package ru.kk.movement.entity;

public class Fish implements Moving {
    @Override
    public void move() {
        startofmotion();
        System.out.println("Я маленькая рыбка, я плыву в морских глубинах");
    }
    public void startofmotion() {
        System.out.println("Я рыбка, я двигаю плавниками и хвостом");
    }
}
