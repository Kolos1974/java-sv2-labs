package arrays;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();
        System.out.println("A hónapok napjai: "+arraysMain.numberOfDaysAsString());
        System.out.println();
        System.out.println("A szorzótábla elemei: "+arraysMain.multiplicationTableAsString(5));
        System.out.println();

        double[] day1 = {15.2, 16.0, 17.0, 17.4, 18.1, 18.9};
        double[] day2 = {15.2, 16.0, 17.0, 17.4, 18.1, 18.9};
        System.out.println("Az első nap értékei: "+ Arrays.toString(day1));
        System.out.println("A második nap értékei: "+ Arrays.toString(day2));
        System.out.println("A napok étékei megegyeznek-e? "+arraysMain.sameTempValues(day1, day2));
        System.out.println();

        System.out.println("sameTempValuesDaylight");
        System.out.println(arraysMain.sameTempValuesDaylight(new double[]{1, 2}, new double[]{1, 2, 3}));
        System.out.println(arraysMain.sameTempValuesDaylight(new double[]{1, 3}, new double[]{1, 2, 3}));
        System.out.println();

        int[] myNumbers = {1, 2, 3, 4, 5};
        int[] wonNumbers = {5, 3, 2, 4, 1};
        System.out.println("MyNumbers: "+Arrays.toString(myNumbers));
        System.out.println("WonNumbers: "+Arrays.toString(wonNumbers));

        System.out.println("Vajon nyertem a lottón? "+arraysMain.wonLottery(myNumbers, wonNumbers));

        System.out.println("MyNumbers: "+Arrays.toString(myNumbers));
        System.out.println("WonNumbers: "+Arrays.toString(wonNumbers));
        System.out.println();

        int[] myNumbersAgain = {11, 21, 31, 41, 51};
        int[] wonNumbersAgain = {51, 31, 21, 41, 11};
        System.out.println("MyNumbersAgain: "+Arrays.toString(myNumbersAgain));
        System.out.println("WonNumbersAgain: "+Arrays.toString(wonNumbersAgain));

        System.out.println("Vajon nyertem a lottón? "+arraysMain.wonLotteryStayPosition(myNumbersAgain, wonNumbersAgain));
        System.out.println("MyNumbersAgain: "+Arrays.toString(myNumbersAgain));
        System.out.println("WonNumbersAgain: "+Arrays.toString(wonNumbersAgain));
        System.out.println();

        myNumbersAgain[0] = 12;
        myNumbersAgain[1] = 22;
        myNumbersAgain[2] = 32;
        myNumbersAgain[3] = 42;
        myNumbersAgain[4] = 52;
        wonNumbersAgain[0] = 52;
        wonNumbersAgain[1] = 32;
        wonNumbersAgain[2] = 22;
        wonNumbersAgain[3] = 42;
        wonNumbersAgain[4] = 12;

        System.out.println("MyNumbersAgain: "+Arrays.toString(myNumbersAgain));
        System.out.println("WonNumbersAgain: "+Arrays.toString(wonNumbersAgain));
        System.out.println();

        System.out.println("wonLottery");
        int[] winner = new int[]{1, 2, 3, 4, 5};
        int[] stake = new int[]{5, 4, 3, 2, 1};
        System.out.println(arraysMain.wonLotteryOrigin(winner, stake));
        System.out.println(Arrays.toString(winner));
        System.out.println(Arrays.toString(stake));
        System.out.println(arraysMain.wonLotteryOrigin(new int[]{1, 2, 3}, new int[]{1, 2, 2}));
    }

    public String numberOfDaysAsString() {
        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        return Arrays.toString(monthDays);
    }

    public String multiplicationTableAsString(int size){
        int[][] table = new int[size][size];
        for (int i= 0; i <size; i++){
            for (int j =0; j<size; j++){
                table[i][j]=(i+1)*(j+1);
            }
        }
        return Arrays.deepToString(table);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day, anotherDay);
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int min = min(day.length, anotherDay.length);
        double[] rangeOfDay = Arrays.copyOfRange(day, 0, min);
        double[] rangeOfAnotherDay = Arrays.copyOfRange(anotherDay, 0, min);
        return Arrays.equals(rangeOfDay, rangeOfAnotherDay);
    }

    private int min(int a, int b){
        if (a < b){
            return a;
        } else {
            return b;
        }
    }

    public boolean wonLottery(int[] myNumbers, int[] wonNumbers) {
        if (!(myNumbers.length==wonNumbers.length)) {
            return false;
        }

        boolean won = true;
        for (int i=0; i< myNumbers.length; i++){
            boolean found= false;
            for (int j=0; j<wonNumbers.length; j++){
                if (myNumbers[i]==wonNumbers[j]) {
                    found = true;
                }
            }
            won = won && found;
        }

        Arrays.sort(myNumbers);
        Arrays.sort(wonNumbers);

        return won;
    }

    public boolean wonLotteryStayPosition(int[] myNumbers, int[] wonNumbers) {
        if (!(myNumbers.length==wonNumbers.length)) {
            return false;
        }

        int []myNumbersCopied = Arrays.copyOf(myNumbers, myNumbers.length);
        int []wonNumbersCopied = Arrays.copyOf(wonNumbers, wonNumbers.length);

        Arrays.sort(myNumbersCopied);
        Arrays.sort(wonNumbersCopied);

        boolean won = true;
        for (int i=0; i< myNumbersCopied.length; i++){
            if (!(myNumbersCopied[i]==wonNumbersCopied[i])) {
                    won = false;
            }
        }
        return won;
    }

    public boolean wonLotteryOrigin(int[] winner, int[] stake) {

//        Arrays.sort(winner);
//        Arrays.sort(stake);
//        return Arrays.equals(winner, stake);

        int[] copyOfWinner = Arrays.copyOf(winner, winner.length);
        int[] copyOfStake = Arrays.copyOf(stake, stake.length);
        Arrays.sort(copyOfWinner);
        Arrays.sort(copyOfStake);
        return Arrays.equals(copyOfWinner, copyOfStake);
    }
}
