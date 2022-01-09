package exceptions.sum;

public class NumbersSum {

    public int getSum(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Üres a tömb");
        }

        int sum = 0;
        for (int element : numbers) {
            sum += element;
        }
        return sum;
    }

    public int getSum(String[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Üres a tömb");
        }

        int sum = 0;
        try {
            for (String element : numbers) {
                sum += Integer.parseInt(element);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Rossz érték a tömbben!", e);
        }
        return sum;
    }

}
