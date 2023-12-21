import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;


/**
 *
 * @author PengLuo22
 * @date 2023/12/20
 * @since 0.0.1
 */
public class RandomWord {
    public static void main(String[] args) {
        int count = 0;
        String champin = null;
        while (!StdIn.isEmpty()) {
            String candidate = StdIn.readString();
            count++;
            if (StdRandom.bernoulli(1 / count)) {
                champin = candidate;
            }
        }
        StdOut.println(champin);
    }
}
