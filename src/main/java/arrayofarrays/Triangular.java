package arrayofarrays;

public class Triangular {
    public static void main(String[] args) {
        Triangular triangular = new Triangular();
        int [][] matrix =  triangular.triangularMatrix(4);


        for (int i[] : matrix) {
            for (int j : i) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public int[][] triangularMatrix(int size){
        int [][] matrix = new int[size][];
        for (int i = 0; i < size; i++){
            matrix[i] = new int[i+1];
            for (int j = 0; j<=i; j++){
                matrix [i][j] = i;
            }
        }
        return matrix;
    }

}
