package empresa;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Variáveis para controlar as opções do menu e o tipo de moeda
        int opcao = -1; // Inicialização com valor padrão
        int tipoMoeda = -1; // Inicialização com valor padrão
        double qtdMoeda;
        String nome;

        // Criação de um objeto para gerenciar o cofrinho
        Cofrinho cofrinho = new Cofrinho();

        // Loop principal do programa
        while (opcao != 0) { // Alteração da condição de saída do loop
            // Exibe o menu principal
            menuPrincipal();
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    // Adicionar moeda
                    tipoMoeda = 0; // Reinicializa tipoMoeda
                    while (tipoMoeda < 1 || tipoMoeda > 3) {
                        menuMoedas();
                        tipoMoeda = teclado.nextInt();
                        System.out.println();
                        

                        switch (tipoMoeda) {
                            case 1:
                                // Adiciona moeda de dólar ao cofrinho
                                System.out.println("Quantas moedas deseja adicionar?");
                                qtdMoeda = teclado.nextDouble();
                                System.out.println("Sua Moeda de Dólar Foi Adicionada");
                                System.out.println();
                                nome = "Dolar";
                                Dolar dolar = new Dolar(nome, qtdMoeda);
                                dolar.setValor(qtdMoeda);
                                dolar.getValor();
                                dolar.info();
                                cofrinho.adicionar(dolar);
                                break;

                            case 2:
                                // Adiciona moeda de euro ao cofrinho
                                System.out.println("Quantas moedas deseja adicionar?");
                                qtdMoeda = teclado.nextDouble();
                                System.out.println("Sua Moeda de Euro Foi Adicionada");
                                System.out.println();
                                nome = "Euro";
                                Euro euro = new Euro(nome, qtdMoeda);
                                euro.setValor(qtdMoeda);
                                euro.getValor();
                                cofrinho.adicionar(euro);
                                euro.info();
                                break;

                            case 3:
                                // Adiciona moeda de real ao cofrinho
                                System.out.println("Quantas moedas deseja adicionar?");
                                qtdMoeda = teclado.nextDouble();
                                System.out.println("Sua Moeda de Real Foi Adicionada:");
                                System.out.println();
                                nome = "Real";
                                Real real = new Real(nome, qtdMoeda);
                                real.setValor(qtdMoeda);
                                real.getValor();
                                real.info();
                                cofrinho.adicionar(real);
                                break;

                            default:
                                System.out.println("Opção Inválida!");
                                break;
                        }
                        break; // Sair do loop após adicionar a moeda
                    }
                    break; // Sair do switch após adicionar a moeda

                case 2:
                    // Remover moeda
                    System.out.println("Selecione a Moeda que deseja remover:");
                    cofrinho.listar();
                    cofrinho.totalConvertido();
                    System.out.println();

                    menuMoedas();
                    int removerMoedas = teclado.nextInt();
                    System.out.println();

                    switch (removerMoedas) {
                        case 1:
                            // Remove moeda de dólar do cofrinho
                            cofrinho.remover("Dolar");
                            break;
                        case 2:
                            // Remove moeda de euro do cofrinho
                            cofrinho.remover("Euro");
                            break;
                        case 3:
                            // Remove moeda de real do cofrinho
                            cofrinho.remover("Real");
                            break;
                        default:
                            System.out.println("Opção Inválida");
                            System.out.println();
                            break;
                    }
                    break;

                case 3:
                    // Listar moedas no cofrinho
                    System.out.println();
                    cofrinho.listar();
                    System.out.println();
                    break;

                case 4:
                    // Exibir o total convertido para Real
                    cofrinho.totalConvertido();
                    break;

                case 0:
                    // Encerrar o programa
                    System.out.println("Fim do programa");
                    break;

                default:
                    // Opção inválida
                    System.out.println("Opção Inválida!");
                    System.out.println();
                    break;
            }
        }

        // Fecha o scanner
        teclado.close();
    }

    // Exibe o menu principal
    private static void menuPrincipal() {
        System.out.println("=== MENU ===");
        System.out.println("1 - Adicionar moeda");
        System.out.println("2 - Remover moeda");
        System.out.println("3 - Listar moedas");
        System.out.println("4 - Total Convertido para Real");
        System.out.println("0 - Encerrar Cofrinho");
        System.out.println();
        System.out.println("Escolha uma opção: ");
        System.out.println();
    }

    // Exibe o menu para escolha do tipo de moeda
    private static void menuMoedas() {
        System.out.println("=== Escolha o tipo de moeda ===");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Real");
        System.out.println();
        System.out.println("Escolha uma opção: ");
        System.out.println();
    }
}
