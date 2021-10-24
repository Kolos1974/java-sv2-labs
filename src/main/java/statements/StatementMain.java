package statements;

public class StatementMain {
    public static void main(String[] args) {
        int x = 5 + 6;
        int y = 11 - x;
        int z = 8;
        boolean b = x > y ;
        boolean own =  (x>y) ? true : false;

        boolean c = ((b == true) || (z>5));

        z++;

        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        System.out.println("z value: "+z);
        System.out.println("b value: "+b);
        System.out.println("c value: "+c);

        System.out.println("");
        System.out.println("Own variable: "+own);
    }

}
