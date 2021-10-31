package math.math;

public class MathMethods {
    public static void main(String[] args) {
        int a = 15;
        int b = 32;
        System.out.println("Két szám közül a nagyobbik: ("+a+" vagy "+b+"): "+Math.max(a, b));

        System.out.println("Két szám közül a kisebbik:  ("+a+" vagy "+b+"): "+Math.min(a, b));

        System.out.println("A PI értéke: "+Math.PI);

        System.out.println("A kerekített PI értéke: "+Math.round(Math.PI));

        double myNum = 8452.142;
        System.out.println("A számom: "+myNum+", ennek a kerekített értéke: "+Math.round(myNum));

        double myNum2 = -34.12;
        System.out.println("A számom: "+myNum2+", ennek az abszolút értéke: "+Math.abs(myNum2));

        System.out.println("Az 1 negáltja: "+Math.negateExact(1));

        System.out.println(Math.addExact(4,6));

        System.out.println(Math.subtractExact(67,32));

        System.out.println(Math.multiplyExact(12,41));

        System.out.println(Math.pow(3.2, 2));

        System.out.println(Math.incrementExact(4));

        System.out.println(Math.decrementExact(8));

        System.out.println(Math.random());




    }

}
