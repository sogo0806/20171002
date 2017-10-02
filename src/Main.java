import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        int v1 = sca.nextInt() % 2;
        if (v1 == 1)
        {
            System.out.println("奇數");
        }else{
            System.out.println("偶數");
        }
    }
}
