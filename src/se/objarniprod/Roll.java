package se.objarniprod;

public class Roll {
    Dice[] dices;

    public Roll(Dice dice1, Dice dice2, Dice dice3, Dice dice4, Dice dice5) {
        dices = new Dice[]{dice1, dice2, dice3, dice4, dice5};
    }

    public int count(Dice dice) {
        int counter = 0;
        for (Dice d : dices) {
            if (d.equals(dice))
                counter ++;
        }
        return counter;
    }
}
