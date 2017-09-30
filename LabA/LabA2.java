/**
 * Created by Sanjay on 9/19/2017.
 */
public class LabA2 {
    public LabA2() {
    }

    public static void main(String[] args) {
        System.out.println("0x" + Integer.toHexString(Integer.parseInt(args[0])));
        System.out.println("0x" + Integer.toHexString(Integer.reverse(Integer.parseInt(args[0]))));
        System.out.println("0x" + Integer.toHexString(Integer.reverseBytes(Integer.parseInt(args[0]))));
    }
}


