import java.util.Random;
public class RandomExample {
    public static void ShuffleArray(int givenArray[]){
        Random r=new Random();
        for(int i= givenArray.length-1;i>0;i--){
            int j=r.nextInt(i+1);
            int temp=givenArray[i];
            givenArray[i]=givenArray[j];
            givenArray[j]=temp;
        }

    }

    public static void main(String[] args) {
        System.out.println("The given array is: ");
        int []given_array={1,2,3,4};
        for (int v:given_array) {
            System.out.print(" "+v);
        }
        int [] shuffled_array;
    RandomExample.ShuffleArray(given_array);
        System.out.println("\nThe shuffled array is: ");

        for (int d : given_array){
            System.out.print(" "+d);
        }
    }
}