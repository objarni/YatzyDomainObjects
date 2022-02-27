package se.objarniprod;

public class Dice {
    public int value;

    public Dice(int value) {
        if (value < 1 || value > 6)
            throw new IllegalArgumentException();
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass())
            return false;
        return ((Dice) o).value == value;
    }

    @Override
    public String toString() {
        return "Dice of " + value;
    }
}
