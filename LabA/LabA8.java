/**
 * Created by Sanjay on 9/21/2017.
 */
public class LabA8 {
    public LabA8() {
    }

    public static void main(String[] args) {
        Integer x = Integer.parseInt(args[0]);

        System.out.println("z = " + Integer.toBinaryString(1 + ~x) + "\t" + (1 + ~x));
    }
}
