package domain;

import java.util.Random;

public class RandomNumber {
    private static final int MAX_RANGE = 10;
    private static final Random random = new Random();

    public static MoveNumber generateRandomIntIntRange() {
        return new MoveNumber(random.nextInt(MAX_RANGE));
    }
}
