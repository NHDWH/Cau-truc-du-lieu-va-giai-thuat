public class baithuchanh2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            if(i == 1){
                System.out.print("*");
            }
            if (i==2){
                System.out.print("!");
            }
            if (i==3) {
                System.out.print("'");
            }
            if (i==4){
                System.out.print("<");
            }
            for(int j = 1; j <= 2 * i + (i/2 + i % 2);j++){
                System.out.print(" ");
            }
            if (i==1){
                System.out.print("*");
            }
            if (i==2){
                System.out.print("!");
            }
            if (i==3) {
                System.out.print("'");
            }
            if (i==4){
                System.out.print(">");
            }
            System.out.println();
        }
    }
}
