
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Take input of 2 numbers and find the sum
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter the 1st number: ");
        num1 = in.nextInt();
        System.out.println("Enter the 2nd number: ");
        num2 = in.nextInt();
        sum =  num1 + num2;
        System.out.println("The sum of 2 numbers is: "+ sum);
        in.close();
    }
}