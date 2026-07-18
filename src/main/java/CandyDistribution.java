import java.util.Arrays;

public class CandyDistribution {

    public static void main(String[] args) {
        int[] score = {5, 4, 3, 5, 6, 2};
        System.out.println(minCandiesRequired(score));
    }

    private static int minCandiesRequired(int[] score) {
        int[] minCadiesArray = new int[score.length];
        int minCandies = 0;
        Arrays.fill(minCadiesArray, 1);
        for (int i = 1; i < score.length; i++) {
            if (score[i - 1] < score[i]) {
                minCadiesArray[i] = minCadiesArray[i] + minCadiesArray[i - 1];
            }
        }
        for (int i = score.length - 2; i >= 0 ; i--) {
            if (score[i + 1] < score[i] && minCadiesArray[i + 1] >= minCadiesArray[i]) {
                minCadiesArray[i] = minCadiesArray[i + 1] + minCadiesArray[i];
            }
        }
        for (int i = 0; i < score.length; i++) {
            minCandies = minCandies + minCadiesArray[i];
        }
        return minCandies;
    }
}
