
import java.util.Scanner;

public class thanhkhoan {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // nhap so tien vay
        System.out.println("Xin moi nhap so tien can vay: ");
        double m = console.nextDouble();

        System.out.println("Xin moi nhap so nam can vay: ");
        int n = console.nextInt();

        System.out.println("Xin moi nhap so lai vay: ");
        double c = console.nextDouble();

        System.out.println("So tien ban phai tra hang thang la: " + (double) hangthang(m, c, n));
    }

    public static double hangthang(double m, double c, int n)
    {
        int nam = n * 12;
        double lai = c / 12 / 100;
        double pay = m * lai * Math.pow(lai + 1, nam) / (Math.pow(1 + lai, nam)-1);
        return pay;
    }
}
