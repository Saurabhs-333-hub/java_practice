import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        a= sc.nextInt();
        if (a%2==0) {
            System.out.println("Number is Even.");
        }else{
            System.out.println("Number is Odd.");
        }
    }
}
