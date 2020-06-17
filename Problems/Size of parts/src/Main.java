import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), a = 0, b = 0, c = 0;
        for(int i =0; i < n; i++)
        {
            switch(in.nextInt()) {
                case 0: {
                    a++;
                    break;
                }
                case 1: {
                    b++;
                    break;
                }
                case -1: {
                    c++;
                    break;
                }
            }
        }
        System.out.print(a + " " + b + " " + c);
    }
}