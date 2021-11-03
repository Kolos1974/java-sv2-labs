package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        String together = ""+1+2;
        System.out.println(together);
        together= "1"+"2";
        System.out.println(together);

        System.out.println(Integer.toString(1)+Integer.toString(2));

        // double quotient = 3 / 4;
        double quotient = 3.0 / 4.0;
        System.out.println(quotient);
        quotient = 3 / 4d;
        System.out.println(quotient);

        long big = 3_244_444_444L;
        System.out.println(big);

        String word = "TITLE";
        System.out.println(word);
        word ="title".toUpperCase();
        System.out.println(word);

        Integer one = 1;
        System.out.println(Integer.toBinaryString(one));
        Integer two = -2;
        System.out.println(Integer.toBinaryString(two));


    }



}
