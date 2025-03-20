import java.util.Scanner;
public class aula2ex3 {
    public static void main(String[] args) {
        int ht,hx,T,X,ST,SX, SB;
        double Sl;
            T= 10;
            X = 15;
        Scanner sc = new Scanner(System.in);
        System.out.println("quantas horas voce trabalhou esse mês? ");
        ht = sc.nextInt();
        System.out.println("quantas horas extras você trabalhou esse mês? ");
        hx = sc.nextInt();
            ST = ht*T;
            SX = hx*X;
            SB = ST+SX;
            Sl = SB *0.9;
        System.out.println("O seu salario bruto desse mês e de"+ SB);
        System.out.println("E o seu salario liquido com os descontos e de "+Sl);
    }
}