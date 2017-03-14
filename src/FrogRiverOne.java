import java.util.HashSet;
import java.util.Set;

/**
 * Created by dylan on 08/03/2017.
 */
public class FrogRiverOne {

    public int solution(int X, int[] A) {
        Set<Integer> currentPossibleSteps = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            currentPossibleSteps.add(A[i]);
            if (currentPossibleSteps.size() == X) {
                return i;
            }
        }
        return -1;
    }
}
