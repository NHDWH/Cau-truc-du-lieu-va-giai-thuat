public class canhuyen {
    public static void main(String[] args) {
        System.out.println("Canh huyen can tinh la: " + canhc(12.5, 15.9));
    }

    public static double canhc(double a, double b)
    {
        return Math.sqrt(a * a + b * b);
    }
}
