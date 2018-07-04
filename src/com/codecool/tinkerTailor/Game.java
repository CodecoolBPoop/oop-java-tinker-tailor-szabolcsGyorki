package com.codecool.tinkerTailor;

public class Game {

    public static void main(String[] args) {
        TinkerTailor tinkerTailor = new TinkerTailor(15, 8);
        System.out.println(tinkerTailor.countingOutChildren());
        System.out.println("\nThe winner is player " + tinkerTailor.getWinner() + "!");
    }
}
