/**
 * Created by dylan on 08/03/2017.
 */
public class PermCheck {

    public int solution(int[] A) {
        boolean allSolution[] = new boolean[A.length];

        for (int a : A) {
            if (a > A.length) {
                return 0;
            }
            allSolution[a - 1] = true;
        }
        return containsFalse(allSolution);
    }

    public int containsFalse(boolean allSolution[]) {
        for (boolean check : allSolution) {
            if (!check) {
                return 0;
            }
        }
        return 1;
    }
}
