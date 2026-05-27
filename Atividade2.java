import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double a = input.nextDouble();
        System.out.print("Digite o lado B: ");
        double b = input.nextDouble();
        System.out.print("Digite o lado C: ");
        double c = input.nextDouble();

        // Regra de existência do triângulo: a soma de dois lados deve ser maior que o terceiro
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.print("Os valores formam um triângulo ");

            // Classificação do triângulo
            if (a == b && b == c) {
                System.out.println("Equilátero (todos os lados iguais).");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isósceles (dois lados iguais).");
            } else {
                System.out.println("Escaleno (todos os lados diferentes).");
            }
        } else {
            System.out.println("Os valores informados NÃO podem formar um triângulo.");
        }

        input.close();
    }
}
