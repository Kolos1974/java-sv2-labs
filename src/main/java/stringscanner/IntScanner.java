package stringscanner;

import java.util.Scanner;

public class IntScanner {
    public static void main(String[] args) {
        IntScanner intScanner = new IntScanner();
        String text= "5;3;107;12;123;18;198";
        System.out.println(intScanner.convertInts(text));
    }

    public String convertInts(String ints){
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(ints).useDelimiter(";");
        while (sc.hasNextInt()){
            int num = sc.nextInt();
            if (num>100) {
                sb.append(num);
                sb.append(",");
            }
        }

        if (sb.toString().length()==0){
            return "";
        }
        return sb.toString();
    }

}
