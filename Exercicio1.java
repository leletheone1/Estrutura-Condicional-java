import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salarioAntigo = input.nextDouble();

        System.out.print("Digite o tempo de serviço (em anos): ");
        int tempoServico = input.nextInt();

        double porcentagemBonus;

        // Estrutura condicional para definir o bônus baseado nos anos trabalhados
        if (tempoServico > 5) {
            porcentagemBonus = 0.05; // 5%
        } else {
            porcentagemBonus = 0.013; // 1.3%
        }

        double valorBonus = salarioAntigo * porcentagemBonus;
        double novoSalario = salarioAntigo + valorBonus;

        System.out.println("\n--- Resumo do Funcionário ---");
        System.out.printf("Tempo de Serviço: %d anos\n", tempoServico);
        System.out.printf("Salário Antigo: R$ %.2f\n", salarioAntigo);
        System.out.printf("Valor Líquido do Bônus: R$ %.2f (%.1f%%)\n", valorBonus, (porcentagemBonus * 100));
        System.out.printf("Novo Salário: R$ %.2f\n", novoSalario);

        input.close();
    }
}
