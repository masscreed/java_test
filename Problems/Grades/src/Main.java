import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), a = 0, b = 0, c = 0, d = 0;
        for (int i =0; i < n; i++) {
            switch(in.nextInt()) {
                case 5: {
                    a++;
                    break;
                }
                case 4: {
                    b++;
                    break;
                }
                case 3: {
                    c++;
                    break;
                }
                case 2: {
                    d++;
                    break;
                }
            }
        }
        System.out.print(d + " " + c + " " + b + " " + a);
    }
}
