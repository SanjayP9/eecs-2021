
/**
 * Created by Sanjay on 9/20/2017.
 */
public class LabA4 {
    public LabA4() {
    }

    public static void main(String[] args) {
        Integer x = Integer.parseInt(args[0]);

        System.out.println("One Shift:\nOperation\tBinary\tDecimal");
        System.out.println("x = \t\t" + Integer.toBinaryString(x) + "\t" + x);
        System.out.println("x << 1 = \t" + Integer.toBinaryString(x << 1) + "\t" + (x << 1));
        System.out.println("x >>> 1 = \t" + Integer.toBinaryString(x >>> 1) + "\t" + (x >>> 1));
        System.out.println("x >> 1 = \t" + Integer.toBinaryString(x >> 1) + "\t" + (x >> 1));

        System.out.println("\n\nTwo Shifts:\nOperation\tBinary\tDecimal");
        System.out.println("x = \t\t" + Integer.toBinaryString(x) + "\t" + x);
        System.out.println("x << 2 = \t" + Integer.toBinaryString(x << 2) + "\t" + (x << 2));
        System.out.println("x >>> 2 = \t" + Integer.toBinaryString(x >>> 2) + "\t" + (x >>> 2));
        System.out.println("x >> 2 = \t" + Integer.toBinaryString(x >> 2) + "\t" + (x >> 2));
    }
}
