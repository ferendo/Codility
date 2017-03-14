import java.util.stream.IntStream;

/**
 * Created by dylan on 07/03/2017.
 */
public class PermMissingElement {

    public int solution(int[] A) {
        int total = IntStream.of(A).sum(), normalTotal = 0;

        for (int i = 1; i <= A.length + 1; i++) {
            normalTotal += i;
        }
        return normalTotal - total;
    }
}
