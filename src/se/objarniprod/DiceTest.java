package se.objarniprod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiceTest {

    @Test
    void constructingValidDice() {
        Assertions.assertEquals(1, new Dice(1).value);
    }

    @Test
    void cannotConstruct0ValuedDice() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> new Dice(0));
    }

    @Test
    void cannotConstruct7ValuedDice() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> new Dice(7));
    }

    @Test
    void hasNiceToStringValue() {
        Assertions.assertEquals("Dice of 2", new Dice(2).toString());
        Assertions.assertEquals("Dice of 6", new Dice(6).toString());
    }

    @Test
    void sameFacedDiceAreEqual() {
        Assertions.assertEquals(new Dice(1), new Dice(1));
    }

    @Test
    void notSameFacedDiceAreNotEqual() {
        Assertions.assertNotEquals(new Dice(1), new Dice(2));
    }
}