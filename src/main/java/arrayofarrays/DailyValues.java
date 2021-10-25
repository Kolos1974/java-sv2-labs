package arrayofarrays;

public class DailyValues {
    public static void main(String[] args) {
        DailyValues dailyValues = new DailyValues();
        int [][] matrix = dailyValues.getValues();

        for (int i[] : matrix) {
            for (int j : i) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public int[][] getValues(){
        int [][] matrix = new int[12][];
        for (int i = 0; i < 12; i++){
            int size = 0;
            if ((i==0) || (i==2) || (i==4) || (i==6) || (i==7) || (i==9) || (i==11)) {
                size = 31;
            }
            if ((i==3) || (i==5) || (i==8) || (i==10)) {
                size = 30;
            }
            if (i==1) {
                size = 28;
            }

            matrix[i] = new int[size];
        }
        return matrix;
    }


}
