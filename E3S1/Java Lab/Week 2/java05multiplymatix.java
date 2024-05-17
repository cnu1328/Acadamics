import java.util.Scanner;

public class java05multiplymatix {
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

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = scanning.nextInt();
            }

        }
        int[][] c=new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                for(int k=0;k<col;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();

        }

    }
}
