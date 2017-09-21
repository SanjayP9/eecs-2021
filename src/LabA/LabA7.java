/**
 * Created by Sanjay on 9/20/2017.
 */
public class LabA7 {
    public LabA7() {
    }

    public static void main(String[] args) {
        Integer x = Integer.parseInt(args[0]);

        System.out.println(Integer.toBinaryString(x));

        Integer temp1 = ((x << 21) >>> 31);
        Integer temp2 = ((x << 11) >>> 31);

        if (temp1 == 1 && temp2 == 0) {
            x |= (1 << 20);
            x &= ~(1 << 10);

        } else if (temp1 == 0 && temp2 == 1) {
            x |= (1 << 10);
            x &= ~(1 << 20);
        }
        System.out.println(Integer.toBinaryString(x));
    }
}
