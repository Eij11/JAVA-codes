import java.util.Scanner;
import java.util.Arrays;

public class Arraysum {
    public static void main(String[] args){
    
    int sum = 0;

        Scanner myobj = new Scanner(System.in);

        System.out.print("Enter Arrays Length: ");
        int size = myobj.nextInt();
        // declare integer array
        int arr[] = new int[3];

        System.out.println("Enter array elements: ");
            for (int i = 0; i < 3; i++){
                arr [i] = myobj.nextInt();

                sum += arr[i];
            }
        System.out.print("Sum value of array elements are: " + sum);
    }
}
