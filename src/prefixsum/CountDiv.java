package prefixsum;

/**
 * Created by dylan on 08/03/2017.
 */
public class CountDiv {
    public int solution(int A, int B, int K) {
        return A % K == 0 ? B / K - A /K - 1 : B / K - A /K;
    }
}
