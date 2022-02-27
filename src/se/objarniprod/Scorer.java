package se.objarniprod;

import java.util.List;

public class Scorer {
    private final Roll roll;

    public Scorer(Roll roll) {
        this.roll = roll;
    }

    public int scoreOf(Category category) {
        try {
            Dice dice = category.asDice();
            return dice.value * roll.count(dice);
        } catch (IllegalArgumentException e) {
            for(int i : List.of(3, 4, 5)) {
                Dice dice = new Dice(i);
                if (roll.count(dice) >= 2)
                    return dice.value * 2;
            }
            return 0;
        }
    }
}
