package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        return list;
    }

    public static void main(String[] args) {
        Digits digits = new Digits();
        String text= "Valami12es45";
        digits.addDigitsToList(text);
        System.out.println("A szöveg: "+text);
        System.out.println(digits.getList().toString());
    }

    public void addDigitsToList(String text){
        char[] temp = text.toCharArray();
        for (char c : temp){
            if (Character.isDigit(c)){
                String st = Character.toString(c);
                int num = Integer.parseInt(st);
                list.add(num);
            }

        }
    }

}
