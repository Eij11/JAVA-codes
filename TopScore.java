import java.util.Scanner;
import java.util.Arrays;

public class TopScore {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        Scanner myobj1 = new Scanner(System.in);

        int arr[] = new int[10];
        String name[] = new String[10];
        for (int i = 0; i < arr.length; i++){
            System.out.print("Name: ");
            name [i] = myobj1.nextLine();
            System.out.print("Score: ");
            arr [i] = myobj.nextInt();
            System.out.println("\r");
        }
        
        int index = 0;
        int max = arr[0];
        //will find the meximum number
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){  
            max = arr[i];
            }
        }
        //will find the index of the maximum number
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] > arr[index]) {     
                index = i;  
            } 
        } 
    System.out.println(name[index]+ " got the HIGHEST SCORE " + max +"!");



    }
}
