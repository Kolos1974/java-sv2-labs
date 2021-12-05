package methodparam.sums;

import java.util.List;

public class Sum {

    public static void main(String[] args) {
        SeparatedSum separatedSum = new SeparatedSum();

        List<Result> result = separatedSum.sum(separatedSum.readFile());

        for (Result element : result) {
            System.out.println(element.getType()+" : "+element.getAmount());
        }
    }
}
