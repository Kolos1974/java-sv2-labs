package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        int a = 2;

        Integer b = 2;

        // Autoboxing
        Integer c = a;

        Integer d = b;

        Integer e = Integer.valueOf(2);

        // Autoboxing
        int f = Integer.valueOf(2);

        // Autoboxing
        int g = Integer.valueOf(a);

        // Autounboxing
        int h = c;

        int i = Integer.parseInt("2");

        // Autounboxing
        Integer j = Integer.valueOf("2");


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println();

        boolean k = true;

        // Autoboxing
        Boolean l = true;

        // Autounboxing
        boolean m = Boolean.valueOf(true);

        Boolean n = Boolean.valueOf(true);

        boolean o = Boolean.parseBoolean("TrUe");

        // Autounboxing
        Boolean p = Boolean.parseBoolean("TrUe");

        boolean q = Boolean.parseBoolean("TreU");

        // Autounboxing
        Boolean r = Boolean.parseBoolean("TreU");

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
    }
}
