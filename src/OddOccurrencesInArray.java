import java.util.Arrays;

/**
 * Created by dylan on 07/03/2017.
 */
public class OddOccurrencesInArray {

    public int solution(int[] A) {
        int unique = 0;
        for (int a : A) {
            unique ^= a;
        }
        return unique;
    }
}
