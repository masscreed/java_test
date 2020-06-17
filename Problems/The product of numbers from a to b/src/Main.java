import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt();
        long rez = 1;
        for(int i = a; i < b; i++)
        {
            rez *= i;
        }
        System.out.println(rez);
    }
}