import java.util.Set;
import java.util.TreeSet;

/**
 * Created by dylan on 08/03/2017.
 */
public class MissingInteger {

    public int solution(int[] A) {
        Set<Integer> numbers = new TreeSet<>();
        int result = 1;

        for (int a : A) {
            numbers.add(a);
        }

        while (numbers.contains(result)) {
            result++;
        }

        return result;
    }
}
