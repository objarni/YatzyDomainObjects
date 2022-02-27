package se.objarniprod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ScoreTest {
    @Test
    void scoreOf2OnesIs2() {
        Roll roll = rollFromList(List.of(1, 2, 3, 4, 1));
        Assertions.assertEquals(2, new Scorer(roll).scoreOf(Category.Ones));
    }

    @Test
    void scoreOf3OnesIs3() {
        Roll roll = rollFromList(List.of(1, 2, 1, 4, 1));
        Assertions.assertEquals(3, new Scorer(roll).scoreOf(Category.Ones));
    }

    @Test
    void scoreOf2TwosIs4() {
        Roll roll = rollFromList(List.of(2, 2, 1, 4, 1));
        Assertions.assertEquals(4, new Scorer(roll).scoreOf(Category.Twos));
    }

    @Test
    void scoreOf3ThreesIs9() {
        Roll roll = rollFromList(List.of(2, 3, 3, 3, 1));
        Assertions.assertEquals(9, new Scorer(roll).scoreOf(Category.Threes));
    }

    @Test
    void scoreOfSinglePairOf5sIs10() {
        Roll roll = rollFromList(List.of(2, 5, 3, 5, 1));
        Assertions.assertEquals(10, new Scorer(roll).scoreOf(Category.SinglePair));
    }

    @Test
    void scoreOfSinglePairOf4sIs8() {
        Roll roll = rollFromList(List.of(4, 4, 3, 5, 1));
        Assertions.assertEquals(8, new Scorer(roll).scoreOf(Category.SinglePair));
    }

    @Test
    void scoreOfSinglePairOf3whenThereAre3isStill6() {
        Roll roll = rollFromList(List.of(4, 3, 3, 3, 1));
        Assertions.assertEquals(6, new Scorer(roll).scoreOf(Category.SinglePair));
    }

    @Test
    void scoreOfSinglePairWhenThereIsNoPairIs0() {
        Roll roll = rollFromList(List.of(2, 4, 3, 5, 1));
        Assertions.assertEquals(0, new Scorer(roll).scoreOf(Category.SinglePair));
    }

    Roll rollFromList(List<Integer> values) {
        return new Roll(
                new Dice(values.get(0)),
                new Dice(values.get(1)),
                new Dice(values.get(2)),
                new Dice(values.get(3)),
                new Dice(values.get(4))
        );
    }
}