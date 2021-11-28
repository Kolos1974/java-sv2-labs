package algorithmscount;

public class Digits {

    public int getCountOfNumbers() {
        int result = 0;
        for (int i =10; i<100; i++){
            int left = i/10;
            int right = i-(left*10);
            if ((left+5==right) || (left==right+5)){
                result++;
            }
        }
        return result;

        // Official
        /*
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            String numberString = Integer.toString(i);
            int firstDigit = Integer.parseInt(numberString.substring(0, 1));
            int secondDigit = Integer.parseInt(numberString.substring(1));

            if (firstDigit + 5 == secondDigit || firstDigit - 5 == secondDigit) {
                count++;
            }
        }
        return count;
        */
    }
}
