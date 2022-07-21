package stragtegy;

import org.junit.Assert;
import org.junit.Test;

public class CrookedTest {
    @Test
    public void testCrookedScore() {
        int score = new CrookDice().rollDice();
        Assert.assertEquals(0, score % 2);
    }
}
