package com.codecool.tinkerTailor;

public class Game {

    public static void main(String[] args) {
        TinkerTailor tinkerTailor = new TinkerTailor(15, 8);
        tinkerTailor.countingOutChildren();
        System.out.println("\nThe winner is player " + tinkerTailor.getWinner() + "!");
    }
}
