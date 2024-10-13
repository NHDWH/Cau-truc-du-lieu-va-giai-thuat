public class vehinh4 {
    public static void main(String[] args) {
        drawDiamond();
        drawX();
        drawRocket();
    }
    public static void drawDiamond() 
    {
        drawCone();
        drawV();
    }
    public static void drawX()
    {
        drawV();
        drawCone();
    }
    public static void drawRocket()
    {
        drawCone();
        drawbox();
        System.out.println("|  viet|");
        System.out.println("|   nam|");
        drawbox();
        drawCone();
    }
    public static void drawCone()
    {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }

    public static void drawV()
    {
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }

    public static void drawbox()
    {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
}
