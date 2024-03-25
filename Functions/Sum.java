import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //sum();
        // int result = sum2();
        // System.out.println(result);
        int ans = sum3(20,30);
        System.out.println(ans);
    }
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter the 1st number: ");
        num1 = in.nextInt();
        System.out.println("Enter the 2nd number: ");
        num2 = in.nextInt();
        sum =  num1 + num2;
        return sum;
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter the 1st number: ");
        num1 = in.nextInt();
        System.out.println("Enter the 2nd number: ");
        num2 = in.nextInt();
        sum =  num1 + num2;
        System.out.println("The sum of 2 numbers is: "+ sum);
    }
}
