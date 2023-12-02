import java.util.Scanner;

public class FavoriteColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your favorite color? Write it below:");
        String color= sc.next();
        System.out.println("Wow! " + color +" is a nice color.");
    }
}
