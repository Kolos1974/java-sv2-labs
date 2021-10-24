package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix+name;
        message = message+444;

        boolean b = "Hello John Doe".equals(message);
        boolean c = "Hello John Doe444".equals(message);

        System.out.println(prefix);
        System.out.println(name);
        System.out.println(message);

        System.out.println(b);
        System.out.println(c);

        String emptyString = ""+"";
        System.out.println("Üres String: \""+emptyString+"\"");
        System.out.println(emptyString.length());

        String example = "Abcde";
        System.out.println(example.toString()+" String hossza: "+example.length());
        System.out.println(example.substring(0,1)+", "+example.substring(2,3));
        System.out.println(example.substring(0,3));

    }

}
