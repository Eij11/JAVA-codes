import java.util.Scanner;
import java.util.Arrays;

public class Arraymaxmin {
    public static void main(String[] args){

        Scanner myobj = new Scanner(System.in);
        
        int arr[] = new int[10];

        System.out.println("===========================");
        System.out.println("\nPlease enter 10 numbers ");
        System.out.println("\n===========================");

        for (int i = 0; i < 10; i++){
            System.out.print("Enter a number: ");
            arr [i] = myobj.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

            for (int i = 0; i < 10; i++){
                    if(arr[i] > max){
                    max = arr[i];
                    }
            /* if the array value is grerater than max, iaassign
            lang yung number na yun sa 'max' until ma meet yung condition.
            
            compare element with max -> if greater than max -> update max ->
            */
            }

            for (int i = 0; i < 10; i++){
                if(arr[i] < min){
                    min = arr[i];
                    }
            }
    
    System.out.println("Maximum value in array is "+max);
    System.out.println("Minimum value in array is "+min);
 

    }
}
