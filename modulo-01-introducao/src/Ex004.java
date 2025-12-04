import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite suas notas: ");
        double nota01 = scanner.nextDouble();
        double nota02 = scanner.nextDouble();
        double nota03 = scanner.nextDouble();
        double nota04 = scanner.nextDouble();

        double media = (nota01 + nota02 + nota03 + nota04) / 4;

        System.out.println("Sua media é: " + media);
    }
}
