package arrayofarrays;

public class ArrayOfArrays {
    public static void main(String[] args) {
        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();
        int [][] numbers = new int[4][3] ;
        numbers[0][0] = 0;
        numbers[0][1] = 1;
        numbers[0][2] = 2;

        numbers[1][0] = 0;
        numbers[1][1] = 1;
        numbers[1][2] = 2;

        numbers[2][0] = 0;
        numbers[2][1] = 1;
        numbers[2][2] = 2;

        numbers[3][0] = 0;
        numbers[3][1] = 1;
        numbers[3][2] = 2;

        int [][] otherNumbers = {{0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}};

        arrayOfArrays.printArrayOfArrays(numbers);
        System.out.println();
        arrayOfArrays.printArrayOfArrays(otherNumbers);
    }

    public void printArrayOfArrays(int[][] a){
/*
        for (int i=0; i<a.length; i++){
            System.out.print(a[i][0]+" ");
            System.out.print(a[i][1]+" ");
            System.out.print(a[i][2]+" ");
            System.out.println();
        }
*/
        for (int i[] : a) {
            for (int j : i) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
