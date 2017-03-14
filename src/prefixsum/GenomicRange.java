package prefixsum;

/**
 * Created by dylan on 09/03/2017.
 */
public class GenomicRange {

    public int[] solution(String S, int[] P, int[] Q) {
        int results[] = new int[P.length];
        int aOccur[] = new int[S.length()];
        int cOccur[] = new int[S.length()];
        int gOccur[] = new int[S.length()];

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'A') {
                aOccur[i]++;
            } else if (S.charAt(i) == 'C') {
                cOccur[i]++;
            } else if (S.charAt(i) == 'G') {
                gOccur[i]++;
            }
        }

        for (int i = 0; i < P.length; i++) {
            if (P[i] == 0) {
                if (aOccur[Q[i] - 1] > 0) {
                    results[i] = 1;
                } else if (cOccur[Q[i] - 1] > 0) {
                    results[i] = 2;
                } else if (gOccur[Q[i] - 1] > 0) {
                    results[i] = 3;
                } else {
                    results[i] = 4;
                }
            } else {
                if (aOccur[Q[i] - 1] > aOccur[P[i] - 1]) {
                    results[i] = 1;
                } else if (cOccur[Q[i] - 1] > cOccur[P[i] - 1]) {
                    results[i] = 2;
                } else if (gOccur[Q[i] - 1] > gOccur[P[i] - 1]) {
                    results[i] = 3;
                } else {
                    results[i] = 4;
                }
            }
        }
        return results;
    }
}
