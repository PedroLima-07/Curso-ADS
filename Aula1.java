import java.util.Scanner;
    public class Aula1 {
    public static void main(String[] args){
        int num1, num2, num3, result;
      Scanner sc= new Scanner(System.in); 
      System.out.println("DIgite um numero: ");
      num1= sc.nextInt(); 
      System.out.println("Digite outro numero: ");
      num2= sc.nextInt();
      System.out.println("DIgite outro numero novamnete: ");
      num3= sc.nextInt();
      result = (num1+num2+num3)/2;
      System.out.println("A média entre esses valores será "+result);
    }
}
