import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GreedTest {
    @Test
    @DisplayName("int array with 1 die roll")
    public void oneRollTest() {
        Greed greedTest = new Greed();
        int[] diceRolls = new int[1];
        greedTest.roll(diceRolls);
        assertTrue(diceRolls[0] >= 1 && diceRolls[0] <= 6);
    }

    @Test
    @DisplayName("testing a roll with multiple die")
    public void multiDieRoll() {
        Greed greedTest = new Greed();
        int[] diceRolls = new int[6];
        greedTest.roll(diceRolls);
        for (int roll: diceRolls)
            assertTrue(roll >= 1 && roll <= 6);
    }

    @Test
    @DisplayName("test score dice roll 1 = 100 points")
    public void testScoreRollOne() {
        Greed greedTest = new Greed();
        int[] rollOne = {1};
        assertEquals(100, greedTest.score(rollOne));
    }

    @Test
    @DisplayName("test score for a dice roll of 5")
    public void testScoreRollFive() {
        Greed greedTest = new Greed();
        int[] rollOne = {5};
        assertEquals(50, greedTest.score(rollOne));
    }
}
