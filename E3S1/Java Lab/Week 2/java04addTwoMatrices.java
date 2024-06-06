import java.util.Scanner;

public class java04addTwoMatrices {
    public static void main(String[] args) {
        int row, col;
        Scanner scanning = new Scanner(System.in);
        row = scanning.nextInt();
        col = scanning.nextInt();
        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        // System.out.println("A Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = scanning.nextInt();
            }

        }
        // System.out.println("B Matrix");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = scanning.nextInt();x
            }

        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();

        }

    }
}
