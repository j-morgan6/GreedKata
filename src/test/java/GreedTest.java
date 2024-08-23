import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GreedTest {
    @Test
    @DisplayName("roll a random number between 1 and 6")
    public void RollOne() {
        Greed greedTest = new Greed();
        int rollTest = greedTest.roll(1);
        assertTrue(rollTest >= 1 && rollTest <= 6);
    }
}
