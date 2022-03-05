package ucgen;
import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int kenar1,kenar2,kenar3;
        System.out.println("1.kenar:");
        kenar1=inp.nextInt();

        System.out.println("2.kenar:");
        kenar2=inp.nextInt();

        System.out.println("3.kenar:");
        kenar3=inp.nextInt();

        int cevre=kenar1+kenar2+kenar3;
        int u= cevre/2;

        double alan;
        alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("ucgenin alani:"+alan);


    }
}
