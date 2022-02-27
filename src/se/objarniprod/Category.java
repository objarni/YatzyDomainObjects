package se.objarniprod;

public enum Category {
    Ones, Twos, Threes, Fours, Fives, Sixes, SinglePair;

    public Dice asDice() {
        int value = this.ordinal() + 1;
        if (value <= 6)
            return new Dice(value);
        throw new IllegalArgumentException();
    }
}
