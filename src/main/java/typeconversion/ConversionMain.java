package typeconversion;

import java.util.Arrays;

public class ConversionMain {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();

        double num = 17.45;
        System.out.println("Az átalakítandó szám: "+num);
        num = conversion.convertDoubleToDouble(num);
        System.out.println("Az átalakított érték: "+num);
        System.out.println();

        int[] intNumbers = {5, -14, 6, 2, 125, 354, 9738, 3};
        System.out.println(Arrays.toString(intNumbers));
        System.out.println(Arrays.toString(conversion.convertIntArrayToByteArray(intNumbers)));
        System.out.println();

        double doubleNum= 17.156;
        System.out.println("A kiinduló szám: "+doubleNum);
        System.out.println("Az első tizedes értéke: "+conversion.getFirstDecimal(doubleNum));

    }
}
