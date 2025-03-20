import java.util.Scanner;
public class aula2ex2 {
    public static void main(String[] args) {
        int P1,M2,G3,T;
        int p1,m2,g3;
            Scanner sc = new Scanner(System.in);
            System.out.println("Quantas camisas P voce deseja: ");
            P1 = sc.nextInt();
            System.out.println("Quantas camisas M voce deseja:");
            M2 =sc.nextInt();
            System.out.println("Quantas camisas G voce deseja:");
            G3 =sc.nextInt();
            p1= P1*10;
            m2=M2*12;
            g3=G3*15;
            T= p1+m2+g3;
            System.out.println("O valor da sua compra é: "+T);
    }
}
