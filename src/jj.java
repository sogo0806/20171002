import java.util.Scanner;

public class jj {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        char ch = sca.next().charAt(0);
        if (ch - 'A' >= 0 && ch - 'A' < 26) {
            System.out.println("up");
        }
        if (ch - 'A' >= 0 && ch - 'A' > 26) {
            System.out.println("lower");
        } else {
            System.out.println("special character");
        }
    }
}
