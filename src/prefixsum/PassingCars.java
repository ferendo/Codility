package prefixsum;

/**
 * Created by dylan on 09/03/2017.
 */
public class PassingCars {
    public int solution(int[] A) {
        int totalZero = 0;
        long totalPairs = 0;

        for (int a : A) {
            if (a == 0) {
                totalZero++;
            } else {
                totalPairs += totalZero;
            }
        }
        return  totalPairs > 1000000000 ? -1 : (int) totalPairs;
    }
}
