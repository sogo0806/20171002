import java.util.Scanner;

public class hw7 {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        int v1 = sca.nextInt();
        if (v1<1){
            System.out.println(Math.round( Math.pow(v1,2)*3));
        }
        if (v1>1){
            System.out.println(Math.round(2*v1+3));
        }
        if ( -1 <= v1 && v1<= 1){
            System.out.println(Math.round(Math.pow(v1,3)+3*v1-3));
        }
    }
}
