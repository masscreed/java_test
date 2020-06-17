import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b, c = 0;
        for(int i = 1; i <= a && c < a; i++) {
            for(int j = 0; j < i && c < a; j++) {
                System.out.print(i + " ");
                c += 1;
            }
        }
    }
}