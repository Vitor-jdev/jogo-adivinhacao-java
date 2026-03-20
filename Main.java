import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numeroSecreto = 6;
        int tentativa = 0;

        while (tentativa != numeroSecreto) {
            System.out.println("Digite um número:");
            tentativa = teclado.nextInt();

            if (tentativa == numeroSecreto) {
                System.out.println("Parabéns, você acertou!");
            } else if (tentativa > numeroSecreto) {
                System.out.println("O número é menor");
            } else {
                System.out.println("O número é maior");
            }
        }
    }
}
