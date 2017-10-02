import java.util.Scanner;

public class abc {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        int v1 = sca.nextInt();
        if (v1 >= 60)
        {
            System.out.println("及格");
        }
        if (v1 <= 60)
        {
            System.out.println("不及格");
        }
    }
}
