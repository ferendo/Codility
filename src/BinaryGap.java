/**
 * Created by dylan on 07/03/2017.
 */
public class BinaryGap {
    public int solution(int N) {
        int counter = 0, highest = 0;
        boolean flagOn = false;
        String binaryString = Integer.toBinaryString(N);

        for (char bit : binaryString.toCharArray()) {
            if (flagOn) {
                if (bit == '0') {
                    counter++;
                } else {
                    if (counter > highest) {
                        highest = counter;
                    }
                    flagOn = false;
                    counter = 0;
                }
            } else {
                if (bit == '0') {
                    counter++;
                    flagOn = true;
                }
            }

        }
        return highest;
    }
}
