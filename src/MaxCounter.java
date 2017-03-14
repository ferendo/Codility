import java.util.Arrays;

/**
 * Created by dylan on 08/03/2017.
 */
public class MaxCounter {
    public int[] solution(int N, int[] A) {
        int counter[] = new int[N];
        int currentMax = 0;
        int lastCurrentMax = 0;

        for (int a : A) {
            if (a <= N && a >= 1) {
                if (counter[a - 1] < lastCurrentMax) {
                    counter[a - 1] = lastCurrentMax + 1;
                } else {
                    counter[a - 1]++;
                }
                currentMax = Math.max(currentMax, counter[a - 1]);
            } else {
                lastCurrentMax = currentMax;
            }
        }
        // Check if all elements were given max condition
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] < lastCurrentMax) {
                counter[i] = lastCurrentMax;
            }
        }
        return counter;
    }
}
