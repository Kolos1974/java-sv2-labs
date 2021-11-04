package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();

        System.out.println(Integer.toBinaryString(156212));
        System.out.println(operators.isEven(156212));
        System.out.println(operators.getResultOfDivision(16, 3));
        System.out.println();
        String s = null;
        System.out.println("A string null értékű-e: "+operators.isNull(s));
        s="abc";
        System.out.println("A string null értékű-e: "+operators.isNull(s));
        System.out.println();
        s=null;
        System.out.println("A string null vagy empty-e: "+operators.isEmpty(s));
        s="";
        System.out.println("A string null vagy empty-e: "+operators.isEmpty(s));
        s="abc";
        System.out.println("A string null vagy empty-e: "+operators.isEmpty(s));

    }
}
