package ru.kk.movement._main;

import ru.kk.movement.entity.Fish;
import ru.kk.movement.entity.Ship;
import ru.kk.movement.service.MoveExecutor;

public class _Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Ship ship = new Ship();

        MoveExecutor moveExecutor = new MoveExecutor();
        moveExecutor.makemove(fish);
        moveExecutor.makemove(ship);
    }
}
