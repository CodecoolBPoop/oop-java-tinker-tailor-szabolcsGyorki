package com.codecool.tinkerTailor;

import java.util.ArrayList;
import java.util.List;

class TinkerTailor {

    private List<Integer> childrens;
    private int childrensNumber;
    private int sequenceLength;

    TinkerTailor(int childrensNumber, int sequenceLength) {
        this.childrens = new ArrayList<>();
        this.childrensNumber = childrensNumber;
        this.sequenceLength = sequenceLength;
        this.setChildrens();
    }

    private void setChildrens() {
        for (int i = 1; i <= childrensNumber; i++) {
            childrens.add(i);
        }
    }

    List<Integer> countingOutChildren() {
        List<Integer> outSequence = new ArrayList<>();
        int j = childrensNumber;
        int i = 0;
        int k = 0;
        do {
            if (childrens.get(i) != null)
                k++;
            if (k == sequenceLength) {
                System.out.println("Player " + childrens.get(i) + " is out!");
                outSequence.add(childrens.get(i));
                childrens.set(i, null);
                j--;
                k = 0;
            }
            i++;
            if (i == childrens.size())
                i = 0;
        } while (j > 1);
        return outSequence;
    }

    Integer getWinner() {
        for (Integer child : childrens) {
            if (child != null) {
                return child;
            }
        }
        return null;
    }
}
