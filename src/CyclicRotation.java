/**
 * Created by dylan on 07/03/2017.
 */
public class CyclicRotation {

    public int[] solution(int[] A, int K) {

        if (A.length == 0) {
            return A;
        } else {
            for (int i = 0; i < K; i++) {
                // Get last element
                int temp = A[A.length - 1];
                System.arraycopy(A, 0, A, 1, A.length - 1);
                A[0] = temp;
            }
            return A;
        }
    }
}
