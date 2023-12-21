/**
 *
 * @author PengLuo22
 * @date 2023/12/20
 * @since 0.0.1
 */
public class HelloGoodbye {

    public static void main(String[] args) {
        if (args.length != 2) {
            return;
        }

        String firstParameter = args[0];
        String secondParameter = args[1];

        System.out.println("Hello " + firstParameter + " and " + secondParameter + ".");
        System.out.println("Goodbye " + secondParameter + " and " + firstParameter + ".");




    }


}
