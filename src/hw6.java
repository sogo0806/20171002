import java.util.Scanner;

public class hw6 {

    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        int v1 = sca.nextInt();
        int v2 = sca.nextInt();
        int v3 = sca.nextInt();
        int v4 = sca.nextInt();
        int v5 = sca.nextInt();
        int v6 = sca.nextInt();
        int count1=0,count2=0,count3=0;
        if (v1>0){
            count1++;
        }else if (v1<0){
            count2++;
        }else {
            count3++;
        }
        if (v2>0){
            count1++;
        }else if (v2<0){
            count2++;
        }else {
            count3++;
        }
        if (v3>0){
            count1++;
        }else if (v3<0){
            count2++;
        }else {
            count3++;
        }
        if (v4>0){
            count1++;
        }else if (v4<0){
            count2++;
        }else {
            count3++;
        }
        if (v5>0){
            count1++;
        }else if (v5<0){
            count2++;
        }else {
            count3++;
        }
        if (v6>0){
            count1++;
        }else if (v6<0){
            count2++;
        }else {
            count3++;
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }
}
