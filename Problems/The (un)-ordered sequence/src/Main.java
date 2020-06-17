import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), type = 0, pre = a;
        while (a != 0 && (a = in.nextInt()) != 0 && type != 3)
        {
            if(type == 0) {
                if (a > pre)
                    type = 1;
                else if ( a == pre)
                    type = 0;
                else
                    type = 2;
                pre = a;
            }
            else
            {
                if(type == 1)
                {
                    if(a >= pre)
                        type = 1;
                    else
                        type = 3;
                    pre = a;
                }
                else if(type == 2) {
                    if(a <= pre)
                        type = 2;
                    else
                        type = 3;
                    pre = a;
                }
            }
        }
        if(type == 3)
            System.out.println("false");
        else
            System.out.println("true");

    }
}