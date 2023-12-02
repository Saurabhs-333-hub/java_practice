import java.util.Scanner;

public class PositinveNegativeZero {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        a= sc.nextInt();
        if (a==0){
            System.out.println("It is Zero.");
        }else if(a>0){
            System.out.println("It is Positive.");
        }else{
            System.out.println("It is Negative.");
        }
    }
}
