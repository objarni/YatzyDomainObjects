package se.objarniprod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RollTest {
    @Test
    void constructingValidRoll() {
        new Roll(new Dice(1), new Dice(1), new Dice(1), new Dice(1), new Dice(1));
    }

    @Test
    void countOnes() {
        Roll roll = new Roll(new Dice(1),
                new Dice(1),
                new Dice(1),
                new Dice(1),
                new Dice(1));
        assertEquals(5, roll.count(new Dice(1)));
    }
}