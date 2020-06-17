import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if( a < 10 && a > 0)
            System.out.println("true");
        else
            System.out.println("false");
    }
}