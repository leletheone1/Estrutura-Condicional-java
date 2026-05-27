import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o peso (kg): ");
        double peso = input.nextDouble();

        System.out.print("Digite a altura (metros, ex: 1,75): ");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);
        String classificacao = "";

        // Encadeamento de if-else seguindo rigorosamente a tabela da imagem
        if (imc < 16) {
            classificacao = "Magreza grave";
        } else if (imc < 17) {
            classificacao = "Magreza moderada";
        } else if (imc < 18.5) {
            classificacao = "Magreza leve";
        } else if (imc < 25) {
            classificacao = "Saudável";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 35) {
            classificacao = "Obesidade Grau I";
        } else if (imc < 40) {
            classificacao = "Obesidade Grau II (severa)";
        } else {
            classificacao = "Obesidade Grau III (mórbida)";
        }

        System.out.printf("\nSeu IMC é: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);

        input.close();
    }
}
