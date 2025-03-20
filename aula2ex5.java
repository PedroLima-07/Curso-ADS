import java.util.Scanner;
public class aula2ex5 {
    public static void main(String[] args) {
        int D,M,m,d,T;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite em numero o mês que nos estamos ?");
        M = sc.nextInt();
        m = M*30;
        System.out.println("Em que dia nos estamos ?");
        D = sc.nextInt();
        d = 30-D;
        T = m-d;
        System.out.println("Então hoje e dia "+D+"/"+M);
        System.out.println("E já faz "+T+" dias desde que começou o ano" );

    }
}
