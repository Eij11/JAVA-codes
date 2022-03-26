import java.util.Scanner;

public class PrelimExam {
    public static void main(String[] args){

    int fnum = 0, snum = 0, value = 0;
    boolean valid = false;
    boolean valid1 = false;

    Scanner myobj = new Scanner(System.in);

        do{
            try{
            Scanner scfnum = new Scanner(System.in);
            System.out.print("Enter first number: ");
            fnum = scfnum.nextInt();
            valid = true;
            } catch(Exception e){
                System.out.println("Enter only integer value!\n\r");
            }
        }while(!valid);

        do{
            try{
            Scanner scsnum = new Scanner(System.in);
            System.out.print("Enter second number: ");
            snum = scsnum.nextInt();
            valid1 = true;
            } catch(Exception e){
                System.out.println("Enter only integer value!\n\r");
            }
        }while(!valid1);

        System.out.println("\nSelection: ");
        System.out.println("a. Addition");
        System.out.println("b. Subtraction");
        System.out.println("c. Multiplication");
        System.out.println("d. Division");
        System.out.println("e. Modulus");

        System.out.print("\nEnter the letter of your chocie: ");
        char option = myobj.next().charAt(0);
            if (option == 'a' || option == 'A'){
                value = fnum + snum;
                System.out.println("The sum of " + fnum + " + " + snum + " = " + value);
            }

            else if (option == 'b' || option == 'B'){
                value = fnum - snum;
                System.out.println("The difference of " + fnum + " - " + snum + " = " + value);
            }

            else if (option == 'c' || option == 'C'){
                value = fnum * snum;
                System.out.println("The product of " + fnum + " * " + snum + " = " + value);
            }

            else if (option == 'd' || option == 'D'){
                value = fnum / snum;
                System.out.println("The quotient of " + fnum + " / " + snum + " = " + value);
            }

            else if (option == 'e' || option == 'E'){
                value = fnum % snum;
                System.out.println("The modulus of " + fnum + " % " + snum + " = " + value);
            }
            else{
                System.out.println("Input invalid!");
                System.exit(0);
            }

                    if ( value % 2 == 0){
                        System.out.println("The result is an even number.");
                    }
                    else{
                        System.out.println("The result is an odd number.");
                    }
    }
}
