
import java.util.Scanner;

public class noel {
    public static void main(String[] args) {
        int batdau = 1;
        Scanner console = new Scanner(System.in);

        System.out.println("Xin moi nhap so doan: ");
        int n = console.nextInt();

        System.err.println("Xin moi nhap so chieu cao: ");
        int dong = console.nextInt();

        int maxleng = (1 + 2 * n) + 6;

        for (int i = 1; i <= n; i++) 
        {
            vecay(maxleng, batdau, dong);
            batdau = batdau + 2;    
        }
        vecay(maxleng, batdau, dong);
        vecay(maxleng, batdau, dong);
        vecay(maxleng, batdau, dong);
    }


    public static void vecay(int maxleng, int batdau, int dong)
    {
        int i, j;
        for (i = 1; i <= dong; i++) 
        {
            for (j = 1; j<=((maxleng - (batdau + 2 * (i-1)))/2);j++)
            {
                System.out.print(" ");
            }
            for (j = 1; j <= (batdau + 2 * (i - 1));j++)
            {
                System.out.print("*");
            }
            for (j = 1; j <=((maxleng - batdau)/2);j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
