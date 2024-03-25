public class Shadowing {
    static int x;
    public static void main(String[] args) {
        System.out.println(x);
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
