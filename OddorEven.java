import java.util.Scanner;

public class Main
{
  public static void main(String[] args){
  
    int a=0, b=0;

    Scanner myobj = new Scanner(System.in);

    do{
    System.out.print("Enter first number: ");
    a = myobj.nextInt();
    System.out.print("Enter second number: ");
    b = myobj.nextInt();
      if(a == b){
        System.out.println("The two numbers are equal, please try again.\r\n");
      }
    }while(a == b);
        if(a != b){
          System.out.println("Number starting from " + a + " to " + b + ": ");
          for (int i = a; i <= b; i++){
            System.out.print(i + " ");
          }


          System.out.println("\nEven: ");
          for (int i = a; i <= b; i++){
            if(i%2 == 0){
              System.out.print(i + " ");
            }
          }
          
          System.out.println("\nOdd: ");
          for (int i = a; i <= b; i++){
            if (i%2 != 0){
              System.out.print(i + " ");
            }           
          }
        }

  }
}
