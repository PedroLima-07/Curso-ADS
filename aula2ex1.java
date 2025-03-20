import java.util.Scanner;
public class aula2ex1{
    public static void main(String[] args) {
        int P, Q, C,S;
        P = 50;
        Q = 100;
        C = 100;
        Scanner sc= new Scanner(System.in);
        System.out.println("Quantos Hamburgueres voce deseja:");
        S = sc.nextInt();
        System.out.println("A quantidade de ingredientes que voce precisara comprar é");
        System.out.println(S*P+" de presunto");
        System.out.println(S*Q+" de queijo");
        System.out.println(S*C+" de carne");

    }
    
}
