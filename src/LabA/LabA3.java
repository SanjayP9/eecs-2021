
/**
 * Created by Sanjay on 9/19/2017.
 */
public class LabA3 {
    public LabA3() {
    }

    public static void main(String[] args) {
        Integer x = Integer.parseInt(args[0]);
        Integer y = Integer.parseInt(args[1]);

        System.out.println("x: " + x + "\t" + Integer.toBinaryString(x));
        System.out.println("y: " + y + "\t" + Integer.toBinaryString(y));
        Integer z = x & y;
        System.out.println("x & y = " + z);
        z = x | y;
        System.out.println("x | y = " + z);
        z = x ^ y;
        System.out.println("x ^ y = " + z);
        z = ~x;
        System.out.println("~x = " + z);

    }
}

