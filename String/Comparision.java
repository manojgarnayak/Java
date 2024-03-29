package String;

public class Comparision {
    public static void main(String[] args) {
        String a = "Manoj";
        String b = "Manoj";
        
        System.out.println(a == b);


        String name = new String("Manoj");
        String name2 = new String("Manoj");
        System.out.println(name == name2);

        System.out.println(name.equals(name2));
        System.out.println(name2.charAt(2));;
    }
}
