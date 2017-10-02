import java.util.Scanner;

public class hw5 {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        int v1 = sca.nextInt();
        int a = v1/1000;
        v1 = v1%1000;
        int b = v1/100;
        v1 = v1%100;
        int c = v1/10;
        v1 = v1%10;
        System.out.println(a+"thousand "+b+"hundred "+c+"ten "+v1+"dollar ");




    }

}
