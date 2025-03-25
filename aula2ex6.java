import java.util.Scanner;
public class aula2ex6 {
    public static void main(String[] args) {
        int m1,m5,m10,m25,m50, R;
        double C1, C5, C10, C25, C50, S;
       Scanner sc = new Scanner(System.in);
        System.out.println("Vamos descobri quanto de dinheiro você acumulou no seu cofrinho");
        System.out.println("Quantas moedas de 1 Centavos você tem? ");
        m1 = sc.nextInt();
        System.out.println("Quantas moedas de 5 Centavos você tem? ");
        m5 = sc.nextInt();
        System.out.println("Quantas moedas de 10 Centavos você tem? ");
        m10 = sc.nextInt();
        System.out.println("Quantas moedas de 25 Centavos você tem? ");
        m25 = sc.nextInt();
        System.out.println("Quantas moedas de 50 Centavos você tem? ");
        m50 = sc.nextInt();
        System.out.println("Quantas moedas de 1 Real você tem? ");
        R = sc.nextInt();
        C1 = m1 * 0.01;
        C5 = m5 * 0.05;
        C10 = m10 * 0.10;
        C25 = m25 * 0.25;
        C50 = (m50 * 0.50);
        S = C1 + C5 + C10 + C25+ C50 +R;
        System.out.println("A Quantidade em reais que vc tem em seu cofrinho é R$"+S);
    }
}