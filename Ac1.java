import java.util.Scanner;
public class Ac1 {
    public static void main(String[] args) {
        String nome;
        Double AC1,AC2, AG,AF;
        Double ac1, ac2, ag, af;
        Double result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ola");
        System.out.println("Qual e o seu nome :");
        nome = sc.nextLine();
        System.out.println("Ola "+nome+" vamos calcular a sua nota final desse semestre ");
        System.out.println("A nota final e constituida por 4 metodos de Avaliação");
        System.out.println("Sendo AC1, AC2, AG e AF");
        System.out.println("Vamos começar!");
        
        System.out.println("Digite a sua da nota da AC1 :");
        AC1 = sc.nextDouble();
        ac1 = AC1 * 0.15;

        System.out.println("Digite a nota da AC2 :");
        AC2 = sc.nextDouble();
        ac2 = AC2 * 0.30;

        System.out.println("Digite a nota da AG :");
        AG = sc.nextDouble();
        ag = AG * 0.10;

        System.out.println("E por fim digite a nota da AF :");
        AF = sc.nextDouble();
        af = AF * 0.45;

        System.out.println("Suas notas esse semestre foram");

        System.out.println("AC1: "+ AC1);

        System.out.println("AC2: "+ AC2);

        System.out.println("AG: "+ AG);

        System.out.println("AF: "+ AF);

        System.out.println("Agora com as suas notas ja podemos realizar o calculo da sua nota final");
        System.out.println("Este calculo é AC1*0.15 + AC2*0.30 +AG*0.10 + AF*0.45");
        System.out.println("Para você passar de semestre sua nota minima precisa ser igual ou superior a 5");
         
        result = (ac1+ac2+ag+af);
        
        System.out.println(" Sua nota final neste semestre será "+result);

        if (result >= 5) {
            System.out.println("Parabens "+nome+" você foi aprovado");
        }else{
            System.out.println(nome+ "infelizmente você foi reprovado");
        }
    }
}
