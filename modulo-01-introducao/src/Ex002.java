import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Sr(Sra) " + nome + ". Seja bem vindo ao mundo da programação.");
        System.out.println("Eu tenho " + idade + " anos, faço faculdade de Ciência da Computação.");
    }
}
