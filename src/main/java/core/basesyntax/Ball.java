package core.basesyntax;

public class Ball {
    private final Color color;
    private final int number;

    // Constructor for Ball
    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return color + " Ball" + ", number " + number;
    }
}
