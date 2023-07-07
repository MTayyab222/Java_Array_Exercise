import java.util.Scanner;
public class demo_6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int row,colum;
        System.out.println("Enter the row: ");
        row=s.nextInt();
        System.out.println("Enter the column: ");
        colum=s.nextInt();
        int [][]matrix=new int[row][colum];
        int [][]matrix_2=new int[colum][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                matrix[i][j]=s.nextInt();
                matrix_2[j][i]=matrix[i][j];
            }
        }
        System.out.println("Before transposition:");
        for (int []roww:matrix) {
            for (int element:roww) {
                System.out.print(" "+element);
            }
            System.out.println();
        }

        System.out.println("After transposition:");
        for (int []rowww:matrix_2) {
            for (int element:rowww) {
                System.out.print(" "+element);
            }
            System.out.println();
        }
    }
}
