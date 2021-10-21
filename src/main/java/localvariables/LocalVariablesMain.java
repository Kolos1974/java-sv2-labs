package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {
        boolean b = false;

        System.out.println("B variables value: "+b);

        int a = 2;

        System.out.println("A variables value: "+a);

        int i = 3;
        int j = 4;

        int k = i;

        System.out.println("Variables: i:"+i+", j:"+j+", k:"+k);

        String s = "Hello World!";
        System.out.println(s);
        String t = s;
        System.out.println(t);

        {
            int x = 0;
            System.out.println("Inside blokk x: "+x);

            System.out.println("From blokk a: "+a);


        }

        // Can't reach "x" variable!
        // System.out.println("Inside blokk x: "+x);
    }
}
