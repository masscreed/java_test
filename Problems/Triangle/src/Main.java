import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt(), B = in.nextInt(), C = in.nextInt();
        if( A + B > C && A + C > B && B + C > A)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}