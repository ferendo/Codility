import java.util.stream.IntStream;

/**
 * Created by dylan on 07/03/2017.
 */
public class TapeEquilibrium {

    public int solution(int[] A) {
        int total = IntStream.of(A).sum(), currentTotal = 0, minimum = 100000;

        for (int i = 0; i < A.length - 1; i++) {
            total -= A[i];
            currentTotal += A[i];
            minimum = Math.min(Math.abs(currentTotal - total), minimum);
        }
        return minimum;
    }
}
