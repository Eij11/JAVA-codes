import java.util.Scanner;
import java.util. Arrays;

public class DiffSorter
{
  public static void main(String[] args){
  
  int option = 0, choice = 0;
  do{
      Scanner sc=new Scanner(System.in);

      System.out.println("Welcome to Sorting Application!");
      System.out.print("Enter the number of the elements on the lists: ");
      int size = sc.nextInt();
      int arr[]=new int[size];
      
      for (int i = 0; i < size; i++){
        System.out.print("Enter a number: ");
        arr[i] = sc.nextInt();
      }
      
      System.out.println("Sorting Algorithms:  ");
      System.out.println("[1] Bubble  ");
      System.out.println("[2] Selection  ");
      System.out.println("[3] Isertion  ");
      System.out.println("[4] Exit  ");
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();

      int temp = 0;
      int minValue, minIndex;
      
        switch (choice){
          case 1:
            System.out.println("Bubble Sort Operations: ");
              for (int i = 0;i < arr.length - 1; i++){
                for (int j = 0;j < arr.length - 1 - i; j++){
                  if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                  }
                }
              }

              for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
              }  
          break;

          case 2:
            System.out.println("Selection Sort Operations: ");
            for (int i = 0;i < arr.length; i++) {
              minValue = arr[i];
              minIndex = i;
             for (int j = i;j < arr.length; j++) {
                   if (arr[j] < minValue) {
                        minValue = arr[j];
                        minIndex = j;
                   }
              }
                  if (minValue < arr[i]) {
                      temp = arr[i];
                      arr[i] = arr[minIndex];
                      arr[minIndex] = temp;
                  }
            }

            for(int i=0; i < arr.length; i++){  
              System.out.print(arr[i] + " ");  
            }  
          break;

          case 3:
            System.out.println("Isertion Sort Operations: ");
            for (int j = 1; j < arr.length; j++) {  
              int key = arr[j];  
              int i = j-1;  
              while ( (i > -1) && (arr[i] > key)){  
                  arr [i+1] = arr [i];  
                  i--;  
              }  
              arr[i+1] = key;  
            }    

           for(int i=0; i < arr.length; i++){  
            System.out.print(arr[i] + " ");  
           } 
          break;

          case 4:
            System.out.println("Thank you for using the app!");
            System.exit(0);
          break;

          default:
            System.out.println("Invalid option!");
          break;
        }

        System.out.println("\n\nDo you want to sort another list? [1] YES [2] No");
        option = sc.nextInt();
        
        }while(option == 1);
            if (option == 2){
              System.out.println("Thank you for using the app!");
            }
            else {
              System.out.println("Invalid option!");
            }
      
  }
}
