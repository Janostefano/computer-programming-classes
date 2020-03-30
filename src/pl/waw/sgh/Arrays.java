package pl.waw.sgh;

public class Arrays {

    public static int sumElements(int [][] matrix) {
        int sum = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                sum +=element;
            }
        }
        return sum;
    }

    public static int sumRow(int[][] matrix, int rowIndex){
        int sum = 0;

        for (int element: matrix[rowIndex]){
            sum += element;
        }

        return sum;
    }

    public static int sumColumn(int[][] matrix, int columnIndex){
        int sum = 0;

        for (int[] row :matrix){
            sum += row[columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] intArrOne = new int[3];
        int[] intArrTwo = new int[3];
        int[] intArrThree = new int[3];
        intArrOne[0] = 46;
        intArrOne[1] = 25;
        intArrOne[2] = 466;
        intArrTwo[0] = 37768;
        intArrTwo[1] = 225;
        intArrTwo[2] = 251;
        intArrThree[0] = 8935;
        intArrThree[1] = 62;
        intArrThree[2] = 324;

        int[][] matrix = new int[3][];
        matrix[0] = intArrOne;
        matrix[1] = intArrTwo;
        matrix[2] = intArrThree;

        System.out.println(sumElements(matrix));
        System.out.println(sumRow(matrix, 1));
        System.out.println(sumColumn(matrix, 1));
    }
}
