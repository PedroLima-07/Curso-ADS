import java.util.Scanner;
public class aula2ex4 {
    public static void main(String[] args) {
        double B, H, T;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual e o comprimento desse terreno ?");
        B = sc.nextInt();
        System.out.println("Qual e a largura desse terreno ?");
        H = sc.nextInt();
        T = B*H;
        System.out.println("A aréa desse terreno e de "+T+"m");
    }
}
