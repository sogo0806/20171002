import java.util.Scanner;

public class w {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        char ch = sca.next().charAt(0);
        if ( ch-'A'>=0 && ch-'A'>26)
        {
            System.out.println(Character.toUpperCase(ch));
        }
        if ( ch-'A' >=0 && ch-'A'<26)
        {
            System.out.println(Character.toLowerCase(ch));
        }
    }
}
