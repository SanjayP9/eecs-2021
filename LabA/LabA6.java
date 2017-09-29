/**
 * Created by Sanjay on 9/20/2017.
 */
public class LabA6 {
    public LabA6() {
    }

    public static void main(String[] args) {
        Integer x = Integer.parseInt(args[0]);

        System.out.println("Before:\t" + Integer.toBinaryString(x));
        x |= 1 << 10;
        x &= ~(1 << 11);
        System.out.println("After:\t" + Integer.toBinaryString(x));
    }
}