package stringseparate;

import java.util.ArrayList;
import java.util.List;

public class Codes {
    public static void main(String[] args) {
        Codes codes = new Codes();
        List<String> list = new ArrayList<>();
        list.add("T57fbj");
        list.add("1234gs");
        list.add("xtcu45");
        list.add("548ert");
        list.add("f578GVHd");
        System.out.println(codes.getCodesStartWithLetter(list));

    }

    public String getCodesStartWithLetter(List<String> codes){
        List<String> temp = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(String element: codes){
            char[] chars = element.toCharArray();
            if ((chars[0]>='a') && (chars[0]<='z') || (chars[0]>='A') && (chars[0]<='Z')){
                temp.add(element);
            }
        }

        for (int i = 0; i<temp.size(); i++){
            sb.append(temp.get(i));
            if (i != temp.size()-1){
                sb.append(", ");
            }

        }
        return sb.toString();
    }

}
