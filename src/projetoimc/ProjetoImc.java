package projetoimc;
import java.util.Scanner;

public class ProjetoImc {
  public static void main(String[] args) {
     Scanner leitor = new Scanner(System.in);
    System.out.println("Informe sua massa corporal: ");
    double peso = leitor.nextDouble();
    System.out.println("Informe sua altura: ");
    double altura = leitor.nextDouble();
    double imc;
    imc = peso/(altura*altura);
    System.out.println("Seu IMC é de: " + imc); 
    }
    
}
