/**
 * Created by Sanjay on 9/20/2017.
 */
public class LabA5 {
    public LabA5() {
    }

    public static void main(String[] args) {
        Integer x = Integer.parseInt(args[0]);
        Integer z = ((x << 21) >>> 31);

        System.out.println(z);

        Integer mask = 1024;
        Integer y = x & mask;
        y = (y >> 10);
        System.out.println(y);

    }
}
