package conversions;

public class TooBigNumber {
    int maxValue = 2_147_483_647;

    public long getRightResult(int number) {
        return (long) maxValue + number;
    }

    public static void main(String[] args) {
        TooBigNumber tooBigNumber = new TooBigNumber();
        System.out.println(tooBigNumber.maxValue);
        System.out.println(150);
        System.out.println(tooBigNumber.getRightResult(150));
        System.out.println();
    }

}
