package OOPS;

public class WrapperEx {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;
        //Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a,b);
        System.out.println(a + " " + b);

        final A manoj = new A("Manoj Garnayak");
        manoj.name = "Bhalu";

    }

    static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
}

class A{
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }
}