package arrayofarrays;

public class Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        int [][] matrix =  rectangle.rectangularMatrix(4);


        for (int i[] : matrix) {
            for (int j : i) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public int[][] rectangularMatrix(int size){
        int [][] matrix = new int[size][];
        for (int i = 0; i < size; i++){
            matrix[i] = new int[size];
            for (int j = 0; j< size; j++){
                matrix [i][j] = i;
            }
        }
        return matrix;
    }

}
