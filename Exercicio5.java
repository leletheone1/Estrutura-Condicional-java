import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU DO RESTAURANTE ===");
        System.out.println("1 - Pizza");
        System.out.println("2 - Hambúrguer");
        System.out.println("3 - Salada");
        System.out.println("4 - Bebida");
        System.out.print("Escolha uma opção (1 a 4): ");
        int opcao = input.nextInt();

        System.out.println("\n--- Detalhes do Pedido ---");
        switch (opcao) {
            case 1:
                System.out.println("Prato: Pizza Muçarela Grande");
                System.out.println("Descrição: Molho de tomate artesanal, muçarela, tomates frescos e orégano.");
                System.out.println("Preço: R$ 45,00");
                break;
            case 2:
                System.out.println("Prato: Hambúrguer Artesanal");
                System.out.println("Descrição: Blend bovino de 150g, queijo cheddar derretido e maionese da casa no pão brioche.");
                System.out.println("Preço: R$ 32,00");
                break;
            case 3:
                System.out.println("Prato: Salada Caesar");
                System.out.println("Descrição: Alface americana fresca, croutons crocantes, queijo parmesão e molho Caesar especial.");
                System.out.println("Preço: R$ 25,00");
                break;
            case 4:
                System.out.println("Item: Bebida (Suco Natural de Laranja)");
                System.out.println("Descrição: Suco de laranja natural e gelado, feito na hora (350ml).");
                System.out.println("Preço: R$ 8,00");
                break;
            default:
                System.out.println("Opção inválida! Por favor, escolha um item do menu válido.");
        }

        input.close();
    }
}
