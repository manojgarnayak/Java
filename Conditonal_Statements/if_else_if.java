class if_else_if{
    public static void main(String args[]){
        int x = 9;
        int y = 10;
        int z = 11;

        if(x > y && x > z)
            System.out.println("X is greater than both Y and Z");
        else if(y>x && y>z)
            System.out.println("Y is greater than both X and Z");
        else
            System.out.println("Z is greater than both X and Y");
    }
}