package se.objarniprod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CategoryTest {
    @Test
    void gettingADiceFromOnes() {
        Assertions.assertEquals(new Dice(1), Category.Ones.asDice());
    }

    @Test
    void gettingADiceFromSixes() {
        Assertions.assertEquals(new Dice(6), Category.Sixes.asDice());
    }

    @Test
    void gettingADiceFromNonNumberCategoryIsError() {
        Assertions.assertThrows(IllegalArgumentException.class, Category.SinglePair::asDice);
    }
}