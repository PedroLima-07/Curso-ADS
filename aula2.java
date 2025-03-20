import java.util.Scanner;
public class aula2{
    public static void main(String[] args) {
    double n1,n2,n3,media;
    String nome;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome= sc.nextLine();
        System.out.println("Digite anota da primeira nota: ");
        n1= sc.nextDouble();
        System.out.println("Digite anota da segunda prova");
        n2=sc.nextDouble();
        System.out.println("Digite anota da terceira prova");
        n3=sc.nextDouble();
        media = (n1+n2+n3)/3;
        System.out.println(nome+", a sua média final é: "+media);
    }
}