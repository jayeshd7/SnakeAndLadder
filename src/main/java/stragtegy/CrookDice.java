package stragtegy;

import java.util.Random;

public class CrookDice implements Dice{
    @Override
    public int rollDice() {
        Random random = new Random();
        return 2 + random.nextInt(3) * 2;
    }
}
