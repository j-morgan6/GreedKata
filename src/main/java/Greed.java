public class Greed {

    public void roll(int[] diceRolls) {
        for (int i = 0; i < diceRolls.length; i++) {
            int rand = (int)(Math.random() * 6 + 1);
            diceRolls[i] = rand;
        }
    }

    public int score(int[] rollOne) {
        int totalScore = 0;
        for (int i : rollOne) {
            if (i == 1)
                totalScore += 100;
            else if (i == 5) {
                totalScore += 50;
            }
        }
        return totalScore;
    }
}
