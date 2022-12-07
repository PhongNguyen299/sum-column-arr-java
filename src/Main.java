import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount row of array: ");
        int row =scanner.nextInt();
        System.out.print("Enter amount column of array: ");
        int col =scanner.nextInt();


        int[][] arr = new int[row][col];
        for (int i =0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.printf("Enter arr[%d][%d]: ",i,j);
                arr[i][j] = scanner.nextInt();
            }
        }
//        System.out.print("Enter column need to sum:");
//        int colS = scanner.nextInt();
//        System.out.print("Sum la: " + sumColumn(arr,colS));


        sumDiagonal(arr);
    }

    public static int sumColumn(int arr[][],int col){
        int sum =0;

        for (int i = 0; i < arr.length; i++){
          sum += arr[i][col -1];
        }

        return sum;
    }

    public static void sumDiagonal(int arr[][]){
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;

        for (int i = 0; i < arr.length;i++){
            sumDiagonal1 += arr[i][i];
            sumDiagonal2 += arr[i][arr.length - i -1];
        }

        System.out.print("Sum Diagonal 1: " + sumDiagonal1);
        System.out.print("\nSum Diagonal 2: " + sumDiagonal2);
    }
}