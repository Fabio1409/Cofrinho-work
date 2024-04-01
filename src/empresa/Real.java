package empresa;

// Classe Real que representa a moeda Real, uma subclasse de Moeda
public class Real extends Moeda {
    
    // Construtor da classe Real que chama o construtor da classe Moeda
    public Real(String nome, double valor) {
        super(nome, valor);
    }
    
    double real; // Variável específica da classe Real para armazenar o valor em Real

    // Implementação do método abstrato converter() para a moeda Real
    @Override
    public double converter() {
        real = getValor(); // Não há conversão para Real, então apenas retorna o valor atual
        return getValor(); // Retorna o valor da moeda Real
    }

    // Método para exibir informações específicas sobre a moeda Real
    public void info() {
        System.out.println(getValor() + " A moeda Real é a moeda oficial do Brasil.");
        System.out.println("É emitida e regulada pelo Banco Central do Brasil.");
        System.out.println();
    }

    // Sobrescrita do método toString() para exibir o valor da moeda Real
    @Override
    public String toString() {
        return "Real = " + getValor() + ""; // Retorna uma string representando a moeda Real
    }
}
