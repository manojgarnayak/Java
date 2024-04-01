package First_Code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, How are you?");
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextLine());
        in.close();
    }
}
