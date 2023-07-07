import java.util.Scanner;
public class demo_5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("We are creating a 2-D array:");
        int rows,column;
        System.out.println("Enter the no: of rows:");
        rows=s.nextInt();
        System.out.println("Enter the no: of column:");
        column=s.nextInt();

        int [][]matrix=new int[rows][column];
        System.out.println("Enter the elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]=s.nextInt();
            }
        }
        int sum=0;
        for (int []row:matrix){
            for (int element:row)
            {
                sum+=element;

            }
        }
        System.out.println("The sum of the elements is: "+sum);

    }
}