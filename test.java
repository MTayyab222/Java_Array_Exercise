import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] a = new int[4][5];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = k;
                k++;
            }
        }
        System.out.println("The values of the array: ");
        for (int v = 0; v < 4; v++) {
            for (int m = 0; m < 5; m++) {
                System.out.print(" " + a[v][m]);
            }
            System.out.println(); // Add a new line after printing each row
        }
    }
}
