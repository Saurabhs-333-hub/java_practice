import java.util.Scanner;

public class MenuDrivenCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1,num2,option;

        System.out.println("Hello and Welcome!");
        System.out.println("OK! Let's Calculate! 🧮\n");

        System.out.print("Enter first number: ");
        num1= sc.nextInt();
        System.out.print("Enter second number: ");
        num2= sc.nextInt();
        System.out.println();
        System.out.println("Press any option for following operation:");
        System.out.println("1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division");

        System.out.print("Enter your option: ");
        option= sc.nextInt();

        if(option==1){
            System.out.println("Addition is: "+(num1+num2));
        } else if (option==2) {
            System.out.println("Subtraction is: "+(num1-num2));
        }else if (option==3) {
            System.out.println("Multiplication is: "+(num1*num2));
        }else if (option==4) {
            System.out.println("Division is: "+(num1/num2));
        }
        else{
            System.out.println("You have selected an invalid option.");
        }
    }
}
