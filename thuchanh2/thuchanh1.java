public class thuchanh1 {

    public static void main(String[] args) {
        // khai bao bien
        double height;
        double weight;
        double bmi;

        // tinh toan BMI
                //gan du lieu
        height = 70;
        weight = 195;
        bmi = weight/(height*height)*703;

        // hien thi ket qua
        System.out.println("Gia tri BMI: ");
        System.err.println(bmi);

        // Khoi tao gia tri ban dau
        double height2 = 70;
        double weight2 = 195;
        double bmi2 = weight2/(height2*height2)*703;

        // hien thi ket qua
        System.out.println("Gia tri BMI 2: ");
        System.out.println(bmi2);
        System.out.println();
        // dung noi chuoi
        System.out.println("Gia tri BMI 2: " + bmi2);
        System.out.println();

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}