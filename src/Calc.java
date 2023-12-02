import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int a,b;

      System.out.println("Write two numbers below:");

      a= sc.nextInt();
      b= sc.nextInt();

      System.out.println("After ADDITION result is: "+ (a+b));
      System.out.println("After SUBTRACTION result is: "+ (a-b));
      System.out.println("After MULTIPLICATION result is: "+ (a*b));
      System.out.println("After DIVISION result is: "+ (a/b));


    }
}