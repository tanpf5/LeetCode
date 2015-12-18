
public class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0, cow = 0;
        int[] array = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            int index = Character.getNumericValue(secret.charAt(i));
            ++array[index];
        }
        for (int j = 0; j < guess.length(); j++) {
            int index = Character.getNumericValue(guess.charAt(j));
            if (guess.charAt(j) == secret.charAt(j)) {
                ++bull;
                if (array[index] == 0) {
                    --cow;
                } else {
                    --array[index];
                }
            } else {
                if (array[index] > 0) {
                    ++cow;
                    --array[index];
                }
            }
        }
        return bull + "A" + cow + "B";
    }
}
